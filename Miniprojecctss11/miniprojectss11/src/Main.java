interface ISkill {
    void useUltimate(GameCharacter target);
}

abstract class GameCharacter {
    public static int count = 0;
    protected String name;
    protected int hp;
    protected int attackPower;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.println(this.name + " nhận " + damage + " sát thương. HP còn: " + Math.max(0, this.hp));
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.name + " đã bị hạ gục!");
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(this.name + " chém " + target.getName() + " bằng kiếm!");
        target.takeDamage(this.attackPower);
    }

    @Override
    public void takeDamage(int damage) {
        int actualDamage = damage - this.armor;
        if (actualDamage < 0) {
            actualDamage = 0;
        }
        System.out.println(this.name + " dùng giáp chặn sát thương (Giáp: " + this.armor + ").");
        super.takeDamage(actualDamage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(this.name + " sử dụng chiêu cuối: Đấm ngàn cân!");
        int ultimateDamage = this.attackPower * 2;
        int selfDamage = (int) (this.hp * 0.1);

        this.hp -= selfDamage;
        System.out.println(this.name + " bị phản hệ mất " + selfDamage + " HP.");
        target.takeDamage(ultimateDamage);
    }

    public int getArmor() {
        return armor;
    }
}

class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (this.mana >= 5) {
            System.out.println(this.name + " bắn cầu năng lượng vào " + target.getName() + "!");
            this.mana -= 5;
            target.takeDamage(this.attackPower);
        } else {
            System.out.println(this.name + " cạn mana, đập trượng vào " + target.getName() + "!");
            target.takeDamage(this.attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (this.mana >= 50) {
            System.out.println(this.name + " niệm chú sử dụng chiêu cuối: Hỏa cầu!");
            this.mana -= 50;
            target.takeDamage(this.attackPower * 3);
        } else {
            System.out.println(this.name + " không đủ mana để dùng Hỏa cầu!");
        }
    }

    public int getMana() {
        return mana;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KHỞI TẠO ARENA OF HEROES ===");

        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Warrior("Arthur (Warrior)", 1000, 80, 20);
        characters[1] = new Mage("Veera (Mage)", 600, 120, 100);

        characters[2] = new GameCharacter("Goblin (Quái)", 300, 0) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm " + target.getName() + "...");
                target.takeDamage(10);
            }
        };

        System.out.println("Tổng số nhân vật tham chiến: " + GameCharacter.count + "\n");
        System.out.println("=== BẮT ĐẦU MÔ PHỎNG TRẬN ĐẤU ===");

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != null && characters[i].getHp() > 0) {
                GameCharacter target = characters[(i + 1) % characters.length];

                System.out.println("\nLượt của " + characters[i].getName() + ":");

                if (characters[i] instanceof ISkill) {
                    ((ISkill) characters[i]).useUltimate(target);
                } else {
                    characters[i].attack(target);
                }
            }
        }

        System.out.println("\n=== THỐNG KÊ SAU TRẬN ĐẤU ===");
        for (GameCharacter character : characters) {
            if (character != null) {
                System.out.print(character.getName() + " | HP: " + character.getHp());

                if (character instanceof Warrior) {
                    System.out.print(" | Armor: " + ((Warrior) character).getArmor());
                } else if (character instanceof Mage) {
                    System.out.print(" | Mana: " + ((Mage) character).getMana());
                }
                System.out.println();
            }
        }
    }
}