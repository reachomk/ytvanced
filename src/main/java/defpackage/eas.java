package defpackage;

/* renamed from: eas */
public final class eas implements xhx {
    private final acum b;
    private final xhv c;

    public eas(acum acum, xhv xhv) {
        this.b = acum;
        this.c = xhv;
    }

    public final void a() {
        if (!this.c.c()) {
            awun awun = (awun) awuk.e.createBuilder();
            awun.a(2);
            awun.b(this.c.m());
            awun.c(1);
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a((awuk) ((anxl) awun.build()));
            this.b.a((asmw) ((anxl) asmz.build()));
        }
    }

    public final void a(bqn bqn) {
        if ((bqn instanceof bqe) && this.c.c()) {
            awun awun = (awun) awuk.e.createBuilder();
            awun.a(3);
            awun.b(this.c.m());
            awun.c(1);
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a((awuk) ((anxl) awun.build()));
            this.b.a((asmw) ((anxl) asmz.build()));
        }
    }
}
