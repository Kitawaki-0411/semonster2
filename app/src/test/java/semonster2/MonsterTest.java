package semonster2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MonsterTest {
    @Test public void appHasAGreeting() {
        Monster classUnderTest = new Monster();

        int monster_number = 0;
        assertNotNull("デュラハン", classUnderTest.printMonster(monster_number));
        assertNotNull("4", classUnderTest.printRare(monster_number));
        assertNotNull("superデュラハン", classUnderTest.superMonster(monster_number));
        assertNotNull("8", classUnderTest.supertRare(monster_number));
    }
}