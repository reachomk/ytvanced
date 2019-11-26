package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: rqr */
public final class rqr extends qou {
    public static final Creator CREATOR = new rsh();
    private final int a;
    private final int b;
    private final long c;
    private final long d;

    rqr(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            rqr rqr = (rqr) obj;
            return this.a == rqr.a && this.b == rqr.b && this.c == rqr.c && this.d == rqr.d;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkLocationStatus:");
        stringBuilder.append(" Wifi status: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" Cell status: ");
        stringBuilder.append(this.b);
        stringBuilder.append(" elapsed time NS: ");
        stringBuilder.append(this.d);
        stringBuilder.append(" system time ms: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}
