import java.util.*;

public class Methods {

    public String FullAge(int age) throws Exeptions {
        if (age >= 18) {
            return ("U ar Welcome");
        } else {
            throw new Exeptions();
        }
    }
    public void AddAddress(String address){
        Scanner scanner = new Scanner(System.in);
        String newaddress = scanner.nextLine();
        if (newaddress.equals(address)){
            System.out.println("U already have this address");
        }
        else {
            address = newaddress;
        }
    }
    public void DeleteAddress(String address){
        Scanner scanner = new Scanner(System.in);
        String uraddress = scanner.nextLine();
        if (uraddress.equals(address)){
            address=null;
        }
        else {
            System.out.println("u dont have thsi adres");
        }
    }
    public void AddAnimal(List<String>animals){
        Scanner scanner = new Scanner(System.in);
        String addinganimal = scanner.nextLine();
        for (String animal : animals) {
            if (addinganimal.equals(animal)){
                System.out.println("u already have this");
            }else {
                animals.add(addinganimal);
            }
        }
    }
    public void  DeleteAnimal(List<String>animals){
        Scanner scanner = new Scanner(System.in);
        String deletinganimal = scanner.nextLine();
        for (String animal : animals) {
            if (deletinganimal.equals(animal)){
               animals.remove(animal);
            }else {
                System.out.println("U don t have this animal");
            }
        }
    }
    public void ChangeFullName(String fullname){
        Scanner scanner = new Scanner(System.in);
        String changedFullName = scanner.nextLine();
        if (changedFullName.equals(fullname)){
            System.out.println("pls enter new fullName");
            String newFullName =scanner.nextLine();
            fullname=newFullName;
        }
    }

}



