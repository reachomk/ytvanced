package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jez */
final /* synthetic */ class jez implements OnClickListener {
    private final jet a;
    private final mkw b;

    jez(jet jet, mkw mkw) {
        this.a = jet;
        this.b = mkw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jet jet = this.a;
        mkw mkw = this.b;
        int a = mkw.a();
        i = mkw.b();
        if (a == 0 && i == 0) {
            jet.b.a(false);
            jet.a(jet.e, false);
        } else {
            jet.b.a(true);
            jet.b.a((a * 60) + i);
            jet.a(jet.e, true);
        }
        jet.b();
    }
}
