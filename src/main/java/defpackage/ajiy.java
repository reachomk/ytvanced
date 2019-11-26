package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;

/* renamed from: ajiy */
public final class ajiy implements Parcelable {
    public static final Creator CREATOR = new ajjb();
    public static final ajiy a = new ajiy(34, 50, 95, true, false);
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ajiy(int i, int i2, int i3, boolean z, boolean z2) {
        boolean z3 = false;
        boolean z4 = i2 >= 0 && i2 <= 100;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("invalid anchorHorizontalPos: ");
        stringBuilder.append(i2);
        amqw.a(z4, stringBuilder.toString());
        if (i3 >= 0 && i3 <= 100) {
            z3 = true;
        }
        StringBuilder stringBuilder2 = new StringBuilder(38);
        stringBuilder2.append("invalid anchorVerticalPos: ");
        stringBuilder2.append(i3);
        amqw.a(z3, stringBuilder2.toString());
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "ap=%d, ah=%d, av=%d, vs=%b, sd=%b", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    /* synthetic */ ajiy(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        boolean z = true;
        boolean z2 = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this(readInt, readInt2, readInt3, z2, z);
    }
}
