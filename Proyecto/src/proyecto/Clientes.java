/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;


//import proyecto.Conexion;
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
public class Clientes extends Conexion {
    private int cod_cliente,  cedula;
    private String nombre, direccion, tel_fijo, tel_cel;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getTel_fijo() {
        return tel_fijo;
    }

    public void setTel_fijo(String tel_fijo) {
        this.tel_fijo = tel_fijo;
    }

    public String getTel_cel() {
        return tel_cel;
    }

    public void setTel_cel(String tel_cel) {
        this.tel_cel = tel_cel;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean getRegistrar(Clientes cliente){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO cliente (id_cod, cedula, nombre, direccion, tel_fijo, tel_cel) VALUES(?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getCod_cliente());
            ps.setInt(2, cliente.getCedula());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getTel_fijo());
            ps.setString(6, cliente.getTel_cel());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    public boolean getEliminar(Clientes cliente){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM cliente WHERE id_cod = ?";
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getCod_cliente());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean getEditar(Clientes cliente){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE cliente SET cedula = ?, nombre = ?, direccion = ?, tel_fijo = ?, tel_cel  = ? WHERE id_cod = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,cliente.getCedula());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTel_fijo());
            ps.setString(5, cliente.getTel_cel());
            ps.setInt(6, cliente.getCod_cliente());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
     public DefaultTableModel getBuscar(Clientes cliente){
       
        String [] titles = {"Código cliente", "Cedula","Nombre","Dirección","Telefono","Celular"};
        String [] registros = new String[6];
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        
        String sql = "SELECT * FROM cliente WHERE id_cod = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,cliente.getCod_cliente());
            rs = ps.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("id_cod");
                registros[1] = rs.getString("cedula");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getString("tel_fijo");
                registros[5] = rs.getString("tel_cel");
                
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
    
    
    
    public DefaultTableModel getReporte(){
       
        String [] titles = {"Código cliente", "Cedula","Nombre","Dirección","Telefono","Celular"};
        String [] registros = new String[6];
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        DefaultTableModel modelo = new DefaultTableModel(null, titles);

        
        String sql = "SELECT * FROM cliente";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("id_cod");
                registros[1] = rs.getString("cedula");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getString("tel_fijo");
                registros[5] = rs.getString("tel_cel");
                
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
