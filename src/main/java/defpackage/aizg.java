package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aizg */
public final class aizg implements aizu {
    public static final Creator CREATOR = new aizj();
    public final String a;
    public final aafv b;
    public final boolean c;
    public final boolean d;

    public aizg(String str, aafv aafv, boolean z, boolean z2) {
        this.a = str;
        this.b = aafv;
        this.c = z;
        this.d = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public aizg(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readString();
        this.b = (aafv) parcel.readParcelable(classLoader);
        boolean z = false;
        this.c = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
