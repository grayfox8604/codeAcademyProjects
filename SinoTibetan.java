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
class SinoTibetan extends Language {
    
    public SinoTibetan(String langName, int speakers) {
        super(langName, speakers, "Asia", "subject-object-verb");
        if(langName.contains("Chinese")){
            this.wordOrder = ("subject-verb-object");
        }
    }
    
}
