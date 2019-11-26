package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aaff */
public final class aaff implements ajth, Parcelable {
    public static final Creator CREATOR = new aafe();
    public final ajrr a;
    private final Map b = new HashMap();
    private Object c;
    private List d;

    public aaff(ajrr ajrr) {
        this.a = ajrr;
    }

    public final int describeContents() {
        return 0;
    }

    public static aaff a(byte[] bArr, aamj aamj) {
        return bArr != null ? new aaff((ajrr) aamj.a(bArr, ajrr.class)) : null;
    }

    public final String toString() {
        ajrr ajrr = this.a;
        if (ajrr == null) {
            return "(null)";
        }
        return ajrr.toString();
    }

    public final void a(String str, Object obj) {
        this.b.put(str, obj);
    }

    public final Object b(String str, Object obj) {
        return this.b.containsKey(str) ? this.b.get(str) : obj;
    }

    public final ajtk a() {
        return this.a.b;
    }

    public final byte[] b() {
        return this.a.d;
    }

    public final void a(Object obj) {
        this.c = obj;
    }

    public final Object c() {
        return this.c;
    }

    public final List d() {
        if (this.d == null) {
            this.d = new ArrayList();
            ajru ajru = this.a.a;
            if (ajru == null) {
                return this.d;
            }
            akaq akaq = ajru.b;
            if (akaq == null) {
                return this.d;
            }
            for (ajrt ajrt : akaq.a) {
                akbc akbc = ajrt.b;
                if (akbc != null) {
                    this.d.add(new aafp(akbc));
                }
            }
        }
        return this.d;
    }

    public final boolean e() {
        return this.a.a == null;
    }

    public final byte[] f() {
        return aocf.toByteArray(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(parcel, this.a);
    }
}
