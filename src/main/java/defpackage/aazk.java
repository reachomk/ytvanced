package defpackage;

/* renamed from: aazk */
public final class aazk extends aanf {
    public final aang a;
    public final aang b;
    public final aang g;

    public aazk(aamf aamf, aamd aamd, afpu afpu, xhf xhf) {
        super(aamd, afpu, xhf);
        this.a = a(asuv.e, aamf, aazn.a, aazm.a);
        this.b = a(asur.e, aamf, aazp.a, aazo.a);
        this.g = a(asuz.e, aamf, aazr.a, aazq.a);
    }

    @Deprecated
    public final anjv a(aazv aazv) {
        return this.a.a(aazv);
    }

    @Deprecated
    public final anjv a(aazs aazs) {
        return this.b.a(aazs);
    }

    @Deprecated
    public final anjv a(aazu aazu) {
        return this.g.a(aazu);
    }

    public final aazv a() {
        return new aazv(this.c, this.d.c());
    }

    public final aazs b() {
        return new aazs(this.c, this.d.c());
    }

    public final aazu c() {
        return new aazu(this.c, this.d.c());
    }
}
