
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(int packages, String licensePlate){
        super(licensePlate);
        this.packages = packages;
    }
    
    public void setPackages(int packages){
        this.packages = packages;
    }
    
    public int getPackages(){
        return packages;
    }
    
    @Override
    public String toString() {
        String initialString = "";
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n", "Número de embalagens", this.packages));
        return sb.toString();
    }
}
