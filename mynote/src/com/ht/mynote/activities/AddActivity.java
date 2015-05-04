package com.ht.mynote.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.ht.mynote.dao.MyNote;
import com.ht.mynote.utils.DataUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Project: com.ht.mynote.activities
 * Author: 安诺爱成长
 * Email: 1399487511@qq.com
 * Date: 2015/5/2
 */
public class AddActivity extends Activity {

    private EditText addtitle;
    private EditText addcontent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        addtitle = (EditText) findViewById(R.id.addtitle);
        addcontent = (EditText) findViewById(R.id.addcontent);


    }

    //如果点击返回键进入上一级，则会默认保存
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        String titleStr = addtitle.getText().toString();
        String contentStr = addcontent.getText().toString();
        if (titleStr.length() == 0 && contentStr.length() == 0) {
            Toast.makeText(this, "不能添加一个空数据", Toast.LENGTH_SHORT).show();
        } else if (titleStr.length() == 0) {
            Toast.makeText(this, "请添加标题", Toast.LENGTH_SHORT).show();
        } else {
            DataUtils.addFile(titleStr, contentStr, this);
            Toast.makeText(this, "添加成功", Toast.LENGTH_SHORT).show();

        }
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);

    }


}