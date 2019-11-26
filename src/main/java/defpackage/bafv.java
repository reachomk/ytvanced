package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* renamed from: bafv */
final /* synthetic */ class bafv implements Runnable {
    private final long a;

    bafv(long j) {
        this.a = j;
    }

    public final void run() {
        ExternalSurfaceManager.nativeCallback(this.a);
    }
}
