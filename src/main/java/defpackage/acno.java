package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: acno */
final /* synthetic */ class acno implements OnClickListener {
    private final acnc a;

    acno(acnc acnc) {
        this.a = acnc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nf nfVar = this.a;
        nfVar.as.setVisibility(8);
        nfVar.at.setVisibility(8);
        if (aclo.a(nfVar)) {
            nfVar.ag.I();
        }
    }
}
