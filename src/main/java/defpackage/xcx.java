package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: xcx */
public final class xcx {
    public final xto a;
    public final xto b;
    public final bcaa c;
    private final Executor d;

    public xcx(teq teq, thv thv, tht tht, bcaa bcaa, Executor executor) {
        this.c = bcaa;
        this.d = executor;
        this.a = new xcz(executor, "FeedbackReporter.apiClient", teq, thv);
        this.b = new xdc(this, "FeedbackReporter.feedback", tht);
    }

    public final void a(Bitmap bitmap, Bundle bundle, String str) {
        thx thx = (thx) this.c.get();
        thx.a(bitmap);
        thx.a(new xdb(bundle));
        thx.c(str);
        this.d.execute(new xda(this, thx));
    }

    public final void a() {
        ((ter) this.a.get()).b();
    }

    public final void b() {
        ((ter) this.a.get()).c();
    }
}
