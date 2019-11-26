package defpackage;

import android.content.ContentProviderClient;
import android.os.Build.VERSION;

/* renamed from: bahj */
public final class bahj {
    public final ContentProviderClient a;
    public final String b;

    bahj(ContentProviderClient contentProviderClient, String str) {
        this.a = contentProviderClient;
        this.b = str;
    }

    public final void a() {
        if (VERSION.SDK_INT >= 24) {
            this.a.close();
        } else {
            this.a.release();
        }
    }
}
