package Entity;

import model.Glober;

public class TeachLeadImpl extends Glober implements TeachLead {
    public TeachLeadImpl(String globerName, String salary, boolean isInProject, String projectName) {
        super(globerName, salary, isInProject, projectName);
    }

    @Override
    public void workAsLead() {
        System.out.println("im a Teach Lead i do Teach Lead stuff");
    }

    @Override
    public void leadPeople() {
        System.out.println("I assign people to projects senior or junior, im the master of puppets");
    }
}
