/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import proyecto.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonat
 */
public class PedidosClientes extends Conexion{
    
    private int cod_pedido, cod_clientes;
    private String cod_componenteElectrico;
    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public int getCod_clientes() {
        return cod_clientes;
    }

    public void setCod_clientes(int cod_clientes) {
        this.cod_clientes = cod_clientes;
    }

    public String getCod_componenteElectrico() {
        return cod_componenteElectrico;
    }

    public void setCod_componenteElectrico(String cod_componenteElectrico) {
        this.cod_componenteElectrico = cod_componenteElectrico;
    }
    
     public boolean getCrearPedido(PedidosClientes pedido){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO pedidos (cod_pedido, cod_clientes, cod_componenteElectrico) VALUES(?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getCod_pedido());
            ps.setInt(2, pedido.getCod_clientes());
            ps.setString(3, pedido.getCod_componenteElectrico());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
     
    public boolean getEditarPedido(PedidosClientes pedido){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE pedidos SET cod_clientes = ?, cod_componenteElectrico = ? WHERE cod_pedido = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getCod_clientes());
            ps.setString(2, pedido.getCod_componenteElectrico());
            ps.setInt(3, pedido.getCod_pedido());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean getBorrarPedido(PedidosClientes pedido){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM pedidos WHERE cod_pedido = ?";
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getCod_pedido());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
    public DefaultTableModel getMostrar(){
       
        String [] titles = {"Código pedido", "Código cliente","Código componente"};
        String [] registros = new String[3];
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        DefaultTableModel modelo = new DefaultTableModel(null, titles);

        
        String sql = "SELECT * FROM pedidos";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("cod_pedido");
                registros[1] = rs.getString("cod_clientes");
                registros[2] = rs.getString("cod_componenteElectrico");
                
                modelo.addRow(registros);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if( rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        return modelo;
     
    }
    
    
}

