
public class Date {
	int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String displayDate() {
		return dd+"-"+mm+"-"+yy;
	}
	public boolean checkDate() {
		if(this.dd>31)
			return false;
		return true;
	}
}
