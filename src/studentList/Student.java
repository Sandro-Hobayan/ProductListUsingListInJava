package studentList;

public class Student {

    private int id;
    private String name, course, section;

    public Student(int id, String name, String course, String section){
        this.id = id;
        this.name = name;
        this.course = course;
        this.section = section;
    }

    //for id
    public void setName(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    //for name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //for course
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    //for section
    public void setSection(String section){
        this.section = section;
    }
    public String getSection(){
        return section;
    }

    public void listOfStudent(){
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course + ", Section: " + section);
    }

}
