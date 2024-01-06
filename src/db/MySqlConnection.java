/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;

// Kelas untuk mengelola koneksi ke database MySQL
public class MySqlConnection {
    // URL database
    private final static String DB_URL = "jdbc:mysql://localhost:3306/pp2_membership";
    // Username database
    private final static String DB_USER = "root";
    // Password database
    private final static String DB_PASS = "";
    
    // Instance dari kelas MySqlConnection
    private static MySqlConnection instance;
    
    // Mendapatkan instance dari MySqlConnection (Singleton Pattern)
    public static MySqlConnection getInstance() {
        if (instance == null) {
            instance = new MySqlConnection();
        }
        return instance;
    }
    
    // Mendapatkan koneksi ke database
    public Connection getConnection() {
        Connection connection = null;
        try {
            // Meload driver JDBC untuk MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }
        catch (Exception e) {
            // Menangkap exception jika terjadi error saat loading driver
            e.printStackTrace();
        }
        // Mengembalikan objek Connection (null, karena belum diimplementasikan)
        return connection;
    }
}
