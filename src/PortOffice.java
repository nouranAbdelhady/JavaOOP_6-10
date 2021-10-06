public class PortOffice extends Office{

    @Override
    public void displayData(Person currentPerson) {
        System.out.println(currentPerson.getName()+" reached "+getOfficeTitle()+"...");
        System.out.println("Data seen: ");
        System.out.println("1- Name: "+currentPerson.getName());
        System.out.println("2- PCR Status: "+currentPerson.getPCRStatus());
        System.out.println("3- Special Conditions: " +currentPerson.getSpecialConditions());
        currentPerson.currentOffice=new HealthOffice();
        currentPerson.currentOffice.displayData(currentPerson);
    }

    PortOffice(){
        officeTitle="Port Office";
    }
    
}
