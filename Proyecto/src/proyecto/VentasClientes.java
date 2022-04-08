/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonat
 */
public class VentasClientes extends Conexion{
    private int cod_ventasClientes, total_ventas,cod_clientes;
    private String producto, descripcion_producto, fecha;
    private double precio;

    public int getCod_ventasClientes() {
        return cod_ventasClientes;
    }

    public void setCod_ventasClientes(int cod_ventasClientes) {
        this.cod_ventasClientes = cod_ventasClientes;
    }

    public int getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(int total_ventas) {
        this.total_ventas = total_ventas;
    }

    public int getCod_clientes() {
        return cod_clientes;
    }

    public void setCod_clientes(int cod_clientes) {
        this.cod_clientes = cod_clientes;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     public boolean getRegistrarVentas(VentasClientes venta){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO ventasClientes (cod_ventasClientes, fecha, producto, precio, descripcion_producto, total_ventas, cod_clientes) VALUES(?,?,?,?,?,?,?)";
        
        try {
 
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getCod_ventasClientes());
            ps.setString(2, venta.getFecha());
            ps.setString(3, venta.getProducto());
            ps.setDouble(4, venta.getPrecio());
            ps.setString(5, venta.getDescripcion_producto());
            ps.setInt(6, venta.getTotal_ventas());
            ps.setInt(7, venta.getCod_clientes());
            
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
     
    public boolean getEliminarVenta(VentasClientes venta){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM ventasClientes WHERE cod_ventasClientes = ?";
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getCod_ventasClientes());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public DefaultTableModel getConsultarVenta(VentasClientes venta){
       
        String [] titles = {"Código ventas clientes", "Fecha","Producto","precio","Descripcion","Total ventas", "Código clientes"};
        String [] registros = new String[7];
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        
        String sql = "SELECT * FROM ventasClientes WHERE cod_ventasClientes = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getCod_ventasClientes());
            rs = ps.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("cod_ventasClientes");
                registros[1] = rs.getString("fecha");
                registros[2] = rs.getString("producto");
                registros[3] = rs.getString("precio");
                registros[4] = rs.getString("descripcion_producto");
                registros[5] = rs.getString("total_ventas");
                registros[6] = rs.getString("cod_clientes");
                
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
    
    public DefaultTableModel getReporteVentas(){
       
        String [] titles = {"Código ventas clientes", "Fecha","Producto","precio","Descripcion","Total ventas", "Código clientes"};
        String [] registros = new String[7];
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        
        String sql = "SELECT * FROM ventasClientes";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("cod_ventasClientes");
                registros[1] = rs.getString("fecha");
                registros[2] = rs.getString("producto");
                registros[3] = rs.getString("precio");
                registros[4] = rs.getString("descripcion_producto");
                registros[5] = rs.getString("total_ventas");
                registros[6] = rs.getString("cod_clientes");
                
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
