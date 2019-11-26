package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: wyo */
public final class wyo implements Closeable {
    public final InputStream[] a;

    public final void close() {
        for (Closeable a : this.a) {
            wyl.a(a);
        }
    }

    /* synthetic */ wyo(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }
}
