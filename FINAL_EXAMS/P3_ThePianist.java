package FUNDAMENTALS.FINAL_EXAM_1;

import java.util.*;

public class P3_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> piecesMap = new TreeMap<>(); //ключовете са сортирани по азбучен ред
        //пиеса -> списък с информация ([0] -> композитор, [1] -> key)
        int countPieces = Integer.parseInt(scanner.nextLine());
        //информация за пиесите
        for (int piece = 1; piece <= countPieces; piece++) {
            String[] pieceParts = scanner.nextLine().split("\\|");
            //"{piece}|{composer}|{key}".split("|") -> ["{piece}", "{composer}", "{key}"]
            String pieceName = pieceParts[0];
            String composer = pieceParts[1];
            String key = pieceParts[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer); //[0]
            pieceInfo.add(key); //[1]
            piecesMap.put(pieceName, pieceInfo);
        }

        //получаваме команди
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String [] commandParts = command.split("\\|");
            //"Add|{piece}|{composer}|{key}".split("|") -> ["Add", "{piece}", "{composer}", "{key}"]
            //"Remove|{piece}".split("|") -> ["Remove", "{piece}"]
            //"ChangeKey|{piece}|{new key}".split("|") -> ["ChangeKey", "{piece}", "{new key}"]
            String commandName = commandParts[0]; // "Add", "Remove", "ChangeKey"
            switch(commandName) {
                case "Add":
                    String newPieceName = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];
                    //ако я има
                    if (piecesMap.containsKey(newPieceName)) {
                        System.out.printf("%s is already in the collection!%n", newPieceName);
                    }
                    //ако я няма
                    else {
                        //пиеса -> списък с информация
                        List<String> newPieceInfo = new ArrayList<>();
                        newPieceInfo.add(composer);
                        newPieceInfo.add(key);
                        piecesMap.put(newPieceName, newPieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n", newPieceName, composer, key);
                    }
                    break;
                case "Remove":
                    String pieceForRemove = commandParts[1];
                    //ако я има
                    if (piecesMap.containsKey(pieceForRemove)) {
                        piecesMap.remove(pieceForRemove);
                        System.out.printf("Successfully removed %s!%n", pieceForRemove);
                    }
                    //ако я няма
                    else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceForRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceName = commandParts[1];
                    String newKey = commandParts[2];
                    //нямаме такава пиеса
                    if (!piecesMap.containsKey(pieceName)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }
                    //имаме такава пиеса
                    else {
                        //пиеса -> списък с информация
                        //списък с инфорамцията: [{composer}, {key}]
                        List<String> currentPieceInfo = piecesMap.get(pieceName);
                        currentPieceInfo.remove(1);
                        currentPieceInfo.add(newKey);
                        piecesMap.put(pieceName, currentPieceInfo);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        //пиеса -> списък с информация ([0] -> composer, [1] -> key)
        piecesMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
