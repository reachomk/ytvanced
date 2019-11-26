package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rwa */
public final class rwa extends qou implements Comparable {
    public static final Creator CREATOR = new rxq();
    private final int a;
    private final int b;

    public rwa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GenericDimension");
        stringBuilder.append("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rwa) && a((rwa) obj) == 0) {
            return true;
        }
        return false;
    }

    private final int a(rwa rwa) {
        int i = this.a;
        int i2 = rwa.a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        i = this.b;
        int i3 = rwa.b;
        if (i < i3) {
            return -1;
        }
        if (i <= i3) {
            return 0;
        }
        return 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, i);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return a((rwa) obj);
    }
}
