
public class Board {
 // ��ȣ , ���� , �۾��� , ���� , �۾����� ip�ּ� , �湮�� ��
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readCount;
	//������
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
	//setter //�޼��� �� ���⼭ ������ ������ �ƴ϶� �ϳ��ϳ� �� �����̴�.
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
