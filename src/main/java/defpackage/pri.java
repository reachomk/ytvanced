package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: pri */
public final class pri extends qou {
    public static final Creator CREATOR = new psb();
    public final prn a;
    public byte[] b;
    public final rjx c;
    public final pre d;
    public final pre e;
    private final int[] f;
    private final String[] g;
    private final int[] h;
    private final byte[][] i;
    private final rvw[] j;
    private final boolean k;

    public pri(prn prn, rjx rjx, pre pre, pre pre2, int[] iArr, int[] iArr2, boolean z) {
        this.a = prn;
        this.c = rjx;
        this.d = pre;
        this.e = pre2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = z;
    }

    pri(prn prn, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, rvw[] rvwArr) {
        this.a = prn;
        this.b = bArr;
        this.f = iArr;
        this.g = strArr;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = iArr2;
        this.i = bArr2;
        this.j = rvwArr;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pri) {
            pri pri = (pri) obj;
            return pzj.a(this.a, pri.a) && Arrays.equals(this.b, pri.b) && Arrays.equals(this.f, pri.f) && Arrays.equals(this.g, pri.g) && pzj.a(this.c, pri.c) && pzj.a(this.d, pri.d) && pzj.a(this.e, pri.e) && Arrays.equals(this.h, pri.h) && Arrays.deepEquals(this.i, pri.i) && Arrays.equals(this.j, pri.j) && this.k == pri.k;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, this.d, this.e, this.h, this.i, this.j, Boolean.valueOf(this.k)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.a);
        stringBuilder.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        stringBuilder.append(bArr != null ? new String(bArr) : null);
        stringBuilder.append(", TestCodes: ");
        stringBuilder.append(Arrays.toString(this.f));
        stringBuilder.append(", MendelPackages: ");
        stringBuilder.append(Arrays.toString(this.g));
        stringBuilder.append(", LogEvent: ");
        stringBuilder.append(this.c);
        stringBuilder.append(", ExtensionProducer: ");
        stringBuilder.append(this.d);
        stringBuilder.append(", VeProducer: ");
        stringBuilder.append(this.e);
        stringBuilder.append(", ExperimentIDs: ");
        stringBuilder.append(Arrays.toString(this.h));
        stringBuilder.append(", ExperimentTokens: ");
        stringBuilder.append(Arrays.toString(this.i));
        stringBuilder.append(", ExperimentTokensParcelables: ");
        stringBuilder.append(Arrays.toString(this.j));
        stringBuilder.append(", AddPhenotypeExperimentTokens: ");
        stringBuilder.append(this.k);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.f);
        qov.a(parcel, 5, this.g);
        qov.a(parcel, 6, this.h);
        qov.a(parcel, 7, this.i);
        qov.a(parcel, 8, this.k);
        qov.a(parcel, 9, this.j, i);
        qov.a(parcel, a);
    }
}
