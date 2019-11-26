package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aakm */
public final class aakm implements Parcelable, Comparable {
    public static final Creator CREATOR = new aakp();
    private static final Set d = Collections.emptySet();
    public final String a;
    public final Set b;
    public final Set c;
    private final int e;

    public aakm(aulg aulg) {
        this(aulg, d);
    }

    public final int describeContents() {
        return 0;
    }

    public aakm(aulg aulg, Set set) {
        this.a = aulg.b;
        this.b = (Set) amqw.a((Object) set);
        int i = aulg.c;
        if (i == 0) {
            i = -1;
        }
        this.e = i;
        this.c = new HashSet();
        for (aula aula : aulg.d) {
            Set set2 = this.c;
            Object a = aulc.a(aula.b);
            if (a == null) {
                a = aulc.UNKNOWN;
            }
            set2.add(a);
        }
    }

    public aakm(nkr nkr) {
        this.a = (nkr.a & 1) != 0 ? nkr.b : "";
        this.b = new HashSet();
        for (Integer intValue : nkr.c) {
            int intValue2 = intValue.intValue();
            Set set = this.b;
            for (Object obj : aako.values()) {
                if (obj.d == intValue2) {
                    break;
                }
            }
            Object obj2 = aako.NO_OP;
            set.add(obj2);
        }
        this.e = (nkr.a & 2) != 0 ? nkr.d : -1;
        this.c = new HashSet();
        if (nkr.e.size() != 0) {
            for (Integer intValue3 : nkr.e) {
                aulc a = aulc.a(intValue3.intValue());
                if (a != null) {
                    this.c.add(a);
                }
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        nku nku = (nku) nkr.f.createBuilder();
        String str = this.a;
        nku.copyOnWrite();
        nkr nkr = (nkr) nku.instance;
        if (str != null) {
            nkr.a |= 1;
            nkr.b = str;
            int i2 = this.e;
            nku.copyOnWrite();
            nkr = (nkr) nku.instance;
            nkr.a |= 2;
            nkr.d = i2;
            int[] iArr = new int[this.b.size()];
            int i3 = 0;
            int i4 = 0;
            for (aako aako : this.b) {
                int i5 = i4 + 1;
                iArr[i4] = aako.d;
                i4 = i5;
            }
            List a = anhe.a(iArr);
            nku.copyOnWrite();
            nkr = (nkr) nku.instance;
            if (!nkr.c.a()) {
                nkr.c = anxl.mutableCopy(nkr.c);
            }
            anvf.addAll(a, nkr.c);
            iArr = new int[this.c.size()];
            for (aulc aulc : this.c) {
                i4 = i3 + 1;
                iArr[i3] = aulc.e;
                i3 = i4;
            }
            a = anhe.a(iArr);
            nku.copyOnWrite();
            nkr = (nkr) nku.instance;
            if (!nkr.e.a()) {
                nkr.e = anxl.mutableCopy(nkr.e);
            }
            anvf.addAll(a, nkr.e);
            xup.a((nkr) ((anxl) nku.build()), parcel);
            return;
        }
        throw new NullPointerException();
    }

    public final Uri a() {
        return Uri.parse(this.a);
    }

    public final int a(int i) {
        int i2 = this.e;
        return i2 != -1 ? i2 : i;
    }

    private final int a(aakm aakm) {
        int i = this.e;
        int i2 = aakm.e;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        } else {
            return this.a.compareTo(aakm.a);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aakm)) {
            return false;
        }
        aakm aakm = (aakm) obj;
        boolean z = true;
        if (this != aakm) {
            if (aakm.a(this) != 0) {
                z = false;
            } else if (hashCode() == aakm.hashCode()) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + this.e) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        stringBuilder.append(this.e);
        stringBuilder.append("baseUrl->");
        stringBuilder.append(this.a);
        stringBuilder.append("params->");
        stringBuilder.append(this.b);
        stringBuilder.append("headers->");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return a((aakm) obj);
    }
}
