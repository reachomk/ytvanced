package defpackage;

/* renamed from: huh */
public final class huh {
    public ejd a = ejd.NONE;
    public ejd b;
    private final aizy c;

    public huh(aizy aizy) {
        this.c = aizy;
    }

    public final void a(ejd ejd) {
        amqw.a((Object) ejd);
        this.a = ejd;
        ejd ejd2 = this.b;
        if (ejd2 != null) {
            if (ejd == ejd2) {
                this.b = null;
            } else {
                return;
            }
        }
        b(ejd);
    }

    public final void b(ejd ejd) {
        if (ejd != ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
            aizy aizy = this.c;
            boolean z = true;
            boolean z2 = ejd.a() && !ejd.n();
            aizy.d(z2);
            aizy = this.c;
            if (!(ejd.d() || ejd.n())) {
                z = false;
            }
            aiqf aiqf = aizy.d;
            if (aiqf.e != z) {
                aiqf.e = z;
                aiqf.g();
            }
            aizy = this.c;
            z2 = ejd.g();
            aiqf = aizy.d;
            if (z2 != aiqf.l) {
                aiqf.l = z2;
                aiqf.g();
            }
            aizy = this.c;
            boolean n = ejd.n();
            aiqf = aizy.d;
            if (n != aiqf.g) {
                aiqf.g = n;
                aiqf.g();
            }
        }
    }
}
