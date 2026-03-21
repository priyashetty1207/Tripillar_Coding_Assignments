package Module11;

import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    String document;

    PrintJob(String doc) {
        this.document = doc;
    }
}

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<PrintJob> queue = new LinkedList<>();

        // Add print jobs
        queue.add(new PrintJob("Doc1"));
        queue.add(new PrintJob("Doc2"));
        queue.add(new PrintJob("Doc3"));

        // Process queue
        while (!queue.isEmpty()) {
            PrintJob job = queue.poll();
            System.out.println("Printing: " + job.document);
        }
    }
}