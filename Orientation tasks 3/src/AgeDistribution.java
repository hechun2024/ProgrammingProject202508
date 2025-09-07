// task 3_2
import java.util.Random;

public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;
        final int MAXAGE = 35;

        // cumulative percentage table: {cumulative %, age}
        int agedistribution[][] = {
                {16, 20},  // If the number is 1–16, → pick age 20. Age 20 = 16%
                {34, 21},  //if the number is 17–34, → pick age 21. Age 21 = (34 – 16) = 18%
                {52, 22},  //if the number is 35–52, → pick age 22. Age 22 = (52 – 34) = 18%
                {68, 23},
                {82, 24},
                {89, 25},
                {94, 26},
                {96, 28},
                {98, 30},
                {100, 35}
        };

        int[] generatedAges = new int[MAXAGE + 1]; //  +1 to make index = the age.
        Random random = new Random();

        // Find which cumulative percentage row this number belongs to
        for (int i = 0; i < REITERATIONS; i++) {
            int x = random.nextInt(100) + 1;
            int j = 0;
            while (x > agedistribution[j][0]) j++;  // move down the table until the random number fits
            generatedAges[agedistribution[j][1]]++;  // Increase the count for the matching age，j is the row index.
        }


        System.out.println("Age  Count   %-Share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] > 0) { // only print ages that appeared
                double share = (double) generatedAges[age] / REITERATIONS * 100;
                // %-4d → left align width 4, %-8d → left align width 8, %-8.2f → 2 decimal places
                System.out.printf("%-4d %-8d %-8.2f\n", age, generatedAges[age], share);
            }
        }
    }
}

