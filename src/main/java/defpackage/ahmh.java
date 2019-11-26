package defpackage;

/* renamed from: ahmh */
public final class ahmh implements ajan, xcp {
    private final ahmf a;
    private awaz b = null;
    private ajmv c = ajne.a;

    ahmh(ahmf ahmf) {
        this.a = ahmf;
    }

    public final long e() {
        return 8;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 8)).a(ajcg.a(ajam.O(), 8)).a(new ahmg(this), ahmj.a)};
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        if (!ahkn.a.a()) {
            Object obj;
            aakj aakj = ahkn.b;
            Object obj2 = null;
            if (aakj == null || aakj.n() == null) {
                obj = null;
            } else {
                obj = ahkn.b.n().c.g;
                if (obj == null) {
                    obj = awaz.c;
                }
            }
            ajmq ajmq = ahkn.d;
            if (ajmq != null) {
                obj2 = ajmq.e();
            }
            if (obj2 == null) {
                obj2 = ajne.a;
            }
            if (!amqq.a(this.b, obj) || !amqq.a(this.c, obj2)) {
                this.b = obj;
                this.c.a(ahmd.class);
                this.c = obj2;
                ajmv ajmv = this.c;
                awaz awaz = this.b;
                if (awaz != null) {
                    float f = awaz.b;
                    if (f != 0.0f) {
                        ajmv.a(new ahmd((long) (f * 1000.0f), (aizy) ahmf.a((aizy) this.a.a.get(), 2)));
                    }
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
