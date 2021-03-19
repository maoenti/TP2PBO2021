/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pbo2021;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author asus
 */
public class abc {
    public abc(String merk, String plat, String warna, String jenis) throws SQLException
    {
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp2", "mlevyn", "root");
        PreparedStatement st = conn.prepareStatement("insert into mobil(merk,plat,warna,jenis)values(?,?,?,?)");
        st.setString(1, merk);
        st.setString(2, plat);
        st.setString(3, warna);
        st.setString(4, jenis);
        int a = st.executeUpdate();
        if(a>0)
        {
            System.out.println("New Update");
        }
    }
}
