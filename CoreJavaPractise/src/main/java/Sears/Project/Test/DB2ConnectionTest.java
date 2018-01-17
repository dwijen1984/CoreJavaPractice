package Sears.Project.Test;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB2ConnectionTest {
    @Test
    public void testDB2Connection() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*napsHost=sch020.sears.com
        napsPort=1304
        napsUser=selloid
        napsPasswd=cu$aep7b
        napsSchema=DBSIPS0
        napsDB=DB91*/
        Connection conn = null;
        ResultSet rs = null;
        try {
            /*return DriverManager.getConnection("jdbc:db2://" + dbConfig.getNapsHost() + ":" + dbConfig.getNapsPort() + "/" + dbConfig.getNapsDb_name(), dbConfig.getNapsUsername(),
                    dbConfig.getNapsPassword());*/
            conn =  DriverManager.getConnection("jdbc:db2://" + "sch020.sears.com" + ":" + "1304" + "/" + "DB91", "selloid",
                    "cu$aep7b");
        } catch (final Exception ex) {
            System.out.println("Error while getting NAPS DB2 connection !");
            ex.printStackTrace();
        }

        PreparedStatement stmt = null;
        //logger.debug("Fetching information from Mainframe NAPS... Started");
        List<String> lst = new ArrayList<String>();
        try {
            //final String query = "SELECT VND_RM_NO, IVC_NO, IVC_DT, IVC_TOT_NET_AM, CHK_NO, CHK_DT, CHK_TOT_AM FROM DBSIPS0.IPSXTAH";
            String query = "SELECT VND_RM_NO, VND_DP_NO, IVC_NO, IVC_DT, TRN_CD, IVC_TOT_GR_AM,IVC_TOT_ANT_AM,IVC_TOT_DISC_AM, IVC_TOT_NET_AM, BAT_NO, BAT_DT, CHK_NO,CHK_DT, CHK_TOT_AM, UN_NO ,DOCREF, 'Null' as RMA FROM DBSIPS0.IPSXTAH WHERE UN_NO IN ('0009301','0009367','0009300','0009311','0007864','0007868')  AND BAT_NO <> '00001' AND VND_DP_NO IN ('691','091','601','602','603','604','606','607','608','609','612','613','614','616','617','618','620','622','626','624','625','628','629','630','631','632','633','634','636','637','638','640','641','642','643','644','645','646','649','650','652','654','657','658','667','671','674','675','676','677','668','680','682','683','687','688','689','690','695','696')  AND CHK_DT > '2017-02-24' AND CHK_DT < '2017-11-30' UNION ALL  SELECT AH.VND_RM_NO,AH.VND_DP_NO, AH.IVC_NO, AH.IVC_DT, AH.TRN_CD,AH.IVC_TOT_GR_AM,  AH.IVC_TOT_ANT_AM,AH.IVC_TOT_DISC_AM,  AH.IVC_TOT_NET_AM, AH.BAT_NO, AH.BAT_DT, AH.CHK_NO,AH.CHK_DT, AH.CHK_TOT_AM,AH.UN_NO, AH.DOCREF,CM.RTR_ATH_NO as RMA FROM DBSIPS0.IPSXTAH AH,DBSIPS0.IPSXTCH CH,DBSIPS0.IPSXTCM CM  WHERE SUBSTR(AH.IVC_NO,6,5) = SUBSTR(CH.CLM_NO,5,5) AND AH.UN_NO IN ('0009301','0009367', '0009300', '0009311', '0007864') AND AH.VND_RM_NO = CH.VND_RM_NO  AND AH.VND_DP_NO = CH.DP_NO  AND AH.UN_NO  = CH.UN_BTO_NO  AND AH.IVC_DT  = CH.CLM_DOC_DT  AND CM.CLM_NO= CH.CLM_NO  AND AH.BAT_NO = '00001' AND AH.VND_DP_NO IN ('691','091','601','602','603','604','606','607','608','609','612','613','614','616','617','618','620','622','626','624','625','628','629','630','631','632','633','634','636','637','638','640','641','642','643','644','645','646','649','650','652','654','657','658','667','671','674','675','676','677','668','680','682','683','687','688','689','690','695','696')  AND AH.CHK_DT > '2016-11-04' AND AH.CHK_DT < '2017-11-21' WITH UR";

            //logger.info("Firing NAPS Query: "+query.toString());
            stmt = conn.prepareStatement(query.toString());
            rs = stmt.executeQuery();

            while (rs.next()) {
                try {
                    //System.out.println(rs.getString(3));
                    System.out.println(rs.getString(6));
                    //lst.add(rs.getString(3));lst.add(rs.getString(4));

                } catch (Exception ex) {
                    System.out.println("Error while fetching information from Mainframe NAPS. ..1111");
                }
            }
            conn.commit();
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while fetching information from Mainframe NAPS. ");

        }finally {
                //System.out.println("Fetching information from Mainframe NAPS... Completed!"+lst.toString());
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception sqlE) {
                    System.out.println("Could not close the connection/resultset. ");
                }
            }
        }
    }

