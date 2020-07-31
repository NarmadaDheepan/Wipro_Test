package com.wipro.test.utils;

public class LanguageSound {

    public static String translate(String sound, String translateTo) {

          switch (translateTo) {
            case "DANISH":
                return "kykyliky";
            case "DUTCH":
                return "kukeleku";
            case "FINNISH":
                return "kukko kiekuu";
            case "FRENCH":
                return "cocorico";
            case "GERMAN":
                return "kikeriki";
            case "GREEK":
                return "kikiriki";
            case "HEBREW":
                return "coo-koo-ri-koo";
            case "HUNGARIAN":
                return "kukuriku";
            case "ITALIAN":
                return "chicchirichi";
            case "JAPANESE":
                return "ko-ke-kok-ko-o";
            case "PORTUGUESE":
                return "cucurucu";
            case "RUSSIAN":
                return "kukareku";
            case "SWEDISH":
                return "kuckeliku";
            case "TURKISH":
                return "kuk-kurri-kuuu";
            case "URDU":
                return "kuklooku";
            default:
                System.out.println("Unable to translate to: " + translateTo);
                return sound;
        }

    }
}
