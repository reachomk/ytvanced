package defpackage;

import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;

/* renamed from: jbj */
public final /* synthetic */ class jbj implements Runnable {
    private final OfflinePrefsFragment a;
    private final int b;

    public jbj(OfflinePrefsFragment offlinePrefsFragment, int i) {
        this.a = offlinePrefsFragment;
        this.b = i;
    }

    public final void run() {
        OfflinePrefsFragment offlinePrefsFragment = this.a;
        xpr.a(offlinePrefsFragment.getActivity(), this.b, 0);
    }
}
