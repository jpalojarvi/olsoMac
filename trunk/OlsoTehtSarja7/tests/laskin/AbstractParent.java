package laskin;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * T‰ss‰§ esitell‰‰n @BeforeEach, @AfterEach, @BeforeAll ja @AfterAll annotaatioita
 */
public abstract class AbstractParent {

	// 3. Suoritetaan ennen kuin yht‰‰n testimetodia ajetaan
    @BeforeAll
    public static void startTestSystem() {
        System.out.println("@BeforeAll TESTAAMINEN ALKAA.");
    }

    // 3. Suoritetaan jokaisen testimetodiajon j‰lkeen
    @AfterAll
    public static void stopTestSystem() {
        System.out.println("@AfterAll TESTAAMINEN VALMIS.");
    }

 // 3. Suoritetaan ennen jokaista testimetodiajoa
    @BeforeEach
    public void initTestSystem() {
        System.out.println("  @BeforeEach K‰ynnist‰ uusi testimetodi.");
    }

 // 3. Suoritetaan vasta kun kaikki testimetodit on ajettu
    @AfterEach
    public void cleanTestSystem() {
        System.out.println("  @AfterEach Testimetodi suoritettu.");
    }
}
