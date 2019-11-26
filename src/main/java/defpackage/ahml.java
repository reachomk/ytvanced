package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahml */
public final class ahml implements ajan, xcp {
    public final Executor a;
    public final afqv b;
    public final afmq c;
    public final afpu d;
    public final afti e;
    public ahkn f;

    public ahml(Executor executor, afqv afqv, afmq afmq, afti afti, afpu afpu) {
        this.a = executor;
        this.b = afqv;
        this.c = afmq;
        this.e = afti;
        this.d = afpu;
    }

    public final long e() {
        return 16;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 16)).a(ajcg.a(ajam.O(), 16)).a(new ahmk(this), ahmn.a)};
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.e()) {
            this.f = ahkn;
        } else {
            this.f = null;
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
