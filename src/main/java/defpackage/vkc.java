package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: vkc */
public final class vkc implements Parcelable {
    public static final Creator CREATOR = new vkf();
    public static final vkc a = new vkc(0, 0);
    public long b;
    public long c;

    public vkc(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public vkc(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("[");
        stringBuilder.append(j);
        stringBuilder.append(", ");
        stringBuilder.append(j2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            vkc vkc = (vkc) obj;
            if (this.b == vkc.b && this.c == vkc.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c)});
    }
}
