package lti.quiz.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import lti.quiz.bean.OptionBean;
import lti.quiz.bean.QuizBean;

public class QuizDaoImpl implements QuizDao {
	private Connection getConnection() throws SQLException {
	/*	DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "AIQ", "AIQ");*/
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/quiz");
			Connection conn = ds.getConnection();
			return conn;
		} catch (NamingException e) {
			throw new SQLException(e.getMessage());
		}
	}

	@Override
	public List<QuizBean> loadQuiz() {
		String sql = "select quiz.qid,question,options,score from quiz,answer where quiz.qid=answer.qid order by quiz.qid";
		Connection conn = null;

		try {
			conn = getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			List<QuizBean> questions = new ArrayList<>();
			QuizBean quiz = null;
			ArrayList<OptionBean> options = null;

			while (rs.next()) {
				if(quiz != null && quiz.getId() != rs.getInt(1)) {
					quiz.setOptions(options);
					questions.add(quiz);
					quiz = null;
				}
				if (rs.getInt(1) > questions.size() && quiz == null) {
					quiz = new QuizBean();
					quiz.setId(rs.getInt(1));
					quiz.setQuestion(rs.getString(2));
					options = new ArrayList<>();
				}
				options.add(new OptionBean(rs.getString(3), rs.getString(4)));
			}

			return questions;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getResult(String code) {
		String sql = "select hero from result where code='" + code + "'";
		Connection conn = null;
		
		try {
			conn = getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			if(rs.next())
				return rs.getString(1);
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}









/*package lti.quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lti.quiz.bean.OptionBean;
import lti.quiz.bean.QuizBean;
import lti.quiz.bean.RegistrationBean;
import oracle.jdbc.OracleDriver;

public class QuizDaoImpl implements QuizDao {
	private Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "AIQ", "AIQ");
		return conn;
	}

	QuizBean qb = null;
	ArrayList<OptionBean> ar = null;
	List<QuizBean> list = null;
	
	
	
	@Override
	public List<QuizBean> loadQuiz() {
		String sql="select quiz.qid,question,options,option_detail from quiz,answer where quiz.qid=answer.qid";
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			QuizBean quiz = null;
			OptionBean option = null;
			ArrayList<OptionBean> options = null;
			ArrayList<QuizBean> quizlist = new ArrayList<>();
			 while(rs.next()) {
				 quiz = new QuizBean();
				 
				 options = new ArrayList<>();
				 quiz.setQuestion(rs.getString(2));
				 String sql1 = "select options, score from answer where qid = ?";
					PreparedStatement stmt1 = conn.prepareStatement(sql);
					stmt1.setString(1, getString(1));
					ResultSet rs1 = stmt1.executeQuery();
					while(rs1.next()) {
						option = new OptionBean();
						
						option.setOption(rs1.getString(1));
						option.setScore(rs1.getString(2));
						options.add(option);
						quiz.setOptions(options);
					}
				 
			 }
			return quiz;
			
		

		}  catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private String getString(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResult(String code) {
		String sql = "select hero from result where code=?";
		// TODO Auto-generated method stub
		return null;
	}

}
*/