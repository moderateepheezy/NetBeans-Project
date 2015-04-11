/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcbatchprocessing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author simpumind
 */
public class JDBCPreparedStatementBatch {
    
    public static void main(String[] args){
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        String query = "INSERT INTO Employee(empId, name)values(?,?)";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            
            long start = System.currentTimeMillis();
            for(int i =0; i<10000;i++){
		ps.setInt(1, i);
		ps.setString(2, "Name"+i);
				
		ps.addBatch();
				
		if(i%1000 == 0) ps.executeBatch();
            }
            ps.executeBatch();
            System.out.println("Time Taken="+(System.currentTimeMillis()-start));
        }catch (SQLException e) {
            e.printStackTrace();
	}finally{
		try {
                    ps.close();
                    conn.close();
		} catch (SQLException e) {
                    e.printStackTrace();
		}
	}
    }
}
