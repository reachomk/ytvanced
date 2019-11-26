package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvk */
public final class rvk extends qou implements rvi {
    public static final Creator CREATOR = new rvl();
    private final rvj a;
    private final String b;
    private final String c;

    public rvk(rvj rvj, String str, String str2) {
        this.a = rvj;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, a);
    }
}
