package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;
import edu.grinnell.csc207.store.BulkItem;
import edu.grinnell.csc207.store.Item;
import edu.grinnell.csc207.store.Purchase;
import edu.grinnell.csc207.store.StoreUtils;
import edu.grinnell.csc207.store.Multiple;
/**
 * Some experiments with our store classes.
 *
 * @author Samuel A. Rebelsky
 * @author Alyssa Ryan and Alex Pollock
 */
public class Store {
  /**
   * Run the experiments.
   *
   * @param args Command-line arguments.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    StoreUtils.printReceipt(pen,
        new Purchase[] {
            new Item("hammer", "hits things", 899),
            new Item("penny candy", "imaginary", 1),
            new Item("will to live", "imaginary", 2000),
            new BulkItem("pennies", "worth a cent", "penny", 2, 3),
            new Multiple("nails", "to pound into wood", 2, 63)});
    pen.close();
  } // main(String[])
} // class Store
