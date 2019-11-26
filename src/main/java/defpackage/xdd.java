package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

/* renamed from: xdd */
final class xdd extends ContextWrapper {
    private final xdg a;

    public final PackageManager getPackageManager() {
        return this.a;
    }

    /* synthetic */ xdd(Context context, xdg xdg) {
        super(context);
        this.a = (xdg) amqw.a((Object) xdg);
    }
}
