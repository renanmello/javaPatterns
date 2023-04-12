package facede.subsystem1;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void saveClient(String name, String cep , String city, String state){
        System.out.println("Save in CRM");
        System.out.println("Client name: "+ name);
        System.out.println("Client cep: "+ cep);
        System.out.println("Client city: "+ city);
        System.out.println("Client state: "+ state);
    }
}
