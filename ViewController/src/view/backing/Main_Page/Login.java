package view.backing.Main_Page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.Map;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jdbc.driver.OracleDriver;

public class Login {

    // generating static variables to use in different scopes
    private static String user_id;
    private static String page_name;
    private static String sessUName = null;


    private RichForm f1;
    private RichDocument d1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichGridCell gc3;
    private RichGridRow gr2;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichGridCell gc6;
    private RichGridRow gr3;
    private RichGridCell gc7;
    private RichGridCell gc8;
    private RichGridCell gc9;
    private RichGridRow gr4;
    private RichGridCell gc10;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichGridRow gr5;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichGridCell gc15;
    private RichGridRow gr6;
    private RichGridCell gc16;
    private RichGridCell gc17;
    private RichGridCell gc18;
    private RichGridRow gr7;
    private RichGridCell gc19;
    private RichGridCell gc20;
    private RichGridCell gc21;
    private RichGridRow gr8;
    private RichGridCell gc22;
    private RichGridCell gc23;
    private RichGridCell gc24;
    private RichGridRow gr9;
    private RichGridCell gc25;
    private RichGridCell gc26;
    private RichGridCell gc27;
    private RichGridRow gr10;
    private RichGridCell gc28;
    private RichGridCell gc29;
    private RichGridCell gc30;
    private RichImage i1;
    private RichSpacer s1;
    private RichPanelGroupLayout pgl2;
    private RichSpacer s2;
    private RichImage i2;
    private RichInputText it1;
    private RichSpacer s3;
    private RichPanelGroupLayout pgl3;
    private RichSpacer s4;
    private RichImage i3;
    private RichInputText it2;
    private RichSpacer s5;
    private RichLink l1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }

    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
    }

    public void setGc15(RichGridCell gc15) {
        this.gc15 = gc15;
    }

    public RichGridCell getGc15() {
        return gc15;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc16(RichGridCell gc16) {
        this.gc16 = gc16;
    }

    public RichGridCell getGc16() {
        return gc16;
    }

    public void setGc17(RichGridCell gc17) {
        this.gc17 = gc17;
    }

    public RichGridCell getGc17() {
        return gc17;
    }

    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc19(RichGridCell gc19) {
        this.gc19 = gc19;
    }

    public RichGridCell getGc19() {
        return gc19;
    }

    public void setGc20(RichGridCell gc20) {
        this.gc20 = gc20;
    }

    public RichGridCell getGc20() {
        return gc20;
    }

    public void setGc21(RichGridCell gc21) {
        this.gc21 = gc21;
    }

    public RichGridCell getGc21() {
        return gc21;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
    }

    public void setGc22(RichGridCell gc22) {
        this.gc22 = gc22;
    }

    public RichGridCell getGc22() {
        return gc22;
    }

    public void setGc23(RichGridCell gc23) {
        this.gc23 = gc23;
    }

    public RichGridCell getGc23() {
        return gc23;
    }

    public void setGc24(RichGridCell gc24) {
        this.gc24 = gc24;
    }

    public RichGridCell getGc24() {
        return gc24;
    }

    public void setGr9(RichGridRow gr9) {
        this.gr9 = gr9;
    }

    public RichGridRow getGr9() {
        return gr9;
    }

    public void setGc25(RichGridCell gc25) {
        this.gc25 = gc25;
    }

    public RichGridCell getGc25() {
        return gc25;
    }

    public void setGc26(RichGridCell gc26) {
        this.gc26 = gc26;
    }

    public RichGridCell getGc26() {
        return gc26;
    }

    public void setGc27(RichGridCell gc27) {
        this.gc27 = gc27;
    }

    public RichGridCell getGc27() {
        return gc27;
    }

    public void setGr10(RichGridRow gr10) {
        this.gr10 = gr10;
    }

    public RichGridRow getGr10() {
        return gr10;
    }

    public void setGc28(RichGridCell gc28) {
        this.gc28 = gc28;
    }

    public RichGridCell getGc28() {
        return gc28;
    }

    public void setGc29(RichGridCell gc29) {
        this.gc29 = gc29;
    }

    public RichGridCell getGc29() {
        return gc29;
    }

    public void setGc30(RichGridCell gc30) {
        this.gc30 = gc30;
    }

    public RichGridCell getGc30() {
        return gc30;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setI2(RichImage i2) {
        this.i2 = i2;
    }

    public RichImage getI2() {
        return i2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setI3(RichImage i3) {
        this.i3 = i3;
    }

    public RichImage getI3() {
        return i3;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    // creating generic database connection
    public static Connection getConnection() throws SQLException {
        String username = "ems";
        String password = "ems";
        String thinConn = "jdbc:oracle:thin:@192.168.1.102:1521:orcl";
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = DriverManager.getConnection(thinConn, username, password);
        conn.setAutoCommit(false);
        return conn;
    }

    // session value storing function
    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }

    public String login_action() {
        // Add event code here...
        //SETTING VALUE PROGRAMMATICALLY IN PASSWORD FIELD,,,,ONLY TESTING
        //  //          it2.setValue("bla bla bla");
        String username = this.getIt1().getValue().toString();
        String password = this.getIt2().getValue().toString();

        sessUName = username;
        storeOnSession("sessUName", sessUName);
        System.out.println("value for session..............." + sessUName);

        System.out.println(".......................................................................");
        System.out.println(".......................................................................");
        System.out.println("Entered username is : " + username + "....and password is : " + password);
        System.out.println(".......................................................................");
        System.out.println(".......................................................................");


        Connection conn;

        try {
            conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_user where user_name = '" + username + "' and user_pwd = '" +
                                  password + "'");

            if (rset.next()) {
                //                conn.close();
                //getting data against column from table
                user_id = (rset.getString("user_id")).toString();

                //Storing value in session username from input text field and role_master_id from DB

                System.out.println(".........User Name stored in session is :..." + username + "...");
                System.out.println(".........User Password stored in session is :..." + password + "...");
                System.out.println(".........User id stored in session is :..." + user_id + "...");

                //Redirecting to home page after successfull authentication
                //System.out.println("....... here we go /// you are redirecting now to DASHBOARD ......");
                //                return "good";

                conn.close();
                return "/faces/Main_Page/MainPage.jsf?faces-redirect=true";
            } else {
                conn.close();
                System.out.println("........wrong login credentials........");
                return "/faces/Main_Page/Login.jsf?faces-redirect=true";

            }


        } catch (SQLException e) {
            System.out.println(e);
        }

        return user_id;
        //        return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
        //        return "good";
        //return null;
    }

    public String logout_action() {
        // Add event code here...
        System.out.println("logout called");
        sessUName = "";
        storeOnSession("sessUName", "");
        //        return "good";
        return "/faces/Main_Page/Login.jsf?faces-redirect=true";
    }

    //page load check session
    public String checkSession(String pageName) {

        page_name = pageName;
        System.out.println("User redirected to " + page_name);
        System.out.println("UserName in Session is " + sessUName);
        
        if (sessUName !=  null) {
            System.out.println("if called");
            return "Y";
        } else {
            System.out.println("else called");
            return "N";
        }


    }
}
