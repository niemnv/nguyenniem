package iii.com.psytravel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu, menu);
		LinearLayout linearLayout = (LinearLayout) menu.findItem(
				R.id.option_menu).getActionView();
		final Button mOptionNews = (Button) linearLayout
				.findViewById(R.id.btnoptionmenu_news);
		final Button mOptionTour = (Button) linearLayout
				.findViewById(R.id.btnoptionmenu_tour);
		final Button mOptionFavorite = (Button) linearLayout
				.findViewById(R.id.btnoptionmenu_favorite);
		final Button mOptionSetting = (Button) linearLayout
				.findViewById(R.id.btnoptionmenu_settings);
		mOptionNews.isClickable();
		mOptionNews.setOnClickListener(new myOnclicklistener());
		mOptionTour.setOnClickListener(new myOnclicklistener());
		mOptionFavorite.setOnClickListener(new myOnclicklistener());
		mOptionSetting.setOnClickListener(new myOnclicklistener());

		return true;
	}
	
	/**
	 * Even CLickistener of Button on OptionMenu
	 **/
	private class myOnclicklistener implements OnClickListener {
		Fragment mfragment = null;

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btnoptionmenu_news:
				mfragment = new Fragment_News();
				break;
			case  R.id.btnoptionmenu_tour:
				mfragment = new Fragment_Tour();
				break;
			case R.id.btnoptionmenu_favorite:
				mfragment = new Fragment_Favorite();
				break;
			case R.id.btnoptionmenu_settings:
				mfragment = new Fragment_Settings();
				break;

			default:
				break;
			}
			if (mfragment != null){
				FragmentManager fragmentManager = getSupportFragmentManager();
				FragmentTransaction transaction = fragmentManager.beginTransaction();
				transaction.replace(R.id.frame_container,mfragment);
				transaction.addToBackStack("1");
				transaction.commit();
			}else {
				Log.e("MainActivity", "Error in creating fragment");
			}
		}
	}

}
