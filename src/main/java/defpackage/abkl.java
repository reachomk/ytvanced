package defpackage;

import java.util.Set;

/* renamed from: abkl */
public final class abkl implements baqa {
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

    private abkl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
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
    }

    public static abkl a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        return new abkl(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10);
    }

    public final /* synthetic */ Object get() {
        amqp amqp = (amqp) this.a.get();
        this.b.get();
        aamd aamd = (aamd) this.c.get();
        afpu afpu = (afpu) this.d.get();
        amqp amqp2 = (amqp) this.e.get();
        bcaa bcaa = this.f;
        zzf zzf = (zzf) this.g.get();
        this.h.get();
        return new abka(amqp, aamd, afpu, amqp2, bcaa, zzf, (Set) this.i.get(), (abkc) this.j.get());
    }
}