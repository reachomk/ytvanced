package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: ouq */
public class ouq implements Parcelable {
    public static final Creator CREATOR = new oup();
    public static final ouq v = new ouq();
    public final String w;
    public final String x;
    public final boolean y;
    public final int z;

    ouq() {
        this(null, null, false, 0);
    }

    public int describeContents() {
        return 0;
    }

    ouq(String str, String str2, boolean z, int i) {
        this.w = ozp.b(str);
        this.x = ozp.b(str2);
        this.y = z;
        this.z = i;
    }

    ouq(Parcel parcel) {
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = ozp.a(parcel);
        this.z = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ouq ouq = (ouq) obj;
            return TextUtils.equals(this.w, ouq.w) && TextUtils.equals(this.x, ouq.x) && this.y == ouq.y && this.z == ouq.z;
        }
    }

    public int hashCode() {
        String str = this.w;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.x;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.y) * 31) + this.z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        ozp.a(parcel, this.y);
        parcel.writeInt(this.z);
    }
}
