package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

/* renamed from: qaf */
public final class qaf implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pyt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        IBinder iBinder = str;
        Scope[] scopeArr = iBinder;
        Bundle bundle = scopeArr;
        Account account = bundle;
        psc[] pscArr = account;
        psc[] pscArr2 = pscArr;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel2, readInt);
                    break;
                case 2:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 3:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 4:
                    str = qot.j(parcel2, readInt);
                    break;
                case 5:
                    iBinder = qot.k(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) qot.b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) qot.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    pscArr = (psc[]) qot.b(parcel2, readInt, psc.CREATOR);
                    break;
                case 11:
                    pscArr2 = (psc[]) qot.b(parcel2, readInt, psc.CREATOR);
                    break;
                case 12:
                    z = qot.c(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new pyt(i, i2, i3, str, iBinder, scopeArr, bundle, account, pscArr, pscArr2, z);
    }
}
