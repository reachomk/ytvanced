package defpackage;

import com.google.android.youtube.R;

/* renamed from: acnb */
final /* synthetic */ class acnb implements Runnable {
    private final acnc a;

    acnb(acnc acnc) {
        this.a = acnc;
    }

    public final void run() {
        acnc acnc = this.a;
        xtl.c("Kill connection dead man's switch triggered, stopping stream.");
        acef.a().a(9, 19, null);
        acnc.a(11, acnc.a((int) R.string.lc_error_generic), false);
    }
}
