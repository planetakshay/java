package datastructures;

import java.util.ArrayList;

class Dir{
	
	private ArrayList<String> files = new ArrayList<String>();
	private ArrayList<Dir> dirs = new ArrayList<Dir>();
	String name;
	
	Dir(String dirname){
		this.name=dirname;
	}
	public void addDir(Dir d){
		dirs.add(d);
	}
	public void addFile(String f){
		files.add(f);
	}
	public ArrayList<String> getFiles(){
		return this.files;
	}
	public ArrayList<Dir> getDirs(){
		return this.dirs;
	}
	
	
}

public class FileSystem {
	
	public static void main(String args[]){
		
		Dir l1dir1 = new Dir("l1dir1");
		Dir root = l1dir1;
		
		l1dir1.addFile("f1l1dir1");
		l1dir1.addFile("f2l1dir1");
		
		Dir l2dir1 = new Dir("l2dir1");
		l1dir1.addDir(l2dir1);
		l2dir1.addFile("f1l2dir1");
		
		Dir l2dir2 = new Dir("l2dir2");
		l1dir1.addDir(l2dir2);
		l2dir2.addFile("f1l2dir2");
		l2dir2.addFile("f2l2dir2");
		
		Dir l3dir1 = new Dir("l3dir1");
		l2dir2.addDir(l3dir1);
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
			ArrayList<String> files = d.getFiles();
			for(String f: files){
				//System.out.print(d.name +"->"+f+",");
				System.out.print(f+",");
			}
		}
		else if(d.getFiles().size() ==0){
			System.out.print(d.name + "-> has no files" );
		}
	}
	
	}

