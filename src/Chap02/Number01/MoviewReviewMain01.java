package Chap02.Number01;

public class MoviewReviewMain01 {
    public static void main(String[] args) {

        MovieReview movieReview01 = new MovieReview();

        movieReview01.title = "인셉션";
        movieReview01.review = "인생은 무한루프";

        MovieReview movieReview02 = new MovieReview();

        movieReview02.title = "어바웃타임";
        movieReview02.review = "인생 시간영화";

        System.out.println("영화 제목:" + movieReview01.title + ", 평점:" + movieReview01.review);
        System.out.println("영화 제목:" + movieReview02.title + ", 평점:" + movieReview02.review);




    }
}
