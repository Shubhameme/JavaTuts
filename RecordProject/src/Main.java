public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            LPAStudent s = new LPAStudent("77777" + i, switch (i) {
                case 1 -> "Marry";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },
                "07/11/1985", "Java Masterclass");
                System.out.println(s);
            }
            Student pojoStudent = new Student("S890001", "Anita", "23/02/2001", "Java Masterclass");
            LPAStudent recordStudent = new LPAStudent("890002", "Animesh", "05/03/2003", "Java Masterclasss");

            System.out.println(pojoStudent);
            System.out.println(recordStudent);

            System.out.println(pojoStudent.getName()+ " is taking " + pojoStudent.getClassList());
            System.out.println(recordStudent.name()+ " is taking " + recordStudent.classList());
        }
    }