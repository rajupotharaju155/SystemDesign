package builder_example;

public class URL {
    public String protocol;
    public String host;
    public String port;
    public String path;
    public String queryParam;

    void setProtocol(String protocol){
        this.protocol = protocol;
    }

    void setHost(String host){
        this.host = host;
    }

    void setPort(String port){
        this.port = port;
    }

    void setPath(String path){
        this.path = path;
    }

    void setQueryParam(String queryParam){
        this.queryParam = queryParam;
    }

    //constructor 1
    // public URL(String protocol, String host){
    //     this.protocol = protocol;
    //     this.host = host;
    // }
    // //constructor 1
    // public URL(String protocol, String host, String port){
    //     this.protocol = protocol;
    //     this.host = host;
    //     this.port = port;
    // }
    // //constructor 1
    // public URL(String protocol, String host, String port, String path){
    //     this.protocol = protocol;
    //     this.host = host;
    //     this.port = port;
    //     this.path = path;
    // }
    // Like this we will have to keep on creating constructor of all combinations which is tedious task,

}
