package defpackage;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineVideosActivity;

/* renamed from: agku */
public final class agku implements OnCheckedChangeListener {
    private final /* synthetic */ CheckBox a;
    private final /* synthetic */ DebugOfflineVideosActivity b;

    public agku(DebugOfflineVideosActivity debugOfflineVideosActivity, CheckBox checkBox) {
        this.b = debugOfflineVideosActivity;
        this.a = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b.c.edit().putBoolean("debug_offline_transfer_retry", z).apply();
        this.a.setChecked(z);
    }
}
