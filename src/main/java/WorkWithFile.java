/*import java.io.*;


public class WorkWithFile {
    public static void main(String[] args) throws IOException {
        {
            int i;
            FileInputStream fin=null;
            BufferedReader bf = null;
            try {
                File file = new File("OPEN_ME_PLEASE.txt");
                if (!file.exists()) //если файл не существует
                    file.createNewFile();

                PrintWriter pw = new PrintWriter(file);
                pw.println("Hello,my Dear!");
                pw.println("How are u?");
                pw.close();

                bf = new BufferedReader(new FileReader("OPEN_ME_PLEASE.txt"));
                String line;
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException ex) {
                System.out.println("Ошибка при создании файла");
            } finally {
                try {
                    bf.close();
                } catch (IOException ex) {
                    System.out.println("Ошибка закрытия файла");
                }

            /*
           *                ОТКРЫТИЕ ФАЙЛА ИЗ КОНСОЛИ
           *                java  WorkWithFile OPEN_ME.txt
           *
            //убеждаемся,что программе передается имя файла
            if (args.length != 1) {
                System.out.println("Использование: ShowFile OPEN_ME_PLEASE");
                return;
            }
            try {
                fin = new FileInputStream(args[0]); //открываем файл
            } catch (FileNotFoundException ex) {
                System.out.println("Файл не найден");
                return;
            }

            try {
                //чтение файла,пока не встретим соответствующий символ
                do {
                    i = fin.read();//считываем
                    if (i != -1) System.out.print((char) i);
                } while (i != -1);
            } catch (IOException ex) {
                System.out.println("Возникла ошибка при чтении файла :( ");
            } finally {
                //закрываем файл независимо от того,как реализуется блок try
                try {
                    fin.close();
                } catch (IOException ex) {
                    System.out.println("Ошибка при закрытии файла");
                }
            }

             */
/*
            }
        }
    }
}

 */

