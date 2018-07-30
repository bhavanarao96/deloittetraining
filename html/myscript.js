/**
 * 
 */
	document.write("<h1>Welcome to JS</h1>");
	
	function display() {
		var r = confirm("are you sure you want to logout");
		if(r) {
			alert("logged out");
		}
		else {
			alert("welcome back");
		}
	}
	function askinput() {
		var name = prompt("enter name","..");
		alert("Welcome "+name);	
	}