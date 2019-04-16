
class Matrix {
    private int[][] intMatrix;
    private int rows;

    Matrix(String matrixAsString) {
        String[] stringsSplitByLine = matrixAsString.split("[\\r\\n]+");
        String[] rowNumbersAsStrings = stringsSplitByLine[0].split(" ");

        int[][] matrix = new int[stringsSplitByLine.length][rowNumbersAsStrings.length];

        for(int i = 0; i < stringsSplitByLine.length; i++){
            rowNumbersAsStrings = stringsSplitByLine[i].split(" ");

            for (int n = 0; n < rowNumbersAsStrings.length; n++){
                matrix[i][n] = Integer.parseInt(rowNumbersAsStrings[n]);
            }
        }

        this.intMatrix = matrix;
        this.rows = stringsSplitByLine.length;

    }

    int[] getRow(int rowNumber) {
        return intMatrix[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[rows];

        for (int i = 0; i < column.length; i++){
            column[i] = intMatrix[i][columnNumber];
        }

        return column;
    }
}
