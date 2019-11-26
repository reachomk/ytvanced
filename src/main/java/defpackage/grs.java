package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: grs */
final /* synthetic */ class grs implements OnClickListener {
    private final grt a;
    private final acvx b;
    private final aywd c;
    private final int d;

    grs(grt grt, acvx acvx, aywd aywd, int i) {
        this.a = grt;
        this.b = acvx;
        this.c = aywd;
        this.d = i;
    }

    public final void onClick(View view) {
        grt grt = this.a;
        acvx acvx = this.b;
        aywd aywd = this.c;
        int i = this.d;
        acvx.a(3, new acvs(aywd.f), null);
        grt.a.a(aywd, i);
    }
}
