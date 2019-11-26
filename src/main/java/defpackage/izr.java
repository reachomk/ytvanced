package defpackage;

import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izr */
public final class izr implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ DeveloperPrefsFragment b;

    public izr(DeveloperPrefsFragment developerPrefsFragment, String str) {
        this.b = developerPrefsFragment;
        this.a = str;
    }

    public final void run() {
        xpr.a(this.b.getActivity(), this.a, 0);
    }
}
