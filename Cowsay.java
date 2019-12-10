
public class Cowsay {

    //List available cows
    private static void listCows(Cow[] cows) {
        for (int i = 0; i < cows.length; i++) {
            if (i == cows.length - 1) {
                System.out.print(cows[i].getName() + "\n");
            } else {
                System.out.print(cows[i].getName() + " ");
            }
        }
    }

    //Find cow by name
    private static Cow findCow(String name, Cow[] cows) {
    	
    	Cow foundCow = null;
    	
        for (int i = 0; i < cows.length; i++) {
            if (name.equals(cows[i].getName())) {
                foundCow = cows[i];
            }
        }
        return foundCow;
    }
    
    public static void main (String[] args) {
        
        String[] command = args;

        //Generates the cows
        Cow[] cows = HeiferGenerator.getCows();
        Cow[] fileCows = HeiferGenerator.getFileCows();

        if (command[0].equals("-1")) {
            System.out.print("Regular cows available: ");
            listCows(cows);
            System.out.print("File cows available: ");
            listCows(fileCows);
        } else if (command[0].equals("-n")) {
            Cow newCow = findCow(command[1], cows);

            if(newCow == null) {
                System.out.println("Could not find " + command[1] + " cow!");
            } else {
                for (int i = 2; i < command.length; i++) {
                    if (i == command.length - 1) {
                        System.out.print(command[i]);
                    } else {
                        System.out.print(command[i] + " ");
                    }
                }

                System.out.println();
                System.out.println(newCow.getImage());

                //If the cow is a dragon, checks if it can breathe fire.
                if(newCow instanceof Dragon) {
                    if(((Dragon) newCow).canBreatheFire()) {
                        System.out.println("This dragon can breathe fire.");
                    } else if (!((Dragon) newCow).canBreatheFire()) {
                        System.out.println("This dragon cannot breathe fire.");
                    }
                }
            }
        } else if (command[0].equals("-f")) { //Prints the cow message with a specific file cow
            Cow newFileCow = findCow(command[1], fileCows);
        	//Check if the specific cow is available/exists
            if(newFileCow == null) { 
                System.out.println("Could not find " + command[1] + " cow!");
            } else {
                //Print message from command argument
                for (int i = 2; i < command.length; i++) {
                    if (i == command.length - 1) {
                        System.out.print(command[i]);
                    } else {
                        System.out.print(command[i] + " ");
                    }
                }

                System.out.println();
                //Prints specific cow
                System.out.println(newFileCow.getImage()); 
            }
        } else {
            for (int i = 0; i < command.length; i++) {
                if (i == command.length - 1) {
                    System.out.print(command[i]);
                } else {
                    System.out.print(command[i] + " ");
                }
            }
            System.out.println();
            System.out.println(cows[0].getImage());
        }
    }
}
