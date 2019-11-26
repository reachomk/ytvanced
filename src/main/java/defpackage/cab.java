package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: cab */
public final class cab implements bzs {
    private final Resources a;

    public cab(Resources resources) {
        this.a = resources;
    }

    public final void a() {
    }

    public final bzq a(bzy bzy) {
        return new cac(this.a, bzy.a(Uri.class, AssetFileDescriptor.class));
    }
}
