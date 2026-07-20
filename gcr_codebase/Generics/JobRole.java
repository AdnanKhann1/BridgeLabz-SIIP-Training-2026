abstract class JobRole {
    abstract String getRole();
}

class SoftwareEngineer extends JobRole {
    public String getRole() { return "Software Engineer"; }
}

class Resume<T extends JobRole> {
    private T role;

    public Resume(T role) { this.role = role; }
    public void process() { System.out.println("Screening for: " + role.getRole()); }
}
