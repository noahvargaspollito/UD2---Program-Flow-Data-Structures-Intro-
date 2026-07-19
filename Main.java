////  NAME: NOAH VARGAS POLO
////  UPDATED FOR UD2 THIS TIME NO PARTNERS BUT STILL HAS PRIOR METHODS

import java.util.Scanner;

public class Main {

  // ===============================================================
  // MAIN METHOD
  // ===============================================================
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome! Please type in a number to learn more about the following topics: "); // , 123]
    System.out.println("1. Endangered Status\n2. Anatomical Facts\n3. Fun Facts\n4. Scientific Names\n5. Projected Population Growth\n6. Projected Population Decline\n7. Diet\n8. Habitat"); // , 124]

    int userSelection = scanner.nextInt();

    switch (userSelection) {
      case 1:

        String[] statuses = {"Critically Endangered", "Endangered", "Vulnerable", "Endangered"};
        String[] speciesNames = {"Northern", "Reticulated", "Southern", "Masai"};

        System.out.println("Which species would you like to see the status of?");
        System.out.println("1. Northern\n2. Reticulated\n3. Southern\n4. Masai");

        //using a utilitybelt feature
        int choice = UtilityBelt.readInt("Enter number (1-4): ", 1, 4);


        System.out.println("The " + speciesNames[choice - 1] + " giraffe is: " + statuses[choice - 1]);
        break;

      case 2:
        // ANATOMICAL FACTS VARIABLES (meters)
        double largestPossibleNeckLength = 1.8;
        double largestPossibleLegLength = 1.8;
        double largestPossibleFemaleHeight = 4.2672;
        double largestPossibleMaleHeight = 5.4864;
        double heartSize = 0.6096;

        System.out.println("\n--- Anatomical Facts (Meters) ---");
        System.out.println("Max Neck Length:    " + largestPossibleNeckLength + " meters");
        System.out.println("Max Leg Length:     " + largestPossibleLegLength + " meters");
        System.out.println("Max Female Height:  " + largestPossibleFemaleHeight + " meters");
        System.out.println("Max Male Height:    " + largestPossibleMaleHeight + " meters");
        System.out.println("Heart Size Length:  " + heartSize + " meters");
        break;

      case 3:

        funFacts();
        break;

      case 4:

        scientificNames();
        break;

      case 5:

        int totalPopulation = 140000;

        System.out.println("\nEnter number of years into the future:");
        int growthYears = scanner.nextInt();


        calculateGrowth(totalPopulation, growthYears);
        break;

      case 6:
        // PRIOR POPULATION VARIABLES
        int popIn1980s = 155000;
        int popIn2026 = 140000;


        calculateDecline(popIn1980s, popIn2026);
        break;

      case 7:
        // DIET VARIABLES (percent) ]
        String consumes = "herbs, climbers, vines, flowers, fruits, and grass"; // ]
        int feedingTime = 75; // ]

        System.out.println("\n--- Diet ---");
        System.out.println("Giraffes consume: " + consumes);
        System.out.println("Feeding Time: Spends " + feedingTime + "% of the day eating.");
        break;

      case 8:
        // HABITAT VARIABLES ]
        String continent = "Africa"; // ]
        String biomes = "savannas, grasslands, and woodlands"; // ]

        System.out.println("\n--- Habitat ---");
        System.out.println("Continent: " + continent);
        System.out.println("Biomes: " + biomes);
        break;

      default:
        System.out.println("Please enter in a valid number"); // ]
        break;
    }

    scanner.close();
  }

  // ===============================================================
  // STATIC METHODS BY GROUP MEMBERS
  // ===============================================================


  public static void calculateGrowth(int currentPop, int years) {
    // Calculation/Transformation: assume an increase of 2100 giraffes a year
    int projectedPop = currentPop + (2100 * years);
    System.out.println("In " + years + " years, the projected population grows to: " + projectedPop);
  }


  public static void calculateDecline(int pastPop, int currentPop) {
    // Calculation: tracks net loss
    int loss = pastPop - currentPop;


    double percentLoss = ((double) loss / pastPop) * 100;

    System.out.println("\n--- Population Decline ---");
    System.out.println("Population drop since 1980s: " + loss + " giraffes.");
    System.out.printf("Percentage Decline: %.2f%% decrease%n", percentLoss);
  }

  /*
   * Prints fun facts about giraffes.
   * Katelyn Ho's method(s)
   */
  public static void funFacts() {
    boolean matriarchal = true;
    int avgLifeSpan = 13;
    double recordSpeed = 34.7;
    String eyeballSize = "golf balls";

    System.out.println("Did you know that it is " + matriarchal + " that giraffes are matriarchal?");
    System.out.println("Their average life span is " + avgLifeSpan + " years!");
    System.out.println("The fastest recorded speed of giraffes is " + recordSpeed + " miles per hour. Pretty fast right?");
    System.out.println("You will never believe this, but giraffes have eyeballs the size of " + eyeballSize + "!");
  }

  /*

   * Katelyn Ho's method(s)
   */
  public static void scientificNames() {
    //  at least one array
    String[] common = {"Northern", "Southern", "Masai", "Reticulated"};
    String[] scientific = {"G. camelopardalis", "G. giraffa", "G. tippelskirchi", "G. reticulata"};

    System.out.println("\n--- Scientific Names ---");

    //one loop
    for (int i = 0; i < common.length; i++) {
      // Using concatenation (+) to join array values with a String literal [1, 3]
      System.out.println(common[i] + " giraffe scientific name: " + scientific[i]);
    }
  }
}