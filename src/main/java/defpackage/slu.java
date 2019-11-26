package defpackage;

/* renamed from: slu */
public final class slu extends cma {
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
    private slw v = new slw();
    @cue(a = 13)
    private bbmz w;
    @cue(a = 13)
    private swp x;
    @cue(a = 13)
    private sns y;

    public slu() {
        super("ComponentElement");
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
            this.y = (sns) csq.a(sns.class);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        sna.a(cmg, cri, this.y, this.w, this.x, this.f, this.b, this.g, this.e, this.c, this.d);
        this.v.b = (soi) cri.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        cma a = sna.a(cmg, this.v.b, this.w, this.f, this.u, this.g, this.c);
        sna.a(cmg, this.a);
        return a;
    }

    public final void a(String str) {
        cmg cmg = this.p;
        Object obj = (str.hashCode() == 341203229 && str.equals("subscription")) ? null : -1;
        if (obj == null) {
            sna.a(cmg, this.v.b, this.w, this.f, this.g, this.c, this.a);
        }
    }

    public final void b(String str) {
        Object obj = (str.hashCode() == 341203229 && str.equals("subscription")) ? null : -1;
        if (obj == null) {
            sna.a(this.v.b, this.w);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        slw slw = (slw) crh;
        slw slw2 = (slw) crh2;
        slw2.a = slw.a;
        slw2.b = slw.b;
    }

    public final /* synthetic */ cma g() {
        slu slu = (slu) super.g();
        slu.v = new slw();
        return slu;
    }
}
