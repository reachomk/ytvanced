package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;

/* renamed from: jbf */
public final /* synthetic */ class jbf implements OnClickListener {
    private final OfflinePrefsFragment a;
    private final View b;

    public jbf(OfflinePrefsFragment offlinePrefsFragment, View view) {
        this.a = offlinePrefsFragment;
        this.b = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OfflinePrefsFragment offlinePrefsFragment = this.a;
        String obj = ((EditText) this.b.findViewById(R.id.cross_device_offline_device_name)).getText().toString();
        if (TextUtils.isEmpty(obj)) {
            offlinePrefsFragment.a(R.string.pref_cross_device_offline_no_device_name);
            return;
        }
        String string = offlinePrefsFragment.j.getString("gcm_registration_id", "");
        if (string.isEmpty()) {
            offlinePrefsFragment.a(R.string.pref_cross_device_offline_no_gcm_registration_id);
            return;
        }
        boolean z = offlinePrefsFragment.l;
        ablj ablj = offlinePrefsFragment.h;
        aaml abmg = new abmg(ablj.c, ablj.d.c());
        abmg.a = aali.b(xsl.a(offlinePrefsFragment.getActivity()));
        abmg.d = !z ? 3 : 2;
        abmg.b = aali.b(obj);
        abmg.c = aali.b(string);
        abmg.g();
        Boolean valueOf = Boolean.valueOf(z);
        offlinePrefsFragment.findPreference("cross_device_offline").setEnabled(false);
        offlinePrefsFragment.h.n.a(abmg, new jbi(offlinePrefsFragment, obj, valueOf));
    }
}
