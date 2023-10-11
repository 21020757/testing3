import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void BMICategory() {
        //Loi dau vao
        assertEquals("Input error", Main.BMICategory(2, 1.5));
        assertEquals("Input error", Main.BMICategory(50, -1));
        assertEquals("Input error", Main.BMICategory(50, 3));
        assertEquals("Input error", Main.BMICategory(600, 1.8));

        //Thieu can
        assertEquals("Underweight", Main.BMICategory(50, 1.8));
        assertEquals("Underweight", Main.BMICategory(40, 1.7));

        //Can nang binh thuong
        assertEquals("Normal", Main.BMICategory(60, 1.68));
        assertEquals("Normal", Main.BMICategory(70, 1.8));

        //Thua can
        assertEquals("Overweight", Main.BMICategory(80, 1.67));
        assertEquals("Overweight", Main.BMICategory(90, 1.8));

        //Beo phi do I
        assertEquals("Obese", Main.BMICategory(80, 1.6));
        assertEquals("Obese", Main.BMICategory(90, 1.7));

        //Beo phi do II
        assertEquals("Severely Obese", Main.BMICategory(90, 1.6));
        assertEquals("Severely Obese", Main.BMICategory(110, 1.7));

        //Beo phi do III
        assertEquals("Morbidly Obese", Main.BMICategory(120, 1.6));
        assertEquals("Morbidly Obese", Main.BMICategory(130, 1.5));
    }
}