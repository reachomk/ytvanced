package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wai */
public final class wai implements Runnable {
    private final /* synthetic */ aagr a;
    private final /* synthetic */ wxf b;
    private final /* synthetic */ waf c;

    public wai(waf waf, aagr aagr, wxf wxf) {
        this.c = waf;
        this.a = aagr;
        this.b = wxf;
    }

    public final void run() {
        if (TextUtils.isEmpty(this.a.c)) {
            this.b.a(this.a.j, null);
            return;
        }
        airv a = this.c.a.a(this.a);
        try {
            waf waf = this.c;
            aiqs a2 = aiqq.a();
            a2.a = airn.a(this.a.c, "", -1, 0.0f);
            waf.c = a.a(a2.b(), this.a.j, -1, null, null, false, aiqw.a);
            this.b.a(this.a.j, (aakj) this.c.c.get(2, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (a != null) {
                this.c.c.cancel(true);
            }
            this.b.a(this.a.j, new ExecutionException("Failed to get adPlayerResponse for mdx", e));
        }
    }
}
