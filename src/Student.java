public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    float averageGradeInMathematics;
    float averageGradeInEconomics;
    float averageGradeInForeignLanguages;
}

class StudentTest {

    double sreadArifmeticheskayOcenka(Student st) {
        double srednOcenka = (st.averageGradeInMathematics + st.averageGradeInEconomics + st.averageGradeInForeignLanguages) / 3;
        System.out.println("Средняя арифметическая оценка студента" + " " + st.surname + " " + st.name + "=" + srednOcenka);
        return srednOcenka;

    }

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.studentId = 1;
        st1.name = "Вова";
        st1.surname = "Попов";
        st1.course = 4;
        st1.averageGradeInMathematics = 15;
        st1.averageGradeInEconomics = 10;
        st1.averageGradeInForeignLanguages = 21;

        st2.studentId = 2;
        st2.name = "Вадим";
        st2.surname = "Макаров";
        st2.course = 2;
        st2.averageGradeInMathematics = 5;
        st2.averageGradeInEconomics = 15;
        st2.averageGradeInForeignLanguages = 11;

        st3.studentId = 3;
        st3.name = "Алексей";
        st3.surname = "Парыгин";
        st3.course = 1;
        st3.averageGradeInMathematics = 15;
        st3.averageGradeInEconomics = 12;
        st3.averageGradeInForeignLanguages = 5;

        StudentTest sreadArifmeticheskayOcenka2= new StudentTest();
        sreadArifmeticheskayOcenka2.sreadArifmeticheskayOcenka(st1);
        sreadArifmeticheskayOcenka2.sreadArifmeticheskayOcenka(st2);
        sreadArifmeticheskayOcenka2.sreadArifmeticheskayOcenka(st3);
    }
}

