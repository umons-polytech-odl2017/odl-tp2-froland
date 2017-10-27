package exercise2;

public class ProductionWorker implements Payable {
	private final int producedPieceRate;
	private int producedPieces = 0;

	public ProductionWorker(int producedPieceRate) {
		this.producedPieceRate = producedPieceRate;
	}

	public void produceOnePiece() {
		producedPieces++;
	}

	public int computeSalary() {
		return producedPieces * producedPieceRate;
	}

}
