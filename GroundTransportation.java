
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
        super.setFees(GROUNDFEES);
        this.licensePlate = licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
}
