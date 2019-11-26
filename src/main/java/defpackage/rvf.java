package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvf */
public final class rvf extends qou implements rvd {
    public static final Creator CREATOR = new rvc();
    private final rvj a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public rvf(rvj rvj, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = rvj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 17, this.c);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.g);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, 7, this.f);
        qov.a(parcel, a);
    }
}
