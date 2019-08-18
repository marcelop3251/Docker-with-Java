
$(document).ready(function() {
	$("#salve").click(registerUser);	
})


function registerUser(){
	var dados = 
	{
	 nome: $("#nome").val(),
	 idade: $("#idade").val()
	}

  	console.log(dados);

  	$.post("http://localhost:80/usuario",dados, function(){
  		console.log("Dados salvo com sucesso");
  	})
}

