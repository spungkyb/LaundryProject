/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryproject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Seviana Pungky B.
 */
public class LaundryProject {

Connection koneksi;
    Statement st;
    ResultSet rs;
    public  Connection getkoneksi(){
        try {
            koneksi=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/projectlaundry","root","");
            st=(Statement) koneksi.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+ e);
        }
        return koneksi;
    }
}
