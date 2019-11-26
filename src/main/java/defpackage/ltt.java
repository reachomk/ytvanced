package defpackage;

import android.app.Activity;

/* renamed from: ltt */
final class ltt implements zwt {
    private final /* synthetic */ Activity a;

    ltt(Activity activity) {
        this.a = activity;
    }

    public final void a() {
    }

    public final void b() {
        this.a.getWindow().getDecorView().sendAccessibilityEvent(32);
    }
}
