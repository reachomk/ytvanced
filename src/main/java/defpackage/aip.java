package defpackage;

import android.view.MenuItem;

/* renamed from: aip */
final class aip implements Runnable {
    private final /* synthetic */ air a;
    private final /* synthetic */ MenuItem b;
    private final /* synthetic */ aiw c;
    private final /* synthetic */ aiq d;

    aip(aiq aiq, air air, MenuItem menuItem, aiw aiw) {
        this.d = aiq;
        this.a = air;
        this.b = menuItem;
        this.c = aiw;
    }

    public final void run() {
        air air = this.a;
        if (air != null) {
            this.d.a.f = true;
            air.b.a(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, 4);
        }
    }
}
