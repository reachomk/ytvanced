package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: cae */
public final class cae implements bzs {
    private final Resources a;

    public cae(Resources resources) {
        this.a = resources;
    }

    public final void a() {
    }

    public final bzq a(bzy bzy) {
        return new cac(this.a, bzy.a(Uri.class, ParcelFileDescriptor.class));
    }
}
