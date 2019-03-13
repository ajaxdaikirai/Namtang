<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Start Up</title>
	<style type="text/css">
		.imgs_wrap{
			width:600px;
			margin-top: 50px;
		}
		.imgs_wrap img{
			max-width: 200px;
		}
	</style>
	
	<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
		var sel_files = [];
		
		$(document).ready(function(){
			$("#upLoadFile").on("change",handleImgsFilesSelect);	
			
		});
		function deleteImageAction(index){
			console.log("index : " +index);
			sel_files.splice(index,1);
				
			var img_id = "#img_id_"+index;
			$(img_id).remove();
			console.log(sel_files);
		}
		
		function fileUploadAction(){
			console.log("fileUploadAction");
			$("#upLoadFile").trigger('click');
		}
		
		function handleImgsFilesSelect(e){
			sel_files = [];
			$(".imgs_wrap").empty();
			
			var files = e.target.files;
			var filesArr = Array.prototype.slice.call(files);
			
			var index = 0;
			filesArr.forEach(function(f){
				if(!f.type.match("image.*")){
					alert("확장자는 이미지만 가능");
					return;
				}
			sel_files.push(f);
			var reader = new FileReader();
			reader.onload = function(e){
				var html = "<a href=\"javascript:void(0);\"onclick=\"deleteImageAction("+index+")\" id=\"img_id"+index+"\"><img src=\"" + e.target.result + "\" data-file='"+f.name+"' class='selProductFile' title='Click to remove'></a>";
// 				var img_html = 	"<img src=\"" + e.target.result + "\" />";
				$(".imgs_wrap").append(html);
				index++;
			}
			reader.readAsDataURL(f);
			
			});
		}
		function deleteImageAction(index){
			console.log("index : " +index);
			sel_files.splice(index,1);
				
			var img_id = "#img_id_"+index;
			$(img_id).remove();
			console.log(sel_files);
		}
		
		function init() {
			
			$.ajax({
				
				url:"viewSns", // controller의 action 부분
				data:{}, // 데이터없음
				type:"get", // method는 get
				success:function(result){ // 성공시 listReviewe action의 리턴값을 받아옴 
					output(result); // output 함수 실행
				}
				
			});
			
		}
	</script>
</head>	
<body>
	
	<form name="fileForm" action="writeSns" method = "post" enctype="multipart/form-data">
		<input type="hidden" name="userSeq" id="userSeq" value="${sessionScope.userSeq}">
		<input type="text" name="snsContent" id="snsContent">
       <div class="input_wrap">
		<a href="javascript:" onclick="fileUploadAction();" class="my_button">파일업로드</a>
		<input multiple="multiple" type="file" id="upLoadFile" name="upLoadFile"/>
		</div>
        <div>
			<div class="imgs_wrap">
			<img id="img"/>
		</div>
		</div>
		해쉬태그 : 
		<input type="text" id="firstTag" name="firstTag">
		<input type="text" id="secondTag" name="secondTag">
		<input type="text" id="thirdTag" name="thirdTag">
        <input type="submit" value="전송" />
    </form>
    
    <div>
    
    qwe
    asd
    zxc
    
    </div>
</body>
</html>