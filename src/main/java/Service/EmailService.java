package Service;

import Model.Email;
import Repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;


    public void sendEmail(Email email, HttpStatus created) {
         
    }
}
