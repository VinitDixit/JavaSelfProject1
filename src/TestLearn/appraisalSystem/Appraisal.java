package TestLearn.appraisalSystem;

public class Appraisal {
    Integer rating;
    Double hikePercent;
    String comment;

    @Override
    public String toString() {
        return "Appraisal Details::{" +
                "rating=" + rating +
                ", hikePercent=" + hikePercent +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Double getHikePercent() {
        return hikePercent;
    }

    public void setHikePercent(Double hikePercent) {
        this.hikePercent = hikePercent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
