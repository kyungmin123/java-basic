package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        reviews[0] = inception;

        MovieReview abountTime = new MovieReview();
        abountTime.title = "어바웃 타임";
        abountTime.review = "인생 시간 영화";
        reviews[1] = abountTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
