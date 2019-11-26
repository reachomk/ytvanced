package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rzk */
public final class rzk extends qou {
    public static final Creator CREATOR = new rzn();
    public int a;
    public Account b;
    public Bundle c;
    public int d;
    public rzg e;
    private boolean f;
    private final int g;
    private double h;
    private double i;

    rzk(int i, Account account, Bundle bundle, boolean z, int i2, rzg rzg, int i3, double d, double d2) {
        this.f = false;
        this.a = i;
        this.b = account;
        this.c = bundle;
        this.f = z;
        this.d = i2;
        this.e = rzg;
        this.g = i3;
        this.h = d;
        this.i = d2;
    }

    rzk() {
        this.f = false;
        this.a = 1;
        this.d = 0;
        this.g = 0;
    }

    public static rzm a() {
        return new rzm(new rzk());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b, i);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.f);
        qov.b(parcel, 6, this.d);
        qov.a(parcel, 7, this.e, i);
        qov.b(parcel, 8, this.g);
        qov.a(parcel, 9, this.h);
        qov.a(parcel, 10, this.i);
        qov.a(parcel, a);
    }
}
