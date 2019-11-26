package defpackage;

import java.util.List;

/* renamed from: zzm */
public final class zzm implements afmq {
    private final avzo a;

    public zzm(avzo avzo) {
        amqw.a((Object) avzo);
        this.a = avzo;
    }

    public zzm(int i, List list) {
        avzn avzn = (avzn) avzo.f.createBuilder();
        avzn.copyOnWrite();
        avzo avzo = (avzo) avzn.instance;
        avzo.a |= 1;
        avzo.b = i;
        avzn.copyOnWrite();
        avzo avzo2 = (avzo) avzn.instance;
        if (!avzo2.c.a()) {
            avzo2.c = anxl.mutableCopy(avzo2.c);
        }
        anvf.addAll(list, avzo2.c);
        avzn.copyOnWrite();
        avzo2 = (avzo) avzn.instance;
        avzo2.a |= 2;
        avzo2.d = 60;
        avzn.copyOnWrite();
        avzo2 = (avzo) avzn.instance;
        avzo2.a |= 4;
        avzo2.e = true;
        this.a = (avzo) ((anxl) avzn.build());
    }

    public final int a() {
        return this.a.b;
    }

    public final List b() {
        return this.a.c;
    }

    public final int c() {
        return this.a.d;
    }

    public final boolean d() {
        return this.a.e;
    }
}
