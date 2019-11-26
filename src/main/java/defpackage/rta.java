package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: rta */
public final class rta extends qou {
    public static final Creator CREATOR = new rtm();
    private final List a;
    private final String b;

    public rta(List list, String str) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rta)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rta rta = (rta) obj;
        return pzj.a(this.a, rta.a) && pzj.a(this.b, rta.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, i);
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("matches", this.a);
        a.a("query", this.b);
        return a.toString();
    }

    static {
        rta rta = new rta(Collections.emptyList(), null);
    }
}
