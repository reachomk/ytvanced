package defpackage;

/* renamed from: aktt */
public final class aktt implements akov, xcp {
    public final akwn a;
    public akwl b;
    public final /* synthetic */ aktq c;

    public final void a(akot akot, Object obj) {
        if (obj == this.b) {
            aktq aktq = this.c;
            ajtf c = aktq.c(ajti.NEXT);
            if (aktq.l != c) {
                aktq.a(ajti.NEXT);
                aktq.l = c;
            }
        }
    }

    public final void a(Object obj, Object obj2) {
        a();
        if (obj != null) {
            this.c.g.a((Object) this, obj);
        }
        if (obj == null || obj2 == null) {
            this.c.g.a((Object) this);
        } else if (obj2 != obj) {
            this.c.g.a((Object) this, obj2);
        }
    }

    public final void a() {
        this.c.g.b(this);
    }

    public final void b() {
        if (this.a != null) {
            Object obj = null;
            Object obj2 = (this.b != null || this.c.b(ajti.NEXT) || (this.c.f.isEmpty() && this.c.b(ajti.RELOAD))) ? 1 : null;
            if (this.c.d.d(this.a) != -1) {
                obj = 1;
            }
            if (obj2 == obj) {
                return;
            }
            if (obj2 != null) {
                aktq aktq = this.c;
                aktq.d.a(aktq.o(), this.a);
                if (this.c.b(ajti.NEXT)) {
                    if (this.b == null) {
                        this.b = b(new akuu());
                    }
                    a(this.b.a);
                    return;
                }
                return;
            }
            this.c.d.c(this.a);
        }
    }

    public final void a(akux akux) {
        if (this.a != null) {
            akwl akwl = this.b;
            if (akwl == null) {
                this.b = b(akux);
            } else if (akwl.a != akux) {
                this.b = akwl.a(akux);
            }
            if (!(akux instanceof akuq)) {
                this.a.a(this.b);
            } else if (this.c.b(ajti.NEXT)) {
                this.b = this.b.a(new akuu());
                this.a.a(this.b);
            } else {
                this.a.a(null);
            }
        }
    }

    public final akwl b(akux akux) {
        akwk a = akwl.a();
        a.a = akux;
        aktq aktq = this.c;
        a.b = aktq.E;
        a.c = aktq;
        a.d = aktq;
        return a.a();
    }

    /* synthetic */ aktt(aktq aktq, akwn akwn) {
        this.c = aktq;
        this.a = akwn;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{akuq.class, akuv.class, akuu.class};
        } else if (i == 0) {
            akuq akuq = (akuq) obj;
            this.c.p();
            a(akuq);
        } else if (i == 1) {
            akuv akuv = (akuv) obj;
            this.c.p();
            a(akuv);
        } else if (i == 2) {
            akuu akuu = (akuu) obj;
            if (this.c.a(akuu)) {
                a(akuu);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
