package builder_example;

public class Start {
    public static void main(String[] args) {
        URLBuilder customURLBuilder = new CustomURLBuilder();
        customURLBuilder.buildProtocol("https://")
            .buildHost("www.google.com")
            .buildPort(":8080")
            .buildPath("/docs");
        
        URL url = customURLBuilder.getCompleteURL();

        System.out.println(url.protocol+url.host+url.path+url.queryParam+url.port);
        
    }
}
