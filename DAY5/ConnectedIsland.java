public class ConnectedIsland {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0 }
        };
        countIsland(arr);
    }

    public static void countIsland(int[][] array) {
        // Visited array of boolean to check weather it is visited or not
        boolean[][] visited = new boolean[array.length][array[0].length];
        int count = 0; // count number of island
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // if the position is not visited and it is also '1'
                if (array[i][j] == 1 && visited[i][j] == false) {
                    // calling for further check
                    drawTree(array, i, j, visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void drawTree(int[][] arr, int i, int j, boolean[][] visited) {
        // check the position is 0 or not, it is already visited or not, it is in the
        // bound or not
        if ( i < 0 || j < 0 || i >= arr.length || j >= arr[0].length||arr[i][j] == 0 || visited[i][j] == true ){
            return;
        }
        // mark it visited
        visited[i][j] = true;
        // check for above position
        drawTree(arr, i - 1, j, visited);
        // check for right position
        drawTree(arr, i, j + 1, visited);
        // check for down position
        drawTree(arr, i, j - 1, visited);
        // check for left position
        drawTree(arr, i + 1, j, visited);
    }
}
