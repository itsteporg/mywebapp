package org.itstep.myWebApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "cf_mails")
public class Mail extends BaseEntity {

    @NotNull
    @Column(name = "text")
    private String text;

    @NotNull
    @Column(name = "todudu")
    private String to; // email

    @NotNull
    @Column(name = "timestamp")
    private LocalDateTime created;

//    @NotNull
//    @Column(name = "user_id")
//    private Integer userId; // owner



    public Mail() {
    }

    public Mail(Integer id, String name, String text, String to, LocalDateTime created, Integer userId) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.to = to;
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }



    @Override
    public String toString() {
        return "Mail{" +
                "text='" + text + '\'' +
                ", to='" + to + '\'' +
                ", created=" + created +
                "}";
    }
}
