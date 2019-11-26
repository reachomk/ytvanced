package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: psc */
public final class psc extends qou {
    public static final Creator CREATOR = new qbn();
    public final String a;
    @Deprecated
    private final int b;
    private final long c;

    public psc(String str) {
        this.a = str;
        this.c = 1;
        this.b = -1;
    }

    public psc(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, 3, a());
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof psc) {
            psc psc = (psc) obj;
            String str = this.a;
            if (((str != null && str.equals(psc.a)) || (this.a == null && psc.a == null)) && a() == psc.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("name", this.a);
        a.a("version", Long.valueOf(a()));
        return a.toString();
    }
}
