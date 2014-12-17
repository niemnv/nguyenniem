package iii.com.psytravel;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class Dialog_Fragment_Login extends DialogFragment {

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {

		return new AlertDialog.Builder(getActivity())
				.setIcon(R.drawable.ic_launcher)
				.setTitle("Login")
				.setMessage(
						"Bạn vui lòng đăng nhập để sử dụng chức năng của hệ thống")
				.setPositiveButton("OK", new OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Do something else
					}

				}).setNegativeButton("Cancle", new OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Do something else
					}
				}).create();
	}

}
