package defpackage;

import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: bcml */
public final class bcml implements Runnable {
    private final /* synthetic */ CronetUrlRequestContext a;

    public bcml(CronetUrlRequestContext cronetUrlRequestContext) {
        this.a = cronetUrlRequestContext;
    }

    public final void run() {
        CronetLibraryLoader.a();
        synchronized (this.a.b) {
            CronetUrlRequestContext cronetUrlRequestContext = this.a;
            cronetUrlRequestContext.nativeInitRequestContextOnInitThread(cronetUrlRequestContext.c);
        }
    }
}
