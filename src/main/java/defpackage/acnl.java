package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: acnl */
final /* synthetic */ class acnl implements OnClickListener {
    private final acnc a;
    private final boolean b;

    acnl(acnc acnc, boolean z) {
        this.a = acnc;
        this.b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nf nfVar = this.a;
        if (!this.b) {
            if (nfVar.bf && nfVar.ab.a(5)) {
                nfVar.aP = 5;
            } else if (nfVar.bg && nfVar.ab.a(4)) {
                nfVar.aP = 4;
            } else if (nfVar.ab.a(3)) {
                nfVar.aP = 3;
            }
        }
        nfVar.f(true);
        nfVar.g(true);
        nfVar.h((int) R.string.lc_going_live);
        if (aclo.a(nfVar)) {
            nfVar.ag.e(nfVar.aP);
            nfVar.aa.a();
        }
    }
}
