package Modul5.Unguided;

public class Hero {
    private String nama;
    private int hp, mana, damage;
    private Boolean checkHp, checkMana, checkDamage;
    private int maxHp;

    // Constructor
    public Hero(
        String nama,
        int hp,
        int mana,
        int damage
    ) {
        checkHp = hp >= 0 && hp <= 100;
        checkMana = mana >= 0 && mana <= 100;
        checkDamage = damage >= 0 && damage <= 15;
        if (
            checkHp &&
            checkMana &&
            checkDamage
        ) {
            this.nama = nama;
            this.hp = hp;
            this.mana = mana;
            this.damage = damage;
            this.maxHp = hp;
        } else {
            if (!checkHp && checkMana && checkDamage) {
                System.out.println("HP harus bernilai 0-100 !");
            } else if (!checkMana && checkHp && checkDamage) {
                System.out.println("Mana harus bernilai 0-100 !");
            } else if (!checkDamage && checkHp && checkMana) {
                System.out.println("Damage harus bernilai 0-15 !");
            } else {
                System.out.println("HP dan Mana harus bernilai 0-100 !");
                System.out.println("Damage harus bernilai 0-15 !");
            }
        }
    }

    public void basicAttack(Hero target) {
        target.hp -= this.damage;
        if (target.hp < 0) {
            target.hp = 0;
        }
        System.out.println("["+this.nama+"] Melancarkan Basic Attack ke " + target.nama + " (Damage: " + this.damage + ")");
        System.out.println();
    }

    public void skillAttack(Hero target) {
        if (this.mana >= 25) {
            target.hp -= this.damage*2;
            this.mana -= 25;
        
            if (target.hp < 0) {
                target.hp = 0;
            }
            System.out.println("["+this.nama+"] Melancarkan Skill ke " + target.nama + " (Damage: " + this.damage*2 + ")");
            System.out.println();
        } else {
            System.out.println("["+this.nama+"] Mana tidak cukup untuk melancarkan skill.");
            System.out.println();
        }
    }

    public void regenHp() {
        if (this.hp < maxHp && this.hp > 0) {
            this.hp += 15;
            if (this.hp > 100) {
                this.hp = maxHp;
            }
            System.out.println("["+this.nama+"] Regenerasi, +15 Hp");
            System.out.println();
        } else {
            System.out.println("["+this.nama+"] Tidak dapat regenerasi (mati).");
            System.out.println();
        }
        // return target.hp;
    }

    public void attributeStatus() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Current Hp / Max Hp : " + this.hp + " / " + maxHp);
        System.out.println("Mana : " + this.mana);
        System.out.println("Damage: " + this.damage);
        if (this.hp == 0) {
            System.out.println("Status: DEAD");
        } else if (this.hp > 0) {
            System.out.println("Status: ALIVE");
        }
        System.out.println();
    }
}
