package semonster2;
/* import java.util.Random; */

public class Monster {
    String monster_name;
    int rare;
    int hp;

    Monster(){
        /* Random random = new Random(); */
        /* monster_number = random.nextInt(3)*/
        this.monster_name = this.printMonster(0);
        this.rare = this.printRare(0);
        this.hp = printHP(this.rare, 0); 
    }

    public String printMonster(int monster_number){
        String monsters[] = {"デュラハン","ドラゴン","スライム"};
        return monsters[monster_number];
    }

    public int printRare(int rare_number){
        int rare[] = {4,5,1};
        return rare[rare_number];
    }

    public int printHP(int rare, int monster_number){
        int[] monster_hp = new int[10];
        int hp;

        if (rare == 1){
            hp = 5;
        }else if(rare == 2){
            hp = 10;
        }else if(rare == 3){
            hp = 15;
        }else if(rare == 4){
            hp = 20;
        }else if(rare == 5){
            hp = 25;
        }else{
            hp = 30;
        }
        monster_hp[monster_number] = hp;
        return hp;
    }

        
}
