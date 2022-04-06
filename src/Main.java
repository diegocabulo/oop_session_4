import Entity.*;

public class Main {
    public static void main(String[] args) {
        JuniorEngineer juniorEngineer = new JuniorEng("Diego", "little money", false, "");

        SeniorEngineer seniorEngineer = new SeniorDev("Future diego", "acceptable money", true, "Project 1");

        TeachLead teachLead = new TeachLeadImpl("Diego in 6 years", "im rich baby", true, "projects x2");

        juniorEngineer.workAsJunior();

        seniorEngineer.workAsSenior();

        teachLead.workAsLead();

        teachLead.leadPeople();
    }
}
