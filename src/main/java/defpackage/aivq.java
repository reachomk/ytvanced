package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* renamed from: aivq */
final class aivq extends aepm {
    private final aivx b;
    private final aahr c;

    aivq(aeps aeps, aivx aivx, aahr aahr) {
        super(aeps);
        this.b = aivx;
        this.c = aahr;
    }

    public final void a(Context context, Uri uri, Map map) {
        if (!xvt.c(uri)) {
            aivx aivx = this.b;
            aahr aahr = this.c;
            uri = aivx.a(aahr.b, aahr.b(), this.c.t(), this.c.c(), this.c.C(), uri);
        }
        super.a(context, uri, map);
    }
}
