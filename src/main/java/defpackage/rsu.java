package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: rsu */
public final class rsu extends qou {
    public static final Creator CREATOR = new rtg();
    private final byte[] a;
    private final long b;
    private final String c;

    public rsu(byte[] bArr, long j, String str) {
        this.a = bArr;
        this.b = j;
        this.c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsu)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rsu rsu = (rsu) obj;
        return Arrays.equals(this.a, rsu.a) && pzj.a(Long.valueOf(this.b), Long.valueOf(rsu.b)) && pzj.a(this.c, rsu.c);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(new Object[]{Long.valueOf(this.b), this.c});
    }

    static {
        rsu rsu = new rsu(null, Long.MIN_VALUE, null);
    }
}
