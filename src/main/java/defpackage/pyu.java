package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pyu */
public final class pyu extends qou {
    public static final Creator CREATOR = new qab();
    public Bundle a;
    public psc[] b;

    pyu(Bundle bundle, psc[] pscArr) {
        this.a = bundle;
        this.b = pscArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, 2, this.b, i);
        qov.a(parcel, a);
    }
}
