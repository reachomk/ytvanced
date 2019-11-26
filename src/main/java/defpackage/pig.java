package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: pig */
public final class pig extends qou {
    public static final Creator CREATOR = new pit();
    public final List a;
    private final int b;

    pig(int i, List list) {
        this.b = i;
        this.a = (List) pzr.a((Object) list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.b);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
