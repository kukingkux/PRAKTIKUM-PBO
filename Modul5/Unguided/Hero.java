package Modul5.Unguided;

public class Hero {
    private String nama;
    private int hp, mana, damage;
    private Boolean checkHp, checkMana, checkDamage;


    // Constructor
    public Hero(
        String nama,
        int hp,
        int mana,
        int damage
    ) {
        checkHp = hp >= 0 && hp <= 100;
        checkMana = mana >= 0 && hp <= 100;
        checkDamage = damage >= 0 && hp <= 15;
        if (
            checkHp &&
            checkMana &&
            checkDamage
        ) {
            this.nama = nama;
            this.hp = hp;
            this.mana = mana;
            this.damage = damage;
        } else {
            if ((checkHp && !checkMana && !checkDamage) || (!checkHp && checkMana && !checkDamage) || (!checkHp && !checkMana && checkDamage) || (!checkHp && !checkMana && !checkDamage)) {
                System.out.println("HP dan Mana harus bernilai 0-100 !");
                System.out.println("Danage harus bernilai 0-15 !");
            }
            if (!checkHp && checkMana && checkDamage) {
                System.out.println("HP harus bernilai 0-100 !");
            }
            if (!checkMana && checkHp && checkDamage) {
                System.out.println("Mana harus bernilai 0-100 !");
            }
            if (!checkDamage && checkHp && checkMana) {
                System.out.println("Damage harus bernilai 0-15 !");
            }
                
            return;
        }
    }


}
