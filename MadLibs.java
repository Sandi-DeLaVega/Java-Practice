public class MadLibs {
  /*
  This program generates a mad libbed story
  Author: Sandi De La Vega
  Date: 03/20/2021
  */
  	public static void main(String[] args){
      String name1 = "Princess";
      String adjective1 = "strong";
      String adjective2 = "beautiful";
      String adjective3 = "frustrating";
      String verb1 = "shout";
      String noun1 = "scoundrel";
      String noun2 = "stinky cheese";
      String noun3 = "thundering drum";
      String noun4 = "noise";
      String noun5 = "palace";
      String noun6 = "queen";
      String name2 = "Fairy Godmother";
      int number = 2030;
      String place1 = "Far Far Away Place";
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
