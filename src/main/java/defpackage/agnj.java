package defpackage;

/* renamed from: agnj */
public final class agnj {
    private final acum a;

    public agnj(acum acum) {
        this.a = (acum) amqw.a((Object) acum);
    }

    public final void a(String str, int i, int i2) {
        avsf avsf = (avsf) avsg.e.createBuilder();
        avsf.copyOnWrite();
        avsg avsg = (avsg) avsf.instance;
        if (str != null) {
            avsg.a |= 1;
            avsg.b = str;
            avsf.copyOnWrite();
            avsg avsg2 = (avsg) avsf.instance;
            avsg2.a |= 2;
            avsg2.c = i2 - 1;
            avsf.copyOnWrite();
            avsg2 = (avsg) avsf.instance;
            if (i != 0) {
                avsg2.a |= 4;
                avsg2.d = i - 1;
                avsg2 = (avsg) ((anxl) avsf.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                if (avsg2 != null) {
                    asmw.c = avsg2;
                    asmw.b = 239;
                    this.a.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
