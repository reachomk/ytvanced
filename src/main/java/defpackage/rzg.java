package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rzg */
public final class rzg extends qou {
    public static final Creator CREATOR = new rzl();
    public int a;
    private final Bundle b;
    private final String c;

    public rzg() {
        this.a = 0;
        this.b = new Bundle();
        this.c = "";
    }

    rzg(int i, Bundle bundle, String str) {
        this.b = bundle;
        this.a = i;
        this.c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, i);
    }
}
