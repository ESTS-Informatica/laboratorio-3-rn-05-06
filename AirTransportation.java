
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double AIRFEES = 4.0;
    public AirTransportation(String name,int numberOfContainers){
        setFees(AIRFEES);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public double getPriceWithFees(){
        return (100.0 + getFees())*getPrice();
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Aéreo";
    }
    
    @Override
    public String toString() {
        String initialString = "";
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matrícula", this.name));
        sb.append(String.format("%15s: %d\n", "Quantidade de contentores", this.numberOfContainers));
        return sb.toString();
    }

}
