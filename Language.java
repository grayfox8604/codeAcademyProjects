
package language;

/**
 * Build out a Java package with these classes to 
 * model real-world language families.
 * @author bserrato
 */
public class Language {
    
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String rSpoken, String wOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = rSpoken;
        this.wordOrder = wOrder;
    }
    
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + 
        " people mainly in " + this.regionsSpoken + ". The language follows the word order: " 
        + this.wordOrder + ".");
    }
    
    public static void main(String[] args) {
        
        Language Bri = new Language("Brizzle", 1, "USA","subject-verb-izzle" );
        Bri.getInfo();
        Mayan chontal = new Mayan("Chontal",36810);
        chontal.getInfo();
        SinoTibetan burmese = new SinoTibetan ("Burmese",300000);
        burmese.getInfo();
        SinoTibetan mlchinese = new SinoTibetan("Chinese", 10000000);
        mlchinese.getInfo();
    }
    
}
