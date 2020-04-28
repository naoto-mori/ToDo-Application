<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Remind" %>
<%@ page import="java.util.List" %>
<%
//アプリケーションスコープに保存されたリマインドリストを取得
List<Remind> remindList = (List<Remind>)application.getAttribute("remindList");
//リクエストスコープに保存したエラーメッセージを取得(2020/04/26[mori])
String errorMsg = (String)request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDo-Application</title>
</head>
<body>
<h1>ToDo-Application（仮）</h1>

<form action="/ToDo-Application/Main" method="post"> <!-- ②リマインド内容をMainサーブレットにdoPost -->
	<p>リマインド内容：<input type="text" name="remind"></p>
	<p><input type="submit" value="ToDo!"></p>
</form>
<% if(errorMsg != null){ %><!--  errorLogの追記(2020/04/26[mori]) -->
	<p><%= errorMsg %></p>
<% } %>
<% for(Remind remind : remindList) { %>
	<p><%= remind.getRemind() %></p>
<% } %>
</body>
</html>