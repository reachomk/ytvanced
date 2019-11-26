package defpackage;

import android.os.RemoteException;
import java.io.IOException;

/* renamed from: pkt */
final class pkt implements ptm {
    private final String a;
    private final /* synthetic */ pkq b;

    pkt(pkq pkq, String str) {
        this.b = pkq;
        this.a = str;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pjd pjd = (pjd) ptn;
        this.b.h = pjd;
        try {
            if (pjd.a().b()) {
                pkq.a.a("%s() -> success result", this.a);
                this.b.g = new plw(new pom(), this.b.d);
                try {
                    pkq pkq = this.b;
                    pkq.g.a(pkq.f);
                    this.b.g.a();
                    this.b.g.d();
                    pkq = this.b;
                    pkq.e.a(pkq.g, pkq.b());
                } catch (IOException e) {
                    pkq.a.a(e, "Exception when setting GoogleApiClient.", new Object[0]);
                    this.b.g = null;
                }
                this.b.c.a(pjd.b(), pjd.c(), pjd.d(), pjd.e());
                return;
            }
            pkq.a.a("%s() -> failure result", this.a);
            this.b.c.b(pjd.a().f);
        } catch (RemoteException unused) {
            pkq.a.b("Unable to call %s on %s.", "methods", pnw.class.getSimpleName());
        }
    }
}
