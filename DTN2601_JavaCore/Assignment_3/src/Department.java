public class Department implements Comparable<Department> {
    int departmentID;
    String departmentName;

    public Department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{id=" + departmentID + ", name='" + departmentName + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Department)) return false;
        Department other = (Department) obj;
        return this.departmentName.equals(other.departmentName);
    }

    @Override
    public int compareTo(Department other) {
        return this.departmentName.compareToIgnoreCase(other.departmentName);
    }
}
