import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name:");
        char[] nameArray = keyboard.nextLine().toLowerCase().toCharArray();

        for(int i=0; i<nameArray.length; i++) {
            printAlphabet(nameArray[i]);
            System.out.println();
        }
    }

    public static void printAlphabet(char ch) {
        switch(ch) {
        case 'a':
            printA();
            break;
        case 'b':
            printB();
            break;
        case 'c':
            printC();
            break;
        case 'd':
            printD();
            break;
        case 'e':
            printE();
            break;
        case 'f':
            printF();
            break;
        case 'g':
            printG();
            break;
        case 'h':
            printH();
            break;
        case 'i':
            printI();
            break;
        case 'j':
            printJ();
            break;
        case 'k':
            printK();
            break;
        case 'l':
            printL();
            break;
        case 'm':
            printM();
            break;
        case 'n':
            printN();
            break;
        case 'o':
            printO();
            break;
        case 'p':
            printP();
            break;
        case 'q':
            printQ();
            break;
        case 'r':
            printR();
            break;
        case 's':
            printS();
            break;
        case 't':
            printT();
            break;
        case 'u':
            printU();
            break;
        case 'v':
            printV();
            break;
        case 'w':
            printW();
            break;
        case 'x':
            printX();
            break;
        case 'y':
            printY();
            break;
        case 'z':
            printZ();
            break;
        }
    }
    
    public static void printA() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==6 || j==1 || j==10) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
	          }
	          System.out.println();
	      }
    }

    public static void printB() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1&&j<=9 || i==6&&j<=9 || i==10&&j<=9 || j==1 || j==10&&(i!=1&&i!=6&&i!=10)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printC() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==10 || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printD() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1&&j!=10 || i==10&&j!=10 || j==1 || j==10&&(i!=1&&i!=10)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printE() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==5 || i==10 || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printF() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==5 || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printG() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==10 || j==1 || i==6&&j>=6 || j==10&&i>=6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printH() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==5 || j==1 || j==10) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printI() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==10 || j==6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printJ() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==10&&j<=6 || j==6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printK() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(j==1 || i+j==7 || i-j==4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printL() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==10 || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printM() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(j==1 || j==10 || i==j&&i<=5 || i+j==11&&i<=5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printN() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(j==1 || j==10 || i==j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printO() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==10 || j==1 || j==10) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printP() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==5 || j==1 || j==10&&i<=5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printQ() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1&&j<=7 || i==7&&j<=7 || j==1&&i<=7 || j==7&&i<=7 || (i==j && i>=6))  {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printR() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==6 || j==1 || (j==10 && i<=6) || (i==j && i>=6)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printS() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==5 || i==10 || j==1&&i<=5 || j==10&&i>=6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printT() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || j==6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printU() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==10 || j==1 || j==10) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printV() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=20; j++) {
                if(i==j || i+j==21) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printW() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=40; j++) {
                if(i==j || i+j==21 || j-i==20 || j+i==41) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printX() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==j || i+j==11) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void printY() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==j&&i<=5 || i+j==11) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printZ() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(i==1 || i==10 || i+j==11) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
