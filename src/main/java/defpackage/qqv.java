package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qqv */
public final class qqv extends qou {
    public static final Creator CREATOR = new qqy();
    private final int a;
    private final String b;
    private final String c;

    qqv(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public qqv(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, i);
    }
}
