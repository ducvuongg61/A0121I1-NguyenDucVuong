package service;

import model.MailBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MailBoxRepository;

import java.util.List;

@Service
public class MailBoxServiceImpl implements MailBoxService {
    @Autowired
    private MailBoxRepository mailBoxRepository;

    @Override
    public List<MailBox> findAll() {
        return mailBoxRepository.findAll();
    }

    @Override
    public void save(MailBox mailBox) {
        mailBoxRepository.save(mailBox);
    }
}
