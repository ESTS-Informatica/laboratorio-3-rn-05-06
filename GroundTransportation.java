
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static final double GROUNDFEES = 3.0;
    public GroundTransportation(String licensePlate){
        setFees(GROUNDFEES);
        this.licensePlate = licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    @Override
    public double getPriceWithFees(){
        return ((100.0 + getFees())*getPrice()/100);
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        String initialString = "";
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));
        return sb.toString();
    }
}
