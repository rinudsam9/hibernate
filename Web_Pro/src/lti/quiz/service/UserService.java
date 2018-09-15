package lti.quiz.service;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegistrationBean;

public interface UserService {
	RegistrationBean authenticate(LoginBean login);

	boolean register(RegistrationBean register);

	boolean validate(ForgetBean forget);

	boolean update(LoginBean change);

}
