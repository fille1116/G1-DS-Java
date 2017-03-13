package exchange;

import java.awt.Dimension;

import javax.swing.JFrame;

import library.LibraryController;

public class ItemsController extends LibraryController{
	private ItemsView itemsView = new ItemsView();
	private BorrowedItemsView borrowedItemsView = new BorrowedItemsView();

	public ItemsController(String filePath, JFrame oldFrame) {
		super(filePath);
		super.addFrame(oldFrame);
		super.loadWindow(itemsView, "Bibliotek");
		
		JFrame borrowedItemsFrame = super.getWindow(0);
		JFrame itemsFrame = super.getWindow(1);
		
		borrowedItemsFrame.setTitle("Dina låneobjekt");
		borrowedItemsFrame.setSize(new Dimension(400, 420));
		borrowedItemsFrame.add(borrowedItemsView);
		itemsFrame.setLocation(500, 40);
		itemsFrame.setSize(new Dimension(800, 440));
	}
}















