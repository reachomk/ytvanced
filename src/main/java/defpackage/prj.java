package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: prj */
public final class prj extends qou {
    public static final Creator CREATOR = new pry();
    private final boolean a;
    private final long b;
    private final long c;

    public prj(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof prj) {
            prj prj = (prj) obj;
            return this.a == prj.a && this.b == prj.b && this.c == prj.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        stringBuilder.append(this.a);
        stringBuilder.append(",collectForDebugStartTimeMillis: ");
        stringBuilder.append(this.b);
        stringBuilder.append(",collectForDebugExpiryTimeMillis: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, 2, this.c);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, i);
    }
}
