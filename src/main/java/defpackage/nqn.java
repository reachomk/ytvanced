package defpackage;

import android.media.MediaDrm.KeyStatus;

/* renamed from: nqn */
final class nqn implements nqe {
    private final KeyStatus a;

    nqn(KeyStatus keyStatus) {
        this.a = keyStatus;
    }

    public final int a() {
        return this.a.getStatusCode();
    }

    public final byte[] b() {
        return this.a.getKeyId();
    }
}
