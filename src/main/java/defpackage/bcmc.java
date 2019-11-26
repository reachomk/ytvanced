package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* renamed from: bcmc */
public final class bcmc implements Runnable {
    private final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;

    public bcmc(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
    }

    public final void run() {
        this.a.a(-1);
    }
}
