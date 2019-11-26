package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: pid */
public final class pid extends qou {
    public static final Creator CREATOR = new piu();
    public int a;
    @Deprecated
    public String b;
    private final int c;
    private Account d;

    pid(int i, int i2, String str, Account account) {
        this.c = i;
        this.a = i2;
        this.b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    public pid() {
        this.c = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.c);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.d, i);
        qov.a(parcel, a);
    }
}
