package empresa;

public class DigitalBook extends Book {

	private int download;
	private double size;
	
	public DigitalBook() {}
	
	public DigitalBook(String title, Author author, String genre, int edition, int download, double size) {
		super(title, author, genre, edition);
		this.download = download;
		this.size = size;
	}

	public int getDownload() {
		return download;
	}
	
	public void setDownload(int download) {
		this.download = download;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Download: " + download);
		System.out.println("Tamanho: " + size);
	}
}
