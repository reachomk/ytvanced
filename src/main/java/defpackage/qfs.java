package defpackage;

import android.os.Trace;
import java.io.Closeable;

/* renamed from: qfs */
public final class qfs implements Closeable {
    private static final qia a = qhx.a().b();
    private final boolean b;

    public qfs(String str) {
        boolean booleanValue = ((Boolean) a.a()).booleanValue();
        this.b = booleanValue;
        if (booleanValue && str.length() > 127) {
            str.substring(0, 127);
        }
    }

    public final void close() {
        if (this.b) {
            Trace.endSection();
        }
    }
}
