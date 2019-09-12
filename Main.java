import java.sql.*;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
                       private static final Logger log = LoggerFactory.getLogger(Main.class);

          public static void main(String[] args) throws SQLException
          {
                            log.info("Log maintenance",Main.class.getSimpleName());

                            Connection con=null;
               try {
                con = DriverManager.getConnection
                        (
                        "jdbc:mysql://localhost:3306/class", "root", ""
                        );
                if (con != null) {
                    System.out.println("Connected");
                }
              } catch (SQLException e) {   }




///for insert



            String QueryInsert = "INSERT into student (FirstName,LastName,Rollnum)VALUES(?,?,?) ";
            PreparedStatement Insertstatement = con.prepareStatement(QueryInsert);


        Insertstatement.setString(1, "bill");
        Insertstatement.setString(2, "secretpass");
        Insertstatement.setString(3, "23");


            int rowsInserted = Insertstatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("inserted successfully!");
            }
//for read
        String sql = "SELECT * FROM student";

       Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery(sql);

        int count = 0;

        while (result.next()){
            String Id = result.getString(3);

            String Name = result.getString("FirstName");
            String Lname = result.getString("LastName");

            String output = "User #%d: %s  - %s - %s";
            System.out.println(String.format(output, ++count, Id,  Name, Lname));
        }


            //for update

    String QueryUpdate = "UPDATE student SET FirstName=?,LastName=?,Rollnum=? WHERE Id = ?";
    PreparedStatement updatestatement =  con.prepareStatement(QueryUpdate);

    updatestatement.setString(1,"Mirza");
    updatestatement.setString(2,"Zeeshan");
    updatestatement.setString(3,"150894");
    updatestatement.setString(4,"2");

   int check= updatestatement.executeUpdate();
        if (check > 0) {
            System.out.println("successfully updated");
        }



        //for delete


        String QueryDelete = "DELETE FROM student  WHERE Id > ?";
        PreparedStatement Deletestatement =  con.prepareStatement(QueryDelete);

        Deletestatement.setString(1,"4");

        int check2= Deletestatement.executeUpdate();
        if (check2 > 0) {
            System.out.println("successfully Deleted");
        }

    };}

