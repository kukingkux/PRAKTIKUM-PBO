package Modul5.Unguided;

public class Main {
    public static void main(String[] args) {
        Hero jawhead = new Hero("jawhead", 72, 51, 15);
        Hero xborg = new Hero("xborg", 89, 100, 12);

        jawhead.basicAttack(xborg);
        jawhead.skillAttack(xborg);
        jawhead.skillAttack(xborg);
        xborg.skillAttack(jawhead);
        xborg.regenHp();
        jawhead.skillAttack(xborg);
        jawhead.basicAttack(xborg);
        jawhead.basicAttack(xborg);
        xborg.regenHp();

        xborg.attributeStatus();
        jawhead.attributeStatus();
    }
}
