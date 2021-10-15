package my.home.jonline.module05.task01.filemanager;


import my.home.jonline.module05.task01.entity.Directory;
import my.home.jonline.module05.task01.entity.File;
import my.home.jonline.module05.task01.entity.TextFile;
import my.home.jonline.module05.task01.view.View;

public class FileManager {

	private View view;

	{
		view = new View();
	}

	public Directory createDirectory() {
		return new Directory();
	}

	public Directory createDirectory(String directoryName) {
		return new Directory(directoryName);
	}

	public Directory createSubDirectory(Directory rootDirectory) {
		Directory subDirectory = new Directory();
		rootDirectory.getSubDirectories().add(subDirectory);
		return subDirectory;
	}

	public Directory createSubDirectory(Directory rootDirectory, String directoryName) {
		Directory subDirectory = new Directory(directoryName);
		rootDirectory.getSubDirectories().add(subDirectory);
		return subDirectory;
	}

	public TextFile createTextFile(Directory directory) {
		TextFile textFile = new TextFile();
		directory.getFiles().add(textFile);
		return textFile;
	}

	public TextFile createTextFile(Directory directory, String fileName) {
		TextFile textFile = new TextFile(fileName);
		directory.getFiles().add(textFile);
		return textFile;
	}

	public TextFile createTextFile(Directory directory, String fileName, String extension) {
		TextFile textFile = new TextFile(fileName, extension);
		directory.getFiles().add(textFile);
		return textFile;
	}

	public void renameFile(File file, String newFileName) {
		file.setName(newFileName);
	}

	public void removeFile(Directory directory, File file) {
		if (file.isSystem()) {
			String warningString = "Can't delete system file/folder!";
			view.view(warningString);
			return;
		}
		directory.getFiles().remove(file);
	}

	public void addContent(TextFile file, String content) {
		if (file.isReadOnly()) {
			String warningString = "File is read-only!";
			view.view(warningString);
			return;
		}
		file.addContent(content);
	}
	
	public void viewContent(File file) {
		if (file.isDirectory()) {
			Directory directory = (Directory) file;
			for (File iterationFile : directory.getSubDirectories()) {
				view.view(iterationFile);
			}
			for (File iterationFile : directory.getFiles()) {
				view.view(iterationFile);
			}
			return;
		}
		TextFile textFile = (TextFile) file;
		view.view(textFile.getContent());
	}
}
