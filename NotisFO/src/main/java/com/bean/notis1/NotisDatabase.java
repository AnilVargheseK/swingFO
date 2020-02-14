/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean.notis1;

import com.bean.notis1.TokenResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author trainee4
 */
public class NotisDatabase {
    
    
    Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotisDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        String url = "jdbc:mysql://192.168.51.51:3306/fliplite";
        String user = "fliplite";
        String password = "fliplite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    public int create(JSONObject not) {
        int flag = 0;
         String sql = "insert into notis(access_token,token_type,expires_in,scope)values (?,?,?,?)";
        Connection con = null;
        try {
            con = this.getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, not.getString("access_token"));
            st.setString(2, not.getString("token_type"));
            st.setString(3, not.getString("expires_in"));
            st.setString(4, not.getString("scope"));
            st.executeUpdate();
            flag = 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    public int create(TokenResponse a1) {
        String sql = "insert into notis(access_token,token_type,expires_in,scope)values (?,?,?,?)";
        try {
            NotisDatabase db = new NotisDatabase();
            Connection conn = db.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
//           st.setInt(1, a1.getId());
            
            st.setString(1, a1.getAccess_token());
            st.setString(2, a1.getToken_type());
            st.setString(3, a1.getExpires_in());
            st.setString(4, a1.getScope());
            st.executeUpdate();
            

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;

     }
    
}
