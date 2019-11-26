package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;

/* renamed from: baim */
public final class baim implements Parcelable {
    public static final Creator CREATOR = new baip();
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public baim() {
        this.a = true;
        this.d = true;
    }

    public final int describeContents() {
        return 0;
    }

    public baim(int i) {
        if ((i & 1) != 0) {
            this.a = true;
        }
        if ((i & 2) != 0) {
            this.d = true;
        }
        if ((i & 4) != 0) {
            this.b = true;
        }
        if ((i & 8) != 0) {
            this.c = true;
        }
        if ((i & 16) != 0) {
            this.e = true;
        }
    }

    protected baim(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readInt() != 0;
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.e = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public final String toString() {
        return String.format(Locale.US, "ori=%b, gyro=%b, accel=%b, touch=%b, gestures=%b", new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }
}
