package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* renamed from: nwe */
public final class nwe implements nvz {
    public volatile Object a;
    private final nvq b;
    private final nwb c;
    private final nwd d;
    private volatile boolean e;

    public nwe(String str, nwb nwb, nwd nwd) {
        this.c = nwb;
        this.d = nwd;
        this.b = new nvq(Uri.parse(str), 1);
    }

    public final void d() {
        this.e = true;
    }

    public final boolean e() {
        return this.e;
    }

    public final void f() {
        Closeable nvn = new nvn(this.c, this.b);
        try {
            nvn.a();
            this.a = this.d.b(this.c.a(), nvn);
        } finally {
            nxf.a(nvn);
        }
    }
}
