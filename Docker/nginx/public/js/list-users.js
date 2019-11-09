const URL_TO_FETCH = 'http://172.17.0.4/usuario';

$(document).ready(function() {
	fetch(URL_TO_FETCH);	
})

fetch(URL_TO_FETCH, {
  method: 'get'
})
.then(function(response) { 
  response.json().then(function(result){
      result.forEach(function(currentValue, index, arr){
        $("ul").append( "<li class='list-group-item'>" + currentValue.nome + "</li>");
      })
  })
})
.catch(function(err) { 
  console.error(err); 
});
