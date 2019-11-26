package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qaq */
public final class qaq extends riy implements pyy {
    qaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account a() {
        Parcel a = a(2, aX_());
        Account account = (Account) rjz.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
