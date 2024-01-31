package dev.trifanya.spring_webapp.model;

import dev.trifanya.spring_webapp.model.task.Task;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class Comment {
    private int id;
    private String text;
    private LocalDateTime createdAt;
    private Task task;
    private User author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return id == comment.id &&
                Objects.equals(text, comment.text) &&
                Objects.equals(createdAt, comment.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, createdAt);
    }
}
