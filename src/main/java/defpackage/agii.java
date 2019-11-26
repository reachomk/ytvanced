package defpackage;

import java.util.List;

/* renamed from: agii */
final class agii implements Runnable {
    private final /* synthetic */ agif a;

    agii(agif agif) {
        this.a = agif;
    }

    public final void run() {
        agif agif = this.a;
        agif.g.close();
        try {
            if (agif.i != null) {
                List a = agif.b.a();
                for (agid agid : agif.i.a()) {
                    if (agid.e() == agqf.COMPLETE || agid.e() == agqf.REQUIRES_CONTENT_VERIFICATION) {
                        agie a2 = agif.i.a(agid.a().a());
                        if (a2 != null) {
                            agql a3 = a2.a();
                            agql b = a2.b();
                            boolean z = false;
                            if (agif.a(a3, a)) {
                                if (agif.a(b, a)) {
                                    z = true;
                                }
                            }
                            a2.a(z);
                        }
                    }
                }
                for (agih a4 : agif.h) {
                    a4.a();
                }
            }
            agif.g.open();
        } catch (Throwable th) {
            agif.g.open();
        }
    }
}
