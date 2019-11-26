package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: aagr */
public final class aagr implements aaga, aage, afnt, Parcelable {
    public static final Creator CREATOR = new aagq();
    public static final String a;
    public final amul A;
    public final amul B;
    public final amul C;
    public final amul D;
    public final amul E;
    public final amul F;
    public final amul G;
    public final amul H;
    public final amul I;
    public final amul J;
    public final amul K;
    public final amul L;
    public final amul M;
    public final amul N;
    public final amul O;
    public final Uri P;
    public final Uri Q;
    public final boolean R;
    public final long S;
    public final int T;
    public final boolean U;
    public final aovw V;
    public final ajwf W;
    public final Uri X;
    public final aagr Y;
    public final aagr Z;
    public final long aa;
    public final boolean ab;
    public final boolean ac;
    public final amul ad;
    public final aagh ae;
    public final boolean af;
    public final amul ag;
    public final amul ah;
    public final amul ai;
    public final Pattern aj;
    private final aajs ak;
    private final boolean al;
    private final String am;
    private final String an;
    private final String ao;
    private final amul ap;
    public final amul b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final aagc m;
    public final String n;
    public final int o;
    public final aakj p;
    public final aakh q;
    public final aajj r;
    public final awcq s;
    public final Uri t;
    public final amul u;
    public final amul v;
    public final amul w;
    public final amul x;
    public final amul y;
    public final amul z;

    public aagr(List list, String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, String str7, String str8, String str9, aagc aagc, String str10, int i, aakj aakj, aajs aajs, aakh aakh, aajj aajj, awcq awcq, Uri uri, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, Uri uri2, Uri uri3, boolean z, long j, int i2, boolean z2, aovw aovw, ajwf ajwf, long j2, boolean z3, boolean z4, Uri uri4, aagr aagr, aagr aagr2, List list23, List list24, aagh aagh, List list25, List list26, List list27, boolean z5, Pattern pattern) {
        Uri uri5 = uri4;
        aagr aagr3 = aagr2;
        this.b = aagr.a(list);
        this.c = str;
        this.d = str2;
        String str11 = null;
        String str12 = str3 != null ? str3 : aagr3 != null ? aagr3.e : null;
        this.e = str12;
        str12 = str4 != null ? str4 : aagr3 != null ? aagr3.f : null;
        this.f = str12;
        if (str5 != null) {
            str11 = str5;
        } else if (aagr3 != null) {
            str11 = aagr3.g;
        }
        this.g = str11;
        this.h = bArr;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = aagc;
        this.n = str10;
        this.o = i;
        this.p = aakj;
        this.ak = aajs;
        this.q = (aakh) amqw.a((Object) aakh);
        this.r = (aajj) amqw.a((Object) aajj);
        this.s = awcq;
        this.t = uri;
        this.u = aagr.a(list2);
        this.v = aagr.a(list3);
        this.w = aagr.a(list4);
        this.x = aagr.a(list5);
        this.y = aagr.a(list6);
        this.z = aagr.a(list7);
        this.A = aagr.a(list8);
        this.B = aagr.a(list9);
        this.C = aagr.a(list10);
        this.D = aagr.a(list22);
        this.E = aagr.a(list11);
        this.F = aagr.a(list12);
        this.G = aagr.a(list13);
        this.H = aagr.a(list14);
        this.I = aagr.a(list15);
        this.J = aagr.a(list16);
        this.K = aagr.a(list17);
        this.L = aagr.a(list18);
        this.M = aagr.a(list19);
        this.N = aagr.a(list20);
        this.O = aagr.a(list21);
        this.P = uri2;
        this.Q = uri3;
        this.R = z;
        this.S = j;
        this.T = i2;
        this.U = z2;
        this.V = aovw;
        this.W = ajwf;
        this.aa = j2;
        this.ab = z3;
        this.ac = z4;
        this.X = uri5;
        this.al = uri5 != null;
        this.Y = aagr;
        this.Z = aagr3;
        this.ao = aq();
        this.am = ap();
        this.an = ao();
        this.ap = aagr.a(list23);
        this.ad = aagr.a(list24);
        this.ae = aagh;
        this.ag = aagr.a(list25);
        this.ah = aagr.a(list26);
        this.ai = aagr.a(list27);
        this.af = z5;
        this.aj = pattern;
    }

