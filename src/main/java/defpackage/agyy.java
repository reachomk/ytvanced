package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: agyy */
final class agyy extends BroadcastReceiver {
    private final xhv a;
    private final agyt b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile boolean e;

    public agyy(xhv xhv, agyt agyt) {
        this.a = xhv;
        this.b = agyt;
    }

    public final void onReceive(Context context, Intent intent) {
        if (a()) {
            this.b.f();
        }
    }

    public final boolean a() {
        boolean c = this.a.c();
        xhv xhv = this.a;
        boolean z = xhv.c() && xhv.g();
        boolean a = ahap.a(this.a);
        if (this.c == c && this.e == a && this.d == z) {
            return false;
        }
        this.c = c;
        this.e = a;
        this.d = z;
        return true;
    }
}
