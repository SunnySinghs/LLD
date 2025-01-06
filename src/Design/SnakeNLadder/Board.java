package Design.SnakeNLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell[][] cells;
    private int size;

    public Board(int size, int noOfSnakes, int noOfLadders) {
        this.size = size;
        initializeBoard(size);
        addSnakeNLadders(noOfSnakes, noOfLadders);
    }

    private void initializeBoard(int size) {
        this.cells = new Cell[size+1][size+1];
        for(int i=0; i<=size; i++) {
            for(int j=0; j<=size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public int getSize() {
        return size;
    }

    private void addSnakeNLadders(int noOfSnakes, int noOfLadders) {
        int size = cells.length-1;
        while (noOfSnakes > 0) {
            int head = ThreadLocalRandom.current().nextInt(1, size*size);
            int tail = ThreadLocalRandom.current().nextInt(1, size*size);
            if (head < tail) {
                continue;
            }

            Jump snakeJump = new Jump(head, tail);

            Cell cell = getCell(head);
            //System.out.println("snakeJump" + snakeJump.toString());

            cell.setJump(snakeJump);

            noOfSnakes--;
        }

        while (noOfLadders > 0) {
            int head = ThreadLocalRandom.current().nextInt(1, size*size);
            int tail = ThreadLocalRandom.current().nextInt(1, size*size);
            if (head > tail) {
                continue;
            }

            Jump ladderJump = new Jump(head, tail);

            Cell cell = getCell(head);
            //System.out.println("ladder" + ladderJump.toString());
            cell.setJump(ladderJump);

            noOfLadders--;
        }
    }

    public Cell getCell(int position) {
        int row = position/size;
        int column = position%size;
        return cells[row][column];
    }


}
