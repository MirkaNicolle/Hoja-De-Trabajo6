/**
* HOJA DE TRABAJO 6
* INTERFACE MAP Y SUS 3 IMPLEMENTACIONES
* UVG - 10 DE MARZO DEL 2020
* MIRKA MONZÓN 18139
* DANIELA VILLAMAR 19086
*/

import java.util.Map;

public class DeckManager {

    /**
     * Agrega una carta al userDeck solo si existe, de lo contrario, da un error 
     */
     
    public static boolean AddCard(Map<Integer, Card> map, Map<Integer, Card> userMap, String cardName){
        for (Map.Entry<Integer, Card> entry : map.entrySet()){
            if (entry.getValue().getCardName().equals(cardName)){
                if (userMap.isEmpty()){
                    userMap.put(1, entry.getValue());
                    map.remove(entry.getKey());
                    return true;
                } else {
                    userMap.put(userMap.size() + 1, entry.getValue());
                    map.remove(entry.getKey());
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Muestra el tipo de carta solo si existe en el deck (en el original)
     */
     
    public static String showCardType(Map<Integer, Card> map, String cardName){
        for (Map.Entry<Integer, Card> entry : map.entrySet()) {
            if (entry.getValue().getCardName().equals(cardName)){
                return "\nTipo de carta: " + entry.getValue().getCardType();
            }
        }
        return "\nLa carta ingresada NO existe";
    }

    /**
     * Muestra todas las cartas del deck
     */
     
    public static String showDeck(Map<Integer, Card> userMap){
        String userDeck = "";
        for (Map.Entry<Integer, Card> entry : userMap.entrySet()) {
            userDeck += entry.getValue() + "\n";
        }
        return userDeck;
    }

    /**
     * Organiza el deck por tipo de carta
     */
     
    public static String showCleanDeck(Map<Integer, Card> userMap){
        String userDeckMonster = "\n\tCARTAS TIPO MONSTRUO\n\n";
        String userDeckSpell = "\n\tCARTAS TIPO HECHIZO\n\n";
        String userDeckTrap = "\n\tCARTAS TIPO TRAMPA\n\n";
        for (Map.Entry<Integer, Card> entry : userMap.entrySet()) {
            if (entry.getValue().getCardType().equals("Monstruo")){
                userDeckMonster += "Card Name: " + entry.getValue().getCardName() + "\n";
            } else if (entry.getValue().getCardType().equals("Hechizo")){
                userDeckSpell += "Card Name: " + entry.getValue().getCardName() + "\n";
            } else if (entry.getValue().getCardType().equals("Trampa")){
                userDeckTrap += "Card Name: " + entry.getValue().getCardName() + "\n";
            }
        }
        return userDeckMonster + userDeckSpell + userDeckTrap;
    }
}
