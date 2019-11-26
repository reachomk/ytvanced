package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: piu */
public final class piu implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pid[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        String str = null;
        Account account = str;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                i2 = qot.d(parcel, readInt);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                account = (Account) qot.a(parcel, readInt, Account.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new pid(i, i2, str, account);
    }
}
