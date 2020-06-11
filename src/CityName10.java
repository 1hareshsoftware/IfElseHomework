import java.util.Scanner;
public class CityName10 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter alphabet between a-f");

        String city = sc.next();

        if (city.equals("a")){
            System.out.println("Ahmedabad");
        }
        else if (city.equals ("b")){
            System.out.println("Baroda");
        }
        else if (city.equals("c")){
            System.out.println("Chennai");
        }
        else if (city.equals("d")) {
            System.out.println("Delhi");
        }
        else if (city.equals("e")) {
            System.out.println("Etawah");
        }
        else if (city.equals("f")){
            System.out.println("Faridabad");
        }
        else
            System.out.println("Invalid input, please enter alphabet between a-f only");
        }
    }





