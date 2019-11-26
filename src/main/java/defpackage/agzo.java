package defpackage;

import java.security.Key;

/* renamed from: agzo */
public final class agzo {
    public afhg a;
    public ovf b;
    public boolean c = false;
    private final amro d;
    private final oww e;
    private Key f;
    private Key g;
    private final ovf h;
    private final xsc i;
    private final Object j;
    private final aeex k;
    private final ozb l;
    private final amqp m;

    public agzo(amro amro, oww oww, xsc xsc, Object obj, aeex aeex, ozb ozb, amqp amqp) {
        this.d = amro;
        this.e = oww;
        this.i = xsc;
        this.j = obj;
        this.k = aeex;
        this.l = ozb;
        this.h = new aivg(oww);
        this.m = amqp;
    }

    public final agzo a(Key key) {
        this.f = key;
        this.g = key;
        return this;
    }

    public final aivp a() {
        if (this.c) {
            return new aivp(this.d, new agmq(), this.f, null, this.a, this.b, this.i, this.j, this.k, this.l, this.m);
        }
        return new aivp(this.d, this.e, this.f, this.g, this.a, this.h, this.i, this.j, this.k, this.l, this.m);
    }
}
