
public class Board {
	int num;
	String writer;
	String subjec;
	String content;
	int readCount;
	public Board(int num, String writer, String subjec, String content, int readCount) {
		super();
		this.num = num;
		this.writer = writer;
		this.subjec = subjec;
		this.content = content;
		this.readCount = readCount;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubjec() {
		return subjec;
	}
	public void setSubjec(String subjec) {
		this.subjec = subjec;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}


}
