package defpackage;

import com.google.android.youtube.R;

/* renamed from: acoi */
final class acoi implements acav {
    private final /* synthetic */ acnc a;

    acoi(acnc acnc) {
        this.a = acnc;
    }

    public final void a(int i) {
        if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Capture pause error: ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            acnc acnc = this.a;
            if (acnc.bb) {
                acnc.ad.a(2, acnc.aU, acnc.a((int) R.string.lc_error_pause_resume_failed), false);
            }
        }
    }
}
