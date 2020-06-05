package by.dushenko.codewars.josephussurvivor;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class JosephusTest {

    @Test
    public void test_1_Exclude() {
        int result = 4;
        int survivor = Josephus.josephusSurvivor(7, 3);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_2_Exclude() {
        int result = 5;
        int survivor = Josephus.josephusSurvivor(5, 1);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_3_Exclude() {
        int result = 3;
        int survivor = Josephus.josephusSurvivor(5, 2);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_4_Exclude() {
        int result = 5;
        int survivor = Josephus.josephusSurvivor(6, 2);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_5_Exclude() {
        int result = 5;
        int survivor = Josephus.josephusSurvivor(6, 7);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_6_Exclude() {
        int result = 28;
        int survivor = Josephus.josephusSurvivor(40, 3);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_7_Exclude() {
        int result = 13;
        int survivor = Josephus.josephusSurvivor(14, 2);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_8_Exclude() {
        int result = 100;
        int survivor = Josephus.josephusSurvivor(100, 1);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_9_Exclude() {
        int result = 10;
        int survivor = Josephus.josephusSurvivor(11, 19);
        assertThat(survivor).isEqualTo(result);
    }

    @Test
    public void test_10_Exclude() {
        int result = 265;
        int survivor = Josephus.josephusSurvivor(300, 300);
        assertThat(survivor).isEqualTo(result);
    }

}
