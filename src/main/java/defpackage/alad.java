package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: alad */
public final class alad implements Parcelable {
    public static final Creator CREATOR = new alac();
    public final int a;
    public final acwc b;
    public final acwc c;

    public alad(int i, acwc acwc, acwc acwc2) {
        this.a = i;
        this.b = acwc;
        this.c = acwc2;
    }

    public final int describeContents() {
        return 0;
    }

    protected alad(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = acwc.a(parcel.readString());
        this.c = acwc.a(parcel.readString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
    }
}
