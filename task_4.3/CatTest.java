import org.junit.jupiter.api.Assertions;

class CatTest {

    Cat ourCat = new Cat(4, 6, 6);

    Cat cat1 = new Cat(6, 5, 7);  //looser expected
    Cat cat2 = new Cat(3, 5, 7);  //winner expected
    Cat cat3 = new Cat(4, 6, 6);  //nobody wins expected

    @org.junit.jupiter.api.Test
    void fight() {

        /** First fight */
        Assertions.assertTrue(cat1.fight(ourCat));
        Assertions.assertFalse(ourCat.fight(cat1));

        /** Second fight */
        Assertions.assertTrue(ourCat.fight(cat2));
        Assertions.assertFalse(cat2.fight(ourCat));

        /** Third fight */
        Assertions.assertFalse(cat3.fight(ourCat));
        Assertions.assertFalse(ourCat.fight(cat3));
    }

}