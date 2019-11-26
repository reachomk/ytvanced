package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qgl */
public final class qgl extends qou {
    public static final Creator CREATOR = new qgk();
    private final int a;
    private final String b;
    private final Intent c;

    public qgl(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c, i);
        qov.a(parcel, a);
    }
}
