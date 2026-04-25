import java.time.LocalDate;

public class Account {
     int accountID;
     String email;
     String username;
     String fullName;
     Department department; // FK -> Object
     Position position;
     LocalDate createDate;
}

