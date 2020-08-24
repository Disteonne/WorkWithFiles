/*import java.io.*;

//Работа с файлами,имеющ.произвольный доступ

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[]= {19.4,10.1,123.54,33.0,87.9,74.25};
        double d;

        try(RandomAccessFile raf=new RandomAccessFile("random.dat","rw")){
            //запись значений в фаил
            for(int i=0;i<data.length;i++)
                raf.writeDouble(data[i]);

            //считывание отдельных значений
            raf.seek(8*0);//находим первое значение
            d=raf.readDouble();
            System.out.println(d);

            raf.seek(8);//второе значение
            d=raf.readDouble();
            System.out.println(d);

            raf.seek(8*3);//четвертое значение
            d=raf.readDouble();
            System.out.println(d);

            //прочитываем значения через одно
            for(int i=0;i< data.length;i+=2)
            {
                raf.seek(8*i);
                d=raf.readDouble();
                System.out.println(d);
            }
        }catch (IOException exc){
            System.out.println("Ошибка ввода-вывода"+exc);
        }
    }
}


 */