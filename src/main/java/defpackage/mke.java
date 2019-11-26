package defpackage;

/* renamed from: mke */
public final class mke {
    public final albi a;
    public final etz b;
    public final xsc c;
    public final xci d;
    public final etx e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    private final acum j;

    public mke(zyw zyw, albi albi, etz etz, xsc xsc, acum acum, etx etx, xci xci) {
        aovd D = foh.D(zyw);
        boolean z = false;
        if (D == null) {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = 0;
        } else {
            this.f = D.b;
            this.g = D.c;
            if (D.d && D.e > 0) {
                z = true;
            }
            this.h = z;
            this.i = D.e;
        }
        this.a = albi;
        this.b = etz;
        this.c = xsc;
        this.j = acum;
        this.e = etx;
        this.d = xci;
    }

    public final void a(long j, String str, boolean z) {
        axba axba = (axba) axbb.e.createBuilder();
        axba.copyOnWrite();
        axbb axbb = (axbb) axba.instance;
        axbb.a |= 1;
        axbb.b = j;
        axba.copyOnWrite();
        axbb axbb2 = (axbb) axba.instance;
        if (str != null) {
            axbb2.a |= 2;
            axbb2.c = str;
            axba.copyOnWrite();
            axbb2 = (axbb) axba.instance;
            axbb2.a |= 4;
            axbb2.d = z;
            axbb2 = (axbb) ((anxl) axba.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (axbb2 != null) {
                asmw.c = axbb2;
                asmw.b = 207;
                this.j.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
