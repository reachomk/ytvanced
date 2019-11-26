package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: pzq */
public final class pzq extends qou {
    public static final Creator CREATOR = new pzt();
    private final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    pzq(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public pzq(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b, i);
        qov.b(parcel, 3, this.c);
        qov.a(parcel, 4, this.d, i);
        qov.a(parcel, a);
    }
}
