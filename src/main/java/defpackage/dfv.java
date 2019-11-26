package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* renamed from: dfv */
final class dfv extends ContextWrapper {
    private final dfu a;
    private final dfx b;

    public dfv(Context context) {
        super(context);
        this.a = new dfu(context);
        this.b = new dfx(context.getResources());
    }

    public final PackageManager getPackageManager() {
        return this.a;
    }

    public final Resources getResources() {
        return this.b;
    }
}
