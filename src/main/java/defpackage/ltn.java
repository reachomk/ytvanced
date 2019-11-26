package defpackage;

/* renamed from: ltn */
public final class ltn implements ajan, vda, xcp {
    public final akpk a = new akpk();
    public ltr b;
    public ern c;
    public aqfq d;
    private final swm e;
    private final zyw f;
    private eqd g;
    private boolean h = false;
    private boolean i = false;
    private final lts j;

    public ltn(swm swm, zyw zyw) {
        this.e = swm;
        this.f = zyw;
        this.j = new lts(this);
        this.a.a(this.j);
    }

    public final long e() {
        return 1;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.f, 64, 1)).a(new ltq(this), ltp.a)};
    }

    public final void a() {
        this.b.a(this.g);
    }

    public final void b() {
        this.a.clear();
        this.g = new eqd();
        this.a.add(this.g);
    }

    public final void c() {
        this.a.remove(this.g);
        this.g = null;
    }

    private final void b(boolean z) {
        ern ern = this.c;
        if (ern instanceof eru) {
            eru eru = (eru) ern;
            boolean z2 = true;
            if (!(z || eru.a.i)) {
                z2 = false;
            }
            eru.b = z2;
        }
    }

    public final void d() {
        if (this.i) {
            ern ern = this.c;
            if (ern != null && !this.a.contains(ern)) {
                boolean z = false;
                if (this.h && this.a.size() == 0) {
                    b(false);
                    this.a.add(this.c);
                    return;
                }
                ern = this.c;
                if ((ern instanceof eru) && ((eru) ern).a.h) {
                    if (this.a.size() > 0) {
                        z = true;
                    }
                    b(z);
                    this.a.add(this.c);
                }
            }
        }
    }

    public final void f() {
        if (this.h && this.a.size() == 0 && this.i) {
            aqfq aqfq = this.d;
            if (aqfq != null) {
                this.a.add(aqfq);
            }
        }
    }

    public final void a(boolean z) {
        aqhb aqhb = (aqhb) aqhc.c.createBuilder();
        aqhb.copyOnWrite();
        aqhc aqhc = (aqhc) aqhb.instance;
        aqhc.a |= 1;
        aqhc.b = z;
        String str = "COMPANION_AD_SLOT_STATE_CLIENT";
        this.e.a(str, ((aqhc) ((anxl) aqhb.build())).toByteArray());
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        lts lts = this.j;
        lts.a = ahkn.a;
        if (lts.a == airi.NEW) {
            lts.b.a(false);
        } else if (lts.a == airi.VIDEO_REQUESTED) {
            lts.b();
        }
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 0) {
            this.h = false;
            this.i = false;
        } else if (ordinal == 7 && !this.i) {
            boolean z = true;
            this.i = true;
            if (ahkn.b == null) {
                z = false;
            }
            this.h = z;
            d();
            f();
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
