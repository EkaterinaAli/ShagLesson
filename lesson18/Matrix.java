package lesson18;

public class Matrix<n> {
    //3. Класс Матрица
//Создать класс "Матрица". Класс должен иметь следующие переменные:
//двумерный массив вещественных чисел;
//количество строк и столбцов в матрице.
//Класс должен иметь следующие методы:
//сложение с другой матрицей;
//умножение на число;
//вывод на печать;
//умножение матриц - по желанию.
    private double mas[][];
    private int rowsQty;
    private int colQty;

    public Matrix() {
    }


    public Matrix(double[][] arr) {
        rowsQty = arr.length;
        colQty = arr[0].length;
        mas = new double[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                mas[i][j] = arr[i][j];
            }
        }

    }

    public Matrix(int n, int m) {
        rowsQty = n;
        colQty = m;
        this.mas = new double[rowsQty][colQty];
    }

    public Matrix addMatrix(Matrix b) {
        Matrix res = null;
        if (rowsQty == b.rowsQty && colQty == b.colQty) {
            res = new Matrix(rowsQty, colQty);
            for (int i = 0; i < rowsQty; i++) {
                for (int j = 0; j < colQty; j++) {
                    res.mas[i][j] = mas[i][j] + b.mas[i][j];
                }
            }
        }
        return res;
    }

    public void fillMatrix(double a) {
        for (int i = 0; i < rowsQty; i++) {
            for (int j = 0; j < colQty; j++) {
                mas[i][j] = a;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rowsQty; i++) {
            for (int j = 0; j < colQty; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

}
