package defpackage;

import com.google.android.youtube.R;

/* renamed from: acof */
final class acof implements acas {
    private final /* synthetic */ acnc a;

    acof(acnc acnc) {
        this.a = acnc;
    }

    public final void a(int i, boolean z) {
        acnc acnc;
        if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(75);
            stringBuilder.append("Error updating mic for live capture: status=");
            stringBuilder.append(i);
            stringBuilder.append(", isMicEnabled=");
            stringBuilder.append(z);
            xtl.c(stringBuilder.toString());
            acnc = this.a;
            if (acnc.bb) {
                acnc.ad.a(2, acnc.aU, acnc.a((int) R.string.lc_error_mute_failed), false);
            }
        }
        acnc = this.a;
        acnc.aG = z;
        acnc.ag.h(z);
    }
}
