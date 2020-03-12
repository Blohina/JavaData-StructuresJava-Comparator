import java.util.*;

class Checker implements Comparator<Player> {
    public int compare(Player A,  Player B) {
        int scoreA = A.score;
        int scoreB = B.score;
        int k = Integer.compare(scoreB, scoreA);
        if( k != 0) {
            return k;
        } else {
            return A.name.compareTo(B.name);

        }

        
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
