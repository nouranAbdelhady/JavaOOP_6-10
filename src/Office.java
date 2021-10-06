abstract public class Office {
    String officeTitle;
    
    public abstract void displayData(Person currentPerson); 
    public String getOfficeTitle(){
        return this.officeTitle;
    }
    
    Office(){
        this.officeTitle="Abstract Office";
    } 
}
