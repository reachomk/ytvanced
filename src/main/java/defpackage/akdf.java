package defpackage;

/* renamed from: akdf */
public final class akdf implements sxg {
    private final acum a;

    public akdf(acum acum) {
        this.a = acum;
    }

    public final void a(String str) {
        arcf arcf = (arcf) arcc.c.createBuilder();
        arcf.copyOnWrite();
        arcc arcc = (arcc) arcf.instance;
        if (str != null) {
            arcc.a |= 1;
            arcc.b = str;
            arcc arcc2 = (arcc) ((anxl) arcf.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (arcc2 != null) {
                asmw.c = arcc2;
                asmw.b = 245;
                this.a.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(int i, String str) {
        arca arca = (arca) arcb.e.createBuilder();
        arca.copyOnWrite();
        arcb arcb = (arcb) arca.instance;
        arcb.b = 1;
        arcb.c = Integer.valueOf(i - 1);
        arca.a(str);
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.a((arcb) ((anxl) arca.build()));
        this.a.a((asmw) ((anxl) asmz.build()));
    }

    public final void b(int i, String str) {
        arca arca = (arca) arcb.e.createBuilder();
        arca.copyOnWrite();
        arcb arcb = (arcb) arca.instance;
        arcb.b = 2;
        arcb.c = Integer.valueOf(i - 1);
        arca.a(str);
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.a((arcb) ((anxl) arca.build()));
        this.a.a((asmw) ((anxl) asmz.build()));
    }
}
