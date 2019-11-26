package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: rvu */
public final class rvu extends qou {
    public static final Creator CREATOR = new rxe();
    public final String a;
    public final String b;
    public final rvs[] c;
    private final byte[] d;
    private final Map e = new TreeMap();
    private final boolean f;
    private final long g;

    public rvu(String str, String str2, rvs[] rvsArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.b = str2;
        this.c = rvsArr;
        this.f = z;
        this.d = bArr;
        this.g = j;
        for (rvs rvs : rvsArr) {
            this.e.put(Integer.valueOf(rvs.a), rvs);
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder stringBuilder = new StringBuilder("Configurations('");
        stringBuilder.append(this.a);
        stringBuilder.append("', '");
        stringBuilder.append(this.b);
        stringBuilder.append("', (");
        Iterator it = this.e.values().iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            stringBuilder.append((rvs) it.next());
            stringBuilder.append(str);
        }
        stringBuilder.append("), ");
        stringBuilder.append(this.f);
        stringBuilder.append(str);
        byte[] bArr = this.d;
        if (bArr == null) {
            str2 = "null";
        } else {
            str2 = Base64.encodeToString(bArr, 3);
        }
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append(this.g);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rvu) {
            rvu rvu = (rvu) obj;
            if (rwh.a(this.a, rvu.a) && rwh.a(this.b, rvu.b) && this.e.equals(rvu.e) && this.f == rvu.f && Arrays.equals(this.d, rvu.d) && this.g == rvu.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.e, Boolean.valueOf(this.f), this.d, Long.valueOf(this.g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c, i);
        qov.a(parcel, 5, this.f);
        qov.a(parcel, 6, this.d);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, a);
    }
}
