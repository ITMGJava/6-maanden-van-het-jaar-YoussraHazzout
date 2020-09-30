import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Bent u de nummering van de maanden vergeten? Geen probleem! ");

        for (; ;) {
            System.out.println();
            System.out.print("Voer een cijfer tussen de 1-12 in:");
        int maand = s.nextInt();
        System.out.println();
            if (maand <= 0) {
                System.out.println("Let op! Voer een cijfer in tussen 1-12.");
            } else {
                if (maand > 12) {
                    System.out.println("Let op! Voer een cijfer in tussen 1-12.");
                }
                switch (maand){
                    case 1:
                        System.out.println("1 is de maand januari");
                        break;
                    case 2:
                        System.out.println("2 is de maand februari");
                        break;
                    case 3:
                        System.out.println("3 is de maand maart");
                        break;
                    case 4:
                        System.out.println("4 is de maand april");
                        break;
                    case 5:
                        System.out.println("5 is de maand mei");
                        break;
                    case 6:
                        System.out.println("6 is de maand juni");
                        break;
                    case 7:
                        System.out.println("7 is de maand juli");
                        break;
                    case 8:
                        System.out.println("8 is de maand augustus");
                        break;
                    case 9:
                        System.out.println("9 is de maand september");
                        break;
                    case 10:
                        System.out.println("10 is de maand oktober");
                        break;
                    case 11:
                        System.out.println("11 is de maand november");
                        break;
                    case 12:
                        System.out.println("12 is de maand december");

                }
            }
            }
        }
    }
