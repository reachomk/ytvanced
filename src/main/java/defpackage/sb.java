package defpackage;

import android.graphics.Typeface;

/* renamed from: sb */
final class sb implements Runnable {
    private final /* synthetic */ Typeface a;
    private final /* synthetic */ ry b;

    sb(ry ryVar, Typeface typeface) {
        this.b = ryVar;
        this.a = typeface;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
