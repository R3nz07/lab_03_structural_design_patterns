package ejercicio_02.problema;

public class PCFactory extends GameElementFactory {
    @Override
    public Character createCharacter() {
        return new PCWarrior();
    }
    public Weapon createWeapon() {
        return new PCSword();
    }
}
