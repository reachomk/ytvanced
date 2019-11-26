package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: phf */
public final class phf extends qou implements ptn {
    public static final Creator CREATOR = new pib();
    private Status a;
    private List b;
    @Deprecated
    private String[] c;

    public final Status a() {
        return this.a;
    }

    phf(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a, i);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, a);
    }
}
