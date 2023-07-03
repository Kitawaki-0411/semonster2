package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void appHasAGreeting() {
        Monster classUnderTest = new Monster();

        int monster_number = 0;
        assertNotNull("デュラハン", classUnderTest.printMonster(monster_number));
        assertNotNull("4", classUnderTest.printRare(monster_number));
        assertNotNull("20", classUnderTest.printHP(classUnderTest.printRare(monster_number), monster_number));
    }
}
