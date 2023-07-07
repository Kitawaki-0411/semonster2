package semonster2;

public class Monster {
    String monster_name;
    int rare;

    public String printMonster(int monster_number){
        String monsters[] = {"デュラハン","ドラゴン","スライム"};
        return monsters[monster_number];
    }

    public int printRare(int rare_number){
        int rare[] = {4,5,1};
        return rare[rare_number];
    }
    public  String  superMonster(int monster_number){
        return "super" + printMonster(monster_number);
    }
    public  int  supertRare(int rare_number){
        return 4 +  printRare(rare_number);
    }
}
