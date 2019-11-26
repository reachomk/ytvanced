package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: utd */
final class utd extends usn {
    public static final Creator CREATOR = new utg();

    utd(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        super(str, str2, str3, z, z2, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
