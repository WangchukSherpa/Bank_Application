package com.jigmee.thejavabankingapplication.service.impl;

import com.jigmee.thejavabankingapplication.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
