package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: pzn */
final class pzn implements ptj {
    private final /* synthetic */ ptg a;
    private final /* synthetic */ ryl b;
    private final /* synthetic */ pzp c;
    private final /* synthetic */ pzo d;

    pzn(ptg ptg, ryl ryl, pzp pzp, pzo pzo) {
        this.a = ptg;
        this.b = ryl;
        this.c = pzp;
        this.d = pzo;
    }

    public final void a(Status status) {
        if (status.b()) {
            this.a.a(TimeUnit.MILLISECONDS);
            this.b.a(this.c.a());
            return;
        }
        this.b.a(this.d.a(status));
    }
}
