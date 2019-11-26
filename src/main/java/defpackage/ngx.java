package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ngx */
public final class ngx implements Parcelable {
    public static final Creator CREATOR = new nha();
    public final boolean a;
    public final int b;
    public final aiqq c;

    public ngx(int i, aiqq aiqq, boolean z) {
        this.b = i;
        this.c = aiqq;
        this.a = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c != null ? 1 : 0);
        aiqq aiqq = this.c;
        if (aiqq != null) {
            parcel.writeParcelable(aiqq, i);
        }
        parcel.writeInt(this.a);
    }
}
