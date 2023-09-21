<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>vm</title>
      <link rel="stylesheet" href="css/structure.css">

    <script src="https://kit.fontawesome.com/e5fede6c09.js" crossorigin="anonymous"></script>
</head>
<body> 
	<main>
    

	
	<jsp:include page="/WEB-INF/views/common/hearder.jsp">

        <section class="content">
            <section class="content-1"></section>

            <!-- 아이디/비밀번호/로그인버튼 영역-->
            <section class="content-2">
                <form action="#" name="login-form">

                    <fieldset id="id-pw-area">
                        <section>
                            <input type="text" name="inputId" placeholder="아이디">
                            <input type="password" name="inputPw" placeholder="비밀번호">
                        </section>

                        <section>
                            <button>로그인</button>
                        </section>
                    </fieldset>

                    <label>
                        <input type="checkbox" name="saveId"> 아이디 저장
                    </label>

                    <!-- 회원가입/ Id/pw 찾기 영역 -->
                    <section id="signup-find-area">
                        <a href="#">회원가입</a>
                        <span>|</span>
                        <a href="#">ID/PW 찾기</a>
                    </section>

                </form>

            </section>

        </section>

    </main>


</body>
</html>