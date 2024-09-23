package secao12.a125;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(title+"\n"+likes+" - "+moment+"\n"+content+"\n"+"Comments: "+"\n");
        for (Comment c : comments) str.append(c.getText()+"\n");
        return str.toString();
    }
}
