package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: rvr */
public final class rvr extends qou implements rut {
    public static final Creator CREATOR = new rvo();
    private final String a;
    private final Integer b;

    public rvr(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, this.b);
        qov.a(parcel, i);
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rut)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rut rut = (rut) obj;
        return pzj.a(this.a, rut.a()) && pzj.a(this.b, rut.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
