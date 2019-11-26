package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aiix */
public final class aiix extends xaq implements ajan, xcp {
    public final aizy d;
    public final ajam e;
    public final bdfu f = new bdfu();
    private final apxu g;
    private ajmq h;
    private aijc i;

    public aiix(xci xci, aizy aizy, ajam ajam, apxu apxu) {
        amqw.a((Object) xci);
        this.d = (aizy) amqw.a((Object) aizy);
        this.e = ajam;
        this.g = (apxu) amqw.a((Object) apxu);
    }

    public final long e() {
        return 67108864;
    }

    public final void c() {
        this.f.a();
        ajmq ajmq = this.h;
        if (ajmq != null && this.i != null) {
            ajmv e = ajmq.e();
            if (e != null) {
                e.b(this.i);
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 67108864)).a(ajcg.a()).a(new aija(this), aiiz.a)};
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.a(airi.PLAYBACK_LOADED) && !ahkn.a.a()) {
            a(ahkn.d);
        }
    }

    public final void a(ajmq ajmq) {
        if (this.i == null) {
            this.h = ajmq;
            ajmq = this.h;
            ajmv e = ajmq != null ? ajmq.e() : null;
            if (e != null) {
                long o = this.d.o();
                if (o > 0) {
                    long max;
                    awbv a = aijn.a(this.g);
                    if (a.c < 0) {
                        max = Math.max(TimeUnit.MILLISECONDS.convert((long) a.c, TimeUnit.SECONDS) + o, 0);
                    } else {
                        max = Math.min(TimeUnit.MILLISECONDS.convert((long) a.c, TimeUnit.SECONDS), o);
                    }
                    this.i = new aijc(this, max, o);
                    e.a(this.i);
                }
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
