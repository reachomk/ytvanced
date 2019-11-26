package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.view.Window;

/* renamed from: msh */
public final class msh {
    public final Activity a;

    public msh(Activity activity) {
        this.a = (Activity) amqw.a((Object) activity);
    }

    public final ActionBar a() {
        return this.a.getActionBar();
    }

    public final int b() {
        return this.a.getRequestedOrientation();
    }

    public final Window c() {
        return this.a.getWindow();
    }

    public final boolean d() {
        return this.a.isFinishing();
    }

    public final int e() {
        return System.identityHashCode(this.a);
    }
}
