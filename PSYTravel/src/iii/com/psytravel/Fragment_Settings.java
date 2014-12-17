package iii.com.psytravel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_Settings extends Fragment {

	Button btnfeedback, btnbookingtour;
	TextView tvAddAcount;
	

	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_settings, container,
				false);

		btnfeedback = (Button) rootView.findViewById(R.id.btnfeedback);
		btnbookingtour = (Button) rootView.findViewById(R.id.btnbookingtour);
		tvAddAcount = (TextView) rootView.findViewById(R.id.tvaddaccount);

		btnbookingtour.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Fragment mfragment = new Fragment_Booking_Tour();
				FragmentManager manager = getFragmentManager();
				manager.beginTransaction()
						.replace(R.id.frame_container, mfragment).commit();
				
			}
		});
		btnfeedback.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Fragment mfragment = new Fragment_Feedback();
				FragmentManager manager = getFragmentManager();
				manager.beginTransaction()
						.replace(R.id.frame_container, mfragment).commit();
			}
		});
		tvAddAcount.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				FragmentTransaction fm = getFragmentManager().beginTransaction();
				Dialog_Fragment_Login dialogFragmentLogin = new Dialog_Fragment_Login();
				dialogFragmentLogin.show(fm, "Dang Nhap");
			}
		});
		
		getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);
		getActivity().getActionBar().setHomeButtonEnabled(true);

		return rootView;
	}


	@Override
	public void onDestroy() {
		getActivity().getActionBar().setDisplayHomeAsUpEnabled(false);
		getActivity().getActionBar().setHomeButtonEnabled(false);
		super.onDestroy();
	}

}
