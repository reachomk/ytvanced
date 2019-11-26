package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: fiu */
public final class fiu implements Parcelable {
    public static final Creator CREATOR = new fit();
    public final fiw a;
    public final nl b;
    public final Object c;
    public final String d;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.d);
    }

    /* synthetic */ fiu(fiw fiw, nl nlVar, Object obj, String str) {
        this.a = fiw;
        this.b = nlVar;
        this.c = obj;
        this.d = str;
    }

    /* synthetic */ fiu(Parcel parcel) {
        this.a = (fiw) parcel.readParcelable(fiw.class.getClassLoader());
        this.b = (nl) parcel.readParcelable(nl.class.getClassLoader());
        this.c = null;
        this.d = parcel.readString();
    }
}
