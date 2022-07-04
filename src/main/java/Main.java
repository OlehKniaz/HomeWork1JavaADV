
import lombok.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }
}
class Address{
    String adres;
}
@Data
class User {
    public String fullname;
    public Address address = new Address();
    public Integer age;
    public List<String> animals;
}


