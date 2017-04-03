import java.lang.reflect.Array;

/**
 * Created by Riyandi Syahputra on 4/3/2017.
 */
public class Queue <T> {
    public T[] array;
    public int x,y;

    public Queue(Class<?> classname){
        array =(T[]) Array.newInstance(classname,10);
        x = -1; //posisi awal pointer
        y = 0; //posisi awal array
    }

    public static void main(String[]args){
        Queue<Integer> o = new Queue<Integer>(Integer.class); //inisialisasi o sebagai objek
        o.enqueue(12); //input 1
        o.enqueue(5); //input 2
        o.enqueue(17); //input 3
        o.enqueue(1); //input 4
        System.out.println(o.dequeue()); //mengeluarkan item yg sudah di record sebelumnya sesuai konsep Queue
    }

    public void enqueue(T item){   //fungsi enqueue
        array[++x]=item;
    }

    public T dequeue() { //fungsi dequeue
        return array[y++];
    }
}
