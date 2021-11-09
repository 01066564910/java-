
public class Ex11 {
		String company;
		String model;
		String color;
		int maxspeed;
		public Ex11() {}
		public Ex11(String company, String model,  int maxspeed) {
			this(company,model);
			/*
			 * this.company = company; /// 공통코드
			this.model = model;///
			 */
			this.maxspeed = maxspeed;
		}
		public Ex11(String company, String model, String color) {
			this(company,model); /// 
		 /// 공통코드
			this.color = color;
		/*
		 * 	this.company = company; /// 
			this.model = model; /// 공통코드
		 */
		}
		/// 공통코드를 관리하는 생성자
		public Ex11(String company, String model) {
			this.company = company; 
			this.model = model;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getMaxspeed() {
			return maxspeed;
		}
		public void setMaxspeed(int maxspeed) {
			this.maxspeed = maxspeed;
		}
}
