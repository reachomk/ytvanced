package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: aud */
public final class aud {
    public final Intent a;
    private final Bundle b;

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        ra.a(context, this.a, this.b);
    }

    aud(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }
}
