package defpackage;

import android.media.MediaDrm;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: nqk */
public final class nqk implements nqb {
    public final MediaDrm a;

    public nqk(UUID uuid) {
        this.a = new MediaDrm((UUID) nwf.a((Object) uuid));
    }

    public final void a(nqg nqg) {
        this.a.setOnEventListener(nqg != null ? new nqj(nqg) : null);
    }

    public final byte[] a() {
        return this.a.openSession();
    }

    public final void a(byte[] bArr) {
        this.a.closeSession(bArr);
    }

    public final nqd a(byte[] bArr, byte[] bArr2, String str, int i, HashMap hashMap) {
        return new nql(this.a.getKeyRequest(bArr, bArr2, str, i, hashMap));
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.a.provideKeyResponse(bArr, bArr2);
    }

    public final nqi b() {
        return new nqo(this.a.getProvisionRequest());
    }

    public final void b(byte[] bArr) {
        this.a.provideProvisionResponse(bArr);
    }

    public final Map c(byte[] bArr) {
        return this.a.queryKeyStatus(bArr);
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        this.a.restoreKeys(bArr, bArr2);
    }

    public final String a(String str) {
        return this.a.getPropertyString(str);
    }

    public final void a(String str, String str2) {
        this.a.setPropertyString(str, str2);
    }
}
