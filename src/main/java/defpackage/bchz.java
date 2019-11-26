package defpackage;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.VmPolicy;
import java.io.Closeable;

/* renamed from: bchz */
public final class bchz implements Closeable {
    private final ThreadPolicy a;
    private final VmPolicy b;

    private bchz(ThreadPolicy threadPolicy, VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    private bchz(ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    public bchz(VmPolicy vmPolicy) {
        this(null, vmPolicy);
    }

    public static bchz a() {
        return new bchz(StrictMode.allowThreadDiskWrites());
    }

    public static bchz b() {
        return new bchz(StrictMode.allowThreadDiskReads());
    }

    public final void close() {
        ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
