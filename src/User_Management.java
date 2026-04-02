import java.sql.*;
import java.util.Scanner;

public class User_Management {
    public static void main(String args[]) throws Exception {
        String username = "root";
        String password = "your_password";
        String url = "jdbc:mysql://localhost:3306/user_management";

        Connection c = DriverManager.getConnection(url , username , password);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add user");
            System.out.println("2.View user");
            System.out.println("3.Update user");
            System.out.println("4.Delete User");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID :");
                    int id = sc.nextInt();

                    System.out.println("Enter name : ");
                    String name = sc.next();

                    System.out.println("Enter email : ");
                    String email = sc.next();

                    String insertSql = "insert into users(user_id, name, email) values (?, ?, ?)";
                    PreparedStatement ps1 = c.prepareStatement(insertSql);

                    ps1.setInt(1, id);
                    ps1.setString(2, name);
                    ps1.setString(3, email);

                    ps1.executeUpdate();
                    System.out.println("User added Succesfully");
                    break;

                case 2:
                    String selectsql = "select * from users";
                    PreparedStatement ps2 = c.prepareStatement(selectsql);

                    ResultSet rs = ps2.executeQuery();
                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)) ;
                    }
                    break;

                case 3:
                    System.out.println("Enter user id to update : ");
                    int userid = sc.nextInt();

                    System.out.println("Enter new name : ");
                    String newName = sc.next();

                    String updateSQL = "update users set name = ? where id = ?";
                    PreparedStatement ps3 = c.prepareStatement(updateSQL);

                    ps3.setString(1, newName);
                    ps3.setInt(2, userid);

                    int rows = ps3.executeUpdate();
                    System.out.println(rows + "updated");

                    break;

                case 4:
                    System.out.println("Enter user id you want to delete : ");
                    int deleteId = sc.nextInt();

                    String deleteSql = "delete from users where id = ?";
                    PreparedStatement ps4 = c.prepareStatement(deleteSql);

                    ps4.setInt(1, deleteId);

                    int deleted = ps4.executeUpdate();
                    System.out.println(deleted + "User Deleted");
                    break;

                case 5:
                    System.out.println("Exiting");
                    c.close();
                    return;
                default:
                    System.out.println("Invalid choice entered");
            }
        }
    }
}




