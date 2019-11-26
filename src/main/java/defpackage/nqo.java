package defpackage;

import android.media.MediaDrm.ProvisionRequest;

/* renamed from: nqo */
final class nqo implements nqi {
    private final /* synthetic */ ProvisionRequest a;

    nqo(ProvisionRequest provisionRequest) {
        this.a = provisionRequest;
    }

    public final byte[] a() {
        return this.a.getData();
    }

    public final String b() {
        return this.a.getDefaultUrl();
    }
}
