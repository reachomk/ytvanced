package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: afnm */
final class afnm extends xle {
    private final /* synthetic */ wxg a;
    private final /* synthetic */ Uri b;
    private final /* synthetic */ afnk k;

    afnm(afnk afnk, String str, bqk bqk, wxg wxg, Uri uri) {
        this.k = afnk;
        this.a = wxg;
        this.b = uri;
        super(0, str, bqk);
    }

    public final bqh a(bqd bqd) {
        try {
            return bqh.a(this.k.a.a(bqd), bqp.a(bqd));
        } catch (IOException | xwd e) {
            return bqh.a(new bqn(e));
        }
    }

    public final void a(Object obj) {
        this.a.a(this.b, obj);
    }
}
