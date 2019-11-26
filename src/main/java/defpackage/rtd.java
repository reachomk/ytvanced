package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: rtd */
public final class rtd extends qou {
    public static final Creator CREATOR = new rtp();
    private final int a;
    private final int b;

    rtd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rtd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rtd rtd = (rtd) obj;
        return pzj.a(Integer.valueOf(this.a), Integer.valueOf(rtd.a)) && pzj.a(Integer.valueOf(this.b), Integer.valueOf(rtd.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, i);
    }
}
