
/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class ShippingCompany extends HashSet<Transport>{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String name){
        inService = new ArrayList();
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        String finalString = "";
        for(Transport a : this){
            finalString += ("\n" + a.toString());
        }

        System.out.println(finalString);
        return finalString;
    }
    
    public void addTransport(Transport transport){
        add(transport);
    }
    
}
