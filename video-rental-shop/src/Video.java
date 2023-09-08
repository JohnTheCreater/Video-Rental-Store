public class Video {
    private String name;
    private boolean checkoutStatus;
    private int rating;

    public Video(String name){
        this.name=name;
    }
    String getName()
    {

        return name;
    }

    void doCheckout()
    {
        checkoutStatus=true;
    }
    void doReturn()
    {
        checkoutStatus=false;
    }
    void reciveRating(int rating)
    {
        this.rating=rating;

        
    }

    int getRating()
    {
        return rating;
    }
    boolean getCheckout()
    {
        return checkoutStatus;
    }
    
}
