package com.knoldus.service;

import java.util.List;
import com.knoldus.model.PostSignInResponse;
import com.knoldus.model.PostSignUpDto;
import com.knoldus.model.RegistrationRequest;
import com.knoldus.model.SignInRequest;

/**
 * Authentication Service
 */
public interface IAuthenticationService {
  /**
   * User registration
   *
   * @param requestDto the request dto
   * @return the post sign up dto
   * @throws Exception the exception
   */
  PostSignUpDto doRegistration(List<RegistrationRequest> requestDto) throws Exception;

  /**
   * Do login.
   *
   * @param signInRequest the sign in request
   * @return the post sign in response
   * @throws Exception the exception
   */
  PostSignInResponse doLogin(SignInRequest signInRequest) throws Exception;
}
