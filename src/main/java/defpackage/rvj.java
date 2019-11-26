package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: rvj */
public final class rvj extends qou implements Parcelable {
    public static final Creator CREATOR = new rvg();
    private final Integer a;
    private final Boolean b;

    public rvj(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, this.a);
        Boolean bool = this.b;
        if (bool != null) {
            qov.a(parcel, 4, 4);
            parcel.writeInt(bool.booleanValue());
        }
        qov.a(parcel, i);
    }
}
