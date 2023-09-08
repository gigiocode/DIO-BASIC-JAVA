package SelectionProcess;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {
    public static void main(String[] args) {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidate : candidates) {
            callCandidate(candidate);
        }
    }

    static void callCandidate(String candidate) {

        int triedCalls = 1;
        boolean keepTrying = true;
        boolean succeed = false;
        do {
            succeed = answer();
            keepTrying = !succeed;
            if (keepTrying)
                triedCalls++;
            else
                System.out.println("Succesfull Contact!");

        } while (keepTrying && triedCalls < 3);

        if (succeed)
            System.out.println("Succesfull Contact whith " + candidate + " at the #" + triedCalls + " try.");
        else
            System.out.println("UNABLE TO CONTACT THE APPLICANT " + candidate + " AFTER TRYING "
                    + triedCalls + " TIMES.");

    }

    // Auxiliary method
    static boolean answer() {
        return new Random().nextInt(3) == 1;
    }

    static void chosenList() {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Print candidate List with index");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("The candidate number #" + (i + 1) + " is " + candidates[i]);
        }

        for (String candidate : candidates) {
            System.out.println("The chosen candidate was " + candidate);
        }
    }

    static void candidateSelection() {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatesSelected = 0;
        int candidatesIndex = 0;
        double wageBase = 2000.0;
        while (candidatesSelected < 5 && candidatesIndex < candidates.length) {
            String candidate = candidates[candidatesIndex];
            double wageExpected = valueExpected();

            System.out.println("The candidate " + candidate + " expects the wage = U$ " + wageExpected);
            if (wageBase >= wageExpected) {

                System.out.println("The candidate " + candidate + " was selected.");
                candidatesSelected++;
            }
            candidatesIndex++;

        }

    }

    static double valueExpected() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void candidateAnalysis(double wageExpected) {
        double wageBase = 2000.0;
        if (wageBase > wageExpected) {
            System.out.println("Call the candidate.");
        } else if (wageBase == wageExpected) {
            System.out.println("Offer counter-proposal.");
        } else {
            System.out.println("Wait for other candidates.");
        }
    }
}
