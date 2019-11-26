package defpackage;

import android.os.Parcel;

/* renamed from: ajqb */
public final class ajqb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final String e;
    public final ajdv f;
    public final ajqd g;

    public ajqb(boolean z, boolean z2, boolean z3, long j, ajdv ajdv, ajqd ajqd, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.f = ajdv;
        this.g = ajqd;
        this.e = str;
    }

    private ajqb(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        boolean z = false;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.c = z;
        this.d = parcel.readLong();
        this.f = (ajdv) parcel.readParcelable(classLoader);
        this.g = (ajqd) parcel.readParcelable(classLoader);
        this.e = parcel.readString();
    }

    public static ajqb a(ajqb ajqb) {
        return ajqb != null ? new ajqb(false, ajqb.b, ajqb.c, ajqb.d, ajqb.f, ajqb.g, ajqb.e) : null;
    }

    static ajqb a(Parcel parcel) {
        return new ajqb(parcel);
    }

    public final void b(Parcel parcel) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.e);
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        long j = this.d;
        String valueOf = String.valueOf(this.f);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 141) + valueOf.length());
        stringBuilder.append("VideoState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" playOnResume=");
        stringBuilder.append(z);
        stringBuilder.append(" wasEnded=");
        stringBuilder.append(z2);
        stringBuilder.append(" restoreFromBackStack=");
        stringBuilder.append(z3);
        stringBuilder.append(" videoPositionMillis=");
        stringBuilder.append(j);
        stringBuilder.append(" playbackClientMangerState=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajqb) {
            ajqb ajqb = (ajqb) obj;
            return this.a == ajqb.a && this.b == ajqb.b && this.c == ajqb.c && this.d == ajqb.d;
        }
    }

    public final int hashCode() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        long j = this.d;
        return ((((((((((z + 527) * 31) + z2) * 31) + z3) * 31) + ((int) (j >> 32))) * 31) + ((int) j)) * 31) + this.e.hashCode();
    }
}
