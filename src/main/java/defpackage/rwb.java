package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rwb */
public final class rwb extends qou {
    public static final Creator CREATOR = new rxr();
    private final List a;

    public rwb(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwb)) {
            return false;
        }
        return this.a.equals(((rwb) obj).a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlagOverrides(");
        Object obj = 1;
        for (rvy rvy : this.a) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            rvy.a(stringBuilder);
            obj = null;
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
