import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Employee employee=new Employee();
        Address address=new Address();

        employee.setName("Amit");
        System.out.println(employee.getName());
        address.setStreet("Puraini");
        address.setCity("Madhepura");
        address.setState("Bihar");
        employee.setAddress(new Address("puraini","Madhepura","Bihar",28532));

        address.setPin(1234);
        System.out.println(employee.getAddress());
//        System.out.println(address.getStreet()+" "+ address.getCity()+" "+ address.getState()+" "+ address.getPin());

    }
}
