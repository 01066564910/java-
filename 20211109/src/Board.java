
public class Board {
 // 번호 , 제목 , 글쓴이 , 내용 , 글쓴이의 ip주소 , 방문자 수
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readCount;
	//생성자
	public Board() {}
	public Board(int num,String subject,String writer,
				String content,String ip,int readCount) {
		this.num = num;
		this.subject=subject;
		this.writer = writer;
		this.content = content;
		this.ip = ip;
		this.readCount = readCount;
	}
	//setter //메서드 는 여기서 부터의 개념이 아니라 하나하나 의 개념이다.
	public void setNum(int num) {
		this.num=num;
	}
	public void setSubject(String subject){
		this.subject =subject;
	}
	public void setWriter(String writer){
		this.writer =writer;
	}
	public void setContentr(String content){
		this.content =content;
	}public void setip(String ip) {
		this.ip=ip;
	}
	public void setReadCount(int readCount) {
		this.readCount=readCount;
	}
	// getter
	public int getNum() {
		return this.num;
	}
	public String getsubject() {
		return this.subject;
	}public String getWriterr() {
		return this.writer;
	}	public String getContent() {
		return this.content;
	}public String getIp() {
		return this.ip;
	}public int getReadCount() {
		return this.readCount;
	}
}
