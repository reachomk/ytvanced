package defpackage;

import android.os.Bundle;

/* renamed from: tx */
final class tx extends ur {
    private final /* synthetic */ yf a;

    tx(Object obj, yf yfVar) {
        this.a = yfVar;
        super(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        tt ttVar = (tt) obj;
        if ((this.e & 2) != 0) {
            this.a.a(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", ttVar);
        this.a.a(0, bundle);
    }
}
