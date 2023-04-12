package facede.subsystem2;

public class CepApi {
    private  static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    static public CepApi getInstance(){
        return instance;
    }
    public String takeCity(){
        return "Belém";
    }
    public String takeState(){
        return "Pará";
    }

}
