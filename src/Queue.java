//// Queue class to encapsulate a queue of Alert objects.
//// It presumes we have an Alert class on the pattern described in the course notes.
//// For sample usage see the "test" method at bottom.
//
//public class Queue {
//
//    // The nested class QueueRecord provides the structure of the queue.
//    // It includes a pointer to the data (an Alert) and a pointer to the
//    // "next" record in the queue.
//    public class QueueRecord {
//        public QueueRecord( Alert obj ) {
//            data = obj;
//            next = null;
//        }
//        public Alert data;
//        public QueueRecord next;
//    }
//    private QueueRecord head = null;
//    private QueueRecord tail = null;
//    public Queue() {
//        head = null;
//        tail = null;
//    }
//
//    // Add a record to the tail of the queue
//    public void enqueue( Alert obj ) {
//        QueueRecord new_rec = new QueueRecord( obj );
//        if (tail == null) {
//            // Queue was empty; new_rec becomes the only record in the queue
//            head = new_rec;
//            tail = new_rec;
//        }
//        else {
//            // new_rec becomes the new tail record
//            tail.next = new_rec;
//            tail = new_rec;
//        }
//    }
//
//    // Take a record off the head of the queue
//    public Alert dequeue() {
//        Alert returnObj = null;
//        if (head != null) {
//            returnObj = head.data;
//            if (head == tail) {
//                // Last job is being dequeued
//                head = null;
//                tail = null;
//            }
//            else {
//                head = head.next;
//            }
//        }
//        return returnObj;
//    }
//
//    // This is not a required method for a queue, but it can be helpful
//    public int length() {
//        QueueRecord job = head;
//        int count = 0;
//        while (job != null) {
//            count++;
//            job = job.next;
//        }
//        return count;
//    }
//
//    // Example of a simple unit test
//    public static void test() {
//        Queue queue = new Queue();
//        queue.enqueue( new Alert( 1, 1, "one") );
//        System.out.println( "dequeued: " + queue.dequeue() );
//
//        queue.enqueue( new Alert( 2, 1, "two") );
//        queue.enqueue( new Alert( 3, 1, "three") );
//        queue.enqueue( new Alert( 4, 1, "four") );
//        System.out.println( "dequeued: " + queue.dequeue() );
//        System.out.println( "dequeued: " + queue.dequeue() );
//        System.out.println( "dequeued: " + queue.dequeue() );
//
//        if (!(queue.dequeue() == null)) {
//            System.out.println("error: queue nonempty, expected to be empty");
//        }
//    }
//
//}