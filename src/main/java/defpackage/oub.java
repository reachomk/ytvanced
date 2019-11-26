package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: oub */
public final class oub extends ouq {
    public static final Creator CREATOR = new oue();
    public static final oub a = new oub();
    private final SparseBooleanArray A;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final SparseArray u;

    private oub() {
        String str = ouq.v.w;
        String str2 = ouq.v.x;
        boolean z = ouq.v.y;
        int i = ouq.v.z;
        SparseArray sparseArray = new SparseArray();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        super(str, str2, z, i);
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = true;
        this.g = false;
        this.h = true;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = true;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = true;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = 0;
        this.u = sparseArray;
        this.A = sparseBooleanArray;
    }

    public final int describeContents() {
        return 0;
    }

    oub(Parcel parcel) {
        super(parcel);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = ozp.a(parcel);
        this.g = ozp.a(parcel);
        this.h = ozp.a(parcel);
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = ozp.a(parcel);
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = ozp.a(parcel);
        this.o = ozp.a(parcel);
        this.p = ozp.a(parcel);
        this.q = ozp.a(parcel);
        this.r = ozp.a(parcel);
        this.s = ozp.a(parcel);
        this.t = parcel.readInt();
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put((opz) parcel.readParcelable(opz.class.getClassLoader()), (oud) parcel.readParcelable(oud.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.u = sparseArray;
        this.A = (SparseBooleanArray) ozp.a(parcel.readSparseBooleanArray());
    }

    public final boolean a(int i) {
        return this.A.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oub oub = (oub) obj;
            if (super.equals(obj) && this.b == oub.b && this.c == oub.c && this.d == oub.d && this.e == oub.e && this.f == oub.f && this.g == oub.g && this.h == oub.h && this.k == oub.k && this.i == oub.i && this.j == oub.j && this.l == oub.l && this.m == oub.m && this.n == oub.n && this.o == oub.o && this.p == oub.p && this.q == oub.q && this.r == oub.r && this.s == oub.s && this.t == oub.t) {
                SparseBooleanArray sparseBooleanArray = this.A;
                SparseBooleanArray sparseBooleanArray2 = oub.A;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i;
                    for (i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                    }
                    SparseArray sparseArray = this.u;
                    SparseArray sparseArray2 = oub.u;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        size = 0;
                        while (size < size2) {
                            i = sparseArray2.indexOfKey(sparseArray.keyAt(size));
                            if (i >= 0) {
                                Map map = (Map) sparseArray.valueAt(size);
                                Map map2 = (Map) sparseArray2.valueAt(i);
                                if (map2.size() == map.size()) {
                                    for (Entry entry : map.entrySet()) {
                                        opz opz = (opz) entry.getKey();
                                        if (map2.containsKey(opz)) {
                                            if (!ozp.a(entry.getValue(), map2.get(opz))) {
                                            }
                                        }
                                    }
                                    size++;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.k) * 31) + this.i) * 31) + this.j) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        ozp.a(parcel, this.f);
        ozp.a(parcel, this.g);
        ozp.a(parcel, this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        ozp.a(parcel, this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        ozp.a(parcel, this.n);
        ozp.a(parcel, this.o);
        ozp.a(parcel, this.p);
        ozp.a(parcel, this.q);
        ozp.a(parcel, this.r);
        ozp.a(parcel, this.s);
        parcel.writeInt(this.t);
        SparseArray sparseArray = this.u;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.A);
    }
}
