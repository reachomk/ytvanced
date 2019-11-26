package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: adgt */
public final class adgt {
    public static final long[] a = new long[]{TimeUnit.SECONDS.toMillis(2), TimeUnit.SECONDS.toMillis(5), TimeUnit.MINUTES.toMillis(1)};
    public final Handler b;
    public final acum c;
    public final adfq d;
    public final Context e;
    public final xci f;
    public final adgu g;
    public final adgv h;
    public final adgs i;
    public long j = 0;
    private final xhv k;

    public adgt(adfq adfq, acum acum, Context context, xhv xhv, xci xci) {
        Handler handler = new Handler(Looper.getMainLooper());
        Object adgx = new adgx();
        this.d = (adfq) amqw.a((Object) adfq);
        this.c = (acum) amqw.a((Object) acum);
        this.e = (Context) amqw.a((Object) context);
        this.b = handler;
        this.k = (xhv) amqw.a((Object) xhv);
        this.f = (xci) amqw.a((Object) xci);
        this.g = (adgu) amqw.a(adgx);
        this.h = new adgv(this);
        this.i = new adgs(this);
    }

    public final void a() {
        this.j = 0;
        this.b.removeCallbacks(this.i);
        this.i.a = 0;
        if (this.k.c() && this.k.e()) {
            this.b.postDelayed(this.i, a[0]);
        }
    }
}
