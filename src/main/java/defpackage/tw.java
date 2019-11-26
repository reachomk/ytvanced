package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: tw */
final class tw extends ur {
    private final /* synthetic */ yf a;

    tw(Object obj, yf yfVar) {
        this.a = yfVar;
        super(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        if ((this.e & 4) == 0 && obj != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) obj.toArray(new tt[0]));
            this.a.a(0, bundle);
            return;
        }
        this.a.a(-1, null);
    }
}
