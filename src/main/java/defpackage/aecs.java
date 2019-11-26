package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aecs */
public final class aecs implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;
    private final bcaa m;

    private aecs(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
        this.j = bcaa10;
        this.k = bcaa11;
        this.l = bcaa12;
        this.m = bcaa13;
    }

    public static aecs a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13) {
        return new aecs(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10, bcaa11, bcaa12, bcaa13);
    }

    public final /* synthetic */ Object get() {
        aecq aecq = new aecq();
        aecq.a = (Context) this.a.get();
        aecq.b = (Executor) this.b.get();
        this.c.get();
        this.d.get();
        aecq.c = (String) this.e.get();
        aecq.d = (zyw) this.f.get();
        aecq.e = this.g;
        aecq.f = (afjj) this.h.get();
        aecq.g = (xax) this.i.get();
        aecq.h = (Executor) this.j.get();
        aecq.i = (xgv) this.k.get();
        aecq.j = (xti) this.m.get();
        return aecq;
    }
}
