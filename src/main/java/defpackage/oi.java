package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: oi */
final class oi implements Parcelable {
    public static final Creator CREATOR = new ol();
    public ArrayList a;
    public ArrayList b;
    public nb[] c;
    public String d = null;
    public int e;

    public final int describeContents() {
        return 0;
    }

    public oi(Parcel parcel) {
        this.a = parcel.createTypedArrayList(om.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (nb[]) parcel.createTypedArray(nb.CREATOR);
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
