package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: plt */
public final class plt extends qou {
    public static final Creator CREATOR = new pne();
    public final String a;
    public final int b;
    public final String c;

    plt(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, i);
    }
}
