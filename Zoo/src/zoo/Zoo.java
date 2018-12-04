package zoo;

import java.util.Scanner;

/**
 *
 * @author Mikayla Miller
 * MaKenzie Kennedy
 * Kristi Ando
 */
public class Zoo {
    public static void main(String[] args){
     //OBJECTS FOR THE BEARS
     Bear Beethoven = new Bear();
     EurasianBear Bach = new EurasianBear();
     BrownBear Brahm = new BrownBear();
     SlothBear Schubert = new SlothBear();
     
     //OBJECTS FOR THE MONKEYS
     Monkey Monteverdi = new Monkey();
     WhiteHeadedCapuchin Wagner = new WhiteHeadedCapuchin();
     PatasMonkey Purcell = new PatasMonkey();
     EmpororTamarin Weber = new EmpororTamarin();
     
     //OBJECTS FOR THE BIRDS
     Bird Britten = new Bird();
     Puffin Puccini = new Puffin();
     MagnificentFrigateBird Faure = new MagnificentFrigateBird();
     Pigeon Prokofiev = new Pigeon();
     
    Scanner Bob = new Scanner(System.in);
        System.out.println("Welcom to our Zoo! Here we have about 12 animals that decsend from\n"
                + "3 specific animals! You are welcome to explore an learn about which ever\n"
                + "animal you please; however, be careful, some of these animals can be very dangerous.\n"
                + "Let's begin your tour! You can press 1 to see the Bears, press 2 to see the Monkeys,\n"
                + "and press 3 to see the Birds:");
        int ZooFirstChoice = Bob.nextInt();
        
        
        switch(ZooFirstChoice)
        {
            case 1:
                System.out.println("BEARS");
                break;
                
            case 2:
                System.out.println("MONKEYS");
                break;
                
            case 3:
                System.out.println("BIRDS");
                break;
        }
       
    }
}
