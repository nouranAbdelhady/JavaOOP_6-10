public class PCROffice extends Office{

    @Override
    public void displayData(Person currentPerson) {
        System.out.println(currentPerson.getName()+" reached "+getOfficeTitle()+"...");
        System.out.println("Data seen: ");
        System.out.println("1- Name: "+currentPerson.getName());
        System.out.println("2- Has fever: " +currentPerson.getHasFever());
        System.out.println("3- Has Cough: " +currentPerson.getHasCough());
    }

    PCROffice(){
        officeTitle="PCR Office";
    }
    
}
