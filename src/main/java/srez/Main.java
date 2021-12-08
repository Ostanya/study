package srez;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        try (FileReader inputFile = new FileReader(new File(args[0]))){     // Line1
//        } catch (FileNotFoundException | IOException e){                    // Line2
//            e.printStackTrace();
//        }
        //TreeSet();
        HashMap props = new HashMap();
        props.put("key45", "some value");
        props.put("key12", "some other value");
        props.put("key39", "yet another value");
        Set set = props.keySet();
        System.out.println(set);

        String[] students = {"Shreya", "Joseph"};
        try { System.out.println(students[0] + ""); }
       // System.out.println(students[1]);
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.add("one");
        myDeque.add("two");
        myDeque.add("three");
        System.out.println(myDeque.remove()); //one
        System.out.println(myDeque);//[two, three]

        //BufferedWriter bw; //Java класс BufferedWriter записывает текст в поток вывода символов,
        // буферизуя записанные символы, чтобы обеспечить эффективную запись символов,
        // массивов и строк. Можно указать в конструкторе вторым параметром размер буфера.
       // BufferedWriter b1 = new BufferedWriter(new File("f")); // Line1

        System.out.println("________________");
      //  Map<String,int> map = new HashMap<int,String>();
        Map<String,String> map2 = new HashMap<String,String>();
        Map<String,String> map3 = new HashMap<>(); //Line3
     //   Map<> map4 = new HashMap<String,String>(); //Line4

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("carrot");
        myList.add("banana");
        myList.add(1, "plum");
        System.out.println(myList);

        //[apple, plum, carrot, banana]
        System.out.println("________________");
//        String srcFile = "deleteBanan.ser";
//        String dstFile = "deleteBanan2.ser";
//        try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
//             BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))){ //TRY
//            int ch = 0;
//            while((ch=inputFile.read())!=-1){
//                outputFile.write((char)ch);
//            }
//        } catch(/*FileNotFoundException |*/ IOException exception){ //MULTI_CATCH
//            System.err.println("Error in opening or processing file " + exception.getMessage());
//        }

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList();
       // Stream.of(l1,l2,l3).map(x->x+1).flatMap(x->x.stream()).forEach(System.out::print);

        System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x ->"" + x).collect(Collectors.joining()));
        System.out.println("________________");

        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(()->"growl!");
        Stream<String> stream2 = Stream.generate(()->"growl!");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.anyMatch(predicate);
        System.out.println(b1 + " " + b2); //true true


        DoubleStream s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x>2).count(); //1.2, 2.4

        System.out.println("________________");
        int a = 10;
        String name = null;
        try {
            a = name.length();
            a++;
        } catch (RuntimeException e){
            ++a;
        }
        System.out.println(a);
    }



}
