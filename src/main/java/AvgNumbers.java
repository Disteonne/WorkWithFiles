import  java.io.*;
public class AvgNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum=0.0;
        double avg;
        double t;

        System.out.println("Сколько чисел нужно ввести? ");
        str= br.readLine();

        try {
            n= Integer.parseInt(str);// преобразовываем в тип Int
        }catch (NumberFormatException ex){
            System.out.println("Неверный формат");
            n=0;
        }

        System.out.println("Ввод значений: ");
        for (int i=0;i<n;i++){
            str=br.readLine();//считываем
            try {
                t=Double.parseDouble(str);//преоб. тип
            }catch (NumberFormatException exc){
                System.out.println("Неверный формат");
                t=0.0;
            }
            sum+=t;
        }
        avg=sum/n;
        System.out.println("Среднее арифм: "+avg);
    }
}
