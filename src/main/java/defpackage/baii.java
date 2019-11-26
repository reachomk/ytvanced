package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: baii */
public final class baii extends baig {
    public static final Creator CREATOR = new bail();
    public static ArrayDeque l = new ArrayDeque();
    public static Object m = new Object();
    public int n;
    public baiq[] o = new baiq[16];
    public boolean p;
    public baid q = new baid();
    public long r;
    public int s;
    public final baje[] t = new baje[16];

    public baii() {
        for (int i = 0; i < 16; i++) {
            this.o[i] = new baiq();
            this.t[i] = new baje();
        }
        a();
    }

    public final int describeContents() {
        return 0;
    }

    public final void a() {
        super.a();
        this.n = 0;
        this.s = 0;
        this.p = false;
        this.r = 0;
    }

    public final void a(int i) {
        super.a(i);
        baig.a(i, this.n, this.o);
        this.q.e = i;
        baig.a(i, this.s, this.t);
    }

    public final void b() {
        a();
        synchronized (m) {
            if (!l.contains(this)) {
                l.add(this);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        int dataPosition = parcel.dataPosition();
        int i3 = 24;
        for (i2 = 0; i2 < this.c; i2++) {
            i3 += 24;
        }
        for (i2 = 0; i2 < this.e; i2++) {
            i3 += 20;
        }
        for (i2 = 0; i2 < this.f; i2++) {
            i3 += 24;
        }
        for (i2 = 0; i2 < this.h; i2++) {
            i3 += 28;
        }
        for (i2 = 0; i2 < this.j; i2++) {
            i3 += 28;
        }
        i3 += 8;
        for (i2 = 0; i2 < this.n; i2++) {
            i3 += 24;
        }
        i3 += 4;
        if (this.p) {
            i3 += 20;
        }
        i3 += 12;
        for (i2 = 0; i2 < this.s; i2++) {
            i3 += baje.a();
        }
        parcel.writeInt(i3);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n);
        for (i2 = 0; i2 < this.n; i2++) {
            this.o[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.p);
        if (this.p) {
            this.q.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.r);
        parcel.writeInt(this.s);
        for (int i4 = 0; i4 < this.s; i4++) {
            this.t[i4].writeToParcel(parcel, i);
        }
        if (parcel.dataPosition() - dataPosition != i3) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public final void a(Parcel parcel) {
        int readInt;
        int dataPosition = parcel.dataPosition() + parcel.readInt();
        super.a(parcel);
        if (parcel.dataPosition() < dataPosition) {
            readInt = parcel.readInt();
            this.n = readInt;
            baig.c(readInt);
            for (readInt = 0; readInt < this.n; readInt++) {
                this.o[readInt].a(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            boolean z = parcel.readInt() != 0;
            this.p = z;
            if (z) {
                this.q.a(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            this.r = parcel.readLong();
        }
        if (parcel.dataPosition() < dataPosition) {
            readInt = parcel.readInt();
            this.s = readInt;
            baig.c(readInt);
            for (int i = 0; i < this.s; i++) {
                this.t[i].a(parcel);
            }
        }
        parcel.setDataPosition(dataPosition);
    }

    public static long c() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
