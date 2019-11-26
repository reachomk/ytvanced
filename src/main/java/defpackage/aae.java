package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aae */
public class aae implements Parcelable {
    public static final Creator CREATOR = new aag();
    public static final aae f = new aah();
    public final Parcelable g;

    private aae() {
        this.g = null;
    }

    public final int describeContents() {
        return 0;
    }

    protected aae(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f) {
                parcelable = null;
            }
            this.g = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected aae(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f;
        }
        this.g = readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.g, i);
    }
}
