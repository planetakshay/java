package datastructures;

import java.util.ArrayList;

class File{
	String name;
	File(String name){
		this.name=name;
	}
}

class Dir{
	
	private ArrayList<File> files = new ArrayList<File>();
	private ArrayList<Dir> dirs = new ArrayList<Dir>();
	String name;
	
	Dir(String dirname){
		this.name=dirname;
	}
	public void addDir(Dir d){
		dirs.add(d);
	}
	public void addFile(File f){
		files.add(f);
	}
	public ArrayList<File> getFiles(){
		return this.files;
	}
	public ArrayList<Dir> getDirs(){
		return this.dirs;
	}
	
	
}

public class FileSystem {
	
	public static void main(String args[]){
		
		Dir l1dir1 = new Dir("Vinayak Deodhar");
		Dir root = l1dir1;
		
		l1dir1.addFile(new File("Sindhu"));
		l1dir1.addFile(new File("Sanjay"));
		
		Dir l2dir1 = new Dir("Sanjay Deodhar");
		l1dir1.addDir(l2dir1);
		l2dir1.addFile(new File("Kshama"));
		
		Dir l2dir2 = new Dir("Lata Karodi");
		l1dir1.addDir(l2dir2);
		l2dir2.addFile(new File("Anna"));
		l2dir2.addFile(new File("Vishal"));
		
		Dir l3dir1 = new Dir("Akshay Deodhar");
		l2dir1.addDir(l3dir1);
		printDirsAndFiles(l1dir1);
	}
	
	public static void printDirsAndFiles(Dir d){
		
		System.out.println("*** Start: Printing contents of "+d.name);
		System.out.print(d.name+" Files:");
		printFiles(d);
		System.out.println("--");
		System.out.print(d.name +" Directories:");
		printDirectories(d);
		System.out.println("--");
		if(d.getDirs().size()!=0){
				//If current directory contains other directories, then print all of them
					ArrayList<Dir> dirs = d.getDirs();
					for(Dir dir: dirs){
						//Print this directory structure
						printDirsAndFiles(dir);
					}
			} else if(d.getDirs().size()==0){
				System.out.print(d.name +" has no sub directories");
				System.out.println("###End: Printing "+d.name+ "##");
				System.out.println();
				return;
			}
			
		System.out.println("###Printing "+d.name+ " is over.##");
		System.out.println();
		
	}
	public static void printDirectories(Dir d){
		if(d.getDirs().size() !=0){
			ArrayList<Dir> dirs = d.getDirs();
			for(Dir dir: dirs){
				System.out.print(dir.name +",");
			}
		}
		
	}
	public static void printFiles(Dir d){
		if(d.getFiles().size() !=0){
			ArrayList<File> files = d.getFiles();
			for(File f: files){
				//System.out.print(d.name +"->"+f+",");
				System.out.print("Printing File Name  "+f.name+","+"\n");
			}
		}
		else if(d.getFiles().size() ==0){
			System.out.print(d.name + "-> has no files" );
		}
	}
	
	}

