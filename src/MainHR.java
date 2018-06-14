import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class MainHR {

    public static void main(String[] args) throws ParseException {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("Data about the users\n");

        User user1 = new User("Tom", "Kowalski", Sex.MALE, 180, "1990-11-13");

        User user2 = new User("Anna", "Niebieska", Sex.FEMALE);

        User user3 = new User("Leon", "Zawodowiec", Sex.MALE, "1982-04-22");

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(user3.getBirthDate());

        User user4 = new User("Hanna", "Rogal", Sex.FEMALE, 164, "1971-08-16");

        User user5 = new User("Gustaw", "Jelito", Sex.MALE);




        
    }
}
