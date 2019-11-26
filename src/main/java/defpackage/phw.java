package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: phw */
public final class phw extends qou {
    public static final Creator CREATOR = new phv();
    private final boolean a;

    public phw(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phw)) {
            return false;
        }
        return this.a == ((phw) obj).a;
    }
}
