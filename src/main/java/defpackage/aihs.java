package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aihs */
public final class aihs implements Parcelable {
    public static final Creator CREATOR = new aihr();
    public final long a;
    private final long b;

    public aihs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            aihs aihs = (aihs) obj;
            if (this.a == aihs.a && this.b == aihs.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((this.a * 31) + this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
