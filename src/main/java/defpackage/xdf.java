package defpackage;

import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: xdf */
final class xdf {
    public final Bundle a;
    private final String b;

    xdf(String str, Bundle bundle) {
        this.b = (String) amqw.a((Object) str);
        this.a = (Bundle) amqw.a((Object) bundle);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ProviderInfo providerInfo, int i) {
        return (i & 128) == 128 && TextUtils.equals(providerInfo.authority, this.b);
    }
}
