/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcbatchprocessing;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author simpumind
 */
public class JDBCStatementBatch {
    
    public static void main(String[] args){
    
        Connection conn = null;
        Statement stmt = null;

        try{
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();

            long start = System.currentTimeMillis();
            for(int i =0; i<10000;i++){
                String query = "insert into Employee values ("+i+",'Name"+i+"')";
                stmt.addBatch(query);

                //execute and commit batch of 1000 queries
                if(i%1000 ==0) {
                    stmt.executeBatch();
                }
            }
            //commit remaining queries in the batch
            stmt.executeBatch();
            System.out.println("Time Taken="+(System.currentTimeMillis()-start));
        }catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
}
