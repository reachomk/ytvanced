package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView.BufferType;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;

/* renamed from: jbh */
public final /* synthetic */ class jbh implements OnShowListener {
    private final OfflinePrefsFragment a;
    private final View b;
    private final AlertDialog c;

    public jbh(OfflinePrefsFragment offlinePrefsFragment, View view, AlertDialog alertDialog) {
        this.a = offlinePrefsFragment;
        this.b = view;
        this.c = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        OfflinePrefsFragment offlinePrefsFragment = this.a;
        View view = this.b;
        AlertDialog alertDialog = this.c;
        ((Switch) view.findViewById(R.id.cross_device_offline_enabled)).setChecked(offlinePrefsFragment.j.getBoolean("cross_device_offline_device_state", false));
        EditText editText = (EditText) view.findViewById(R.id.cross_device_offline_device_name);
        editText.setText(offlinePrefsFragment.j.getString("cross_device_offline_device_name", ""), BufferType.EDITABLE);
        if (editText.getText().toString().isEmpty()) {
            alertDialog.getButton(-1).setEnabled(false);
        }
    }
}
