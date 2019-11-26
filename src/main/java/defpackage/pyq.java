package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pyq */
public final class pyq extends qou {
    public static final Creator CREATOR = new pzz();
    private final int a;
    private final String b;

    public pyq(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof pyq)) {
            pyq pyq = (pyq) obj;
            return pyq.a == this.a && pzj.a(pyq.b, this.b);
        }
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, i);
    }
}
