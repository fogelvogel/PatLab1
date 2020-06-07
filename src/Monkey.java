
public class Monkey {
public boolean isRun() {
		return isRun;
	}
	public void setRun(boolean isRun) {
		this.isRun = isRun;
	}
	public boolean isSwim() {
		return isSwim;
	}
	public void setSwim(boolean isSwim) {
		this.isSwim = isSwim;
	}
	public boolean isQuaver() {
		return isQuaver;
	}
	public void setQuaver(boolean isQuaver) {
		this.isQuaver = isQuaver;
	}
	public boolean isImitate() {
		return isImitate;
	}
	public void setImitate(boolean isImitate) {
		this.isImitate = isImitate;
	}
private boolean isRun,isSwim,isQuaver,isImitate;
public Irun irun;
public Iswim iswim;
public Iquaver iquaver;
public Iimitate iimitate;

public void performRun() {
	isRun = irun.run();
	
}
public void performSwim() {
	isSwim = iswim.swim();
	
}
public void performQuaver() {
	isQuaver = iquaver.quaver();

}
public void performImitate() {
	isImitate = iimitate.imitate();
	
}
}
