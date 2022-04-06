package Entity;

import model.Glober;

public class SeniorDev extends Glober implements SeniorEngineer {
    public SeniorDev(String globerName, String salary, boolean isInProject, String projectName) {
        super(globerName, salary, isInProject, projectName);
    }

    @Override
    public void workAsSenior() {
        System.out.println("im a Senior dev i do Senior dev things");
    }
}
