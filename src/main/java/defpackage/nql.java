package defpackage;

import android.media.MediaDrm.KeyRequest;

/* renamed from: nql */
final class nql implements nqd {
    private final /* synthetic */ KeyRequest a;

    nql(KeyRequest keyRequest) {
        this.a = keyRequest;
    }

    public final byte[] a() {
        return this.a.getData();
    }
}
