package facede;

import facede.subsystem1.CrmService;
import facede.subsystem2.CepApi;

public class Facede {

    public void changeClient(String name, String cep){
        String city =  CepApi.getInstance().takeCity();
        String state = CepApi.getInstance().takeState();

        CrmService.saveClient(name,cep, city, state);

    }
}
