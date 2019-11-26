package defpackage;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStoreActivity;

/* renamed from: agkl */
public final /* synthetic */ class agkl implements OnCheckedChangeListener {
    private final DebugOfflineStoreActivity a;
    private final CheckBox b;

    public agkl(DebugOfflineStoreActivity debugOfflineStoreActivity, CheckBox checkBox) {
        this.a = debugOfflineStoreActivity;
        this.b = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        DebugOfflineStoreActivity debugOfflineStoreActivity = this.a;
        CheckBox checkBox = this.b;
        debugOfflineStoreActivity.a.edit().putBoolean("debug_noop_offline_store", z).apply();
        checkBox.setChecked(z);
    }
}
