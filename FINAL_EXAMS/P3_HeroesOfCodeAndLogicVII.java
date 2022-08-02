package FUNDAMENTALS.FINAL_EXAM_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroHp = new HashMap<>();
        Map<String, Integer> heroMp = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] points = scanner.nextLine().split(" ");
            String name = points[0];
            int hp = Integer.parseInt(points[1]);
            int mp = Integer.parseInt(points[2]);

            heroHp.putIfAbsent(name, hp);
            heroMp.putIfAbsent(name, mp);

            if (heroHp.get(name) > 100) {
                heroHp.put(name, 100);
            }

            if (heroMp.get(name) > 200) {
                heroMp.put(name, 200);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" - ");
            String command = data[0];
            String heroName = data[1];

            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(data[2]);
                    String spellName = data[3];
                    int leftMp = heroMp.get(heroName) - mpNeeded;

                    if (leftMp >= 0) {
                        heroMp.put(heroName, leftMp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, leftMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    int damagePoints = heroHp.get(heroName) - damage;

                    if (damagePoints > 0) {
                        heroHp.put(heroName, damagePoints);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, damagePoints);
                    } else {
                        heroHp.remove(heroName);
                        heroMp.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(data[2]);
                    int sumAmount = heroMp.get(heroName) + amount;

                    if (sumAmount > 200) {
                        System.out.printf("%s recharged for %d MP!\n", heroName, 200 - heroMp.get(heroName));
                        heroMp.put(heroName, 200);
                    } else {
                        heroMp.put(heroName, sumAmount);
                        System.out.printf("%s recharged for %d MP!\n", heroName, amount);
                    }
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(data[2]);
                    int sum = heroHp.get(heroName) + amountHeal;

                    if (sum > 100) {
                        System.out.printf("%s healed for %d HP!\n", heroName, 100 - heroHp.get(heroName));
                        heroHp.put(heroName, 100);
                    } else {
                        heroHp.put(heroName, sum);
                        System.out.printf("%s healed for %d HP!\n", heroName, amountHeal);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        heroHp.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    System.out.println("  HP: " + e.getValue());
                    System.out.println("  MP: " + heroMp.get(e.getKey()));
                });

       //heroHp.entrySet().stream()
       //        .sorted((e1, e2) -> {
       //            int result = Integer.compare(e2.getValue(), e1.getValue());
       //            if (result == 0) {
       //                result = e1.getKey().compareTo(e2.getKey());
       //            }
       //            return result;
       //        }).forEach(item -> {
       //    System.out.printf("%s%n  HP: %d%n  MP: %d%n", item.getKey(), item.getValue(), heroMp.get(item.getKey()));
       //});
    }
}
