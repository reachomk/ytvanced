package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: phb */
public final class phb extends qou {
    public static final Creator CREATOR = new phx();
    private final phd[] a;
    private final String b;
    private final boolean c;
    private final Account d;

    phb(phd[] phdArr, String str, boolean z, Account account) {
        this.a = phdArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a, i);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d, i);
        qov.a(parcel, a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof phb) {
            phb phb = (phb) obj;
            if (pzj.a(this.b, phb.b) && pzj.a(Boolean.valueOf(this.c), Boolean.valueOf(phb.c)) && pzj.a(this.d, phb.d) && Arrays.equals(this.a, phb.a)) {
                return true;
            }
        }
        return false;
    }
}
