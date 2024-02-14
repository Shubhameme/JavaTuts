public class Student {
    private String id;
    private String Name;
    private String DateOfBirth;
    private String ClassList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        Name = name;
        DateOfBirth = dateOfBirth;
        ClassList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", ClassList='" + ClassList + '\'' +
                '}';

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return ClassList;
    }

    public void setClassList(String classList) {
        ClassList = classList;
    }
}
