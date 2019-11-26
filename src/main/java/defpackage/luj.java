package defpackage;

/* renamed from: luj */
public final class luj implements ejc, exv, xcp {
    private final xci a;
    private final eif b;
    private final aaas c;
    private final lck d;
    private final aizy e;
    private auyb f;
    private int g;
    private ejd h;
    private boolean i;

    public luj(xci xci, eif eif, aaas aaas, lck lck, aizy aizy) {
        this.a = xci;
        this.b = eif;
        this.c = aaas;
        this.d = lck;
        this.e = aizy;
    }

    public final void a() {
        this.a.a((Object) this);
        this.b.a(this);
    }

    public final void b() {
        this.a.b(this);
        this.b.b(this);
    }

    public final void a(ejd ejd, ejd ejd2) {
        a(this.g, ejd2);
    }

    private final void a(int i, ejd ejd) {
        if (this.g != i || this.h != ejd) {
            if (ejd == ejd.NONE) {
                this.i = false;
            }
            auyb auyb = this.f;
            if (auyb != null) {
                int a = awbn.a(auyb.b);
                if (a != 0 && a == 5 && i == 2 && ejd == ejd.WATCH_WHILE_MINIMIZED) {
                    if (this.g == 3 && this.h == ejd.WATCH_WHILE_MINIMIZED) {
                        this.d.h();
                    } else {
                        this.e.b();
                        if (!this.i) {
                            aaas aaas = this.c;
                            apxu apxu = this.f.c;
                            if (apxu == null) {
                                apxu = apxu.d;
                            }
                            aaas.a(apxu, null);
                            this.i = true;
                        }
                    }
                }
            }
            this.g = i;
            this.h = ejd;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkr.class};
        } else if (i == 0) {
            ahkn ahkn = (ahkn) obj;
            airi airi = ahkn.a;
            if (airi == airi.NEW) {
                this.f = null;
                return null;
            } else if (airi != airi.VIDEO_REQUESTED) {
                return null;
            } else {
                auyb auyb;
                ajxu ajxu = ahkn.b.a;
                if (ajxu != null) {
                    atdv atdv = ajxu.a;
                    if (!(atdv == null || (atdv.a & 512) == 0)) {
                        axak axak = atdv.h;
                        if (axak == null) {
                            axak = axak.a;
                        }
                        auyb = (auyb) ajzv.a(ajzv.a(axak), auyb.class);
                        this.f = auyb;
                        return null;
                    }
                }
                auyb = null;
                this.f = auyb;
                return null;
            }
        } else if (i == 1) {
            a(((ahkr) obj).a, this.h);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
