package defpackage;

/* renamed from: jht */
final class jht extends aktw implements xcp {
    private final akpk a = new akpk();
    private final xci b;
    private final ajuq c;
    private final akvh d = new akvh();

    public jht(akvz akvz, xci xci, ajuq ajuq) {
        amqw.a((Object) akvz);
        this.b = (xci) amqw.a((Object) xci);
        this.c = (ajuq) amqw.a((Object) ajuq);
        akvz.a(akbp.class);
        this.a.clear();
        this.a.add(ajuq);
        for (ajup ajup : ajuq.b) {
            aqfs aqfs = ajup.c;
            if (aqfs != null) {
                this.a.add(aqfs);
            } else {
                aqgs aqgs = ajup.b;
                if (aqgs != null) {
                    this.a.add(aqgs);
                } else {
                    ajsx ajsx = ajup.d;
                    if (ajsx != null) {
                        this.a.add(ajsx);
                    } else {
                        aqfg aqfg = ajup.e;
                        if (aqfg != null) {
                            this.a.add(aqfg);
                        } else {
                            aqqg aqqg = ajup.f;
                            if (aqqg != null) {
                                this.a.add(aqqg);
                            }
                        }
                    }
                }
            }
        }
        this.a.add(this.d);
        xci.a((Object) this);
    }

    public final aknh a() {
        return this.a;
    }

    public final void c() {
        this.b.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        ajuq ajuq;
        if (i == -1) {
            return new Class[]{zyg.class, aaxd.class};
        } else if (i == 0) {
            ajuq = ((zyg) obj).d;
            if (ajuq == this.c) {
                this.a.clear();
                return null;
            }
            this.a.remove(ajuq);
            return null;
        } else if (i == 1) {
            ajuq = ((aaxd) obj).b;
            if (ajuq == this.c) {
                this.a.clear();
                return null;
            }
            this.a.remove(ajuq);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
