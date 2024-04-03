
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main (String[] args){
        ShippingCompany shippingCompany = new ShippingCompany("RELIABLE-MOVING");
        shippingCompany.addTransport(new GroundTransportation("abc123"));
        shippingCompany.addTransport(new AirTransportation("HK1", 210));
        shippingCompany.addTransport(new AirTransportation("HK6", 660));
        shippingCompany.addTransport(new Lorry(420,3,"xdXd12"));
        shippingCompany.addTransport(new Van(25,"U8ADOG"));
        shippingCompany.toString();
    }
}
