package defpackage;

import com.google.android.youtube.R;

/* renamed from: glo */
final /* synthetic */ class glo implements Runnable {
    private final gll a;

    glo(gll gll) {
        this.a = gll;
    }

    public final void run() {
        gll gll = this.a;
        gll.a.dismiss();
        glk glk = gll.b;
        xpr.a(glk.a, !glk.c.b ? R.string.download_reel_item_saved : R.string.download_reel_item_error, 1);
    }
}
