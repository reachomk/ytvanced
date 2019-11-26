package defpackage;

import java.security.Key;

/* renamed from: aips */
public final class aips implements aiqa {
    private final amro a;
    private final Key b;
    private final afhg c;
    private final xsc d;
    private final Object e = new Object();
    private final aeex f;
    private final ozb g;
    private final amqp h;
    private final amro i = new aipv();

    public aips(amro amro, Key key, afhg afhg, xsc xsc, aeex aeex, ozb ozb, amqp amqp) {
        this.a = (amro) amqw.a((Object) amro);
        this.b = (Key) amqw.a((Object) key);
        this.c = (afhg) amqw.a((Object) afhg);
        this.d = (xsc) amqw.a((Object) xsc);
        this.f = (aeex) amqw.a((Object) aeex);
        this.g = (ozb) amqw.a((Object) ozb);
        this.h = amqp;
    }

    public final aivp a() {
        oww oww = (oww) this.a.get();
        if (oww == null) {
            return null;
        }
        amro amro = this.i;
        Key key = this.b;
        return new aivp(amro, oww, key, key, this.c, new aivg(oww), this.d, this.e, this.f, this.g, this.h);
    }
}
