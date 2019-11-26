package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aagv */
public final class aagv implements afnt, Parcelable {
    public static final Creator CREATOR = new aagu();
    public static final aagx d = new aagx();
    public final int a;
    public final boolean b;
    public final Uri c;

    public aagv(int i, boolean z, Uri uri) {
        this.a = i;
        this.b = z;
        this.c = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final int a(int i) {
        if (this.b) {
            return ((this.a * i) * 1000) / 100;
        }
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, 0);
    }

    public final int hashCode() {
        return ((((((getClass().hashCode() + 527) * 31) + this.a) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aagv) {
            aagv aagv = (aagv) obj;
            if (this.a == aagv.a && amqq.a(Boolean.valueOf(this.b), Boolean.valueOf(aagv.b)) && amqq.a(this.c, aagv.c)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ afns c() {
        return new aagx(this);
    }
}
