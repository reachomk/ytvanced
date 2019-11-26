package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: phd */
public final class phd extends qou {
    public static final Creator CREATOR = new phz();
    private static final int a = Integer.parseInt("-1");
    private final String b;
    private final phh c;
    private final int d;
    private final byte[] e;

    phd(String str, phh phh, int i, byte[] bArr) {
        boolean z = true;
        if (i != a && phi.a(i) == null) {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder(32);
        String str2 = "Invalid section type ";
        stringBuilder.append(str2);
        stringBuilder.append(i);
        pzr.b(z, stringBuilder.toString());
        this.b = str;
        this.c = phh;
        this.d = i;
        this.e = bArr;
        String str3 = null;
        if (i != a && phi.a(this.d) == null) {
            int i2 = this.d;
            StringBuilder stringBuilder2 = new StringBuilder(32);
            stringBuilder2.append(str2);
            stringBuilder2.append(i2);
            str3 = stringBuilder2.toString();
        } else if (!(this.b == null || this.e == null)) {
            str3 = "Both content and blobContent set";
        }
        if (str3 != null) {
            throw new IllegalArgumentException(str3);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.b);
        qov.a(parcel, 3, this.c, i);
        qov.b(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, a);
    }

    static {
        phk phk = new phk("SsbContext");
        phk.b = "blob";
        String str = phk.a;
        String str2 = phk.b;
        int i = phk.c;
        List list = phk.d;
        phh phh = new phh(str, str2, true, i, false, null, (phg[]) list.toArray(new phg[list.size()]), null, null);
    }
}
