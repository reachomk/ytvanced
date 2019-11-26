package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: olq */
public final class olq implements oll {
    public static final Creator CREATOR = new olt();
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final byte[] e;
    private int f;

    public olq(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    olq(Parcel parcel) {
        this.a = (String) ozp.a(parcel.readString());
        this.b = (String) ozp.a(parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) ozp.a(parcel.createByteArray());
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int i2 = 0;
        i = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.c;
        long j2 = this.d;
        i = ((((((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.e);
        this.f = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            olq olq = (olq) obj;
            return this.c == olq.c && this.d == olq.d && ozp.a(this.a, olq.a) && ozp.a(this.b, olq.b) && Arrays.equals(this.e, olq.e);
        }
    }

    public final String toString() {
        String str = this.a;
        long j = this.d;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(str2).length());
        stringBuilder.append("EMSG: scheme=");
        stringBuilder.append(str);
        stringBuilder.append(", id=");
        stringBuilder.append(j);
        stringBuilder.append(", value=");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }
}
