package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* renamed from: bcnn */
final class bcnn implements Runnable {
    private final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;
    private final /* synthetic */ int b;

    bcnn(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
