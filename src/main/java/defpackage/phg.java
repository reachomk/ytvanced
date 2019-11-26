package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: phg */
public final class phg extends qou {
    public static final Creator CREATOR = new pic();
    private final int a;
    private final Bundle b;

    phg(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                arrayList.add(this.b.getString(str));
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phg) {
            phg phg = (phg) obj;
            if (this.a == phg.a) {
                Bundle bundle = this.b;
                if (bundle == null) {
                    return phg.b == null;
                } else {
                    if (phg.b != null && bundle.size() == phg.b.size()) {
                        for (String str : this.b.keySet()) {
                            if (phg.b.containsKey(str)) {
                                if (!pzj.a(this.b.getString(str), phg.b.getString(str))) {
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
