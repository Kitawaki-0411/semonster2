/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
    public String getGreeting() {
        return "こんにちは SEMonster";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

public class Monster{
    String monster_name;
    int rare;

    public printMonster(int monster_number){
        String monsters[] = {"デュラハン","ドラゴン","スライム"};
        return monsters[monster_number];
    }

    public printRare(int rare_number){
        int rare[] = {4,5,1};
        return rare[rare_number];
    }
}