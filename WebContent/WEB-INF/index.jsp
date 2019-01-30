<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Calculatrice</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<div class="page-header">
				<h1>Calculatrice en ligne</h1>
			</div>
			<!-- ADDITION -->
			<form class="form-horizontal" action="Calculatrice" method="POST">
				<div class="form-group">
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="2" name="addition1">
					</div>
					<div class="col-sm-1 text-center">
						<h4>+</h4>
					</div>
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="5" name="addition2">
					</div>
					<div class="col-sm-3">
						<button type="submit" class="btn btn-success">Valider</button>
					</div>
				</div>
				<input name="opperation" type="hidden" value="plus">
				<div class="col-sm-12">
					<h4> ${ reponseAddition} </h4>
				</div>
				</input>
			</form>
			<!-- SOUSTRACTION -->
			<form class="form-horizontal" action="Calculatrice" method="POST">
				<div class="form-group">
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="6" name="soustraction1">
					</div>
					<div class="col-sm-1 text-center">
						<h4>-</h4>
					</div>
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="3" name="soustraction2">
					</div>
					<div class="col-sm-3">
						<button type="submit" class="btn btn-success">Valider</button>
					</div>
				</div>
				<input name="opperation" type="hidden" value="moin">
				<div class="col-sm-12">
					<h4> ${ reponseSoustraction} </h4>
				</div>
				</input>
			</form>
			<!-- DIVISION -->
			<form class="form-horizontal" action="Calculatrice" method="POST">
				<div class="form-group">
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="20" name="division1">
					</div>
					<div class="col-sm-1 text-center">
						<h4>/</h4>
					</div>
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="5" name="division2">
					</div>
					<div class="col-sm-3">
						<button type="submit" class="btn btn-success">Valider</button>
					</div>
				</div>
				<input name="opperation" type="hidden" value="division">
				<div class="col-sm-12">
					<h4> ${ reponseDivision} </h4>
				</div>
				</input>
			</form>
			<!-- MULTIPLICATION -->
			<form class="form-horizontal" action="Calculatrice" method="POST">
				<div class="form-group">
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="5" name="multiplication1">
					</div>
					<div class="col-sm-1 text-center">
						<h4>*</h4>
					</div>
					<div class="col-sm-4">
						<input type="number" class="form-control" placeholder="4" name="multiplication2">
					</div>
					<div class="col-sm-3">
						<button type="submit" class="btn btn-success">Valider</button>
					</div>
				</div>
				<input name="opperation" type="hidden" value="multi">
				<div class="col-sm-12">
					<h4> ${ reponseMultiplication} </h4>
				</div>
				</input>
			</form>	
		</div>
	</div>
</body>
</html>