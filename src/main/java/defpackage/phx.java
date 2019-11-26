package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: phx */
public final class phx implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        phd[] phdArr = null;
        String str = null;
        Account account = str;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                phdArr = (phd[]) qot.b(parcel, readInt, phd.CREATOR);
            } else if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                z = qot.c(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                account = (Account) qot.a(parcel, readInt, Account.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new phb(phdArr, str, z, account);
    }
}
