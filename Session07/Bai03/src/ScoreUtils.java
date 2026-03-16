public class ScoreUtils {
    // Phương thức kiểm tra Đạt/Trượt
    public static boolean checkPass(double score) {
        if (score >= 50) {
            return true;
        } else {
            return false;
        }
    }

    // Phương thức tính trung bình cộng
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return sum / scores.length;
    }
}