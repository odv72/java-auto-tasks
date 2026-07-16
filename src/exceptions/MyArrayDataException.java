package exceptions;

public class MyArrayDataException extends Exception {
    private int row;
    private int col;
    private String invalidValue;

    public MyArrayDataException(int row, int col, String invalidValue) {
        super(String.format("Неверные данные в ячейке [%d][%d]: '%s'", row, col, invalidValue));
        this.row = row;
        this.col = col;
        this.invalidValue = invalidValue;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getInvalidValue() {
        return invalidValue;
    }
}