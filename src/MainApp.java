import service.Router;

public class MainApp {


    private static final String urlToDb = "jdbc:mysql://localhost:3306/the_articles";
    private static final String user = "root";
    private static final String password = "mohammad";
    private static final String testQuery = "select * from name_list";

    public static void main(String[] args) {


//        try {
//
//            Connection connection = DriverManager.getConnection(urlToDb, user, password);
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(testQuery);
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(2));
//            }
//
//
//        } catch (Exception e) {
//            System.out.println(" some thing went wrong ");
//            e.printStackTrace();
//        }
        //
        Router.start();

    }
}

