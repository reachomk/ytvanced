package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: aey */
abstract class aey {
    private BroadcastReceiver a;
    private final /* synthetic */ aek b;

    aey(aek aek) {
        this.b = aek;
    }

    public abstract int a();

    public abstract void b();

    public abstract IntentFilter d();

    /* Access modifiers changed, original: final */
    public final void c() {
        e();
        IntentFilter d = d();
        if (d != null && d.countActions() != 0) {
            if (this.a == null) {
                this.a = new afb(this);
            }
            this.b.a.registerReceiver(this.a, d);
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.b.a.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }
}
