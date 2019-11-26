package defpackage;

import android.util.Log;
import java.io.IOException;

/* renamed from: uhq */
public final class uhq implements uhs {
    private static final String a = uhs.class.getSimpleName();
    private final tnl b;
    private final tem c;

    public uhq(tnl tnl, tem tem) {
        this.b = tnl;
        this.c = tem;
    }

    public final void a(uho uho) {
        try {
            this.b.a(uho.b);
        } catch (tei e) {
            this.c.a(e.a, uho.b);
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.");
        } catch (tej e2) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.");
            this.c.a(e2.a, uho.b);
            throw new IOException("Blocked unpatched use of SSL stack.");
        }
    }
}
