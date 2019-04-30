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


///////////////
    
    private RichInputText it1;
    private RichInputText it2;
    private RichLink l1;
    
    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }
    

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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
                
                storeOnSession("sessUID", user_id);
                System.out.println("value for session..............." + user_id);
                
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
