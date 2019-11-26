package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;

/* renamed from: rtb */
public final class rtb extends qou {
    public static final Creator CREATOR = new rtn();
    private String a;
    private List b;

    public rtb(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        List list = this.b;
        if (list == null) {
            list = Collections.emptyList();
        }
        qov.b(parcel, 3, list);
        qov.a(parcel, i);
    }
}
