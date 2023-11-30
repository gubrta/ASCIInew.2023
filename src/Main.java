import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, String[]> ascii = new HashMap<>();
        ascii.put('A', new String[]{
                "  A  ",
                "A   A",
                "AAAAA",
                "A   A",
                "A   A",
        });
        ascii.put('B', new String[]{
                "BBBBB ",
                "B    B",
                "BBBBB ",
                "B    B",
                "BBBBB "
        });
        ascii.put('C', new String[]{
                " CCCC ",
                "C     ",
                "C     ",
                "C     ",
                " CCCC ",
        });
        ascii.put('D', new String[]{
                "DDDDDD",
                "D      D",
                "D      D",
                "D      D",
                "DDDDDD",
        });
        ascii.put('E', new String[]{
                "EEEEEE ",
                "E      ",
                "EEEEEE ",
                "E      ",
                "EEEEEE ",
        });
        ascii.put('F', new String[]{
                "FFFFFF",
                "F     ",
                "FFFF  ",
                "F     ",
                "F     ",
        });
        ascii.put('G', new String[]{
                " GGGG ",
                "G     ",
                "G  GGG",
                "G    G",
                "GGGGGG",
        });
        ascii.put('H', new String[]{
                "H    H",
                "H    H",
                "HHHHHH",
                "H    H",
                "H    H",
        });
        ascii.put('I', new String[]{
                "   I   ",
                "   I   ",
                "   I   ",
                "   I   ",
                "   I   ",
        });
        ascii.put('J', new String[]{
                "  J  ",
                "  J  ",
                "  J  ",
                "  J  ",
                "JJJ  ",
        });
        ascii.put('K', new String[]{
                "K   K",
                "K K  ",
                "KK   ",
                "K K  ",
                "K   K",
        });
        ascii.put('L', new String[]{
                "L      ",
                "L      ",
                "L      ",
                "L      ",
                "LLLLLLL",
        });
        ascii.put('M', new String[]{
                "MM      MM",
                "M   M    M",
                "M   M    M",
                "M        M",
                "M        M",
        });
        ascii.put('N', new String[]{
                "N     N",
                "N N   N",
                "N  N  N",
                "N   N N",
                "N     N",
        });
        ascii.put('O', new String[]{
                "OOOOOOO",
                "O     O",
                "O     O",
                "O     O",
                "OOOOOOO",
        });
        ascii.put('P', new String[]{
                "PPPPPPP",
                "P     P",
                "PPPPPPP",
                "P      ",
                "P      ",
        });
        ascii.put('Q', new String[]{
                "QQQQQQQ  ",
                "Q     Q  ",
                "Q     Q  ",
                "Q   Q Q  ",
                "QQQQQQQQQ",
        });
        ascii.put('R', new String[]{
                "RRRRRRR",
                "R     R",
                "RRRRRRR",
                "RRR    ",
                "R  RRRR",
        });
        ascii.put('S', new String[]{
                "SSSSSS",
                " S    ",
                "  S   ",
                "   S  ",
                "SSSSSS",
        });
        ascii.put('T', new String[]{
                "TTTTTTT",
                "   T   ",
                "   T   ",
                "   T   ",
                "   T   ",
        });
        ascii.put('U', new String[]{
                "U     U",
                "U     U",
                "U     U",
                "U     U",
                "UUUUUUU",
        });
        ascii.put('V', new String[]{
                "V       V",
                " V     V ",
                "  V   V  ",
                "   V V   ",
                "    V    ",
        });
        ascii.put('W', new String[]{
                "W   W   W",
                "W   W   W",
                " W W W W ",
                "  W   W  ",
                "  W   W  ",
        });
        ascii.put('X', new String[]{
                "X     X ",
                "  X X   ",
                "   X    ",
                "  X X   ",
                "X    X  ",
        });
        ascii.put('Y', new String[]{
                "Y     Y",
                " Y   Y ",
                "   Y   ",
                "   Y   ",
                "   Y   ",
        });
        ascii.put('Z', new String[]{
                "ZZZZZ",
                "  Z  ",
                " Z   ",
                "Z    ",
                "ZZZZZ",
        });
        ascii.put(' ', new String[]{
                "    ",
                "    ",
                "    ",
                "    ",
                "    ",
        });
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Text ein:");
        String input = scanner.nextLine();

        boolean validInput = true;
        for (int i = 0; i < input.length(); i++) {
            if (!ascii.containsKey(input.charAt(i))) {
                System.out.println("Ungültige Eingabe: " + input.charAt(i));
                validInput = false;
                break;
            }
        }

        if (validInput) {
            for (int line = 0; line < 5; line++) {
                for (char letter : input.toCharArray()) {
                    if (ascii.containsKey(letter)) {
                        System.out.print(ascii.get(letter)[line] + " ");
                    }

                }
                System.out.println();
            }
        }
    }
}