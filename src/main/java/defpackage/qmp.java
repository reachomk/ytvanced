package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: qmp */
public final class qmp extends qou {
    public static final Creator CREATOR = new qms();
    public String a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;

    public qmp() {
        "0".length();
        this("afma-sdk-a-v13280009.13280009.0", 13280009, 13280009, true, false);
    }

    qmp(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, i);
    }
}
