package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aqb */
public final class aqb extends aae {
    public static final Creator CREATOR = new aqa();
    public Parcelable a;

    aqb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = apn.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader);
    }

    public aqb(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }
}
