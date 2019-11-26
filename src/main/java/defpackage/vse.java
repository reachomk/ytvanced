package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: vse */
public final class vse implements aaga, afnt {
    public static final Creator CREATOR = new vsh();
    public static final vsg b = new vsg();
    public final vso a;

    public vse(vso vso) {
        this.a = vso;
    }

    public final List A() {
        return null;
    }

    public final List C() {
        return null;
    }

    public final List E() {
        return null;
    }

    public final List G() {
        return null;
    }

    public final List I() {
        return null;
    }

    public final List K() {
        return null;
    }

    public final List M() {
        return null;
    }

    public final List O() {
        return null;
    }

    public final List Q() {
        return null;
    }

    public final List S() {
        return null;
    }

    public final List X() {
        return null;
    }

    public final String Y() {
        return null;
    }

    public final String Z() {
        return null;
    }

    public final String aa() {
        return null;
    }

    public final aagc ab() {
        return null;
    }

    public final Pattern ac() {
        return null;
    }

    public final List af() {
        return null;
    }

    @Deprecated
    public final boolean bb_() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final List u() {
        return null;
    }

    public final List w() {
        return null;
    }

    public final List y() {
        return null;
    }

    public final String d() {
        return this.a.d();
    }

    public final List e() {
        return this.a.J();
    }

    public final String f() {
        return this.a.d;
    }

    public final String g() {
        return this.a.f;
    }

    public final String h() {
        return this.a.K();
    }

    public final String i() {
        return this.a.e();
    }

    public final byte[] j() {
        return this.a.e;
    }

    public final String k() {
        return this.a.g;
    }

    public final String l() {
        return this.a.j;
    }

    public final String m() {
        return this.a.o();
    }

    public final int n() {
        return this.a.f();
    }

    public final boolean o() {
        return this.a instanceof vrx;
    }

    public final boolean p() {
        return this.a.W();
    }

    public final long b() {
        return this.a.k;
    }

    public final boolean a(xsc xsc) {
        vso vso = this.a;
        return ((vso instanceof vrx) || vso.a(xsc)) ? false : true;
    }

    public final aakj q() {
        return this.a.i();
    }

    public final aajj r() {
        return this.a.i;
    }

    public final List s() {
        return this.a.L();
    }

    public final List t() {
        return this.a.p();
    }

    public final List v() {
        return this.a.q();
    }

    public final List x() {
        return this.a.r();
    }

    public final List z() {
        return this.a.s();
    }

    public final List B() {
        return this.a.t();
    }

    public final List D() {
        return this.a.u();
    }

    public final List F() {
        return this.a.w();
    }

    public final List H() {
        return this.a.x();
    }

    public final List J() {
        return this.a.y();
    }

    public final List L() {
        return this.a.z();
    }

    public final List N() {
        return this.a.A();
    }

    public final List P() {
        return this.a.B();
    }

    public final List R() {
        return this.a.D();
    }

    public final List T() {
        return this.a.E();
    }

    public final Uri U() {
        return this.a.N();
    }

    public final apxu V() {
        return this.a.O();
    }

    public final Uri W() {
        return this.a.l();
    }

    public final aagd ad() {
        if (ah() != null) {
            return aagd.SURVEY;
        }
        if (p()) {
            return aagd.SKIPPABLE;
        }
        return aagd.NONE;
    }

    public final int ae() {
        return this.a.P();
    }

    public final ajwf ag() {
        return this.a.n();
    }

    public final aagi ah() {
        vso vso = this.a;
        if (vso instanceof vsu) {
            return (vsu) vso;
        }
        return null;
    }

    public final axop ai() {
        return this.a.Q();
    }

    public final aphg aj() {
        return this.a.R();
    }

    public final apfy ak() {
        return this.a.S();
    }

    public final ayxm al() {
        return this.a.T();
    }

    public final apxu am() {
        return this.a.U();
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("InstreamAdImpl should not be a key.");
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vse)) {
            return false;
        }
        return this.a.equals(((vse) obj).a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
    }

    /* renamed from: an */
    public final vsg c() {
        return new vsg(this);
    }
}
