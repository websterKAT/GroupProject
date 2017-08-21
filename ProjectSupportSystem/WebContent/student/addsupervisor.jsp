<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIT-University of Colombo School of Computing - Project
	Evaluation Support System</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="resources/styles/bitstudent.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/scripts/bitstudent.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>


</head>
<body>

	<jsp:include page="../_header.jsp" />
	<jsp:include page="../_leftSideBarStudent.jsp"/>

	<div class="changer" id="formload">
		<div class="input-data" id="addsupervisor">
			<form class="form-horizontal" method="POST" action="DoAddSupervisor"
				enctype="multipart/form-data">
				<center>
					<h4>Supervisor Details</h4>
				</center>
				<div class="form-group">
					<label for="InputFirstName" class="col-sm-3 control-label">First
						Name:</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="firstName"
							placeholder="First Name">
					</div>
				</div>
				<div class="form-group">
					<label for="InputLastName" class="col-sm-3 control-label">Last
						Name:</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="lastName"
							placeholder="Last Name">
					</div>
				</div>
				<div class="form-group">
					<label for="InputEmail" class="col-sm-3 control-label">E-Mail:</label>
					<div class="col-sm-9">
						<input type="email" class="form-control" name="email"
							placeholder="E-Mail">
					</div>
				</div>
				<div class="form-group">
					<label for="InputTeleNo" class="col-sm-3 control-label">Mobile:</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="mobileNo"
							placeholder="Mobile No">
					</div>
				</div>
				<div class="form-group">
					<label for="InputAddress" class="col-sm-3 control-label">Address:</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="address" rows="3"
							placeholder="No,Street Name,City Name"></textarea>
					</div>
				</div>
				<div class="form-group">
					<label for="Inputform" class="col-sm-3 control-label">Submit
						Form: </label>
					<div class="col-sm-9">
						<input type="file" name="agreementForm">
						<p class="help-block col-sm-3">"*filename:
							supervisorAgreementForm.pdf"</p>
					</div>
				</div>


				
				<button type="submit" class="btn btn-default">Save</button>
			</form>
		</div>


	</div>


</body>
</html>

