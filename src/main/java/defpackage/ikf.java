package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: ikf */
public final class ikf implements aaap {
    public final xoi a;
    private final nn b;
    private final afpu c;
    private final afqe d;

    public ikf(nn nnVar, afpu afpu, afqe afqe, xoi xoi) {
        this.b = nnVar;
        this.c = afpu;
        this.d = afqe;
        this.a = xoi;
    }

    public final void a(apxu apxu, Map map) {
        if (this.c.a()) {
            a(apxu);
        } else {
            this.d.a(this.b, null, new iki(this, apxu));
        }
    }

    public final void a(apxu apxu) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        nf ile = new ile();
        ile.f(bundle);
        this.b.f().a().a(ile, "SuggestedPlaylistVideosFragment").a();
    }
}
