package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gzg */
public final class gzg implements aamt {
    private final SharedPreferences a;

    public gzg(Context context, SharedPreferences sharedPreferences) {
        amqw.a((Object) context);
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final void a(asib asib) {
        ashn ashn = (ashn) ((anxo) asib.a().toBuilder());
        int a = fmv.a(this.a);
        if (a == 1) {
            ashn.a(2);
        } else if (a != 2) {
            ashn.a(1);
        } else {
            ashn.a(3);
        }
        asib.a(ashn);
    }
}
