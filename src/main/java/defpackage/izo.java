package defpackage;

import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izo */
public final class izo implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ DeveloperPrefsFragment c;

    public izo(DeveloperPrefsFragment developerPrefsFragment, int i, int i2) {
        this.c = developerPrefsFragment;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        xpr.a(this.c.getActivity(), this.a, this.b);
    }
}
