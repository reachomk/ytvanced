package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: poi */
public final class poi extends qou {
    public static final Creator CREATOR = new pou();
    public String a;

    poi(String str) {
        this.a = str;
    }

    public poi() {
        this(null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof poi)) {
            return false;
        }
        return ppj.a(this.a, ((poi) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
