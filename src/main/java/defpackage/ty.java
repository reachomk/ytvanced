package defpackage;

import android.os.Bundle;

/* renamed from: ty */
public final class ty {
    public final String a;
    public final Bundle b;

    public ty(String str, Bundle bundle) {
        if (str != null) {
            this.a = str;
            this.b = bundle;
            return;
        }
        throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
    }
}
