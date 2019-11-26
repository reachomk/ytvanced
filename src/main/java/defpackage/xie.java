package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: xie */
public final class xie implements xfs {
    public final Executor b = Executors.newSingleThreadExecutor(new xaf(8, "cronetPrewarm"));
    private final bcaa c;

    public xie(bcaa bcaa) {
        this.c = bcaa;
    }

    public final void a(Uri uri) {
        this.b.execute(new xid(this, (bciz) this.c.get(), uri));
    }
}
