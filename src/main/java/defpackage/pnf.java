package defpackage;

import android.util.LruCache;

/* renamed from: pnf */
final class pnf extends LruCache {
    private final /* synthetic */ plm a;

    pnf(plm plm) {
        this.a = plm;
        super(20);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.h.add(num);
        }
    }
}
