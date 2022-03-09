import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        double minLatitude = 90;
        double maxLatitude = -90;
        double minLongitude = 180;
        double maxLongitude = -180;
        double tempLat;
        double tempLong;
        String response;
        boolean enterLocation = true;
        Scanner scanner = new Scanner(System.in);
        while(enterLocation){
                System.out.println("Please enter the latitude: ");
                tempLat = scanner.nextDouble();
            if(tempLat >= -90 && tempLat <= 90){
                if(tempLat >= maxLatitude){
                    maxLatitude = tempLat;
                }
                else if(tempLat <= minLatitude){
                    minLatitude = tempLat;
                }

               
            }
            else{
                System.out.println("Invalid Input");
                continue;
            }
                System.out.println("Please enter the longitude: ");
                tempLong = scanner.nextDouble();
            if(tempLong >= -180 && tempLong <= 180){
                if(tempLong >= maxLongitude){
                    maxLongitude = tempLong;
                }
                else if(tempLong <= minLongitude){
                    minLongitude = tempLong;
                }
                
            }
            else{
                System.out.println("Invalid Input");
                continue;
            }
            System.out.println("Would you like to enter another location?");
            response = scanner.next();
            if(response.equals("Yes") || response.equals("yes") ||
                response.equals("Y") || response.equals("y")){
                    continue;
                }
            else if((response.equals("No") || response.equals("no") ||
            response.equals("N") || response.equals("n"))){
                break;
            }
        }
        System.out.println("Farthest north: " + maxLatitude);
        System.out.println("Farthest south: " + minLatitude);
        System.out.println("Farthest east: " + maxLongitude);
        System.out.println("Farthest west: " + minLongitude);
}
}