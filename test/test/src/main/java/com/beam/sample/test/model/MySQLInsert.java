package com.beam.sample.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLInsert {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/CaseApplication";
            String user = "root";
            String password = "password";

            String sql = "INSERT INTO Users(user_id, password, email, full_name, phone, address_id) VALUES (?, ?, ?, ?, ?, ?)";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, "12345");
                pstmt.setString(2, "55555");
                pstmt.setString(3, "ayse.kaya@gmail.com");
                pstmt.setString(4, "Ayşe Kaya");
                pstmt.setString(5, "05056743323");
                pstmt.setString(6, "5");

                pstmt.executeUpdate();
                System.out.println("Record inserted successfully.");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


