package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bjf */
final class bjf implements bkb {
    private final /* synthetic */ bjg a;

    bjf(bjg bjg) {
        this.a = bjg;
    }

    public final /* synthetic */ void a(Object obj) {
        bjj bjj = (bjj) obj;
        bjg bjg = this.a;
        bjg.a.setCallback(bjg);
        bjg.c = bjj;
        bju bju = bjg.a;
        boolean z = false;
        if (bju.a != bjj) {
            bju.n = false;
            bju.b();
            bju.a = bjj;
            bju.a();
            bpe bpe = bju.b;
            bjj bjj2 = bpe.h;
            bpe.h = bjj;
            if (bjj2 == null) {
                bpe.a((float) ((int) Math.max(bpe.f, bjj.i)), (float) ((int) Math.min(bpe.g, bjj.j)));
            } else {
                bpe.a((float) ((int) bjj.i), (float) ((int) bjj.j));
            }
            float f = bpe.d;
            bpe.d = 0.0f;
            bpe.a((int) f);
            bju.a(bju.b.getAnimatedFraction());
            bju.b(bju.c);
            bju.h();
            Iterator it = new ArrayList(bju.e).iterator();
            while (it.hasNext()) {
                ((bjz) it.next()).a();
                it.remove();
            }
            bju.e.clear();
            boolean z2 = bju.m;
            bjj.a.a = false;
            z = true;
        }
        bjg.e();
        if (bjg.getDrawable() != bjg.a || z) {
            bjg.setImageDrawable(null);
            bjg.setImageDrawable(bjg.a);
            bjg.requestLayout();
            for (bkd a : bjg.b) {
                a.a();
            }
        }
    }
}
