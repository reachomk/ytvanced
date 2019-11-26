package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: rvs */
public final class rvs extends qou implements Comparable {
    public static final Creator CREATOR = new rxf();
    public final int a;
    public final rvz[] b;
    public final String[] c;
    private final Map d = new TreeMap();

    public rvs(int i, rvz[] rvzArr, String[] strArr) {
        this.a = i;
        this.b = rvzArr;
        for (rvz rvz : rvzArr) {
            this.d.put(rvz.a, rvz);
        }
        this.c = strArr;
        String[] strArr2 = this.c;
        if (strArr2 != null) {
            Arrays.sort(strArr2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.a);
        stringBuilder.append(", (");
        Iterator it = this.d.values().iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            stringBuilder.append((rvz) it.next());
            stringBuilder.append(str);
        }
        stringBuilder.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String append : strArr) {
                stringBuilder.append(append);
                stringBuilder.append(str);
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append("))");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rvs) {
            rvs rvs = (rvs) obj;
            if (this.a == rvs.a && rwh.a(this.d, rvs.d) && Arrays.equals(this.c, rvs.c)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b, i);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((rvs) obj).a;
    }
}
