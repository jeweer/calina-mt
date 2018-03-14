<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/jquery-ui.css" />
<script type="text/javascript" src="js/jquery.1.9.1.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<style type="text/css">
#draggable {
	width: 150px;
	height: 150px;
	padding: 0.5em;
	position: absolute;
}
</style>
</head>
<script type="text/javascript">
	$(function(){
		$("#draggable").draggable()
	})
</script>

<body>
	<div id="draggable">1</div>
</body>
</html>