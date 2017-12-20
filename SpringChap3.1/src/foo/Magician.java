package foo;

public class Magician implements Performer {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println(magicWords);
		System.out.println("The magic box contains...");
		System.out.println(magicBox.getContents());
	}
	public String getMagicWords() {
		return magicWords;
	}
	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}
	public MagicBox getMagicBox() {
		return magicBox;
	}
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}
	private String magicWords;
	private MagicBox  magicBox;

}
