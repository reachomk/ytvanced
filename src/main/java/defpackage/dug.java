package defpackage;

import android.net.Uri;

/* renamed from: dug */
public final class dug implements baqa {
    private final bcaa a;

    public dug(bcaa bcaa) {
        this.a = bcaa;
    }

    public final /* synthetic */ Object get() {
        Uri[] uriArr;
        Object obj;
        zzf zzf = (zzf) this.a.get();
        aosh o = zzf.o();
        aoth f = zzf.f();
        if (f.g.size() > 0) {
            uriArr = new Uri[f.g.size()];
            for (int i = 0; i < f.g.size(); i++) {
                uriArr[i] = Uri.parse((String) f.g.get(i));
            }
        } else {
            uriArr = null;
        }
        if (uriArr == null) {
            obj = xgr.a;
        } else {
            boolean z = o.h;
            obj = new xgr(uriArr);
        }
        return (xgr) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
