package Main;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double currentAvailable = areaPerBucket*extraBuckets;
        double difference = area - currentAvailable;

        if (difference < 0) {
            return 0;
        }
        int numBuckets = 0;

        while (difference > 0) {
            extraBuckets++;
            numBuckets++;
            currentAvailable = areaPerBucket*extraBuckets;
            difference = area - currentAvailable;
        }
        return numBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        int numBuckets = 0;

        while (area > 0) {
            area -= areaPerBucket;
            numBuckets++;
        }
        return numBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int numBuckets = 0;
        while (area > 0) {
            numBuckets++;
            area -= areaPerBucket;
        }
        return numBuckets;
    }
}
