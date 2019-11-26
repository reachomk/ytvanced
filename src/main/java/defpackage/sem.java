package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: sem */
public final class sem implements Parcelable {
    public static final Creator CREATOR = new sep();
    public final int a;
    public final int b;
    public final Bitmap c;
    public final boolean d;
    public final boolean e;
    public final Bitmap f;
    public final String g;
    public final PendingIntent h;
    public final boolean i;

    protected sem(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean z = false;
        this.d = parcel.readInt() == 1;
        this.e = parcel.readInt() == 1;
        this.f = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.g = parcel.readString();
        this.h = (PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader());
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.i = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i);
    }
}
