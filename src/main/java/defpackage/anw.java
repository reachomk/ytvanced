package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: anw */
public final class anw implements Parcelable {
    public static final Creator CREATOR = new anv();
    public int a;
    public int b;
    public boolean c;

    public final int describeContents() {
        return 0;
    }

    anw(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.c = z;
    }

    public anw(anw anw) {
        this.a = anw.a;
        this.b = anw.b;
        this.c = anw.c;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a >= 0;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.a = -1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
