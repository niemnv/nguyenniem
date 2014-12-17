package iii.com.psytravel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Fragment_Detail_Tour extends Fragment {

	LinearLayout lnlayout;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_fragment__detail__tour, container, false);
		lnlayout=(LinearLayout)view.findViewById(R.id.lndetailtour);
		lnlayout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Fragment mfragment=new Fragment_Booking_Tour();
				FragmentManager manager=getFragmentManager();
				manager.beginTransaction().replace(R.id.frame_container, mfragment).commit();
				
			}
		});
		return view;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// Inflate the menu; this adds items to the action bar if it is present.
		inflater.inflate(R.menu.fragment__detail__tour, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
