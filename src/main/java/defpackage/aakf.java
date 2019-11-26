package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aakf */
public final class aakf implements Parcelable, Comparable {
    public static final Creator CREATOR = new aake();
    public final anvu a;
    public final int b;

    public aakf(awek awek) {
        this.a = awek.b;
        this.b = awek.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aakf aakf = (aakf) obj;
        int i = this.b;
        int i2 = aakf.b;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        } else {
            return 0;
        }
    }
}
