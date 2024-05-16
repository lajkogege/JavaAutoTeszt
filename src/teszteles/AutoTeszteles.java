
package teszteles;

import main.Auto;


public class AutoTeszteles {
    public static void main(String[] args) {
       new AutoTeszteles().tesztesetek();
    }

    private void tesztesetek() {
        tankolasTeszt();
    }

    private void tankolasTeszt() {
        System.out.println("- Tankolás tesztek:");
        System.out.println("-- NINCS üzemanyag, leálitva");
        Auto auto = new Auto(false, false);
        auto.tankol();
        assert auto.isUzemanyag() : "tankolási hiba";
        
        System.out.println("-- NINCS üzemanyag, Beinditva");
        auto = new Auto(false, true);
        auto.tankol();
        assert !auto.isUzemanyag() : "tankolási hiba";
        
        System.out.println("-- Van üzemanyag, Leálítva");
        auto = new Auto(true, false);
        auto.tankol();
        assert auto.isUzemanyag() : "tankolási hiba";
        
         System.out.println("-- Van üzemanyag, Beinditva");
        auto = new Auto(true, true);
        auto.tankol();
        assert auto.isUzemanyag() : "tankolási hiba";
    }
 
}
