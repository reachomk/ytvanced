package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: acby */
public final class acby implements aceh {
    public static final long a = TimeUnit.SECONDS.toNanos(60);
    public final Context b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public accg d;
    public boolean e;
    public long f;
    public int g = -1;
    public int h = -1;
    public final Runnable i = new accb(this);
    public final Runnable j = new acca(this);
    public final Runnable k = new accd(this);
    public final Runnable l = new accc(this);
    public final Runnable m = new accf(this);
    public final BroadcastReceiver n = new acce(this);
    public final BroadcastReceiver o = new acch(this);

    public acby(Context context) {
        this.b = context;
    }

    public final void a(Object obj) {
        if (this.e && (obj instanceof auho)) {
            auho auho = (auho) obj;
            int i = this.g;
            auho.copyOnWrite();
            auhp auhp = (auhp) auho.instance;
            auhp.a |= 16;
            auhp.f = i;
            i = this.h;
            if (i == 2) {
                auho.b(2);
            } else if (i == 3) {
                auho.b(3);
            } else if (i == 4) {
                auho.b(5);
            } else if (i != 5) {
                auho.b(1);
            } else {
                auho.b(4);
            }
        }
    }
}
