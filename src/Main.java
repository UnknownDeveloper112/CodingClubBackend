import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        upper:while(true){
            Scanner scanObj=new Scanner(System.in);
            System.out.print(">");
            String command=scanObj.nextLine();
            switch(command){
                case "1":
                    Q1.init();
                    System.out.printf("LATITUDE: %s\nLONGITUDE: %s\n",Q1.LATITUDE,Q1.LONGITUDE);
                    break;
                case "2":
                    Q1.init();
                    Q2.init();
                    System.out.printf("TIMEZONE: %s\nCOUNTRYCODE: %s\n",Q2.TIMEZONE,Q2.COUNTRYCODE);
                    break;
                case "3":
                    Scanner scan=new Scanner(System.in);
                    System.out.print("Enter Year - ");
                    int year=Integer.parseInt(scanObj.nextLine());
                    System.out.print("Enter Month - ");
                    int month=Integer.parseInt(scanObj.nextLine());
                    System.out.print("Enter Date - ");
                    int date=Integer.parseInt(scanObj.nextLine());
                    Q3.init(year,month,date);
                    System.out.printf("LATITUDE: %s\nLONGITUDE: %s\n",Q3.LATITUDE,Q3.LONGITUDE);
                    break;
                case "q":
                    break upper;
                case "h":
                    System.out.println("1: Answer to Question One\n" +
                            "2: Answer to Question Two\n" +
                            "3: Answer to Question Three\n" +
                            "q: Quit");
                    break;
                default:
                    System.out.println("Invalid Input\nEnter 'h' for help");

            }
        }

    }
}