package myscrum2package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager2 {

	static final String folderpath = "C:\\MyPhase1Project\\LockedMeFiles";

	public static void main(String[] args)

	{
		// Code for deleting a file
		String fileName;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name to be deleted:");
		fileName = obj.nextLine();

		boolean isDeleted = FileManager2.deleteFile(folderpath, fileName);

		if (isDeleted)
			System.out.println("May be File missing or some not accessible");
		else
			System.out.println("File deleted successfully");

	}

	private static boolean deleteFile(String folderpath2, String fileName) {
		// TODO Auto-generated method stub
		return false;
	}

}
