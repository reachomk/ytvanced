package defpackage;

import android.app.Activity;

/* renamed from: zth */
final class zth {
    public Runnable a;
    public zte b;
    public String c;
    public boolean d;

    private zth() {
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.c = str;
        this.d = true;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c = null;
    }

    /* synthetic */ zth(byte b) {
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, Activity activity) {
        if (this.b != null) {
            activity.runOnUiThread(new ztg(this, i));
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            activity.runOnUiThread(runnable);
            this.a = null;
        }
        this.d = false;
        a();
    }
}
