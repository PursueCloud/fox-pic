package com.yo.foxpic.test;

import java.awt.Font;

import com.yo.foxpic.pic.FoxPic;

public class FoxTest {
	
	/**
	 * 参考用法
	 * @param args
	 */
	public static void main(String[] args) {
		FoxPic.setFont(new Font("宋体", Font.BOLD, 50));
		FoxPic.create("C:/work");
		//FoxPic.create("中","C:/work");
		//FoxPic.create("C:/work",PictureUtil.createImage("中", new Font("楷体",Font.BOLD, 32), 80, 80));
	}

}
