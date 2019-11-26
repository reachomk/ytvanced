package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uk */
final class uk extends ur {
    private final /* synthetic */ uq a;
    private final /* synthetic */ Bundle f;

    uk(Object obj, uq uqVar, Bundle bundle) {
        this.a = uqVar;
        this.f = bundle;
        super(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        if (obj != null) {
            if ((this.e & 1) != 0) {
                List obj2 = tv.a(obj2, this.f);
            }
            ArrayList arrayList = new ArrayList();
            for (tt ttVar : obj2) {
                Parcel obtain = Parcel.obtain();
                ttVar.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
            this.a.a(arrayList);
            return;
        }
        this.a.a(null);
    }
}
