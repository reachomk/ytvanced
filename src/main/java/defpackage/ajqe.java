package defpackage;

import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ajqe */
public final class ajqe {
    private final Set a;

    public ajqe(Set set) {
        this.a = set;
    }

    public final ajqd a() {
        Map hashMap = new HashMap();
        for (ajps ajps : this.a) {
            Parcelable d = ajps.d();
            if (d != null) {
                hashMap.put(ajps.getClass().toString(), d);
            }
        }
        return new ajqd(hashMap);
    }

    public final void a(ajqd ajqd, ajpr ajpr) {
        Map map = ajqd.a;
        for (ajps ajps : this.a) {
            Parcelable parcelable = (Parcelable) map.get(ajps.getClass().toString());
            if (parcelable != null) {
                ajps.a(parcelable, ajpr);
            }
        }
    }
}
