package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gex */
final /* synthetic */ class gex implements OnClickListener {
    private final geu a;
    private final awxs b;
    private final gfb c;

    gex(geu geu, awxs awxs, gfb gfb) {
        this.a = geu;
        this.b = awxs;
        this.c = gfb;
    }

    public final void onClick(View view) {
        String obj;
        geu geu = this.a;
        awxs awxs = this.b;
        gfb gfb = this.c;
        String a = geu.a(awxs);
        if ((awxs.a & 2) != 0) {
            arml arml = awxs.c;
            if (arml == null) {
                arml = arml.f;
            }
            obj = ajqy.a(arml).toString();
        } else {
            obj = null;
        }
        if (geu.h.contains(a)) {
            geu.h.remove(a);
            geu.g.b(obj, awxs.e);
            gfb.s.setVisibility(8);
        } else {
            geu.h.add(a);
            geu.g.a(obj, awxs.e);
            gfb.s.setVisibility(0);
        }
        geu.aa_();
    }
}
