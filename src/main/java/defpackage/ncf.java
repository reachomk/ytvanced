package defpackage;

import android.net.Uri;

/* renamed from: ncf */
public final /* synthetic */ class ncf implements bcvk {
    private final String a;

    public ncf(String str) {
        this.a = str;
    }

    public final void a(Object obj) {
        ndi ndi = (ndi) obj;
        Uri b = nft.b(this.a);
        ndi.a(b != null ? nft.a(b, false) : null);
    }
}
