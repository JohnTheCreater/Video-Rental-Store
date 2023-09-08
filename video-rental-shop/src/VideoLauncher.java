import java.util.Scanner;

import static java.lang.System.exit;

public class VideoLauncher extends VideoStore {
    public static void main(String[] args)
    {
        VideoStore access=new VideoStore();
        String name=new String();
        int n;
        Scanner scan= new Scanner(System.in);
        do{
            System.out.println("MAIN MENU");
            System.out.println("==========");
            System.out.println("1.add video");
            System.out.println("2.check out");
            System.out.println("3.return");
            System.out.println("4.recive rating");
            System.out.println("5.list inventry");
            System.out.println("6.exit");
            System.out.print("Enter Your Choice:");
            n=scan.nextInt();
            scan.nextLine();
            if(n<=4)
            {
                System.out.println("enter the video name:");
                name = scan.nextLine();
            }
            switch(n)
            {
                case 1:
                    access.addVideo(name);
                    break;
                case 2:
                    access.doCheckout(name);
                    break;
                case 3:
                    access.doReturn(name);
                    break;
                case 4:
                    System.out.print("enter the rating for this video:");
                    int rating=scan.nextInt();
                    access.reciveRating(name,rating);
                    break;
                case 5:
                    access.listInventory();
                    break;
                case 6:
                    exit(0);

            }
        }while(n!=6);


    }
}
