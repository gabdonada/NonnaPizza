/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class ValidaLog {
    private String SenhaUso;
    private String LoginUso;
    private int verSenha=0;
    private int verLogin=0;
    private int posS;
    private int posL;
    ArrayList<funcionarios> logins = new ArrayList<>();
    ArrayList<funcionarios> senhas = new ArrayList<>();
    ArrayList<String> Login = new ArrayList();
    ArrayList<String> Senha = new ArrayList();
    String id;

    funcionarios f = new funcionarios();
    
    public String getSenhaUso() {
        return SenhaUso;
    }

    public void setSenhaUso(String SenhaUso) {
        this.SenhaUso = SenhaUso;
    }

    public String getLoginUso() {
        return LoginUso;
    }

    public void setLoginUso(String LoginUso) {
        this.LoginUso = LoginUso;
    }
    
    
    private void verificaSenhaELogin(){
        Logs();
        for (int i = 0; i <logins.size() ; i++) {
            if(Login.get(i).equals(LoginUso)){
             this.verLogin=1;
             posL=i;
            }
             if(Senha.get(i).equals(SenhaUso)){
             this.verSenha=1;
             posS=i;
            }
            
            
        }
    }
    public boolean Entrada() throws SQLException{
        this.verificaSenhaELogin();
        if(this.verLogin==1 && this.verSenha==1 && posS==posL){
            ArrayList<funcionarios> al = new ArrayList<>();
            id = LoginUso;
            al = dados();
            return true;
        }else  if(this.verLogin==0 && this.verSenha==1 && posS==posL){
            JOptionPane.showMessageDialog(null, "ID inválido");
            return false;
        }else  if(this.verLogin==1 && this.verSenha==0 && posS==posL){
            JOptionPane.showMessageDialog(null, "Senha inválido");
            return false;
        }else{
            JOptionPane.showMessageDialog(null, "Senha  e ID inválidos");
            return false;
        
        }
    }
    public void Logs(){
        try {           

            //Recebendo o ArrayList cheio em produtos
            logins = buscarLogs();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro! " + e.getMessage());
        }
    }
    public ArrayList<funcionarios> dados() throws SQLException{
        Connection con = Conecta.getConexao();
        Statement stat = con.createStatement();
                
      try {
            String sql;
            
            sql = "SELECT * FROM pizzaria.funcionario where idfuncionario like '"+id+"' ;";


            ArrayList<funcionarios> funcionarios = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                f.setGrupo(rs.getString("grupo_funcionario"));
                f.setId(rs.getString("idfuncionario"));
                f.setNome(rs.getString("nome_funcionario"));
               
            }
           
            
            return funcionarios;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar dados! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    public ArrayList<funcionarios> buscarLogs() throws SQLException {

        Connection con = Conecta.getConexao();
        Statement stat = con.createStatement();

      try {
            String sql;
            
            sql = "select * from funcionario";
             

            ArrayList<funcionarios> funcionarios = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                Login.add(rs.getString("idfuncionario"));
                Senha.add(rs.getString("senha_funcionario"));
                
                funcionarios.add(f);
            }
            
            return funcionarios;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Logs! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
