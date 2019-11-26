package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baio */
public final class baio extends baih {
    public static final Creator CREATOR = new bair();
    public float a;
    public float b;
    public float c;
    public float f;

    public final int describeContents() {
        return 0;
    }

    public baio(Parcel parcel) {
        a(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f);
    }

    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
    }
}
