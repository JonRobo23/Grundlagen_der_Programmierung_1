public class Arrays {
    public static double smallestValue(double[] values) {
        double smallestV = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < smallestV)
                smallestV = values[i];
        }
        return smallestV;
    }

    public static double biggestValue(double[] values) {
        double biggestV = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > biggestV)
                biggestV = values[i];
        }
        return biggestV;
    }

    public static double average(double[] values) {
        double sum = 0;
        for (double value: values)
            sum += value;
        return sum / values.length;
    }

    public static int num_over_target(double[] values, double target) {
        int number = 0;
        for (double value: values) {
            if (value > target)
                number++;
        }
        return number;
    }

    // returns the index of the first element above the given border
    public static int getIndexOverBorder(double[] values, double border_value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > border_value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] measurements = { 21.3, 19.8, 20.1, 22.4, 18.7, 21.9, 20.5, 23.1, 19.4, 20.0 };
        System.out.printf("smallest value %f\n", smallestValue(measurements));
        System.out.printf("biggest value %f\n", biggestValue(measurements));
        double average = average(measurements);
        System.out.printf("average %f\n", average);
        System.out.printf("num over average %d\n", num_over_target(measurements, average));
        System.out.printf("Index of the first value over 22.0 %d\n", getIndexOverBorder(measurements, 22.0));
    }
}
