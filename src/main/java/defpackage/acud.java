package defpackage;

/* renamed from: acud */
public final class acud implements afpg {
    private final acum a;

    public acud(acum acum) {
        this.a = acum;
    }

    public final boolean a(apuy apuy) {
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (apuy != null) {
            asmw.c = apuy;
            asmw.b = 163;
            return this.a.a((asmw) ((anxl) asmz.build()));
        }
        throw new NullPointerException();
    }
}
