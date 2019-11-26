package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.util.Map;

/* renamed from: aivw */
public final class aivw extends aepm {
    private final aivx b;
    private final aivz c = new aivz(this, Looper.myLooper());
    private boolean d;

    public final void a(Context context, Uri uri, Map map) {
        super.a(context, this.b.a(uri), map);
        this.d = true;
        k();
    }

    public final void b(int i) {
    }

    public final void a(aepr aepr) {
        this.a = aepr;
        k();
    }

    private final void k() {
        if (this.d) {
            this.c.obtainMessage(1, 100, -1).sendToTarget();
        }
    }

    /* synthetic */ aivw(aeps aeps, aivx aivx) {
        super(aeps);
        this.b = (aivx) amqw.a((Object) aivx);
    }
}
