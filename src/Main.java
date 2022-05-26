public class Main {

    public static void main(String[] args) {
        String[][] test;
        test = new String[4][4];
        //test = new String[5][3];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) test[i][j] = "1";
        }

        //test[2][2] = "ops!";

        try {
            someWorkWithArray(test);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }



    public static void someWorkWithArray(String[][] array) throws MyArraySizeException,MyArrayDataException {
        if (array.length == 4 && array[1].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for(int j = 0; j < array.length; j++) {
                    try {
                        int h = Integer.parseInt(array[i][j]);
                        h += h;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Array contains not valid symbol. Index = ", i, j);
                    }
                }
            }
        }
        else {
            throw new MyArraySizeException("Array size should be [4][4]");
        }
    }
}

