package defpackage;

/* renamed from: aqrn */
public final class aqrn extends anxo implements anzf {
    private aqrn() {
        super(aqro.l);
    }

    public final aqrk a() {
        aqrk aqrk = ((aqro) this.instance).c;
        return aqrk == null ? aqrk.c : aqrk;
    }

    public final aqrm b() {
        aqrm aqrm = ((aqro) this.instance).e;
        return aqrm == null ? aqrm.c : aqrm;
    }

    public final boolean c() {
        return ((aqro) this.instance).f;
    }

    public final aqrn a(boolean z) {
        copyOnWrite();
        aqro aqro = (aqro) this.instance;
        aqro.a |= 128;
        aqro.f = z;
        return this;
    }

    public final boolean d() {
        return ((aqro) this.instance).g;
    }

    /* synthetic */ aqrn(byte b) {
        super(aqro.l);
    }
}
