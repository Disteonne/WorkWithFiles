/*import  java.io.*;

public class RWdata {
    //использование DataOutputStream and DaraInputStream.
    // Чтение и запись примитивных типов
    public static void main(String[] args) {
        int i=10;
        double d=23.4;
        boolean b= true;

        //Записываем ряд значений
        try(DataOutputStream dataOut= new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Записано: "+i);
            dataOut.writeInt(i);

            System.out.println("Записано: "+d);
            dataOut.writeDouble(d);

            System.out.println("Записано: "+b);
            dataOut.writeBoolean(b);

        }catch (IOException ex){
            System.out.println("Ошибка при записи");
            return;
        }

        System.out.println();

        //Чтение записи

        try(DataInputStream dataIn= new DataInputStream(new FileInputStream("testdata"))) {
            i=dataIn.readInt();
            System.out.println(i);

            d=dataIn.readDouble();
            System.out.println(d);

            b=dataIn.readBoolean();
            System.out.println(b);
        }catch (IOException ex){
            System.out.println("Ошибка при чтении");
        }
    }
}

 */