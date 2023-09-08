import java.util.Scanner;

public class VideoStore {
    static int n;
    String ans;

    private Video[] video=new Video[10];
    Scanner  scan= new Scanner(System.in);

    protected void addVideo(String name)
    {
        video[n]=new Video(name);
        video[n].reciveRating(0);
        n++;
    }
    protected void doCheckout(String name)
    {
        int num=checkVideo(name);
        if(num==-1)
            System.out.println("no such video like\""+name+"\"");
        else
            video[num].doCheckout();
    }
    protected void doReturn(String name)
    {
        int num=checkVideo(name);
        if(num== -1) {
            System.out.println("no such video like \"" + name + "\" you want to add y/n");
            ans=scan.nextLine();
            if(ans.equalsIgnoreCase("y"))
                    addVideo(name);
        }
        else
            video[num].doReturn();


    }
    protected void reciveRating(String name,int rating)
    {
        int num=checkVideo(name);
        if(num== -1) {
            System.out.println("no such video like \"" + name + "\" you want to add y/n");
            ans=scan.nextLine();
            if(ans.equalsIgnoreCase("y"))
                addVideo(name);
        }
        else
            video[num].reciveRating(rating);
    }

   protected int checkVideo(String name)
   {
       int num=-1;
       for(int i=0;i<n;i++)
       {
           if(video[i].getName().equalsIgnoreCase((name)))
           { num=i;
               break;}
       }
       return num;
   }


    protected void listInventory() {
        int i;
        System.out.println("Video Name          |       Checkout Status        |        Rating");
        System.out.println("====================================================================");
        for(i=0;i<n;i++) {
            System.out.println(video[i].getName()+"\t\t\t|\t"+video[i].getCheckout()+"\t\t\t|\t"+video[i].getRating());
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
