package com.ibm.newsletter.service;

import com.ibm.newsletter.entity.ContactUs;

import java.util.List;

public interface ContactService {

    List<ContactUs> getContactList();

    void saveContact(ContactUs contactUs);

    void updateContact(long id, ContactUs contactUs);

    void deleteContact(long id);
}
