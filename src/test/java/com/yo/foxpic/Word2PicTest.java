package com.yo.foxpic;

import com.yo.foxpic.pic.FoxPic;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Jay.huang
 * @date 2019/7/26
 */
@Ignore
public class Word2PicTest {

    @Test
    public void testGeneratePicWord() {
        String path = FoxPic.create("大卫", "D:\\cn-word-pictures");
        System.out.println("图片生成路径为：" + path);
    }
}
