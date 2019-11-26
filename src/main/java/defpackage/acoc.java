package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: acoc */
final class acoc implements OnClickListener {
    private final /* synthetic */ acnc a;

    acoc(acnc acnc) {
        this.a = acnc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acnc acnc = this.a;
        acnc.ai.removeCallbacks(acnc.aq);
        acnc = this.a;
        acek acek = acnc.aa;
        if (acek.a == 13) {
            acnc.a(26, acnc.a((int) R.string.lc_error_generic), this.a.aQ);
        } else if (acnc.aQ) {
            acek.c(0);
        } else {
            acek.c(26);
        }
    }
}
