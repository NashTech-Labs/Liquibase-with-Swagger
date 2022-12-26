package com.knoldus.service.impl;

import com.knoldus.dao.UserRepository;
import com.knoldus.model.Users;
import com.knoldus.service.IUserFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type User fetch service.
 */
@Service
public class UserFetchService implements IUserFetchService {

  /**
   * UserRepository.
   */
  @Autowired
  private UserRepository userRepository;

  @Override
  public Users fetchUserById(long id) throws Exception {
    try {
      return userRepository.findByUserId(id);
    } catch (Exception ex) {
      throw ex;
    }
  }
}
