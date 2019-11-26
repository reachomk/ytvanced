package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

/* renamed from: aepi */
public final class aepi implements aepf {
    private final /* synthetic */ Builder a;

    public aepi(Builder builder) {
        this.a = builder;
    }

    public final void b(String str, String str2) {
    }

    public final void a(String str, String str2) {
        this.a.appendQueryParameter(str, str2);
    }

    public final void a(String str) {
        this.a.authority(str);
    }

    public final Uri a() {
        return this.a.build();
    }
}
