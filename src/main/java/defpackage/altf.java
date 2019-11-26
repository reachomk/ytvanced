package defpackage;

/* renamed from: altf */
public final class altf {
    public final axrs a = ((axrs) axrt.d.createBuilder());

    public final altf a(altb altb) {
        axrs axrs = this.a;
        axrh a = altb.a();
        axrs.copyOnWrite();
        axrt axrt = (axrt) axrs.instance;
        if (a != null) {
            axrt.b = a;
            axrt.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final asmw a() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        axrt axrt = (axrt) ((anxl) this.a.build());
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (axrt != null) {
            asmw.c = axrt;
            asmw.b = 88;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }
}
