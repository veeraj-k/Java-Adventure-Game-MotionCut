import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");

        String name = input.nextLine();

        String[] names = {"Bob", "Carol", "Larry", "Benjamin", "Matthew",
                "Julia", "Clark", "Zoe", "Kenneth", "Jim",
                "Nathan", "Amanda", "Jake", "Mark", "Ally",
                "Stephen", "Megan", "Lori", "Jonathan","Tristan"};

        String[] pronouns = {"t","t","t","t"};
        System.out.print("Is this a boy (1) or girl (2) name: ");
        int a = input.nextInt();
        if (a == 1){
            pronouns[0] = "he";
            pronouns[1] = "him";
            pronouns[2] = "his";
            pronouns[3]= "himself";
        }
        else{
            pronouns[0] = "she";
            pronouns[1] = "her";
            pronouns[2] = "her";
            pronouns[3] = "herself";
        }

        boolean playGame = true;

        while(playGame == true){
            //************************************* GAME START *************************************
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            boolean goodGuy = true;
            boolean armor = false;
            boolean dead = false;

            System.out.println("\n\n\n****************************************");
            System.out.println("       The Adventures of " + name);
            System.out.println("****************************************");

            System.out.println("In the mystical land of Eldoria, there lived a legendary adventurer named " + name + ". ");
            System.out.println(name + " was known for " + pronouns[2] + " incredible skills in swordsmanship and magic.");
            System.out.println("However, a dark prophecy foretells of an impending disaster that could plunge Eldoria into chaos.");
            System.out.println("To prevent this, " + name + " must embark on a perilous journey to uncover the truth and save the realm.");


            System.out.println("As " + name + " prepares for the quest, a mysterious figure approaches with a cryptic message.");
            System.out.println("'Beware, " + name + ", for the path ahead is treacherous. Choose your actions wisely, for destiny awaits.'");
            System.out.println("Enter 1 or 2: ");
            System.out.println("\t\t1. Speak to the mysterious figure\n\t\t2. Begin the journey without engaging");

            int choice = input.nextInt();

            if (choice == 1){
                System.out.println("The figure reveals ancient knowledge about a hidden artifact that can unlock " + pronouns[2] + " true potential.");
                System.out.println("'Seek the Crystal of Lumaria in the Enchanted Forest,' the figure whispers. 'It holds the key to your destiny.'");
                System.out.println("Enter 1 to accept the quest or 2 to ignore the advice.");

                choice = input.nextInt();

                if (choice == 1){
                    System.out.println("Armed with determination, " + name + " sets forth towards the Enchanted Forest.");
                    System.out.println("Along the way, " + name + " encounters a wise old wizard who offers guidance.");
                    System.out.println("'To reach the Crystal of Lumaria, you must navigate through the mystical fog or face dire consequences.'");
                    System.out.println("\t\t1. Trust the wizard and navigate through the fog\n\t\t2. Ignore the wizard's advice and charge forward");

                    choice = input.nextInt();

                    if (choice == 1){
                        System.out.println("Following the wizard's advice, " + name + " successfully navigates through the enchanted fog.");
                        System.out.println("In the heart of the forest, " + pronouns[0] + " discovers the radiant Crystal of Lumaria, radiating with ancient magic.");
                        armor = true;
                    }
                    else {
                        System.out.println("Disregarding the wizard's warning, " + name + " charges forward into the fog and gets lost.");
                        System.out.println("After hours of wandering, " + pronouns[0] + " encounters a menacing creature and must engage in a fierce battle.");
                        if (!armor){
                            System.out.println(name + " succumbs to the creature's attack. The journey ends in defeat.");
                            dead = true;
                        }
                        else{
                            System.out.println("Fortunately, the armor received earlier saves " + pronouns[2] + " from a fatal blow.");
                            System.out.println(name + " defeats the creature and continues the quest with newfound caution.");
                        }
                    }
                }

                choice = 2;
            }
            //************ACT I
            if (choice == 2){
                System.out.println(name + " decides to start the journey without engaging further with the mysterious figure.");
                System.out.println("The path ahead is divided into two trails: one leading to the Enchanted Forest and the other to the Cursed Mountains.");
                System.out.println("\t\t1. Head to the Enchanted Forest\n\t\t2. Traverse the Cursed Mountains");

                choice = input.nextInt();

                //Enchanted Forest
                if (choice == 1){
                    System.out.println(name + " ventures into the mystical Enchanted Forest, captivated by the ethereal surroundings.");
                    System.out.println("Within the forest, " + pronouns[0] + " encounters a group of friendly sprites who offer guidance.");
                    System.out.println("'To find the Crystal of Lumaria, you must answer our riddles,' the sprites declare.");
                    System.out.println("\t\t1. Accept the challenge and answer the riddles\n\t\t2. Decline and continue without solving the riddles");

                    choice = input.nextInt();

                    if (choice==1){
                        System.out.println("Embracing the challenge, " + name + " successfully answers the sprites' riddles.");
                        System.out.println("In gratitude, the sprites guide " + pronouns[2] + " to the Crystal of Lumaria, hidden in a secret glade.");
                        armor = true;
                    }
                    else if (choice == 2){
                        System.out.println("Opting to continue without solving the riddles, " + name + " faces unexpected challenges.");
                        System.out.println("A mischievous spirit casts a spell, creating illusions and confusion.");
                        System.out.println("Navigate through the illusions to reach the heart of the forest.");
                    }
                }
                //Cursed Mountains
                else{
                    System.out.println(name + " braves the treacherous Cursed Mountains, shrouded in an eerie mist.");
                    System.out.println("Deep within the mountains, " + name + " discovers an ancient shrine guarded by spectral beings.");
                    System.out.println("The beings offer a choice: embrace the shadows for increased power or resist the darkness.");

                    System.out.println("\t\t1. Embrace the shadows for increased power\n\t\t2. Resist the darkness and follow the path of light");

                    choice = input.nextInt();

                    if (choice == 1){
                        System.out.println("Choosing to embrace the shadows, " + name + " gains dark powers, enhancing " + pronouns[2] + " combat skills.");
                        System.out.println("The shadows guide " + pronouns[0] + " to a hidden passage leading directly to the Crystal of Lumaria.");
                    }
                    else{
                        System.out.println("Resisting the darkness, " + name + " harnesses the power of light to dispel the shadows.");
                        System.out.println("The spectral beings, impressed by " + pronouns[2] + " purity, reveal the location of the Crystal of Lumaria.");
                        armor = true;
                    }
                }
            }

            //************ACT II
            if (dead == false){
                System.out.println("\n\n" + name + " reaches the Crystal of Lumaria and witnesses its radiant glow.");
                System.out.println("As " + pronouns[0] + " touches the crystal, visions of a forgotten past and a looming threat fill " + pronouns[2] + " mind.");

                System.out.println("\n'The fate of Eldoria hangs in the balance,' whispers the crystal. 'A darkness awakens, and you are the chosen one to face it.'");
                System.out.println("With newfound purpose, " + name + " returns to the realm, ready to confront the rising darkness.");

                System.out.println("\nApproaching the kingdom, " + name + " sees signs of chaos and destruction.");
                System.out.println("'The Dark Lord has risen,' echoes a voice in " + pronouns[2] + " mind. 'Choose your path wisely, for the fate of Eldoria rests on your decisions.'");

                System.out.println("\t\t1. Infiltrate the Dark Citadel\n\t\t2. Rally the Kingdom's Armies for a Final Battle");
                choice = input.nextInt();

                if (choice == 1){
                    System.out.println("Opting to infiltrate the Dark Citadel alone, " + name + " sneaks through the shadows.");
                    System.out.println("Inside, " + pronouns[0] + " faces sinister minions and dark enchantments.");
                    System.out.println("As " + pronouns[0] + " reaches the heart of the Citadel, the Dark Lord emerges from the shadows.");

                    System.out.println("\n'I have been expecting you, " + name + ",' the Dark Lord sneers. 'Join me, and together we can rule Eldoria.'");
                    System.out.println("\t\t1. Reject the Dark Lord and engage in an epic battle\n\t\t2. Consider the Dark Lord's offer");

                    choice = input.nextInt();

                    if (choice == 1){
                        System.out.println("With unwavering resolve, " + name + " rejects the Dark Lord's offer and engages in an epic battle.");
                        System.out.println(pronouns[0] + " fights valiantly, using the powers of the Crystal of Lumaria to weaken the Dark Lord.");
                        System.out.println("In a climactic showdown, " + name + " emerges victorious, banishing the darkness from Eldoria.");
                    }
                    else{
                        System.out.println("Considering the Dark Lord's offer, " + name + " faces a moral dilemma.");
                        System.out.println("In the end, " + pronouns[0] + " chooses the path of light and engages in a fierce battle against the Dark Lord.");
                        System.out.println("With the powers of the Crystal of Lumaria, " + name + " overcomes the darkness and restores peace to Eldoria.");
                    }
                }
                else{
                    System.out.println("Deciding to rally the kingdom's armies, " + name + " becomes a beacon of hope for Eldoria.");
                    System.out.println("A grand army assembles, and " + pronouns[0] + " leads them into an epic battle against the forces of the Dark Lord.");

                    System.out.println("\nAs the battle rages on, the Dark Lord emerges, wielding dark powers that threaten to consume Eldoria.");
                    System.out.println("\t\t1. Confront the Dark Lord in a one-on-one duel\n\t\t2. Unleash the power of the Crystal of Lumaria to weaken the Dark Lord");

                    choice = input.nextInt();

                    if (choice == 1){
                        System.out.println("Facing the Dark Lord in a one-on-one duel, " + name + " showcases " + pronouns[2] + " unparalleled combat skills.");
                        System.out.println("In a battle of strength and will, " + name + " defeats the Dark Lord, bringing an end to the darkness.");
                    }
                    else{
                        System.out.println("Harnessing the power of the Crystal of Lumaria, " + name + " weakens the Dark Lord's dark powers.");
                        System.out.println("The kingdom's armies, empowered by " + pronouns[2] + " presence, launch a final assault against the Dark Lord.");
                        System.out.println("In the climactic battle, " + name + " and the armies of Eldoria emerge victorious, banishing the darkness from the realm.");
                    }
                }
            }

            System.out.println("*************************************************************");
            System.out.println("                        The End ");
            System.out.println("*************************************************************");

            System.out.println("Would you like to play again (Y or N, you may need to type it twice): ");
            String playerChoice = input.nextLine();
            input.nextLine();

            if (playerChoice.equals("N")){
                playGame = false;
            }
        } // while loop
    }// public static void main

} // class Main
