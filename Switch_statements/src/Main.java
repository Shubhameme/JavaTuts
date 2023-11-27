public class Main {
    public static void main(String[] args) {

        int switchValue = 5;

        switch (switchValue) {
            // this is a new style switch statement want to switch to older one just right click and swap in context action.
            case 1 -> System.out.println("The value is 1");
            case 2 -> System.out.println("The value is 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5 ");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("was not 1,2,3,4 or 5");
        }
        String month = "April";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter "); // this state is using method call "getQuarter"
    }

    public static String getQuarter(String month) {
        //  this is a new style switch statement want to switch to older one just right click and swap in context action.
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> { // always remember to use default statement in switch otherwise it will throw an error.
                String badResponse = month + " is bad";
                yield badResponse; // yield is introduced to return a value back.
            }
        };
    }

}