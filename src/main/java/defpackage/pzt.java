package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: pzt */
public final class pzt implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pzq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                account = (Account) qot.a(parcel, readInt, Account.CREATOR);
            } else if (c == 3) {
                i2 = qot.d(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) qot.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new pzq(i, account, i2, googleSignInAccount);
    }
}
