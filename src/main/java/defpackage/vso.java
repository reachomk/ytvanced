package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: vso */
public abstract class vso implements aage, afnt, Parcelable, vsq {
    public static final long m = TimeUnit.DAYS.toMillis(3);
    public final String d;
    public final byte[] e;
    public final String f;
    public final String g;
    public final boolean h;
    public final aajj i;
    public final String j;
    public final long k;
    public final vtp l;

    protected vso(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j, vtp vtp) {
        this.d = xvd.a(str);
        this.e = (byte[]) amqw.a((Object) bArr);
        this.f = str2;
        this.g = xvd.a(str3);
        this.h = z;
        this.i = (aajj) amqw.a((Object) aajj);
        this.j = str4;
        this.k = j;
        this.l = (vtp) amqw.a((Object) vtp);
    }

    public aojz I() {
        return null;
    }

    public String K() {
        return "";
    }

    public aule[] M() {
        return null;
    }

    public Uri N() {
        return null;
    }

    public apxu O() {
        return null;
    }

    public int P() {
        return 1;
    }

    public axop Q() {
        return null;
    }

    public aphg R() {
        return null;
    }

    public apfy S() {
        return null;
    }

    public ayxm T() {
        return null;
    }

    public apxu U() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public int V() {
        return 0;
    }

    public boolean a(vra vra) {
        return true;
    }

    @Deprecated
    public final boolean bb_() {
        return false;
    }

    public String d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public String e() {
        return null;
    }

    public abstract int f();

    public abstract boolean g();

    public abstract boolean h();

    public aakj i() {
        return null;
    }

    public aajs j() {
        return null;
    }

    public aakh k() {
        return null;
    }

    public Uri l() {
        return null;
    }

    public aolc m() {
        return null;
    }

    public ajwf n() {
        return null;
    }

    public String o() {
        return "";
    }

    public final long b() {
        return this.k;
    }

    public final boolean a(xsc xsc) {
        return xsc.a() >= this.k;
    }

    public final List p() {
        return this.l.n;
    }

    public final List q() {
        return this.l.u;
    }

    public final List r() {
        return this.l.l;
    }

    public final List s() {
        return this.l.s;
    }

    public final List t() {
        return this.l.v;
    }

    public final List u() {
        return this.l.q;
    }

    public final List v() {
        return this.l.t;
    }

    public final List w() {
        return this.l.i;
    }

    public final List x() {
        return this.l.h;
    }

    public final List y() {
        return this.l.p;
    }

    public final List z() {
        return this.l.r;
    }

    public final List A() {
        return this.l.m;
    }

    public final List B() {
        return this.l.j;
    }

    public final List C() {
        return this.l.g;
    }

    public final List D() {
        return this.l.k;
    }

    public final List E() {
        return this.l.b;
    }

    public final List F() {
        return this.l.c;
    }

    public final List G() {
        return this.l.e;
    }

    public final List H() {
        return this.l.d;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = this.j;
        StringBuilder stringBuilder = new StringBuilder((simpleName.length() + 1) + String.valueOf(str).length());
        stringBuilder.append(simpleName);
        stringBuilder.append("_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("Ad should not be a key.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof vso) {
            vso vso = (vso) obj;
            if (amqq.a(this.d, vso.d) && Arrays.equals(this.e, vso.e) && amqq.a(this.f, vso.f) && amqq.a(this.g, vso.g) && amqq.a(Boolean.valueOf(this.h), Boolean.valueOf(vso.h)) && amqq.a(this.i, vso.i) && amqq.a(this.j, vso.j) && this.k == vso.k && amqq.a(this.l, vso.l)) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeByte(this.h);
        parcel.writeParcelable(this.i, 0);
        parcel.writeString(this.j);
        parcel.writeLong(this.k);
    }

    public List J() {
        return Collections.emptyList();
    }

    public List L() {
        return Collections.emptyList();
    }

    public final boolean W() {
        return V() > 0;
    }

    public final String a() {
        return this.j;
    }
}
