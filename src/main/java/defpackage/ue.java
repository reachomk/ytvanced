package defpackage;

import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: ue */
final class ue extends ur {
    private final /* synthetic */ uq a;

    ue(Object obj, uq uqVar) {
        this.a = uqVar;
        super(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        if (obj == null) {
            obj = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (tt ttVar : obj) {
                Parcel obtain = Parcel.obtain();
                ttVar.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
            obj = arrayList;
        }
        this.a.a(obj);
    }
}
