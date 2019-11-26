package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Arrays;
import java.util.Set;

/* renamed from: aahr */
public final class aahr implements Parcelable {
    public static final Creator CREATOR = new aahq();
    public final arlv a;
    public final String b;
    public final long c;
    public final Uri d;
    public final String e;
    public final int f;
    public final boolean g;
    public final String h;

    public aahr(arlv arlv, String str, long j) {
        this(arlv, str, j, false);
    }

    public static boolean a(int i) {
        return i >= 0;
    }

    public static boolean b(int i) {
        return i == -2 || i == -1;
    }

    public final int describeContents() {
        return 0;
    }

    public aahr(arlv arlv, String str, long j, boolean z) {
        int i;
        String str2;
        this.a = arlv;
        this.b = str;
        this.c = j;
        this.d = Uri.parse(arlv.d);
        this.e = aajy.a(b(), t());
        if (z) {
            arlv arlv2 = this.a;
            i = arlv2.g;
            if (i <= 0) {
                i = (int) (((float) arlv2.f) * 0.8f);
            }
        } else {
            i = arlv.f;
        }
        this.f = i;
        this.g = z;
        if (str != null) {
            String str3 = this.e;
            long j2 = arlv.n;
            StringBuilder stringBuilder = new StringBuilder((str.length() + 22) + String.valueOf(str3).length());
            stringBuilder.append(str);
            str2 = ".";
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            stringBuilder.append(str2);
            stringBuilder.append(j2);
            str2 = stringBuilder.toString();
        } else {
            str2 = null;
        }
        this.h = str2;
    }

    public final aahs a() {
        return aahs.a(this.d);
    }

    public final Uri a(String str) {
        aahs a = a();
        a.a(str);
        return a.a();
    }

    public final int b() {
        return this.a.c;
    }

    public final long c() {
        return this.a.o;
    }

    public final String d() {
        return this.a.e;
    }

    public final String e() {
        return aaja.c(d());
    }

    public final int f() {
        return this.a.i;
    }

