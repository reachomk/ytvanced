package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qfy */
public final class qfy extends qou {
    public static final Creator CREATOR = new qhg();
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public qfy(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, i);
    }
}