    public final List B() {
        return null;
    }

    public final List D() {
        return null;
    }

    public final List F() {
        return null;
    }

    public final List H() {
        return null;
    }

    public final List J() {
        return null;
    }

    public final List L() {
        return null;
    }

    public final List N() {
        return null;
    }

    public final List P() {
        return null;
    }

    public final List R() {
        return null;
    }

    public final List T() {
        return null;
    }

    public final apxu V() {
        return null;
    }

    public final int ae() {
        throw null;
    }

    public final axop ai() {
        return null;
    }

    public final aphg aj() {
        return null;
    }

    public final apfy ak() {
        return null;
    }

    public final ayxm al() {
        return null;
    }

    public final apxu am() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String k() {
        throw null;
    }

    public final List t() {
        return null;
    }

    public final List v() {
        return null;
    }

    public final List x() {
        return null;
    }

    public final List z() {
        return null;
    }

    private aagr() {
        this.b = amul.g();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = aagc.UNKNOWN;
        this.n = null;
        this.o = 0;
        this.p = null;
        this.ak = null;
        this.q = new aakh();
        this.r = aajj.b;
        this.s = null;
        this.t = null;
        this.u = amul.g();
        this.v = amul.g();
        this.w = amul.g();
        this.x = amul.g();
        this.y = amul.g();
        this.z = amul.g();
        this.A = amul.g();
        this.B = amul.g();
        this.C = amul.g();
        this.D = amul.g();
        this.E = amul.g();
        this.F = amul.g();
        this.G = amul.g();
        this.H = amul.g();
        this.I = amul.g();
        this.J = amul.g();
        this.K = amul.g();
        this.L = amul.g();
        this.M = amul.g();
        this.N = amul.g();
        this.O = amul.g();
        this.P = null;
        this.Q = null;
        this.R = true;
        this.S = 0;
        this.T = -1;
        this.U = false;
        this.V = null;
        this.W = null;
        this.aa = 0;
        this.ab = false;
        this.ac = false;
        this.X = null;
        this.al = false;
        this.Y = null;
        this.Z = null;
        this.ao = aq();
        this.am = ap();
        this.an = ao();
        this.ap = amul.g();
        this.ad = amul.g();
        this.ae = null;
        this.ag = amul.g();
        this.ah = amul.g();
        this.ai = amul.g();
        this.af = false;
        this.aj = null;
    }

    public final aagt an() {
        aagt aagt = new aagt();
        aagt.b = new ArrayList(this.b);
        aagt.j = this.c;
        aagt.c = this.d;
        aagt.d = this.e;
        aagt.e = this.f;
        aagt.f = this.g;
        aagt.g = this.h;
        aagt.h = this.i;
        aagt.i = this.j;
        aagt.k = this.k;
        aagt.l = this.l;
        aagt.m = this.m;
        aagt.n = this.n;
        aagt.o = this.o;
        aagt.p = this.p;
        aagt.q = this.ak;
        aagt.r = this.q;
        aagt.t = this.s;
        aagt.s = this.r;
        aagt.u = this.t;
        aagt.v = this.u;
        aagt.w = this.v;
        aagt.x = this.w;
        aagt.y = this.x;
        aagt.z = this.y;
        aagt.A = this.z;
        aagt.B = this.A;
        aagt.C = this.B;
        aagt.D = this.C;
        aagt.E = this.D;
        aagt.F = this.E;
        aagt.G = this.F;
        aagt.H = this.G;
        aagt.I = this.H;
        aagt.J = this.I;
        aagt.K = this.J;
        aagt.L = this.K;
        aagt.M = this.L;
        aagt.N = this.M;
        aagt.O = this.N;
        aagt.P = this.O;
        aagt.Q = this.P;
        aagt.R = this.Q;
        aagt.U = this.R;
        aagt.S = this.S;
        aagt.T = this.T;
        aagt.V = this.U;
        aagt.W = this.V;
        aagt.X = this.W;
        aagt.Y = this.aa;
        aagt.Z = this.ab;
        aagt.aa = this.ac;
        aagt.ab = this.X;
        aagt.ac = this.Y;
        aagt.ad = this.Z;
        aagt.ae = this.ap;
        aagt.af = this.ad;
        aagt.ah = this.ae;
        aagt.ai = this.ag;
        aagt.aj = this.ah;
        aagt.ak = this.ai;
        aagt.ag = this.af;
        aagt.al = this.aj;
        return aagt;
    }

