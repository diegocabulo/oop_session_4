package Entity;

import model.Glober;

public class JuniorEng extends Glober implements JuniorEngineer {

    public JuniorEng(String globerName, String salary, boolean isInProject, String projectName) {
        super(globerName, salary, isInProject, projectName);
    }

    @Override
    public void workAsJunior() {
        System.out.println("im a junior dev i do junior dev things");
    }
}
