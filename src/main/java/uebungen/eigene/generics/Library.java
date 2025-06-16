package uebungen.eigene.generics;

import java.util.ArrayList;
import java.util.List;

public class Library <T>{
   private List<T> items = new ArrayList<>();

   public void add(T item) {
       items.add(item);
   }

   public List<T> getItems() {
       return items;
   }

   public void removeFirst(){
       items.removeFirst();
   }

   public void removeAll(){
       items.removeAll(items);
   }

   public int size(){
       return items.size();
   }


   public static void main(String[] args){
       Library<Book> bookLibrary= new Library<>();
       Library<Music> musicLibrary = new Library<>();
       bookLibrary.add(new Book("1983", "George Orwell"));
       musicLibrary.add(new Music("KTS", "manifest"));
       bookLibrary.add(new Book("Animal Farm", "George Orwell"));
       musicLibrary.add(new Music("Can't Stop", "RHCP"));
       bookLibrary.add(new Book("Chess", "Stefan Zweig"));
       musicLibrary.add(new Music("Four to the Floor", "Moby"));

       for (Book book : bookLibrary.getItems()) {
           System.out.println(book.getTitle() + ", " + book.getAuthor());
       }

       for (Music music : musicLibrary.getItems()) {
           System.out.println(music.getTitel() + ", " + music.getSinger());
       }


   }
}
