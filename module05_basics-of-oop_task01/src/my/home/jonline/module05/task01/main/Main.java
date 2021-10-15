package my.home.jonline.module05.task01.main;

import my.home.jonline.module05.task01.entity.Directory;
import my.home.jonline.module05.task01.entity.TextFile;
import my.home.jonline.module05.task01.filemanager.FileManager;
import my.home.jonline.module05.task01.view.View;

public class Main {

	public static void main(String[] args) {
		FileManager fileManager = new FileManager();
		View view = new View();

		Directory rootDirectory;
		Directory firstSubDirectory;
		Directory secondSubDirectory;
		TextFile firstTextFile;
		TextFile secondTextFile;

		
		//create folders, subfolders, files
		rootDirectory = fileManager.createDirectory("RootFolder");
		firstSubDirectory = fileManager.createSubDirectory(rootDirectory, "FirstSubDirectory");
		secondSubDirectory = fileManager.createSubDirectory(rootDirectory, "SecondSubDirectory");
		
		firstTextFile = fileManager.createTextFile(rootDirectory);
		secondTextFile = fileManager.createTextFile(secondSubDirectory, "MyTextFile", ".txt");
		
		fileManager.viewContent(rootDirectory);
		view.view("");//empty line just for more accurate view in console
		
		
		// rename file
		fileManager.viewContent(secondSubDirectory);//before rename

		fileManager.renameFile(secondTextFile, "New Name");

		fileManager.viewContent(secondSubDirectory);//after rename
		
		view.view("");//empty line just for more accurate view in console
		
		// add and show content
		fileManager.addContent(secondTextFile, "This is text file content.");
		fileManager.viewContent(secondTextFile);
		view.view("");//empty line just for more accurate view in console
		
		//remove file from folder
		fileManager.removeFile(secondSubDirectory, secondTextFile);
		fileManager.removeFile(rootDirectory, firstTextFile);
		fileManager.viewContent(rootDirectory);
		fileManager.viewContent(secondSubDirectory);
		
	}

}
