
public class weeklylearningreport {

    public static void main(String[] args) {
        int ctopics = 17;
        int totaltopics = 20;
        int dailylearninghours = 3;
        int learningdays = 5;
        int remaingtopics = totaltopics - ctopics;
        int weekly = dailylearninghours * learningdays;
        double persentage = (double) ctopics * 100 / totaltopics;
        System.out.println("Completed Topics: " + ctopics);
        System.out.println("Remaining Topics: " + remaingtopics);
        System.out.println("Weekly Learning Hours: " + weekly);
        System.out.println("Progress Percentage: " + persentage);
    }
}
