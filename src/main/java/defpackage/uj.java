package defpackage;

import android.os.Parcel;

/* renamed from: uj */
final class uj extends ur {
    private final /* synthetic */ uq a;

    uj(Object obj, uq uqVar) {
        this.a = uqVar;
        super(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        tt ttVar = (tt) obj;
        if (ttVar == null) {
            this.a.a(null);
            return;
        }
        Parcel obtain = Parcel.obtain();
        ttVar.writeToParcel(obtain, 0);
        this.a.a(obtain);
    }
}
