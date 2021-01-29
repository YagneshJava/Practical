$(document).ready(function(){
	
	$("#resetSbmtForm").click(function(){
		$('#idRow').hide();
		$('#updateFormDetails')[0].reset();
	}); 	
});


function getListOfUsers(){
	
	$.ajax({
		url : "/getUserList",
		type : "POST",
		dataType : 'json',
		secureuri : false,
		success : function(data) {
			 for(var i=0;i<data.length;i++){
				 $('#tblDynamic').append('<tr>' + '<td>' +data[i].id + '</td>'  + '<td >' +data[i].name + '</td>'  +  '<td >' +data[i].dateOfBirth + '</td>'  + '<td >' +data[i].userName + '</td>'  + '<td >' +data[i].email + '</td>'  + '<td ><input type="button" onclick="deleteRecord('+data[i].id+')" value="Delete"></td>'  +'<td ><input type="button" onclick="updateRecord(\''+data[i].id+'\',\''+data[i].name.trim()+'\',\''+data[i].userName.trim()+'\',\''+data[i].dateOfBirth.trim()+'\',\''+data[i].email.trim()+'\');" value="Edit"></td>'  +'</tr>');
			 }
		}
	});
}



function deleteRecord(id){
	$.ajax({
		url : "/deleteRecord",
		data:{
			"id":id
		},
		type : "POST",
		dataType : 'json',
		secureuri : false,
		success : function(data) {			
		}
	});
	
}

//,"'+data[i].dateOfBirth +'","' +data[i].userName + '","' +data[i].email + '"
//,userName,email
function updateRecord(id,name,userName,dateOfBirth,email){
	$('#userTableDiv').hide();
	$('#idRow').hide();
	$('#updateAddDiv').show();
	$('#id').val(id);
	$('#name').val(name);
	$('#userName').val(userName);
	$('#birth').val(dateOfBirth);
	$('#email').val(email);
}

function updateInfo(){
	if($('#name').val().trim() =='' || $('#name').val().trim() == undefined){
		alert('Please enter first name');
		return;
	}
	if($('#lastName').val().trim() =='' || $('#lastName').val().trim() == undefined){
		alert('Please enter last name');
		return;
	}
	if($('#birth').val().trim() =='' || $('#birth').val().trim() == undefined){
		alert('Please enter date of birth');
		return;
	}
	if($('#userName').val().trim() =='' || $('#userName').val().trim() == undefined){
		alert('Please enter user name');
		return;
	}
	if($('#password').val().trim() =='' || $('#password').val().trim() == undefined){
		alert('Please enter password');
		return;
	}
	if($('#email').val().trim() =='' || $('#email').val().trim() == undefined){
		alert('Please enter email ');
		return;
	}
	
	$.ajax({
		url : "/updateUserInfo",
		data:$('#updateFormDetails').serialize(),
		type : "POST",
		dataType : 'json',
		secureuri : false,
		success : function(data) {			
		}
	});
	
}

function addNewrecord(){
	if($('#name').val().trim() =='' || $('#name').val().trim() == undefined){
		alert('Please enter first name');
		return;
	}
	if($('#lastName').val().trim() =='' || $('#lastName').val().trim() == undefined){
		alert('Please enter last name');
		return;
	}
	if($('#birth').val().trim() =='' || $('#birth').val().trim() == undefined){
		alert('Please enter date of birth');
		return;
	}
	if($('#userName').val().trim() =='' || $('#userName').val().trim() == undefined){
		alert('Please enter user name');
		return;
	}
	if($('#password').val().trim() =='' || $('#password').val().trim() == undefined){
		alert('Please enter password');
		return;
	}
	if($('#email').val().trim() =='' || $('#email').val().trim() == undefined){
		alert('Please enter email ');
		return;
	}
	
	$.ajax({
		url : "/addUserInfo",
		data:$('#updateFormDetails').serialize(),
		type : "POST",
		dataType : 'json',
		secureuri : false,
		success : function(data) {	
			alert("User Added");
		}
	});
	
}

function userList(){
	$('#updateAddDiv').hide();
	$('#userTableDiv').show();
}

