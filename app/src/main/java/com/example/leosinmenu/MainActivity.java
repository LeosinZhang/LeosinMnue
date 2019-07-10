package com.example.leosinmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


/**
 * Author: Leosin
 * Data: 2019/7/10
 * Description:
 **/
public class MainActivity extends Activity {

    private CircleMenuLayout mCircleMenuLayout;

    private String[] mItemTexts = new String[]{"零食 ", "水果", "面条",
            "炒饭", "火锅", "牛排", "烧烤", "西北风", "中餐", "汉堡", "小龙虾", "干锅"};
    private int[] mItemImgs = new int[]{
            R.mipmap.snack, R.mipmap.fruit,
            R.mipmap.noodles, R.mipmap.friedrice,
            R.mipmap.hotpot, R.mipmap.steak,
            R.mipmap.bbq, R.mipmap.wind,
            R.mipmap.chinesefood, R.mipmap.hamburger,
            R.mipmap.crayfish, R.mipmap.drypot,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleMenuLayout = findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener() {
            @Override
            public void itemClick(View view, int pos) {
                Toast.makeText(MainActivity.this, mItemTexts[pos],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void itemCenterClick(View view) {
                Toast.makeText(MainActivity.this,
                        "今天吃什么呢 ^_^ ",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
