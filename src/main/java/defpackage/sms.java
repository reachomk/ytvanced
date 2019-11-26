package defpackage;

/* renamed from: sms */
public final class sms extends cma {
    @cue(a = 13)
    public sly a;
    @cue(a = 13)
    public swk b;
    @cue(a = 3)
    public boolean c;
    @cue(a = 3)
    public boolean d;
    @cue(a = 3)
    public boolean e;
    @cue(a = 13)
    public bbmi f;
    @cue(a = 13)
    public sxd g;
    @cue(a = 13)
    public syc u;
    @cue(a = 14)
    private smu v = new smu();
    @cue(a = 13)
    private bbmz w;
    @cue(a = 13)
    private swp x;
    @cue(a = 13)
    private swz y;

    public sms() {
        super("ComponentElementFlat");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.v;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(csq csq) {
        if (csq != null) {
            this.w = (bbmz) csq.a(bbmz.class);
            this.x = (swp) csq.a(swp.class);
            this.y = (swz) csq.a(swz.class);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        smw.a(cmg, cri, this.y, this.w, this.x, this.f, this.b, this.g, this.e, this.c, this.d);
        this.v.b = (soi) cri.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        cma a = smw.a(cmg, this.v.b, this.w, this.f, this.g, this.u, this.c);
        smw.a(cmg, this.a);
        return a;
    }

    public final void a(String str) {
        cmg cmg = this.p;
        Object obj = (str.hashCode() == 341203229 && str.equals("subscription")) ? null : -1;
        if (obj == null) {
            smw.a(cmg, this.v.b, this.w, this.f, this.g, this.c, this.a);
        }
    }

    public final void b(String str) {
        Object obj = (str.hashCode() == 341203229 && str.equals("subscription")) ? null : -1;
        if (obj == null) {
            smw.a(this.v.b, this.w);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        smu smu = (smu) crh;
        smu smu2 = (smu) crh2;
        smu2.a = smu.a;
        smu2.b = smu.b;
    }

    public final /* synthetic */ cma g() {
        sms sms = (sms) super.g();
        sms.v = new smu();
        return sms;
    }
}
