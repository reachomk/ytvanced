package defpackage;

import com.google.android.youtube.R;

/* renamed from: gmx */
final /* synthetic */ class gmx implements Runnable {
    private final gmp a;
    private final String b;

    gmx(gmp gmp, String str) {
        this.a = gmp;
        this.b = str;
    }

    public final void run() {
        gmp gmp = this.a;
        gmp.ae.a(this.b, 2);
        gmp.ac().c.a(gmp.a((int) R.string.reel_error_video_not_available), null);
    }
}
