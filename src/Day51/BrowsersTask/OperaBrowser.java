package Day51.BrowsersTask;

public class OperaBrowser extends WebDriver{


    public void get(String url) {
        System.out.println("Opening the " + url + " in Opera browser");
    }


    public void close() {
        System.out.println("closing the opera browser");
    }

}