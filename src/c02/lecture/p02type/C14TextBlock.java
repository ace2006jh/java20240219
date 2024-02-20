package c02.lecture.p02type;

public class C14TextBlock {
    public static void main(String[] args) {
        // text block
        // """로 묶음
        // newline, 따옴표등을 탈출 문자 없이 사용 가능
        // 가장 왼쪽에 있는 문자 기준으로 들여쓰기 결정
        String html2 = """
                <html>
                    <head>
                        <title> 웹 페이지</title>
                    </head>
                    <body>
                        <p> asdfasfasfasf </p>
                    </body>
                    
                </html>
                """;
        System.out.println("html2 = " + html2);
    }
}
