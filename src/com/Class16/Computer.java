package com.Class16;

public class Computer {
Boolean mouse, keyboard, br;
String os,brand;
int screen,ram;

public static void main(String[] args) {
	//1.Object
	Computer com1=new Computer();// we create an object in computer class
	com1.keyboard=true;
	com1.mouse=true;
	com1.os="windows";
	com1.ram=8;
	com1.screen=2;
	com1.brand="HP";
	com1.watchMovie();
	com1.doJavaCoding();
	com1.playMusic();
	//2.Object
	Computer com2=new Computer();
	com2.keyboard=false;
	com2.mouse=false;
	com2.os="Mac OS";
	com2.ram=6;
	com2.screen=4;
	com2.brand="Apple";
	System.out.println("---------------------------------------------------------------------");
	com2.watchMovie();
	com2.doJavaCoding();
	com2.playMusic();
}
void watchMovie() {
	System.out.println("We can wathc movie on computer "+brand);
}
void doJavaCoding() {
	System.out.println("we can do java coding in out computer "+brand);
}
void playMusic() {
	System.out.println("We can play music on out computer "+brand);
}
}
