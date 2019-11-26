package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* renamed from: bcmf */
public final class bcmf implements Runnable {
    private final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;
    private final /* synthetic */ int b;

    public bcmf(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
        this.b = i;
    }

    public final void run() {
        int i;
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.a;
        switch (this.b) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case 13:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
            default:
                throw new IllegalArgumentException("No request status found.");
        }
        versionSafeCallbacks$UrlRequestStatusListener.a(i);
    }
}
