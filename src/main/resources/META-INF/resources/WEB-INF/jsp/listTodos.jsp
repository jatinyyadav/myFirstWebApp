 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
	<title>Todo's</title>
	</head>
	<body>
		<div class="container">
			<h1>Your todo's</h1><hr>
			
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>target-date</th>
						<th>description</th>
						<th>done</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.description}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
				
			</table>
			<a href="add-todo" class="btn btn-success">Add Todo</a>
		</div>
		
	    
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>