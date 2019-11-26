package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qeb */
public final class qeb extends qou {
    public static final Creator CREATOR = new qer();
    public int a;
    private int b;

    qeb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public qeb() {
        this(0, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, i);
    }
}
