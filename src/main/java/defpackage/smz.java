package defpackage;

import android.util.Log;

/* renamed from: smz */
final /* synthetic */ class smz implements bbnv {
    private final sxd a;
    private final boolean b;

    smz(sxd sxd, boolean z) {
        this.a = sxd;
        this.b = z;
    }

    public final Object a(Object obj) {
        sxd sxd = this.a;
        boolean z = this.b;
        Throwable th = (Throwable) obj;
        sxd.b(4, "Error materializing Component", th);
        if (!z) {
            return sna.a;
        }
        Log.e("Elements DEBUG", "NOT A PRODUCTION CRASH BELOW. Review ElementsException message for details");
        throw bbyw.a(th);
    }
}
