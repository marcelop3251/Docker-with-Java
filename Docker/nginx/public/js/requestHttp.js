
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

	$.ajax({
   		 url: ' http://172.17.0.4/usuario',
	    type: 'post',
	    headers: {
	       'Content-Type': 'application/json'
	    },
	    data: JSON.stringify(dados),
	    dateType: 'json',
	    success: function (data) {
        	console.info(data);
    }
});

}

