package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import java.awt.*;
import java.util.Random;


public class Main extends Application {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int BALL_RADIUS = 15;
    public static final int PADDLE_HEIGHT = 100;
    public static final int PADDLE_WIDTH = 25;
    private static Random random;

    private boolean gameStarted;
    //для мяча скорость
    private int ballSpeedX = 1;
    private int ballSpeedY = 1;
    //позиция игроков левого и правого
    private double leftPlayerYPos = WINDOW_HEIGHT/2;
    private double rightPlayerYPos = WINDOW_HEIGHT/2;

    private double ballXPos = WINDOW_WIDTH/2;
    private double ballYPos = WINDOW_HEIGHT/2;
    private int leftScore = 0;
    private int rightScore = 0;

    private double leftPlayerXPos = 10;
    private double rightPlayerXPos = WINDOW_WIDTH-PADDLE_WIDTH-10;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(17), e -> run(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
       // primaryStage.setScene(new Scene(new StackPane(canvas)));
        canvas.setOnMouseClicked(e -> gameStarted = true);
        canvas.setOnMouseMoved(e -> leftPlayerYPos = e.getY());
        primaryStage.setScene(new Scene((new StackPane(canvas) )));
        primaryStage.show();
        tl.play();


       /* //создание линии
        Line line = new Line(WINDOW_WIDTH/2,0,WINDOW_WIDTH/2,WINDOW_HEIGHT);
        line.setStroke(Color.WHITE);
        line.setStrokeWidth(5);
        //мяч
        Circle ball = new Circle(WINDOW_WIDTH/2,WINDOW_HEIGHT/2, BALL_RADIUS);
        ball.setFill(Color.WHITE);
        //отбивалка левая
        Rectangle leftPaddle = new Rectangle(PADDLE_WIDTH,PADDLE_HEIGHT);
        leftPaddle.setX(PADDLE_WIDTH);
        leftPaddle.setY((WINDOW_HEIGHT-PADDLE_HEIGHT)/2);
        leftPaddle.setFill(Color.WHITE);
        //отбивалка правая
        Rectangle rightPaddle = new Rectangle(PADDLE_WIDTH,PADDLE_HEIGHT);
        rightPaddle.setX(WINDOW_WIDTH - 2 *PADDLE_WIDTH);
        rightPaddle.setY((WINDOW_HEIGHT-PADDLE_HEIGHT)/2);
        rightPaddle.setFill(Color.WHITE);

        //создаем объект
        Group group = new Group(line,ball,leftPaddle,rightPaddle);
        // Создание сцены путем передачи объекта группы, высоты и ширины
        Scene scene = new Scene(group,WINDOW_WIDTH,WINDOW_HEIGHT);
        //установка цвета
        scene.setFill(Color.BROWN);
        // Установка заголовка
        primaryStage.setTitle("Sample Application");
        //Добавляем сцену в Stage
        primaryStage.setScene(scene);
        //Отображение содержимого сцены
        primaryStage.show();


        /* Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        */
    }
    private void run(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0, WINDOW_WIDTH,WINDOW_HEIGHT);
        gc.setFill(Color.WHITE);
        gc.fillRect(WINDOW_WIDTH/2-2,0, 4,WINDOW_HEIGHT);
        if (gameStarted){
            //движение мяча
            ballXPos += ballSpeedX;
            ballYPos += ballSpeedY;
            //проверяем выход мяча за границы поля
            if (ballXPos<leftPlayerXPos){
                rightScore++;
                gameStarted = false;
            }
            if (ballXPos > rightPlayerXPos){
                leftScore++;
                gameStarted = false;
            }
            if(ballYPos < 0 || ballYPos >WINDOW_HEIGHT ){
                ballSpeedY = -ballSpeedY;
            }
            //Отбивание мяча от ракеток
            // от правой ракетки
            if ((ballXPos + BALL_RADIUS > rightPlayerXPos) &&
                    ballYPos >= rightPlayerYPos&& ballYPos <= rightPlayerYPos + PADDLE_HEIGHT){
                if (ballXPos >0) ballSpeedX ++;
                else ballSpeedX--;
                if (ballSpeedY >0) ballSpeedY++;
                else ballSpeedY--;
                ballSpeedX= - ballSpeedX;
                //ballSpeedY = -ballSpeedY;
            }
            if ((ballXPos  < leftPlayerXPos + BALL_RADIUS) &&
                    ballYPos >= leftPlayerYPos&& ballYPos <= rightPlayerYPos + PADDLE_HEIGHT)
            { if (ballXPos >0) ballSpeedX ++;
            else ballSpeedX--;
                if (ballSpeedY >0) ballSpeedY++;
                else ballSpeedY--;
                ballSpeedX= - ballSpeedX;
                //ballSpeedY = -ballSpeedY;

            }

            //типа ИИ для правого играка
            if (ballXPos < 3*WINDOW_WIDTH/4){
                rightPlayerYPos = ballYPos - PADDLE_HEIGHT/2;

            }
            else {
                rightPlayerYPos = ballYPos > rightPlayerYPos+PADDLE_HEIGHT/2 ?
                        rightPlayerYPos+=1:rightPlayerYPos-1;
            }
            gc.fillOval(ballXPos,ballYPos,BALL_RADIUS,BALL_RADIUS);

        }
        else {//игра не началась
            gc.setStroke(Color.YELLOW);
            gc.setTextAlign(TextAlignment.CENTER);
            gc.strokeText("Click to Start", WINDOW_WIDTH/2,WINDOW_HEIGHT/2);
            ballXPos = WINDOW_WIDTH/2;
            ballYPos = WINDOW_HEIGHT/2;
            if (random.nextInt(2) == 0){
                ballSpeedX =1;
            }
            else {
                ballSpeedX =-1;
            }
            if (random.nextInt(2) == 0){
                ballSpeedY = 1;
            }
            else {
                ballSpeedY = -1;
            }
        }
        //рисуем ракетки
        gc.fillText(leftScore+ "\t\t\t\t\t\t\t" + rightScore, WINDOW_WIDTH/2, 100);
        gc.fillRect(rightPlayerXPos,rightPlayerYPos,PADDLE_WIDTH,PADDLE_HEIGHT);
        gc.fillRect(leftPlayerXPos, leftPlayerYPos, PADDLE_WIDTH,PADDLE_HEIGHT);

    }
    public static void main(String[] args) {
        launch(args);
    }
}
