package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: qlc */
public final class qlc extends qou {
    public static final Creator CREATOR = new qlb();
    private final int a;
    private final int b;
    private final int c;

    public static qlc a(qmx qmx) {
        return new qlc(qmx.a, qmx.b, qmx.c);
    }

    qlc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.b(parcel, 3, this.c);
        qov.a(parcel, i);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append(i);
        String str = ".";
        stringBuilder.append(str);
        stringBuilder.append(i2);
        stringBuilder.append(str);
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