    public final int g() {
        return this.a.j;
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.a.u)) {
            return this.a.u;
        }
        String str = "";
        if (E()) {
            int b = aahp.b(f(), g());
            if (b != -1) {
                int i = i();
                if (i >= 55) {
                    str = "60";
                } else if (i >= 49) {
                    str = "50";
                } else if (i >= 39) {
                    str = "48";
                }
                StringBuilder stringBuilder = new StringBuilder(str.length() + 12);
                stringBuilder.append(b);
                stringBuilder.append("p");
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        }
        return str;
    }

    public final int i() {
        return this.a.k;
    }

    public final boolean j() {
        aoyg aoyg = this.a.x;
        if (aoyg == null) {
            aoyg = aoyg.e;
        }
        return aoyg.d;
    }

    public final String k() {
        aoyg aoyg = this.a.x;
        if (aoyg == null) {
            aoyg = aoyg.e;
        }
        return aoyg.c;
    }

    public final String l() {
        aoyg aoyg = this.a.x;
        if (aoyg == null) {
            aoyg = aoyg.e;
        }
        return aoyg.b;
    }

    public final String m() {
        apiv apiv = this.a.D;
        if (apiv == null) {
            apiv = apiv.e;
        }
        return apiv.b;
    }

    public final String n() {
        apiv apiv = this.a.D;
        if (apiv == null) {
            apiv = apiv.e;
        }
        return apiv.d;
    }

    public final int o() {
        return (int) (this.a.B * 1000.0d);
    }

    public final long p() {
        return (long) (this.a.B * 1000000.0d);
    }

    public final long q() {
        String queryParameter = this.d.getQueryParameter("mindsq");
        if (queryParameter == null) {
            queryParameter = this.d.getQueryParameter("min_sq");
        }
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public final long r() {
        String queryParameter = this.d.getQueryParameter("maxdsq");
        if (queryParameter == null) {
            queryParameter = this.d.getQueryParameter("max_sq");
        }
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public final double s() {
        return this.a.C;
    }

    public final String t() {
        return this.a.r;
    }

    public static String b(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            baal baal = (baal) aocf.mergeFrom(new baal(), Base64.decode(str, 8));
            StringBuilder stringBuilder = new StringBuilder();
            if (baal.a.length == 0) {
                return str2;
            }
            int i = 0;
            while (true) {
                baai[] baaiArr = baal.a;
                if (i >= baaiArr.length) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(baaiArr[i].b);
                stringBuilder.append("=");
                stringBuilder.append(baal.a[i].c);
                if (i < baal.a.length - 1) {
                    stringBuilder.append(":");
                }
                i++;
            }
        } catch (aocg | IllegalArgumentException unused) {
            return str2;
        }
    }

    public static String c(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        baal baal = new baal();
        String[] split = str.split(":", -1);
        baal.a = new baai[split.length];
        for (int i = 0; i < split.length; i++) {
            String str3;
            String str4;
            String[] split2 = split[i].split("=", -1);
            int length = split2.length;
            if (length <= 0) {
                str3 = str2;
            } else {
                str3 = split2[0];
            }
            if (length <= 1) {
                str4 = str2;
            } else {
                str4 = split2[1];
            }
            baal.a[i] = new baai();
            baai baai = baal.a[i];
            baai.b = str3;
            baai.c = str4;
        }
        return Base64.encodeToString(aocf.toByteArray(baal), 11);
    }

    public final int u() {
        if (E()) {
            return aahp.a(f(), g());
        }
        if (!F() || !aahv.n().contains(Integer.valueOf(b()))) {
            return -1;
        }
        if (((Set) aahv.ay.get()).contains(Integer.valueOf(b()))) {
            return 1;
        }
        return !((Set) aahv.az.get()).contains(Integer.valueOf(b())) ? 2 : 3;
    }

    public static int a(int i, int i2) {
        return aahp.a(i, i2);
    }

    public final boolean v() {
        return xvt.a(this.d);
    }

    public final boolean w() {
        return xvt.c(this.d);
    }

    public final boolean x() {
        arlv arlv = this.a;
        anxr access$000 = anxl.checkIsLite(ammu.b);
        arlv.a(access$000);
        if (arlv.h.a(access$000.d)) {
            arlv = this.a;
            access$000 = anxl.checkIsLite(ammu.b);
            arlv.a(access$000);
            Object b = arlv.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            if (((Boolean) b).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int y() {
        if (v() || w()) {
            return 1;
        }
        return !x() ? 3 : 2;
    }

    public final boolean z() {
        for (atzi atzi : new anyc(this.a.s, arlv.t)) {
            if (atzi == atzi.WIDEVINE) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        return aahr.a(this.a);
    }

    public static boolean a(arlv arlv) {
        return ((Set) aahv.aB.get()).contains(Integer.valueOf(arlv.c)) || arlv.k > 32;
    }

    public final boolean B() {
        return ((Set) aahv.aC.get()).contains(Integer.valueOf(b()));
    }

    public final long C() {
        return this.a.n;
    }

    public final boolean D() {
        return aahv.h().contains(Integer.valueOf(b()));
    }

    public final boolean E() {
        return aaja.a(d());
    }

    public final boolean F() {
        return aaja.b(d());
    }

    public final boolean G() {
        int i = this.a.a;
        return ((i & 1024) == 0 || (i & 2048) == 0) ? false : true;
    }

    public final nzw H() {
        String e = e();
        String d = aaja.d(d());
        if (E()) {
            return new nzw(this.e, null, 4, 0, this.f, d, null, e, oyu.d(d), -1, null, null, Long.MAX_VALUE, f(), g(), (float) i(), -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
        }
        String e2 = oyu.e(d);
        return new nzw(this.e, null, !j() ? 4 : 1, 0, this.f, d, null, e, e2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, k(), -1);
    }

    public final orb d(String str) {
        nzw H = H();
        long j = this.a.n;
        String uri = a(str).toString();
        armb armb = this.a.l;
        if (armb == null) {
            armb = armb.d;
        }
        long j2 = armb.b;
        armb = this.a.l;
        if (armb == null) {
            armb = armb.d;
        }
        long j3 = armb.c;
        armb = this.a.m;
        if (armb == null) {
            armb = armb.d;
        }
        long j4 = armb.b;
        armb = this.a.m;
        if (armb == null) {
            armb = armb.d;
        }
        long j5 = armb.c;
        return new orb(H, uri, new ord(new oqz(null, j2, (j3 - j2) + 1), j4, (j5 - j4) + 1), this.h, c());
    }

    public final int hashCode() {
        long j = this.c;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        String str = this.b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.a.toByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aahr) {
            aahr aahr = (aahr) obj;
            return this.c == aahr.c && amqq.a(this.b, aahr.b) && this.a.equals(aahr.a);
        }
    }

    public final String toString() {
        String k;
        String l;
        Object stringBuilder;
        int b = b();
        String t = t();
        Object obj = "";
        if (F()) {
            boolean j = j();
            k = k();
            l = l();
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(k).length() + 63) + String.valueOf(l).length());
            stringBuilder2.append(" isDefaultAudioTrack=");
            stringBuilder2.append(j);
            stringBuilder2.append(" audioTrackId=");
            stringBuilder2.append(k);
            stringBuilder2.append(" audioTrackDisplayName=");
            stringBuilder2.append(l);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = obj;
        }
        if (E()) {
            int f = f();
            int g = g();
            StringBuilder stringBuilder3 = new StringBuilder(37);
            stringBuilder3.append(" width=");
            stringBuilder3.append(f);
            stringBuilder3.append(" height=");
            stringBuilder3.append(g);
            obj = stringBuilder3.toString();
        }
        k = d();
        l = new anyc(this.a.s, arlv.t).toString();
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(t).length();
        int length2 = String.valueOf(stringBuilder).length();
        int length3 = String.valueOf(obj).length();
        int length4 = String.valueOf(k).length();
        StringBuilder stringBuilder4 = new StringBuilder((((((length + 65) + length2) + length3) + length4) + String.valueOf(l).length()) + valueOf.length());
        stringBuilder4.append("FormatStream(itag=");
        stringBuilder4.append(b);
        stringBuilder4.append(" xtags=");
        stringBuilder4.append(t);
        stringBuilder4.append(stringBuilder);
        stringBuilder4.append(obj);
        stringBuilder4.append(" mimeType=");
        stringBuilder4.append(k);
        stringBuilder4.append(" drmFamilies=");
        stringBuilder4.append(l);
        stringBuilder4.append(" uri=");
        stringBuilder4.append(valueOf);
        stringBuilder4.append(")");
        return stringBuilder4.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.a, parcel);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.g);
    }

    public final int I() {
        int a = arlt.a(this.a.v);
        return a == 0 ? 1 : a;
    }
}
