package defpackage;

/* renamed from: abqz */
public final class abqz {
    private final acum a;

    public abqz(acum acum) {
        this.a = acum;
    }

    public final void a(int i, int i2) {
        asmz asmz = (asmz) asmw.f.createBuilder();
        aucz aucz = (aucz) auda.d.createBuilder();
        aucz.copyOnWrite();
        auda auda = (auda) aucz.instance;
        auda.a |= 1;
        auda.b = i - 1;
        aucz.copyOnWrite();
        auda auda2 = (auda) aucz.instance;
        auda2.a |= 2;
        auda2.c = i2 - 1;
        auda2 = (auda) ((anxl) aucz.build());
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (auda2 != null) {
            asmw.c = auda2;
            asmw.b = 225;
            this.a.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }
}
