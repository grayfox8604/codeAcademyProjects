package playlist;
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList <String> desertIslandPlaylist = new ArrayList <String> ();
    
    //Song playlist
    desertIslandPlaylist.add("Drop it like it's hot");
    desertIslandPlaylist.add("Lucy in the sky with diamonds");
    desertIslandPlaylist.add("Hey Jude");
    desertIslandPlaylist.add("Brand New Jones");
    desertIslandPlaylist.add("Ain't that a kick in the head");
    desertIslandPlaylist.add("It only took a kiss");
    
    //print out of list
    System.out.println(desertIslandPlaylist);
    
    //print out the size
    System.out.println(desertIslandPlaylist.size());
    
    //remove song and check size
    desertIslandPlaylist.remove("Drop it like it's hot");
    System.out.println(desertIslandPlaylist.size());
    
    //swap the order of songs
    int a = desertIslandPlaylist.indexOf("Brand New Jones");
    int b = desertIslandPlaylist.indexOf("It only took a kiss");
    
    System.out.println(a);
    System.out.println(b);
    
    String tempA = desertIslandPlaylist.get(a);
    String tempB = desertIslandPlaylist.get(b);
    
    desertIslandPlaylist.set(a,tempB);
    desertIslandPlaylist.set(b,tempA);
    
    System.out.print(desertIslandPlaylist);
  }
}
