package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ngr */
public final class ngr implements ngn {
    public static final Creator CREATOR = new ngu();
    public final int a;

    public ngr(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngr) {
            if (this.a == ((ngr) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final ngq a() {
        return ngq.ERROR_DATA;
    }

    public final String toString() {
        String obj = super.toString();
        int i = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 24);
        stringBuilder.append(obj);
        stringBuilder.append(" ERROR_TYPE: ");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
