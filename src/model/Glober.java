package model;

public class Glober {
    private String globerName;
    private String salary;
    private boolean isInProject;
    private String projectName;

    public Glober(String globerName, String salary, boolean isInProject, String projectName) {
        this.globerName = globerName;
        this.salary = salary;
        this.isInProject = isInProject;
        this.projectName = projectName;
    }

    public String getGloberName() {
        return globerName;
    }

    public void setGloberName(String globerName) {
        this.globerName = globerName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public boolean isInProject() {
        return isInProject;
    }

    public void setInProject(boolean inProject) {
        isInProject = inProject;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
