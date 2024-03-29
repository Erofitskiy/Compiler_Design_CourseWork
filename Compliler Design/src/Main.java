import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CompilerDesign.fxml"));
        primaryStage.setTitle("CompilerDesign");

        Scene sc = new Scene(root, 1000, 600);

        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}


// 4 проблема вывода синтаксической матрицы для очень больших граммматик     например сокращение токенов(вывод полного имени при наведении курсора)
// распознать грамматику (парсинг файла грамматики) С#
//   https://github.com/antlr/grammars-v4/blob/master/csharp/CSharpParser.g4

// начать с    https://github.com/antlr/grammars-v4/blob/master/arithmetic/arithmetic.g4
// Создание программного комплекса поддержки для курса "Методы разработки компиляторов"
//  + 1) Починить Follow
//  + 2) Добавить ещё один тест
//  + 3) починить First
//  + 4) Добавить в тесты проверку на размерность
//  + 3) Добавить в тесты проверку на Follow
//  + 4) Одеть в JavaFX
// 5) Сделать SyntaxMatrix

// TO DO:
// + пофиксить в примере5 follow
// + убрать дубликаты из NonTerminals, привести к типу ArrayList и отрефакторить тесты


