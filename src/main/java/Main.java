import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:sqlite:sample.db")) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE student(id, name, age, phoneNumber)");
            statement.executeUpdate("INSERT INTO student VALUES(1, 'andrei', 22, 111)");
            statement.executeUpdate("INSERT INTO student VALUES(2, 'oleg', 21, 222)");

            ResultSet cursor = statement.executeQuery("SELECT * FROM student");

            while (cursor.next()){
                System.out.println("id = " + cursor.getInt("id"));
                System.out.println("name = " + cursor.getString("name"));
                System.out.println("age = " + cursor.getInt("age"));
                System.out.println("phoneNumber = " + cursor.getString("phoneNumber"));

            }
        } catch (SQLException throwables) {

            int example;
            String[] names;

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("1 - Решить пример");
                System.out.println("2 - Угадать имя");
                System.out.println("3 - 'Hello World!!!'");
                System.out.println("4 - ");
                System.out.println("5 - ");
                System.out.println("6 - ");
                System.out.println("7 - ");
                System.out.println("8 - ");
                System.out.println("9 - Случайный выбор");
                System.out.println("0 - Выход");
                int userInput = sc.nextInt();

                switch (userInput) {
                    case (1):
                        example = (1 + 1 * 1);
                        System.out.println(example);
                        break;
                    case (2):
                        names = new String[]{"Олег", "Андрей", "Дима", "Александр",
                                "Алексей"};
                        int n = (int) Math.floor(Math.random() * names.length);
                        System.out.println(names[n]);
                        break;
                    case (3):
                        System.out.println("Hello World!!!");
                        break;
                    case (4):

                        break;
                    case (5):

                        break;
                    case (6):

                        break;
                    case (7):

                        break;

                    case (8):

                        break;
                    case (9):

                        break;

                    case (0):
                        System.exit(0);
                        break;
                }

                throwables.printStackTrace();
            }
        }
    }
}
