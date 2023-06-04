import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz..."); // Kullanıcıdan sıcaklık değeri isteniyor (Prompt the user to enter the temperature)
        temp = scanner.nextInt();

        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz."); // Sıcaklık 5'ten küçükse kayak yapma önerisi (You can go skiing if the temperature is less than 5)
        } else {
            if (temp >= 5 && temp <= 15) {
                System.out.println("Sinemaya gidebilirsiniz."); // Sıcaklık 5 ile 15 arasındaysa sinemaya gitme önerisi (You can go to the cinema if the temperature is between 5 and 15)
            } else {
                if (temp > 15 && temp <= 25) {
                    System.out.println("Pikniğe gidebilirsiniz."); // Sıcaklık 15 ile 25 arasındaysa piknik yapma önerisi (You can go for a picnic if the temperature is between 15 and 25)
                } else {
                    System.out.println("Yüzmeye gidebilirsiniz."); // Sıcaklık 25'ten büyükse yüzmeye gitme önerisi (You can go swimming if the temperature is greater than 25)
                }
            }
        }
    }
}
