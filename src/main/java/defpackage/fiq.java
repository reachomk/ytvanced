package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: fiq */
public final class fiq implements Parcelable {
    public static final Creator CREATOR = new fip();
    public final int a;
    public final fis b;
    public fiw c;
    public fiw d;

    fiq(int i) {
        this.a = i;
        this.b = new fis();
        this.c = null;
        this.d = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
