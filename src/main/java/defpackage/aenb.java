package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: aenb */
public final class aenb extends bckr {
    private final aelx a;
    private final afjj b;
    private final boolean c;

    public aenb(Executor executor, aelx aelx, afjj afjj, boolean z) {
        super(executor);
        this.a = (aelx) amqw.a((Object) aelx);
        this.b = afjj;
        this.c = z;
    }

    public final void a(bcko bcko) {
        bckq c = bcko.c();
        if (c != null) {
            bclb e = bcko.e();
            if (e != null && e.b() >= 200 && e.b() < 300) {
                Uri parse = Uri.parse(e.a());
                if (parse.getPath().contains("initplayback")) {
                    long longValue = c.d().longValue() - (c.b().getTime() - c.a().getTime());
                    this.a.a(parse.getHost(), (double) longValue);
                    if (this.c && this.b != null && !parse.getBooleanQueryParameter("owc", false) && parse.getQueryParameter("psid") == null) {
                        if (c.c()) {
                            this.b.a.a(new aehx());
                        }
                        this.b.a.a(new aehs(longValue));
                    }
                }
            }
        }
    }
}
