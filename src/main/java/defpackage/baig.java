package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayDeque;

@Deprecated
/* renamed from: baig */
public class baig implements Parcelable {
    public static final Creator CREATOR = new baij();
    public static ArrayDeque a = new ArrayDeque();
    public static Object b = new Object();
    public int c;
    public baib[] d = new baib[16];
    public int e;
    public int f;
    public baik[] g = new baik[16];
    public int h;
    public baio[] i = new baio[16];
    public int j;
    public bajc[] k = new bajc[16];
    private baif[] l = new baif[16];

    public baig() {
        for (int i = 0; i < 16; i++) {
            this.d[i] = new baib();
            this.l[i] = new baif();
            this.g[i] = new baik();
            this.i[i] = new baio();
            this.k[i] = new bajc();
        }
        a();
    }

    public int describeContents() {
        return 0;
    }

    public void a() {
        this.c = 0;
        this.e = 0;
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    public void a(int i) {
        baig.a(i, this.c, this.d);
        baig.a(i, this.e, this.l);
        baig.a(i, this.f, this.g);
        baig.a(i, this.h, this.i);
        baig.a(i, this.j, this.k);
    }

    public final baif b(int i) {
        if (i >= 0 && i < this.e) {
            return this.l[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public void b() {
        a();
        synchronized (b) {
            if (!a.contains(this)) {
                a.add(this);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(1);
        parcel.writeInt(this.c);
        for (i2 = 0; i2 < this.c; i2++) {
            this.d[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e);
        for (i2 = 0; i2 < this.e; i2++) {
            this.l[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f);
        for (i2 = 0; i2 < this.f; i2++) {
            this.g[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h);
        for (i2 = 0; i2 < this.h; i2++) {
            this.i[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.j);
        for (int i3 = 0; i3 < this.j; i3++) {
            this.k[i3].writeToParcel(parcel, i);
        }
    }

    public void a(Parcel parcel) {
        int i;
        parcel.readInt();
        int readInt = parcel.readInt();
        this.c = readInt;
        baig.c(readInt);
        for (i = 0; i < this.c; i++) {
            this.d[i].a(parcel);
        }
        i = parcel.readInt();
        this.e = i;
        baig.c(i);
        for (i = 0; i < this.e; i++) {
            this.l[i].a(parcel);
        }
        i = parcel.readInt();
        this.f = i;
        baig.c(i);
        for (i = 0; i < this.f; i++) {
            this.g[i].a(parcel);
        }
        i = parcel.readInt();
        this.h = i;
        baig.c(i);
        for (i = 0; i < this.h; i++) {
            this.i[i].a(parcel);
        }
        i = parcel.readInt();
        this.j = i;
        baig.c(i);
        for (readInt = 0; readInt < this.j; readInt++) {
            this.k[readInt].a(parcel);
        }
    }

    protected static void c(int i) {
        if (i < 0 || i >= 16) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Invalid event count: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    static void a(int i, int i2, baih[] baihArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            baihArr[i3].e = i;
        }
    }
}
