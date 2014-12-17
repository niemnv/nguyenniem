package iii.com.psytravel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Fragment_Tour extends Fragment {
	LinearLayout layout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_tour, container, false);

		layout = (LinearLayout) view.findViewById(R.id.layout1);
		layout.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Fragment mfragment = new Fragment_Detail_Tour();
				FragmentManager manager = getFragmentManager();
				manager.beginTransaction()
						.replace(R.id.frame_container, mfragment).commit();
			}
		});

		getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);
		getActivity().getActionBar().setHomeButtonEnabled(true);

		return view;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onDestroy() {
		getActivity().getActionBar().setDisplayHomeAsUpEnabled(false);
		getActivity().getActionBar().setHomeButtonEnabled(false);
		super.onDestroy();
	}
}
