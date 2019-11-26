package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omy */
public final class omy extends ona {
    public static final Creator CREATOR = new onb();
    private final long a;
    private final long b;
    private final byte[] c;

    private omy(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    static omy a(oza oza, int i, long j) {
        long i2 = oza.i();
        byte[] bArr = new byte[(i - 4)];
        oza.a(bArr, 0, bArr.length);
        return new omy(i2, bArr, j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }

    /* synthetic */ omy(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = new byte[parcel.readInt()];
        parcel.readByteArray(this.c);
    }
}
