package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qec */
public final class qec extends qou {
    public static final Creator CREATOR = new qep();
    private final String a;
    private final boolean b;

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, i);
    }

    qec(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
