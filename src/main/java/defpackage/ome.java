package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ome */
public final class ome extends omp {
    public static final Creator CREATOR = new omh();
    private final String a;
    private final boolean b;
    private final boolean c;
    private final String[] e;
    private final omp[] f;

    public ome(String str, boolean z, boolean z2, String[] strArr, omp[] ompArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.e = strArr;
        this.f = ompArr;
    }

    ome(Parcel parcel) {
        super("CTOC");
        this.a = (String) ozp.a(parcel.readString());
        boolean z = true;
        this.b = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.c = z;
        this.e = (String[]) ozp.a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f = new omp[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (omp) parcel.readParcelable(omp.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ome ome = (ome) obj;
            return this.b == ome.b && this.c == ome.c && ozp.a(this.a, ome.a) && Arrays.equals(this.e, ome.e) && Arrays.equals(this.f, ome.f);
        }
    }

    public final int hashCode() {
        int i = (((this.b + 527) * 31) + this.c) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b);
        parcel.writeByte(this.c);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        for (Parcelable writeParcelable : this.f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
