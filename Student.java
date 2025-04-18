// Student.java

class Student {
    private String name;
    private int prn;
    private String dob;
    private String branch;
    private String batch;
    private float cgpa;

    public Student(String name, int prn, String dob, String branch, String batch, float cgpa) {
        this.name = name;
        this.prn = prn;
        this.dob = dob;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    public String getName() { return name; }
    public int getPrn() { return prn; }
    public String getDob() { return dob; }
    public String getBranch() { return branch; }
    public String getBatch() { return batch; }
    public float getCgpa() { return cgpa; }

    public void setName(String name) { this.name = name; }
    public void setPrn(int prn) { this.prn = prn; }
    public void setDob(String dob) { this.dob = dob; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setBatch(String batch) { this.batch = batch; }
    public void setCgpa(float cgpa) { this.cgpa = cgpa; }

    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DoB: " + dob + ", Branch: " + branch + ", Batch: " + batch + ", CGPA: " + cgpa);
    }
}
