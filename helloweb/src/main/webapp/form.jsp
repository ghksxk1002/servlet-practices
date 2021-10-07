<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="join.jsp" method="post">
		이메일 : <input type="text" name="email" /> <br /> <br /> <br />
		
		 비밀번호: <input type="password" name="password" /> <br /> <br /> <br /> 
		 <select name="birthYear">
		 	<option value="1990">1996</option>
		 	<option value="1994">1994</option>
		 	<option value="7778">7778</option>

		 </select>
		 <br /><br />
		 성별 : 
		 여 <input type="radio" name="gender" value="F"/>
		 <br />
		 남 <input type="radio" name="gender" value="M" checked="checked"/>
		 <br />
		 취미 :
		 코딩<input type="checkbox" name="hobby" value="coding"/>
		 술먹기<input type="checkbox" name="hobby" value="drinink"/>
		 요리<input type="checkbox" name="hobby" value="cook"/>
		 수영<input type="checkbox" name="hobby" value="wind"/>
		 <br /><br />
		 
		 자기소개:<br />
		 <textarea name="profile"></textarea>
		 
		 <br /><br />
		 <input type="submit" value="회원가입" />
	</form>
</body>
</html>