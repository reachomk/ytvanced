package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import android.support.v7.widget.RecyclerView;

/* renamed from: fzu */
public final class fzu implements fzy, gad {
    public final gab a;
    private fzw b;
    private gac c;

    public fzu(gab gab) {
        this.a = gab;
    }

    public final void a(RecyclerView recyclerView, ent ent) {
        a();
        this.b = new fzw(this, recyclerView, ent);
        apz apz = this.b;
        apz.b.a((apv) apz);
        apz.c.a(apz);
    }

    public final void a() {
        apv apv = this.b;
        if (apv != null) {
            apv.b.removeCallbacks(apv.a);
            apv.b.b(apv);
            apv.c.b(apv);
        }
    }

    public final void a(gac gac) {
        gac gac2 = this.c;
        avdd avdd = null;
        if (!(gac2 == null || gac2.b() == null)) {
            gaf b = this.c.b();
            if (b.b.getVisibility() == 0 && (b.b.getDrawable() instanceof FrameSequenceDrawable)) {
                b.e.addListener(new gah((FrameSequenceDrawable) b.b.getDrawable(), b.b));
                b.e.setDuration(200).start();
            }
            boolean z = b.f;
            this.c = null;
        }
        if (this.c != gac) {
            this.c = gac;
        }
        gac = this.c;
        if (gac != null) {
            azem azem = gac.b;
            avdd avdd2 = gac.a;
            if (avdd2 == null || (avdd2.a & 1) != 0) {
                avdd = avdd2;
            }
            gaf b2 = gac.b();
            b2.a(avdd, akkw.a(azem.r), new fzx(b2));
        }
    }
}
