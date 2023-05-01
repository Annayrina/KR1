public class Employee {
    private final String fullName;
    private int department;
    private double sallary;
    private final long id;
    private static long newId;
    // newId сделаем private, чтобы из класса main нельзя было его поменять.
    // подсмотрел в разборе курсовой,про класс private;

    // Static - общий счетчик на все объекты;
    public Employee(String fullName, int department, double sallary) {
        // Конструктор, который влияет на написание значение массива.
        this.fullName = fullName;
        this.department = department;
        this.sallary = sallary;
        this.id = newId;
        newId = newId + 1;
        // Присвоили значение и с каждым следующим шагом увеличиваем на 1;
    }

    public String getFullName() {

        return fullName;
    }

    public int getDepartment() {

        return department;
    }

    public double getSallary() {

        return sallary;
    }

    public long getId() {

        return id;
    }
    // setter - изменяемый тип данных.( т.е мы можем менять значение settera)
    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSallary(double sallary) {

        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", sallary=" + sallary +
                ", id=" + id +
                '}';
    }
}
