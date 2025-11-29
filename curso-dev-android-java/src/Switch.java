import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        int nota;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        nota = scanner.nextInt();
        switch (nota){
            case 9:
            case 10:
                System.out.println("Otimo!");
                break;
            
            case 8:
                System.out.println("Bom!");
                 break;

            case 7:
                System.out.println("Regular!");
                 break;

            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Ruim!");
                 break;

            default:
                System.out.println("Não é permitido nota menor que 0, e maior que 10!");    

        }




        scanner.close();
        
        }
    }

