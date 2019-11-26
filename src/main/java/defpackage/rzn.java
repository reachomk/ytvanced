package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rzn */
public final class rzn implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rzk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        double d = 0.0d;
        double d2 = d;
        Account account = null;
        Bundle bundle = account;
        rzg rzg = bundle;
        int i = 1;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = qot.d(parcel2, readInt);
                    break;
                case 3:
                    account = (Account) qot.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case 5:
                    z = qot.c(parcel2, readInt);
                    break;
                case 6:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 7:
                    rzg = (rzg) qot.a(parcel2, readInt, rzg.CREATOR);
                    break;
                case 8:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 9:
                    d = qot.i(parcel2, readInt);
                    break;
                case 10:
                    d2 = qot.i(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new rzk(i, account, bundle, z, i2, rzg, i3, d, d2);
    }
}
