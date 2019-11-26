package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: cad */
public final class cad implements bzs {
    private final Resources a;

    public cad(Resources resources) {
        this.a = resources;
    }

    public final void a() {
    }

    public final bzq a(bzy bzy) {
        return new cac(this.a, bzy.a(Uri.class, InputStream.class));
    }
}
