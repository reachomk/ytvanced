package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: adjb */
public final class adjb extends adjf implements Parcelable {
    public static final Creator CREATOR = new adje();

    public adjb(String str) {
        super(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
