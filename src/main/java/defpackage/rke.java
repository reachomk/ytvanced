package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rke */
public final class rke extends riy implements rkc {
    rke(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle a(String str, Bundle bundle) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        Parcel a = a(2, aX_);
        bundle = (Bundle) rjz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final pig a(pid pid) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) pid);
        Parcel a = a(3, aX_);
        pig pig = (pig) rjz.a(a, pig.CREATOR);
        a.recycle();
        return pig;
    }

    public final Bundle a(Account account, String str, Bundle bundle) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) account);
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        Parcel a = a(5, aX_);
        Bundle bundle2 = (Bundle) rjz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
