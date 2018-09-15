package lti.quiz.dao;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegistrationBean;

public interface UserDao {
	RegistrationBean authenticate(LoginBean login);

	boolean register(RegistrationBean register);

	boolean validate(ForgetBean forget);

	boolean update(LoginBean change);
}
