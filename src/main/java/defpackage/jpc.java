package defpackage;

import android.view.MenuItem;

/* renamed from: jpc */
final class jpc implements Runnable {
    private final /* synthetic */ MenuItem a;
    private final /* synthetic */ jpd b;

    jpc(jpd jpd, MenuItem menuItem) {
        this.b = jpd;
        this.a = menuItem;
    }

    public final void run() {
        this.a.setTitle(abmk.a(this.b.a));
    }
}
