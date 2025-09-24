/**
 * Hands-On Practice: Switch Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand switch statement syntax
 * 2. Practice using switch with different data types
 * 3. Learn when to use switch vs if-else if
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Try different values to test all cases
 */

public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT EXERCISES ===\\n");

        // TODO 1: Day of Week
        // Write a switch statement for day numbers (1-7):
        // 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday"
        // 5: "Friday", 6: "Saturday", 7: "Sunday"
        // default: "Invalid day"
        int dayNumber = 3;
        // Your code here:
        String namaHari;
        switch (dayNumber) {
            case 1:
                namaHari ="Monday";
                break;
            case 2:
                namaHari ="Tuesday";
                break;
            case 3:
                namaHari ="Wednesday";
                break;
            case 4:
                namaHari ="Thursday";
                break;
            case 5:
                namaHari ="Friday";
                break;
            case 6:
                namaHari ="Saturday";
                break;
            case 7:
                namaHari ="Sunday";
                break;
            default:
                namaHari = "Invalid";
        }
        System.out.println("Today Is " + namaHari);

        // TODO 2: Grade to GPA
        // Write a switch statement for letter grades:
        // 'A': "4.0 GPA", 'B': "3.0 GPA", 'C': "2.0 GPA"
        // 'D': "1.0 GPA", 'F': "0.0 GPA"
        // default: "Invalid grade"
        char letterGrade = 'B';
        // Your code here:
        String IPK;

        switch (letterGrade) {
            case 'A':
                IPK = "4.0 GPA";
                break;
            case 'B':
                IPK = "3.0 GPA";
                break;
            case 'C':
                IPK = "2.0 GPA";
                break;
            case 'D':
                IPK = "1.0 GPA";
                break;
            case 'F':
                IPK = "0.0 GPA";
                break;
            default:
                IPK = "Invalid Grade";
        }
        System.out.println("Your GPA: "+ IPK);



        // TODO 3: Month Days
        // Write a switch statement for months (1-12) showing number of days:
        // 1,3,5,7,8,10,12: "31 days"
        // 4,6,9,11: "30 days"
        // 2: "28 or 29 days"
        // default: "Invalid month"
        int month = 4;
        // Your code here:
        String bulan;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                bulan ="31 Days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                bulan ="30 Days";
                break;
            case 2:
                bulan = "28 or 29 Days";
                break;
            default:
                bulan = "Invalid Month";

        }
        System.out.println("This Month has " + bulan);


        // TODO 4: Traffic Light Action
        // Write a switch statement for traffic light colors:
        // "red": "Stop and wait"
        // "yellow": "Prepare to stop"
        // "green": "Go safely"
        // default: "Invalid signal"
        String trafficLight = "yellow";
        // Your code here:
        String warna;
        switch (trafficLight) {
            case "red":
                warna ="Stop and wait";
                break;
            case "yellow":
                warna ="Prepare to stop";
                break;
            case "green":
                warna ="Go safely";
                break;
            default:
                warna = "Invalid signal";
                break;

        }
        System.out.println(warna);


        // TODO 5: Calculator Operations
        // Write a switch statement for basic math operations:
        // '+': "Addition operation"
        // '-': "Subtraction operation"
        // '*': "Multiplication operation"
        // '/': "Division operation"
        // default: "Unknown operation"
        char operation = '*';
        // Your code here:
        String opr;
        switch (operation){
            case '+':
                opr ="Addition operation";
                break;
            case '-':
                opr ="Subtraction operation";
                break;
            case '*':
                opr ="Multiplication operation";
                break;
            case '/':
                opr ="Division operation";
                break;
            default:
                opr ="Unknown operation";
        }
        System.out.println(opr);

        // TODO 6: Season by Month
        // Write a switch statement grouping months into seasons:
        // 12,1,2: "Winter"
        // 3,4,5: "Spring"
        // 6,7,8: "Summer"
        // 9,10,11: "Fall"
        // default: "Invalid month"
        int seasonMonth = 7;
        // Your code here:
        String bln;

        switch (seasonMonth){
            case 1:
            case 2:
            case 12:
                bln = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                bln = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                bln = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                bln = "Fall";
                break;
            default:
                bln = "Invalid Month";
        }
        System.out.println(bln);


        // TODO 7: Exam Grade Range
        // Write a switch statement for score ranges (use score/10):
        // 10,9: "Excellent"
        // 8: "Very good"
        // 7: "Good"
        // 6: "Satisfactory"
        // default: "Needs improvement"
        int examScore = 85; // Hint: use examScore/10 in switch
        // Your code here:
        String grd;

        switch (examScore / 10){
            case 10:
            case 9:
                grd = "Excellent";
                break;
            case 8:
                grd= "Very good";
                break;
            case 7:
                grd ="Good";
                break;
            case 6:
                grd = "Satisfactory";
                break;
            default:
                grd = "Needs improvement";
        }
        System.out.println(grd);


        // TODO 8: Browser Type
        // Write a switch statement for browser names:
        // "chrome": "Google Chrome browser"
        // "firefox": "Mozilla Firefox browser"
        // "safari": "Apple Safari browser"
        // "edge": "Microsoft Edge browser"
        // default: "Unknown browser"
        String browser = "chrome";
        // Your code here:
        String bwr;
        switch (browser){
            case "chrome":
                bwr = "Google Chrome browser";
                break;
            case "firefox":
                bwr ="Mozilla Firefox browser";
                break;
            case "safari":
                bwr ="Apple Safari browser";
                break;
            case "edge":
                bwr = "Microsoft Edge browser";
                break;
            default:
                bwr ="Unknown browser";
        }
        System.out.println(bwr);

        // TODO 9: Priority Level
        // Write a switch statement for priority numbers:
        // 1: "Critical priority"
        // 2: "High priority"
        // 3: "Medium priority"
        // 4: "Low priority"
        // default: "Invalid priority"
        int priority = 2;
        // Your code here:
        String prt;
        switch (priority){
            case 1:
                prt = "Critical priority";
                break;
            case 2:
                prt ="High priority";
                break;
            case 3:
                prt = "Medium priority";
                break;
            case 4:
                prt = "Low priority";
                break;
            default :
                prt = "Invalid priority";
        }
System.out.println(prt);


        // TODO 10: File Extension
        // Write a switch statement for file extensions:
        // "jpg", "png", "gif": "Image file"
        // "mp4", "avi", "mkv": "Video file"
        // "txt", "doc", "pdf": "Document file"
        // default: "Unknown file type"
        String fileExtension = "png";
        // Your code here:
        String fe;
        switch (fileExtension){
            case "jpg":
            case "png":
            case "gif":
                fe = "Image file";
                break;
            case "mp4":
            case "avi":
            case "mkv":
                fe ="Video file";
                break;
            case "txt":
            case "doc":
            case "pdf":
                fe = "Document file";
                break;
            default:
                fe = "Unknown file type";
        }
        System.out.println(fe);

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * switch (variable) {
 *     case value1:
 *         // code for value1
 *         break;
 *     case value2:
 *         // code for value2
 *         break;
 *     default:
 *         // code for default case
 * }
 *
 * KEY POINTS:
 * - Use break; to prevent fall-through
 * - default case is optional but recommended
 * - Switch works with: int, char, String, enum
 * - Multiple cases can share the same code block
 * - Cases must be constant values (not variables)
 */
