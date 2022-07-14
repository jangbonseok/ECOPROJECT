let index = {
	init: function() {
		$("#btn-save").on("click", ()=> {
			this.save();
		});
	},

	save: function() {
		//alert('user의 save함수 호출됨');
		let data = {
			username: $("#username").val(),
			passwd: $("#passwd").val(),
			email: $("#email").val()
		};

		//console.log(data);

		//회원가입 수행 요청
		$.ajax({
			type: "POST",
			url: "/auth/joinProc",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json" //요청의 응답이 왔을 때 default 문자열(생긴게 json이라면) => js 
		}).done(function(resp) {
			alert("회원가입이 완료되었습니다.");
			console.log(resp);
			location.href = "/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		}); //ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청
	},
}

index.init();