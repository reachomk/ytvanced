package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;

/* renamed from: jbg */
public final /* synthetic */ class jbg implements OnCheckedChangeListener {
    private final OfflinePrefsFragment a;

    public jbg(OfflinePrefsFragment offlinePrefsFragment) {
        this.a = offlinePrefsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.l = z;
    }
}
