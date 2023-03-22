package org.example.ProxyPattern.VirtualProxy;

public class RealImage implements Image{
    private String url;

    public RealImage(String url) {
        waitingForGetImage();
        this.url = url;
        System.out.println("Image loaded: "+this.url);
    }

    @Override
    public void showImage() {
        System.out.println("Image showed: "+this.url);
    }

    private static void waitingForGetImage(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