    public final String toString() {
        String str = "]";
        String valueOf;
        if (this.al) {
            valueOf = String.valueOf(this.X);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
            stringBuilder.append("VastAd Wrapper: [wrapperUri=");
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        valueOf = this.k;
        String str2 = this.c;
        String str3 = this.l;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder2 = new StringBuilder(((length + 48) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder2.append("VastAd: [vastAdId=");
        stringBuilder2.append(valueOf);
        stringBuilder2.append(", adVideoId=");
        stringBuilder2.append(str2);
        stringBuilder2.append(", vastAdSystem = ");
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        return stringBuilder2.toString();
    }

    public final String d() {
        return this.c;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public final String i() {
        return this.g;
    }

    public final byte[] j() {
        return this.h;
    }

    public final String l() {
        return this.j;
    }

    public final aagc ab() {
        return this.m;
    }

    public final String m() {
        return this.n;
    }

    public final int n() {
        return this.o;
    }

    public final boolean o() {
        return this.ak == null && !this.al && !this.b.isEmpty() && this.ae == null;
    }

    public final aagd ad() {
        if (this.ae != null) {
            return aagd.SURVEY;
        }
        if (p()) {
            return aagd.SKIPPABLE;
        }
        return aagd.NONE;
    }

    public final boolean p() {
        return this.z.isEmpty() ^ 1;
    }

    public final boolean a(xsc xsc) {
        return !o() && xsc.a() < this.S;
    }

    public final Uri W() {
        aajs aajs = this.ak;
        if (aajs != null) {
            List list = aajs.l;
            if (list != null) {
                if (!list.isEmpty()) {
                    return ((aahr) list.get(0)).d;
                }
                afpc.a(1, afpf.ad, "Received non-null videoStreamingData object with empty list of format streams");
                return null;
            }
        }
        return null;
    }

    private final String ao() {
        LinkedList linkedList = new LinkedList();
        for (aagr aagr = this; aagr != null; aagr = aagr.Z) {
            Object obj = aagr.k;
            if (obj == null) {
                obj = "";
            }
            linkedList.offerFirst(obj);
        }
        return TextUtils.join(",", linkedList);
    }

    private final String ap() {
        LinkedList linkedList = new LinkedList();
        for (aagr aagr = this; aagr != null; aagr = aagr.Z) {
            Object obj = aagr.l;
            if (obj == null) {
                obj = "";
            }
            linkedList.offerFirst(obj);
        }
        return TextUtils.join(",", linkedList);
    }

    private final String aq() {
        LinkedList linkedList = new LinkedList();
        for (aagr aagr = this; aagr != null; aagr = aagr.Z) {
            linkedList.offerFirst(Long.valueOf(aagr.aa));
        }
        return TextUtils.join(",", linkedList);
    }

    public final long b() {
        return this.S;
    }

    public final boolean bb_() {
        return this.ac;
    }

    public final aakj q() {
        return this.p;
    }

    public final aajj r() {
        return this.r;
    }

    public static boolean a(Uri uri) {
        boolean z = false;
        if (uri != null) {
            amqw.a((Object) uri);
            if (("http".equalsIgnoreCase(uri.getScheme()) || xvt.e(uri)) && uri.getHost() != null) {
                if (uri.getHost().startsWith("www.youtube")) {
                    z = true;
                } else if (uri.getHost().equals("youtube.com")) {
                    return true;
                } else {
                    return z;
                }
            }
        }
        return z;
    }

    public final Uri U() {
        return this.t;
    }

    public final List u() {
        return this.u;
    }

    public final List w() {
        return this.v;
    }

    public final List y() {
        return this.w;
    }

    public final List A() {
        return this.x;
    }

    public final List C() {
        return this.y;
    }

    public final List E() {
        return this.C;
    }

    public final List G() {
        return this.E;
    }

    public final List I() {
        return this.F;
    }

    public final List K() {
        return this.G;
    }

    public final List M() {
        return this.I;
    }

    public final List O() {
        return this.J;
    }

    public final List Q() {
        return this.M;
    }

    public final List S() {
        return this.O;
    }

    public final List s() {
        return Collections.emptyList();
    }

    public final String Z() {
        return this.am;
    }

    public final String Y() {
        return this.an;
    }

    public final String aa() {
        return this.ao;
    }

    public final List X() {
        return this.ap;
    }

    public final List af() {
        return this.ad;
    }

    public final ajwf ag() {
        return this.W;
    }

    public final Pattern ac() {
        return this.aj;
    }

    public final List e() {
        return Collections.emptyList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeTypedList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m.toString());
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.p, 0);
        parcel.writeParcelable(this.ak, 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.r, 0);
        parcel.writeParcelable(new ajrb(this.s), 0);
        parcel.writeParcelable(this.t, 0);
        parcel.writeTypedList(this.u);
        parcel.writeTypedList(this.v);
        parcel.writeTypedList(this.w);
        parcel.writeTypedList(this.x);
        parcel.writeTypedList(this.y);
        parcel.writeTypedList(this.z);
        parcel.writeTypedList(this.A);
        parcel.writeTypedList(this.B);
        parcel.writeTypedList(this.C);
        parcel.writeTypedList(this.E);
        parcel.writeTypedList(this.F);
        parcel.writeTypedList(this.G);
        parcel.writeTypedList(this.H);
        parcel.writeTypedList(this.I);
        parcel.writeTypedList(this.J);
        parcel.writeTypedList(this.K);
        parcel.writeTypedList(this.L);
        parcel.writeTypedList(this.M);
        parcel.writeTypedList(this.N);
        parcel.writeTypedList(this.O);
        parcel.writeTypedList(this.D);
        parcel.writeParcelable(this.P, 0);
        parcel.writeParcelable(this.Q, 0);
        parcel.writeInt(this.R);
        parcel.writeLong(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        xup.a(this.V, parcel);
        xup.a(parcel, this.W);
        parcel.writeLong(this.aa);
        parcel.writeInt(this.ab);
        parcel.writeInt(this.ac);
        parcel.writeParcelable(this.X, 0);
        parcel.writeParcelable(this.Y, 0);
        parcel.writeParcelable(this.Z, 0);
        amul<aagf> amul = this.ap;
        ArrayList arrayList = new ArrayList();
        for (aagf name : amul) {
            arrayList.add(name.name());
        }
        parcel.writeStringList(arrayList);
        parcel.writeTypedList(this.ad);
        parcel.writeParcelable(this.ae, 0);
        parcel.writeTypedList(this.ag);
        parcel.writeTypedList(this.ah);
        parcel.writeTypedList(this.ai);
        parcel.writeInt(this.af);
        Pattern pattern = this.aj;
        if (pattern == null) {
            str = "";
        } else {
            str = pattern.pattern();
        }
        parcel.writeString(str);
    }

    private static List a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Uri.CREATOR);
        return Collections.unmodifiableList(arrayList);
    }

    public aagr(Parcel parcel) {
        String str;
        awcq awcq;
        Parcel parcel2 = parcel;
        Class cls = aagr.class;
        List a = aagr.a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        aagc aagc = (aagc) Enum.valueOf(aagc.class, parcel.readString());
        String readString10 = parcel.readString();
        int readInt = parcel.readInt();
        aakj aakj = (aakj) parcel2.readParcelable(aakj.class.getClassLoader());
        aajs aajs = (aajs) parcel2.readParcelable(aajs.class.getClassLoader());
        aakh aakh = (aakh) parcel2.readParcelable(aakh.class.getClassLoader());
        aajj aajj = (aajj) parcel2.readParcelable(aajj.class.getClassLoader());
        ajrb ajrb = (ajrb) parcel2.readParcelable(ajrb.class.getClassLoader());
        if (ajrb == null) {
            str = readString10;
            awcq = null;
        } else {
            str = readString10;
            awcq = (awcq) ajrb.a(awcq.c);
        }
        Uri uri = (Uri) parcel2.readParcelable(Uri.class.getClassLoader());
        List a2 = aagr.a(parcel);
        List a3 = aagr.a(parcel);
        List a4 = aagr.a(parcel);
        List a5 = aagr.a(parcel);
        ArrayList arrayList = new ArrayList();
        parcel2.readTypedList(arrayList, aagv.CREATOR);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        List a6 = aagr.a(parcel);
        List a7 = aagr.a(parcel);
        List a8 = aagr.a(parcel);
        List a9 = aagr.a(parcel);
        List a10 = aagr.a(parcel);
        List a11 = aagr.a(parcel);
        List a12 = aagr.a(parcel);
        List a13 = aagr.a(parcel);
        List a14 = aagr.a(parcel);
        List a15 = aagr.a(parcel);
        List a16 = aagr.a(parcel);
        List a17 = aagr.a(parcel);
        List a18 = aagr.a(parcel);
        List a19 = aagr.a(parcel);
        List a20 = aagr.a(parcel);
        List a21 = aagr.a(parcel);
        Uri uri2 = (Uri) parcel2.readParcelable(Uri.class.getClassLoader());
        Uri uri3 = (Uri) parcel2.readParcelable(Uri.class.getClassLoader());
        boolean z = parcel.readInt() == 1;
        long readLong = parcel.readLong();
        int readInt2 = parcel.readInt();
        boolean z2 = parcel.readInt() == 1;
        aovw aovw = (aovw) xup.a(parcel2, aovw.e);
        ajwf ajwf = new ajwf();
        byte[] createByteArray2 = parcel.createByteArray();
        ajwf ajwf2 = (ajwf) (createByteArray2 != null ? aocf.mergeFrom(ajwf, createByteArray2) : null);
        long readLong2 = parcel.readLong();
        boolean z3 = parcel.readInt() == 1;
        boolean z4 = parcel.readInt() == 1;
        Uri uri4 = (Uri) parcel2.readParcelable(Uri.class.getClassLoader());
        aagr aagr = (aagr) parcel2.readParcelable(cls.getClassLoader());
        aagr aagr2 = (aagr) parcel2.readParcelable(cls.getClassLoader());
        arrayList = new ArrayList();
        parcel2.readStringList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        aagr aagr3 = aagr2;
        int size = arrayList.size();
        ArrayList arrayList3 = arrayList;
        int i = 0;
        while (i < size) {
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = arrayList4;
            int i2 = size;
            arrayList2.add((aagf) Enum.valueOf(aagf.class, (String) arrayList4.get(i)));
            i++;
            parcel2 = parcel;
            size = i2;
            arrayList3 = arrayList5;
        }
        List unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        parcel2.readTypedList(arrayList, aagw.CREATOR);
        List unmodifiableList3 = Collections.unmodifiableList(arrayList);
        aagh aagh = (aagh) parcel2.readParcelable(aagh.class.getClassLoader());
        List a22 = aagr.a(parcel);
        List a23 = aagr.a(parcel);
        List a24 = aagr.a(parcel);
        boolean z5 = parcel.readInt() == 1;
        String readString11 = parcel.readString();
        this(a, readString, readString2, readString3, readString4, readString5, createByteArray, readString6, readString7, readString8, readString9, aagc, str, readInt, aakj, aajs, aakh, aajj, awcq, uri, a2, a3, a4, a5, unmodifiableList, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, uri2, uri3, z, readLong, readInt2, z2, aovw, ajwf2, readLong2, z3, z4, uri4, aagr, aagr3, unmodifiableList2, unmodifiableList3, aagh, a22, a23, a24, z5, !TextUtils.isEmpty(readString11) ? Pattern.compile(readString11) : null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aagr) {
            aagr aagr = (aagr) obj;
            if (amqq.a(this.c, aagr.c) && amqq.a(this.d, aagr.d) && amqq.a(this.e, aagr.e) && amqq.a(this.f, aagr.f) && amqq.a(this.g, aagr.g) && Arrays.equals(this.h, aagr.h) && amqq.a(this.i, aagr.i) && amqq.a(this.j, aagr.j) && amqq.a(this.k, aagr.k) && amqq.a(this.l, aagr.l) && amqq.a(this.m, aagr.m) && amqq.a(this.n, aagr.n) && amqq.a(this.p, aagr.p) && amqq.a(this.ak, aagr.ak) && amqq.a(this.q, aagr.q) && amqq.a(this.r, aagr.r) && amqq.a(this.t, aagr.t) && this.o == aagr.o && this.R == aagr.R && this.S == aagr.S && this.T == aagr.T && amqq.a(this.b, aagr.b) && amqq.a(this.u, aagr.u) && amqq.a(this.v, aagr.v) && amqq.a(this.w, aagr.w) && amqq.a(this.x, aagr.x) && amqq.a(this.y, aagr.y) && amqq.a(this.z, aagr.z) && amqq.a(this.A, aagr.A) && amqq.a(this.B, aagr.B) && amqq.a(this.C, aagr.C) && amqq.a(this.D, aagr.D) && amqq.a(this.E, aagr.E) && amqq.a(this.F, aagr.F) && amqq.a(this.G, aagr.G) && amqq.a(this.H, aagr.H) && amqq.a(this.I, aagr.I) && amqq.a(this.J, aagr.J) && amqq.a(this.K, aagr.K) && amqq.a(this.L, aagr.L) && amqq.a(this.M, aagr.M) && amqq.a(this.N, aagr.N) && amqq.a(this.O, aagr.O) && amqq.a(this.P, aagr.P) && amqq.a(this.Q, aagr.Q) && amqq.a(this.X, aagr.X) && amqq.a(this.Y, aagr.Y) && amqq.a(this.Z, aagr.Z) && this.ab == aagr.ab && this.ac == aagr.ac && amqq.a(this.ap, aagr.ap) && amqq.a(this.ad, aagr.ad) && amqq.a(this.ae, aagr.ae) && amqq.a(this.s, aagr.s) && amqq.a(this.ag, aagr.ag) && amqq.a(this.ah, aagr.ah) && amqq.a(this.ai, aagr.ai) && this.af == aagr.af && amqq.a(this.aj, aagr.aj)) {
                return true;
            }
        }
        return false;
    }

    private static amul a(List list) {
        return list != null ? amul.a((Collection) list) : amul.g();
    }

    public final /* synthetic */ afns c() {
        return new aags(this);
    }

    public final /* bridge */ /* synthetic */ aagi ah() {
        return this.ae;
    }

    static {
        aagr aagr = new aagr();
        String num = Integer.toString(2);
        String num2 = Integer.toString(2);
        String num3 = Integer.toString(15);
        int length = String.valueOf(num).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 2) + String.valueOf(num2).length()) + String.valueOf(num3).length());
        stringBuilder.append(num);
        stringBuilder.append('_');
        stringBuilder.append(num2);
        stringBuilder.append('_');
        stringBuilder.append(num3);
        a = stringBuilder.toString();
        aags aags = new aags();
    }
}
