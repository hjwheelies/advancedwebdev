function addListeners(){
	var searchBtn = document.getElementById("searchBtn");
	if (searchBtn){
		searchBtn.addEventListener("click", function(event){
			event.preventDefault();
			var value = document.getElementById("").value;
	/*		if(!value || value.trim().length === 0){
				alert("Enter a valid search title");
				return false;
			}else{*/
			//COMMENTED BLOCK FOR VALIDATION PURPOSES
				document.forms[0].submit();
			}
		});
	}
}