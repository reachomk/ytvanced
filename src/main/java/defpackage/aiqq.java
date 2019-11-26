package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: aiqq */
public final class aiqq implements Parcelable {
    public static final Creator CREATOR = new aiqt();
    public nkm a;
    public final apxu b;
    public String c;
    public int d;
    public final int e;

    public static aiqs a() {
        return new aiqs();
    }

    public final int describeContents() {
        return 0;
    }

    public final String a(xua xua) {
        if (this.c == null) {
            this.c = xua.a();
        }
        return this.c;
    }

    public final void a(aiqq aiqq) {
        if (aiqq != null && aiqq != this) {
            this.c = aiqq.c;
            aiqq.c = null;
        }
    }

    public final String b() {
        return this.a.b;
    }

    public final String c() {
        return this.a.d;
    }

    public final int d() {
        return this.a.e;
    }

    public final int e() {
        return Math.max(0, d());
    }

    public final List f() {
        if (this.a.c.size() <= 0) {
            return null;
        }
        return this.a.c;
    }

    public final long g() {
        return this.a.k;
    }

    public final String h() {
        return this.a.f;
    }

    public final String i() {
        return this.a.l;
    }

    public final boolean j() {
        return this.a.i;
    }

    public final byte[] k() {
        return this.a.g.d();
    }

    public final boolean l() {
        return this.a.j;
    }

    public final aaje a(String str) {
        if (!((this.a.a & 262144) == 0 || TextUtils.isEmpty(str))) {
            avtm avtm = this.a.r;
            if (avtm == null) {
                avtm = avtm.y;
            }
            if (!avtm.c.isEmpty()) {
                return new aaje(avtm, str, g());
            }
        }
        return null;
    }

    public final boolean m() {
        return this.a.h;
    }

    public final boolean n() {
        return this.a.t;
    }

    public final boolean o() {
        return this.a.u;
    }

    public final boolean p() {
        return this.a.m;
    }

    public final boolean q() {
        return this.a.o;
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.a.w);
    }

    public final aiqs s() {
        aiqs aiqs = new aiqs();
        aiqs.h = this.a;
        aiqs.a = this.b;
        aiqs.l = this.e;
        return aiqs;
    }

    public final void a(boolean z) {
        nkn nkn = (nkn) ((anxo) this.a.toBuilder());
        nkn.c(z);
        this.a = (nkm) ((anxl) nkn.build());
    }

    public final void a(long j) {
        nkn nkn = (nkn) ((anxo) this.a.toBuilder());
        nkn.a(j);
        this.a = (nkm) ((anxl) nkn.build());
    }

    public final String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = b();
        objArr[1] = c();
        objArr[2] = Integer.valueOf(d());
        objArr[3] = f() != null ? f().toString() : "";
        return String.format(locale, "PlaybackStartDescriptor:\n  VideoId:%s\n  PlaylistId:%s\n  Index:%d\n  VideoIds:%s", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }

    /* synthetic */ aiqq(nkm nkm, int i, apxu apxu) {
        this.a = nkm;
        this.e = i;
        this.b = apxu;
    }
}
