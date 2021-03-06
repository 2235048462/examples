package Thread;

/*
antuor by Bo Chen
ProduceConsumer.java
 */
public class ProducerConsumer {
    public static void main ( String[] args ) {
        CubbyHole cubbyHole = new CubbyHole ();
        Producer producer = new Producer ( cubbyHole, 1 );
        Consumer consumer = new Consumer ( cubbyHole, 1 );
        producer.start ();
        consumer.start ();
    }
}

class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get () {
        while (available == false) {
            try {
                wait ();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll ();
        return contents;
    }

    public synchronized void put ( int value ) {
        while (available == true) {
            try {
                wait ();
            } catch (InterruptedException e) {
            }
            contents = value;
            available = true;
            notifyAll ();
        }
    }
}

class Consumer extends Thread {
    private CubbyHole cubbyHole;
    private int number;

    public Consumer ( CubbyHole c, int number ) {
        cubbyHole = c;
        this.number = number;
    }

    public void run () {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyHole.get ();
            System.out.println ( "消费者:" + this.number + "  got:" + value );
        }
    }
}

class Producer extends Thread {
    private CubbyHole cubbyHole;
    private int number;

    public Producer ( CubbyHole c, int number ) {
        cubbyHole = c;
        this.number = number;
    }

    public void run () {
        for (int i = 0; i < 10; i++) {
            cubbyHole.put ( i );
            System.out.println ( "生产者:" + this.number + "  put:" + i );
            try {
                sleep ( (int) (Math.random () * 100) );
            } catch (InterruptedException e) {
            }
        }
    }
}
