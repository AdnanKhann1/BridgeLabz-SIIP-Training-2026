abstract class CourseType {
    abstract String getDetails();
}

class ExamCourse extends CourseType {
    public String getDetails() { return "Exam-Based Course"; }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) { this.courseType = courseType; }
    public void display() { System.out.println(courseType.getDetails()); }
}
