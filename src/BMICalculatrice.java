import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculatrice {
    public static void main(String[] args) throws IOException {

        float heightMigisha;
        float weightMigisha ;
        float bmiMigisha;

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

        System.out.println( " The program will calculate your BMI ");
        System.out.println( " Enter your height in cm (and press Enter): ");
        heightMigisha = Float.parseFloat( br.readLine())/100;
        System.out.println( " Enter your weight (and press Enter) : ");
        weightMigisha = Float.parseFloat(br.readLine());

        bmiMigisha = (float) (weightMigisha /(Math.pow(heightMigisha,2)));
        System.out.printf("Your BMI is : " + " %2.2f ,\n ",bmiMigisha);

        if (bmiMigisha< 16){
            System.out.printf(" You are starving ");
        } else if (( bmiMigisha >= 16)&& (bmiMigisha < 16.99)){
            System.out.printf(" You are emaciated ");
        } else if ((bmiMigisha >= 17)&&(bmiMigisha < 18.49)){
            System.out.printf(" You are underweight ");
        } else if (( bmiMigisha >= 18.50)&&(bmiMigisha < 22.99)){
            System.out.printf(" You are in the low range of the norm ");
        } else if ((bmiMigisha >= 23)&&(bmiMigisha < 24.99)){
            System.out.printf(" You are in the high range of norm ");
        }else if ((bmiMigisha >= 25)&&(bmiMigisha < 27.49)){
            System.out.printf(" You are overweight (pre-obese");
        } else if ((bmiMigisha >= 27.50)&&(bmiMigisha < 29.99)){
            System.out.printf(" You are Overweight ");
        } else if ((bmiMigisha >= 30)&&(bmiMigisha < 34.99)){
            System.out.printf(" You have 1st degree obesity");
        } else if ((bmiMigisha >= 35)&&(bmiMigisha < 39.99)){
            System.out.printf(" You have 2nd degree obesity");
        } else if ((bmiMigisha > 40)){
            System.out.printf(" You have 3rd degree obesity");
        }


    }
}

