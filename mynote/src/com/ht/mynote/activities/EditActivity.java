package com.ht.mynote.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.ht.mynote.dao.MyNote;
import com.ht.mynote.utils.DataUtils;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Project: com.ht.mynote.activities
 * Author: 安诺爱成长
 * Email: 1399487511@qq.com
 * Date: 2015/5/2
 */
public class EditActivity extends Activity {

    private EditText edittitle;
    private EditText editcontent;
    private String title;
    private String content;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        edittitle = (EditText) findViewById(R.id.eidttitle);
        editcontent = (EditText) findViewById(R.id.editcontent);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        content = DataUtils.getContentByName(title, this);

        edittitle.setText(title);
        editcontent.setText(content);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        String titleStr = edittitle.getText().toString();
        String contentStr = editcontent.getText().toString();

        if (!(title.equals(titleStr)) || !(content.equals(contentStr))) {
            //先把本条删除，再新建一条不就可以（根据标题来删除掉）
            DataUtils.delFileByName(title, this);
            //再添加一条数据即可
            DataUtils.addFile(titleStr, contentStr, this);
            Toast.makeText(this, "修改成功", Toast.LENGTH_SHORT).show();
        }

    }
}

