
package com.service.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trainee4
 */
public class Database {
//    public Connection getConnection() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        String url = "jdbc:mysql://192.168.51.51:3306/fliplite";
//        String user = "fliplite";
//        String password = "fliplite";
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(url, user, password);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return conn;
//    }
//    
//            public int create(TradeStructure tr) {
//            int flag = 0;
//            String sql = "insert into notissamp(seqNo,mkt,trdNo,trdTm,tkn,trdQty,trdPrc,bsFlg,ordNo,"
//                    + "brnCd,usrId,proCli,cliActNo,cpCd,remarks,actTyp,TCd,ordTm,mktTyp,aucNo,stpTyp,"
//                    + "oppBrokerCd,trdTrigPrc,ctclId,ordInst,secIdentifier)"
//                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            Connection con = null;
//            try {
//                con = this.getConnection();
//                PreparedStatement st = con.prepareStatement(sql);
//                st.setLong(1, tr.getSeqNo());
//                st.setString(2, tr.getMkt());
//                st.setLong(3, tr.getTrdNo());
//                st.setLong(4, tr.getTrdTm());
//                st.setInt(5, tr.getTkn());
//                st.setInt(6, tr.getTrdQty());
//                st.setInt(7, tr.getTrdPrc());
//                st.setString(8, tr.getBsFlg());
//                st.setDouble(9, tr.getOrdNo());
//                st.setInt(10, tr.getBrnCd());
//                st.setInt(11, tr.getUsrId());
//                st.setShort(12, tr.getProCli());
//                st.setString(13, tr.getCliActNo());
//                st.setString(14, tr.getCpCd());
//                st.setString(15, tr.getRemarks());
//                st.setString(16, tr.getActTyp());
//                st.setString(17, tr.getTCd());
//                st.setLong(18, tr.getOrdTm());
//                st.setString(19, tr.getMktTyp());
//                st.setShort(20, tr.getAucNo());
//                st.setString(21, tr.getStpTyp());
//                st.setString(22, tr.getOppBrokerCd());
//                st.setString(23, tr.getTrdTrigPrc());
//                st.setDouble(24, tr.getCtclId());
//                st.setShort(25, tr.getOrdInst());
//                st.setString(26, tr.getSecIdentifier());
//
//                st.executeUpdate();
//                flag = 1;
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    con.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            return flag;
//        }
//    
}
