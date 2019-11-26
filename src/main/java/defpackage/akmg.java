package defpackage;

import android.content.Context;

/* renamed from: akmg */
final /* synthetic */ class akmg implements Runnable {
    private final Context a;
    private final String b;

    akmg(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void run() {
        xpr.a(this.a, this.b, 1);
    }
}
