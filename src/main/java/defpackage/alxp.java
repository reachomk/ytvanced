package defpackage;

/* renamed from: alxp */
public final class alxp implements alxr {
    private final acum a;
    private boolean b = false;

    public alxp(acum acum) {
        this.a = (acum) amqw.a((Object) acum);
    }

    public final void a(aydm aydm) {
        if (aydm != null && (aydm.a & 64) != 0) {
            ayde ayde = aydm.e;
            if (ayde == null) {
                ayde = ayde.d;
            }
            this.b = ayde.b;
        }
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(aycn aycn) {
        this.a.a(c(aycn));
    }

    public final void b(aycn aycn) {
        try {
            this.a.b(c(aycn));
        } catch (Exception unused) {
            xtl.c("UncaughtException error occurred in critical transmission path.");
        }
    }

    private final asmw c(aycn aycn) {
        amqw.b(this.b);
        ayck ayck = (ayck) aycl.c.createBuilder();
        ayck.copyOnWrite();
        aycl aycl = (aycl) ayck.instance;
        if (aycn != null) {
            aycl.b = aycn;
            aycl.a |= 1;
            aycl aycl2 = (aycl) ((anxl) ayck.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (aycl2 != null) {
                asmw.c = aycl2;
                asmw.b = 3;
                return (asmw) ((anxl) asmz.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
