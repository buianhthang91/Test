package com.example.ui_revisit;

import utilitys.SetViewSizeByPixel;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView txt_banner, txt_welcome, txt_please, txt_nothank;
	Button btn_continue;
	LinearLayout layout_text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getControl();

		SetViewSizeByPixel setSize = new SetViewSizeByPixel(this);
		DisplayMetrics metrics = setSize.getMetrics(this);

		// set banner
		setSize.height(txt_banner, metrics.heightPixels * 1059 / 1920);
		// set layout_text
		setSize.height(layout_text, metrics.heightPixels * (404+8) / 1920);

		// tinh tiep den txt_welcome

		setSize.height(txt_welcome, metrics.heightPixels * (340 + 2) / 1920);
		// txt_welcome.setPadding(0, metrics.heightPixels * 10 / 1920, 0, 0);

		// set khoang cach giua cac dong
		txt_welcome.setLineSpacing(0, 1.2f);
		// ti le cang theo chieu ngang de text nó dài hơn
		txt_welcome.setTextScaleX((float) (1.2));
		String str_wel1 = "Welcome back!";
		String str_wel2 = "We noted that you exercise ";
		String str_wel3 = "3-6 times";
		String str_wel4 = "a week ";
		String str_wel5 = "and you are having ";
		String str_wel6 = "Ensure";
		String str_wel7 = "instead of Anlene products";

		// set textsize cho txt_welcome

		setSize.textSize(txt_welcome, metrics.heightPixels * 48 / 1920);
		// set text
		txt_welcome.setText(Html.fromHtml(str_wel1 + "<br/>" + str_wel2 + "<b>"
				+ str_wel3 + "</b>" + "<br/>" + "<b>" + str_wel4 + "</b>"
				+ str_wel5 + "<b>" + str_wel6 + "</b>" + "<br/>" + str_wel7));

		// /////////////////////////////////////////////////////

		// tiep den txt_please
	//	setSize.height(txt_please, metrics.heightPixels * 147 / 1920);
		setSize.marginTop(txt_please, metrics.heightPixels * 20 / 1920);
		setSize.height(txt_please, metrics.heightPixels * 62 / 1920);
		String str_please = "Please continue to let us know better";
		setSize.textSize(txt_please, metrics.heightPixels * 48 / 1920);
		txt_please.setText(str_please);

		// set khoang cach giua cac dong
		txt_please.setLineSpacing(0, 1.2f);
		// ti le cang theo chieu ngang de text nó dài hơn
		txt_please.setTextScaleX((float) (1.2));
		// ////////////////////////////////////////////////////////////////////////////////
		// button continue
		setSize.size(btn_continue, metrics.widthPixels * 720 / 1080,
				metrics.heightPixels * 131 / 1920);
		
		
		setSize.marginTop(btn_continue, metrics.heightPixels * 79 / 1920);
		setSize.marginBottom(btn_continue, metrics.heightPixels * 62 / 1920);
		btn_continue.setTextSize(metrics.heightPixels * 42 / 1920);

		// ///////////////////////////////////////////////////////////////////
		/*
		 * 
		 * txt no thanh
		 */

		setSize.textSize(txt_nothank, metrics.heightPixels * 42 / 1920);

		// set text nothank

		String mystring = new String("No thanks");
		SpannableString content = new SpannableString(mystring);
		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
		txt_nothank.setText(content);

		setSize.marginBottom(txt_nothank, metrics.heightPixels * (30-10) / 1920,
				false);
	}

	private void getControl() {
		// TODO Auto-generated method stub
		txt_banner = (TextView) findViewById(R.id.txt_banner);
		txt_please = (TextView) findViewById(R.id.txt_please);
		txt_welcome = (TextView) findViewById(R.id.txt_welcome);
		btn_continue = (Button) findViewById(R.id.btn_continue);
		layout_text = (LinearLayout) findViewById(R.id.layout_text);
		txt_nothank = (TextView) findViewById(R.id.txt_nothank);
	}

}
