package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;

/* renamed from: rsy */
public final class rsy extends qou {
    public static final Creator CREATOR = new rtk();
    private int a;
    private List b;
    private String c;

    public rsy(int i, List list, String str) {
        this.a = i;
        this.b = list;
        this.c = str;
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("spamStatus", Integer.valueOf(this.a));
        a.a("person", this.b);
        a.a("matchingId", this.c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        List list = this.b;
        if (list == null) {
            list = Collections.emptyList();
        }
        qov.b(parcel, 3, list);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, i);
    }
}
