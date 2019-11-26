package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qou;
import defpackage.qov;
import defpackage.rzk;
import defpackage.rzo;
import defpackage.rzq;

public final class BuyFlowConfig extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new rzq();
    public String a;
    public rzk b;
    public String c;
    public String d;
    private String e;

    public static rzo a() {
        return new rzo(new BuyFlowConfig());
    }

    public BuyFlowConfig(String str, rzk rzk, String str2, String str3, String str4) {
        this.a = str;
        this.b = rzk;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    BuyFlowConfig() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b, i);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, a);
    }
}
