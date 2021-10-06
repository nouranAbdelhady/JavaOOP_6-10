public class HealthOffice extends Office{

    @Override
    public void displayData(Person currentPerson) {
        System.out.println(currentPerson.getName()+" reached "+getOfficeTitle()+"...");
        System.out.println("Data seen: ");
        System.out.println("1- Name: "+currentPerson.getName());
        System.out.println("2- PCR Status: "+currentPerson.getPCRStatus());
        System.out.println("3- Special Conditions: " +currentPerson.getSpecialConditions());
        System.out.println("4- Places Visited: " +currentPerson.getPlacesVisited());
        System.out.println("5- Has fever: " +currentPerson.getHasFever());
        System.out.println("6- Has Cough: " +currentPerson.getHasCough());
        System.out.println("7- Allergies: " +currentPerson.getAllergies());

        if(currentPerson.getHasFever())
        {
            currentPerson.currentOffice=new PCROffice();
            currentPerson.currentOffice.displayData(currentPerson);
        }
        currentPerson.currentOffice=new ImmigrationOffice();
        currentPerson.currentOffice.displayData(currentPerson);
    }

    HealthOffice(){
        officeTitle="Health Office";
    }
    
}
