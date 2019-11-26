package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: rno */
public final class rno extends qou {
    public static final Creator CREATOR = new rnn();
    private final String a;

    rno(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 15, this.a);
        qov.a(parcel, i);
    }
}
