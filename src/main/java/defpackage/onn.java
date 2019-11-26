package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: onn */
public final class onn extends ona {
    public static final Creator CREATOR = new onm();
    private final long a;
    private final long b;

    public onn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static long a(oza oza, long j) {
        long d = (long) oza.d();
        return (128 & d) != 0 ? 8589934591L & ((((d & 1) << 32) | oza.i()) + j) : -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    /* synthetic */ onn(long j, long j2, byte b) {
        this(j, j2);
    }
}
