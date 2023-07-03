package semonster2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MonsterTest {
    @Test public void appHasAMonsters() {
        Monster classUnderTest = new Monster();
        assertNotNull("デュラハン", classUnderTest.printMonster(0));
        assertNotNull(4, classUnderTest.printRare(0));
    }
    
}
