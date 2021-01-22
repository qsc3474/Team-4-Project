package MemberInformationModification;

public class MemberDTO {
	private int pwd = 1234;
	
	Modified modified = new Modified();

	public MemberDTO() {
	}
	
	
	public MemberDTO(int pwd, Modified modified) {
		this.pwd = pwd;
		this.modified = modified;
	}


	public int getPwd() {
		modified.pwd();
		return pwd;
	}


	public void setPwd(int pwd) {
		this.pwd = pwd;
		modified.pwd();
	}


	

	












	

	
		
	
	
	

}
