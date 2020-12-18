package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static hw8.Logic.*;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    static final int MODE_H_VS_AI = 0;
    static final int MODE_H_VS_H = 1;

    private int mode;
    private int fieldSize;
    private int winningLength;

    private boolean isInit;

    private int cellWidth;
    private int cellHeight;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                if (!hw8.Logic.gameFinished) {
                    hw8.Logic.humanTurn(cellX, cellY);
                }
                if (gameFinished && checkWinLines(DOT_X, DOTS_TO_WIN))
                    JOptionPane.showMessageDialog(BattleMap.this, "Ю Вин!!! \n P.S не Дизель");
                if (gameFinished && checkWinLines(DOT_O, DOTS_TO_WIN))
                    JOptionPane.showMessageDialog(BattleMap.this, "Ю проиграть!!!");
                if (gameFinished && isFull())
                    JOptionPane.showMessageDialog(BattleMap.this, "Ничья!!!");

                    // тут можете проверить кто победил и вывести результат графически
                    // например через gameWindow
                    //



                repaint();
            }
        });


    }

    public void startNewGame(int mode, int fieldSize, int winningLength) {
        this.mode = mode;
        this.fieldSize = fieldSize;
        this.winningLength = winningLength;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }

        cellHeight = getHeight() / fieldSize;
        cellWidth = getWidth() / fieldSize;

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < hw8.Logic.SIZE; i++) {
            for (int j = 0; j < hw8.Logic.SIZE; j++) {
                if (hw8.Logic.map[i][j] == DOT_X) {
                    drawX(g, j, i);
                }
//                if (Logic.checkWinLines(DOT_X, DOTS_TO_WIN)) {
//                    drawLine(g, j, i);

//                }

            }

        }
        for (int i = 0; i < hw8.Logic.SIZE; i++) {
            for (int j = 0; j < hw8.Logic.SIZE; j++) {
                if (hw8.Logic.map[i][j] == hw8.Logic.DOT_O) {
                    drawY(g, j, i);
                }


            }
        }
        for (int i = 0; i < hw8.Logic.SIZE; i++) {
            for (int j = 0; j < hw8.Logic.SIZE; j++) {
                if (checkLine(i, j , 0, 1, DOT_O, DOTS_TO_WIN) || (checkLine(i, j , 0, 1, DOT_X, DOTS_TO_WIN))) {
                    int x1 = hw8.Logic.x1;
                    int y1 = hw8.Logic.y1;

                    drawLineHorizontal(g, x1, y1);
                    }
                }
            }
        for (int i = 0; i < hw8.Logic.SIZE; i++) {
            for (int j = 0; j < hw8.Logic.SIZE; j++) {
                if (checkLine(i, j , 1, 0, DOT_O, DOTS_TO_WIN) || (checkLine(i, j , 1, 0, DOT_X, DOTS_TO_WIN))) {
                    int x1 = hw8.Logic.x1;
                    int y1 = hw8.Logic.y1;

                    drawLineVertical(g, x1, y1);
                }
            }
        }
        for (int i = 0; i < hw8.Logic.SIZE; i++) {
            for (int j = 0; j < hw8.Logic.SIZE; j++) {
                if (checkLine(i, j , 1, 1, DOT_O, DOTS_TO_WIN) || (checkLine(i, j , 1, 1, DOT_X, DOTS_TO_WIN))) {
                    int x1 = hw8.Logic.x1;
                    int y1 = hw8.Logic.y1;

                    drawLineDiagonal1(g, x1, y1);
                }
            }
        }
        for (int i = 0; i < hw8.Logic.SIZE; i++) {
            for (int j = 0; j < hw8.Logic.SIZE; j++) {
                if (checkLine(i, j , -1, 1, DOT_O, DOTS_TO_WIN) || (checkLine(i, j , -1, 1, DOT_X, DOTS_TO_WIN))) {
                    int x1 = hw8.Logic.x1;
                    int y1 = hw8.Logic.y1;

                    drawLineDiagonal2(g, x1, y1);
                }
            }
        }
    }


//        ((Graphics2D)g).setStroke(new BasicStroke(5));
//        g.setColor(Color.RED);
//        g.drawString("qweqweqwe", 200, 200);

//        g.drawLine(100, 100, 400, 400);
//        g.drawOval(100, 100, 300, 300);




    private void drawX(Graphics g, int cellX, int cellY) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.RED);
        g.drawLine(cellX * cellWidth, cellY * cellHeight,
                (cellX + 1) * cellWidth, (cellY + 1) * cellHeight);
        g.drawLine((cellX + 1) * cellWidth, cellY * cellHeight,
                cellX * cellWidth, (cellY + 1) * cellHeight);
    }

    private void drawY(Graphics g, int cellX, int cellY) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.GREEN);
        g.drawOval(cellX * cellWidth, cellY * cellHeight, cellWidth, cellHeight);
    }

    private void drawLineHorizontal(Graphics g, int x1,  int y1) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.BLUE);
        g.drawLine((x1) * cellWidth,(y1) * cellHeight+cellHeight/2,
                (x1 + DOTS_TO_WIN) * cellWidth, (y1)* cellHeight+cellHeight/2);

    }
    private void drawLineVertical(Graphics g, int x1,  int y1) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.BLUE);
        g.drawLine((x1) * cellWidth + cellWidth/2,(y1) * cellHeight,
                (x1) * cellWidth + cellWidth/2, (y1 + DOTS_TO_WIN)* cellHeight);

    }
    private void drawLineDiagonal1(Graphics g, int x1,  int y1) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.BLUE);
        g.drawLine(x1 * cellWidth, y1 * cellHeight,
                (x1 + DOTS_TO_WIN) * cellWidth, (y1 + DOTS_TO_WIN) * cellHeight);

    }
    private void drawLineDiagonal2(Graphics g, int x1,  int y1) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.BLUE);
        g.drawLine((x1) * cellWidth, (y1+1) * cellHeight,
                (x1+DOTS_TO_WIN) * cellWidth, (y1 - DOTS_TO_WIN+1) * cellHeight);

    }
}


