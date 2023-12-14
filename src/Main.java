import java.util.Arrays;

import Classes.*;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

/*        Types empty = new Types();
        System.out.println(empty.PrintDefault());

        Types intTypes = new Types(3, 4);
        System.out.println(intTypes.Calculate());
        System.out.println(intTypes.CheckNumbers());

        Types doubleTypes = new Types(3.4, 8.5);
        System.out.println(doubleTypes.Multiply());



        int lengthInput = Integer.parseInt(JOptionPane.showInputDialog("Enter array length"));
        Collections array = new Collections(lengthInput);

        for (int i = 0; i < array.length; i++) {
          array.numbers[i] = i + 1;
        }

        System.out.println(Arrays.stream(array.numbers)
                  .mapToObj(String::valueOf)
                  .collect(Collectors.joining(", ")));

        Collections list = new Collections();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while(!name.equals("End")){

            list.names.add(name);
            name = scanner.nextLine();
        }

        String result = list.names.stream().map(Objects::toString).collect(Collectors.joining(" and "));
        System.out.println(result);

        String name = JOptionPane.showInputDialog("Enter the Person name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the Person age"));

        Person person;
        if(age < 12){
            person = new Child(name, age);
        } else {
            String university = JOptionPane.showInputDialog("Enter University name");
            person = new Student(name, age, university);
        }


        if(person instanceof Person ){

            System.out.println(person);
            System.out.println(person.IsHungry());
            System.out.println(person.CanEat());
            System.out.println(person.Eat());

            int sum = person.CanCalculate(4, 5);
            System.out.println(sum);
        }

        try{


            StringBuilder sb = new StringBuilder();
            sb.append("Roses are red");
            sb.append(System.lineSeparator());
            sb.append("Violets are purple ");
            sb.append(System.lineSeparator());
            sb.append("booty booty booty booty");
            sb.append(System.lineSeparator());
            FileWriter writer = new FileWriter("./Files/text.txt");
            writer.write(sb.toString());
            writer.close();

            FileReader reader = new FileReader("./Files/text.txt");
            int data = reader.read();

            while (data != -1){
                System.out.print((char) data );
                data = reader.read();
            }

            reader.close();

        }    catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("prior thread");
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());

        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("You are done");

        MyThread thread2 = new MyThread();
        thread2.setPriority(1);
        thread2.start();
        //System.out.println(thread2.isAlive());
        System.out.println(Thread.activeCount());

 */
         MyThread thread1 = new MyThread();

         MyRunnable runnable = new MyRunnable();
         Thread thread2 = new Thread(runnable);

         thread1.start();
         thread1.join();
         thread2.start();
    }

}