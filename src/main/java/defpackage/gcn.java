package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: gcn */
final /* synthetic */ class gcn implements OnClickListener {
    private final gcl a;
    private final zin b;

    gcn(gcl gcl, zin zin) {
        this.a = gcl;
        this.b = zin;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        gcl gcl = this.a;
        zin zin = this.b;
        gcl.a(false);
        gcl.c(zin);
        if (gcl.s().a("reelEditFragment2") != null) {
            gcl.ac();
            return;
        }
        gcs gcs = gcl.ak;
        if (gcs != null) {
            gcs.m();
        }
    }
}
