package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: omq */
public final class omq extends omp {
    public static final Creator CREATOR = new omt();
    public final int a;
    public final int b;
    public final int[] c;
    public final int[] e;
    private final int f;

    public omq(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f = i;
        this.a = i2;
        this.b = i3;
        this.c = iArr;
        this.e = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    omq(Parcel parcel) {
        super("MLLT");
        this.f = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = (int[]) ozp.a(parcel.createIntArray());
        this.e = (int[]) ozp.a(parcel.createIntArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omq omq = (omq) obj;
            return this.f == omq.f && this.a == omq.a && this.b == omq.b && Arrays.equals(this.c, omq.c) && Arrays.equals(this.e, omq.e);
        }
    }

    public final int hashCode() {
        return ((((((((this.f + 527) * 31) + this.a) * 31) + this.b) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.e);
    }
}
