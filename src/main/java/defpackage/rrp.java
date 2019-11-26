package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;

/* renamed from: rrp */
public final class rrp extends qou {
    public static final Creator CREATOR = new rro();
    public static final List a = Collections.emptyList();
    public static final rqj b = new rqj();
    private final rqj c;
    private final List d;
    private final String e;

    rrp(rqj rqj, List list, String str) {
        this.c = rqj;
        this.d = list;
        this.e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.c, i);
        qov.b(parcel, 2, this.d);
        qov.a(parcel, 3, this.e);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rrp) {
            rrp rrp = (rrp) obj;
            if (pzj.a(this.c, rrp.c) && pzj.a(this.d, rrp.d) && pzj.a(this.e, rrp.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
