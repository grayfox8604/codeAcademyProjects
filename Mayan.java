/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language;

/**
 *
 * @author bserrato
 */
class Mayan extends Language {
    
    Mayan(String langName, int speakers) {
        super(langName, speakers, "Central America", "verb-object-subject");
    }

    // override getInfo
    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + 
        " people mainly in " + this.regionsSpoken + ". The language follows the word order: "
        + this.wordOrder + " Fun fact: " + this.name + " is an ergative language.");
    }
}
