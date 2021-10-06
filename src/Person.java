import java.util.List;

public class Person {

    private int ID;
    private String name;
    private List<String> placesVisited;
    private Boolean hasFever;
    private Boolean hasCough;
    private String pcrStatus;
    private List<String> specialConditions;
    private List<String> allergies;

    Person(int id,String name){
        this.ID=id;
        this.name=name;
    }
    Person (int id , String name , List<String> placesVisited , Boolean hasFever , Boolean hasCough , String pcrStatus , List<String> specialConditions , List<String> allergies){
        this.ID=id;
        this.name=name;
        this.placesVisited=placesVisited;
        this.hasCough=hasCough;
        this.hasFever=hasFever;
        this.pcrStatus=pcrStatus;
        this.specialConditions=specialConditions;
        this.allergies=allergies;
    }

    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public Boolean getHasFever(){
        return this.hasFever;
    }
    public Boolean getHasCough(){
        return this.hasCough;
    }
    public String getPCRStatus(){
        return this.pcrStatus;
    }
    public List<String> getPlacesVisited(){
        return this.placesVisited;
    }
    public List<String> getSpecialConditions(){
        return this.specialConditions;
    }
    public List<String> getAllergies(){
        return this.allergies;
    }

    Office currentOffice;  
    public void sequence(){
        currentOffice = new PortOffice();
        currentOffice.displayData(this);
    }
}