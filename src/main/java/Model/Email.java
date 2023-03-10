package Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class Email implements Serializable {

    private static final void long  serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long emailId;

    private String ownerRef;

    private String emailFrom;

    private String emailTo;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;

    private LocalDateTime sendDateEmail;

    private  StatusEmail statusEmail;
}
