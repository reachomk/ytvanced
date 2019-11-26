package defpackage;

import android.widget.ImageView;

/* renamed from: gok */
final /* synthetic */ class gok implements xne {
    private final gof a;
    private final aygk b;
    private final akkj c;

    gok(gof gof, aygk aygk, akkj akkj) {
        this.a = gof;
        this.b = aygk;
        this.c = akkj;
    }

    public final void a(ImageView imageView) {
        gof gof = this.a;
        aygk aygk = this.b;
        akkj akkj = this.c;
        aygm aygm = (aygm) aygk.b.get(0);
        if (aygm != null) {
            akkj.a(xvt.d(aygm.b), new gom(gof, imageView));
        }
    }
}
