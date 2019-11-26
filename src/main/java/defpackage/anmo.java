package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: anmo */
public final class anmo extends qou {
    public static final Creator CREATOR = new anmr();
    private final int a;
    private final Thing[] b;
    private final String[] c;
    private final String[] d;

    anmo(int i, Thing[] thingArr, String[] strArr, String[] strArr2) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6)) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b, i);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, a);
    }
}
