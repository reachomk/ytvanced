package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: akdi */
public final class akdi extends akjt {
    public final akhr q;
    public final akei r;
    public final acvx s;

    public akdi(akhr akhr, akei akei, acvx acvx) {
        super(new HashSet(Arrays.asList(new tak[]{tak.LAYOUT})), akhr.l(), akhr.m());
        this.q = akhr;
        this.r = akei;
        this.s = acvx;
    }

    public final void b() {
        c();
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.b(this.f);
            this.d.removeOnLayoutChangeListener(this.g);
        }
        apa apa = this.b;
        if (apa != null) {
            apa.b(this.h);
        }
        this.b = null;
        this.d = null;
        this.c = null;
        this.k.clear();
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = 1;
        this.o = -1;
        this.p = -1;
        this.a.clear();
    }
}
