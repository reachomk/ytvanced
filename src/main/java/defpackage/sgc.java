package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: sgc */
public final class sgc implements Parcelable {
    public static final Creator CREATOR = new sgb();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    sgc(ansp ansp) {
        this.a = ansp.b;
        this.b = ansp.a;
        this.c = ansp.c;
        this.d = ansp.d;
        this.e = ansp.e;
    }

    public final int describeContents() {
        return 0;
    }

    protected sgc(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
