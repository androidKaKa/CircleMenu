package com.example.circlemenu;
 
import com.example.circlemenu.CircleMenuLayout.OnMenuItemClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends  Activity {

	
	  private CircleMenuLayout mCircleMenuLayout;

	    private String[] mItemTexts = new String[] { "安全中心 ", "特色服务", "投资理财",
	            "转账汇款", "我的账户", "信用卡","CC","AA" };
	    private int[] mItemImgs = new int[] { R.drawable.ic_launcher,
	    		R.drawable.ic_launcher, R.drawable.ic_launcher,
	    		R.drawable.ic_launcher, R.drawable.ic_launcher,
	    		R.drawable.ic_launcher ,R.drawable.ic_launcher,R.drawable.ic_launcher};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
        
        mCircleMenuLayout.setOnMenuItemClickListener(new OnMenuItemClickListener()
        {
            @Override
            public void itemClick(View view, int pos)
            {
                Toast.makeText(MainActivity.this, mItemTexts[pos],
                        Toast.LENGTH_SHORT).show();

            }
            @Override
            public void itemCenterClick(View view)
            {
                Toast.makeText(MainActivity.this,
                        "you can do something just like ccb  ",
                        Toast.LENGTH_SHORT).show();
            }
        });
	}




}
