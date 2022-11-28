'use strict';

var singleUploadForm = document.querySelector('#singleUploadForm');
var singleUploadSuccess = document.querySelector('#singleUploadSuccess');

function uploadSingleFile(file) {
	
	var formData = new FormData();
	formData.append("file", file);
	
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "/uploadFile");
	
	xhr.onload = function() {
		console.log(xhr.resposeText);
		var response = JSON.parse(xhr.responseText);
		
		if(xhr.status == 200) {
			singleFileUploadSuccess.innerHTML = "File Uploaded";
			
		}
		else {
			singleFileUploadSuccess.style.display = "none";
		}
	}
	xhr.send(formData);
}