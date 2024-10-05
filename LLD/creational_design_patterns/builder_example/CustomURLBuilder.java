package builder_example;

interface URLBuilder {
    URLBuilder buildProtocol(String protocol);
    URLBuilder buildHost(String host);
    URLBuilder buildPort(String port);
    URLBuilder buildPath(String path);
    URLBuilder buildQueryParam(String queryParam);
    URL getCompleteURL();
}

public class CustomURLBuilder implements URLBuilder{
    private URL url;

    CustomURLBuilder(){
        this.url = new URL();
    }

    public CustomURLBuilder buildProtocol(String protocol){
        url.setProtocol(protocol);
        return this;
    }

    public CustomURLBuilder buildHost(String host){
        url.setHost(host);
        return this;
    }

    public CustomURLBuilder buildPort(String port){
        url.setPort(port);
        return this;
    }

    public CustomURLBuilder buildPath(String path){
        url.setPath(path);
        return this;
    }

    public CustomURLBuilder buildQueryParam(String queryParam){
        url.setQueryParam(queryParam);
        return this;
    }

    public URL getCompleteURL(){
        return this.url;
    }

}