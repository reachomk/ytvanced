package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: omc */
public final class omc extends omp {
    public static final Creator CREATOR = new omf();
    private final String a;
    private final int b;
    private final int c;
    private final long e;
    private final long f;
    private final omp[] g;

    public omc(String str, int i, int i2, long j, long j2, omp[] ompArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.e = j;
        this.f = j2;
        this.g = ompArr;
    }

    public final int describeContents() {
        return 0;
    }

    omc(Parcel parcel) {
        super("CHAP");
        this.a = (String) ozp.a(parcel.readString());
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new omp[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (omp) parcel.readParcelable(omp.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omc omc = (omc) obj;
            return this.b == omc.b && this.c == omc.c && this.e == omc.e && this.f == omc.f && ozp.a(this.a, omc.a) && Arrays.equals(this.g, omc.g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.b + 527) * 31) + this.c) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (Parcelable writeParcelable : this.g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
