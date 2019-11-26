package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aajs */
public final class aajs implements Parcelable {
    public static final Creator CREATOR = new aajv();
    public static final aajs a = new aajs(aten.j, "", 0, Long.MAX_VALUE, 0, new aajo(), "", null, 0, false);
    public final aten b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final aajo g;
    public final String h;
    public final aaiz i;
    public final int j;
    public final boolean k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final aahr q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    private oqx v;
    private aaju w;
    private Integer x;
    private Map y;

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Missing block: B:54:0x00de, code skipped:
            if (r1.c.size() > 0) goto L_0x00e8;
     */
    public aajs(defpackage.aten r15, java.lang.String r16, long r17, long r19, boolean r21, boolean r22, boolean r23, int r24, defpackage.aajo r25, java.lang.String r26, defpackage.aajj r27) {
        /*
        r14 = this;
        r1 = r15;
        r0 = r27;
        r2 = r1.b;
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0016;
    L_0x000b:
        r2 = java.util.concurrent.TimeUnit.SECONDS;
        r6 = r1.b;
        r2 = r2.toMillis(r6);
        r2 = r19 + r2;
        goto L_0x001b;
    L_0x0016:
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x001b:
        r6 = r2;
        r2 = r1.d;
        r2 = r2.size();
        r3 = 9;
        r8 = 4;
        r9 = 2;
        r10 = 1;
        r11 = 0;
        if (r21 == 0) goto L_0x009f;
    L_0x002a:
        if (r2 <= 0) goto L_0x006d;
    L_0x002c:
        if (r22 == 0) goto L_0x0067;
    L_0x002e:
        r2 = r1.d;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x0063;
    L_0x0036:
        r2 = r1.d;
        r2 = r2.get(r11);
        r2 = (defpackage.arlv) r2;
        r2 = r2.d;
        r2 = android.net.Uri.parse(r2);
        r8 = "maxdsq";
        r8 = r2.getQueryParameter(r8);
        if (r8 != 0) goto L_0x0052;
    L_0x004c:
        r8 = "max_sq";
        r8 = r2.getQueryParameter(r8);
    L_0x0052:
        if (r8 == 0) goto L_0x0063;
    L_0x0054:
        r12 = java.lang.Long.parseLong(r8);
        r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0063;
    L_0x005d:
        r2 = 10;
        r12 = 10;
        goto L_0x00e9;
    L_0x0063:
        r12 = 9;
        goto L_0x00e9;
    L_0x0067:
        r2 = 8;
        r12 = 8;
        goto L_0x00e9;
    L_0x006d:
        r2 = r27.Y();
        if (r2 == 0) goto L_0x0094;
    L_0x0073:
        r2 = r1.e;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0094;
    L_0x007b:
        if (r22 == 0) goto L_0x0092;
    L_0x007d:
        r2 = r0.c;
        r3 = r2.a;
        r3 = r3 & r9;
        if (r3 == 0) goto L_0x0092;
    L_0x0084:
        r2 = r2.d;
        if (r2 != 0) goto L_0x008a;
    L_0x0088:
        r2 = defpackage.arhh.bv;
    L_0x008a:
        r2 = r2.ad;
        if (r2 != 0) goto L_0x008f;
    L_0x008e:
        goto L_0x0092;
    L_0x008f:
        r2 = 5;
        r12 = 5;
        goto L_0x00e9;
    L_0x0092:
        r12 = 4;
        goto L_0x00e9;
    L_0x0094:
        r2 = r1.f;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x009d;
    L_0x009c:
        goto L_0x00e1;
    L_0x009d:
        r12 = 2;
        goto L_0x00e9;
    L_0x009f:
        if (r23 == 0) goto L_0x00c4;
    L_0x00a1:
        if (r2 <= 0) goto L_0x00a8;
    L_0x00a3:
        r2 = 11;
        r12 = 11;
        goto L_0x00e9;
    L_0x00a8:
        r2 = r27.Z();
        if (r2 == 0) goto L_0x00b9;
    L_0x00ae:
        r2 = r1.e;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x00b9;
    L_0x00b6:
        r2 = 6;
        r12 = 6;
        goto L_0x00e9;
    L_0x00b9:
        r2 = r1.f;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x00e1;
    L_0x00c1:
        r2 = 3;
        r12 = 3;
        goto L_0x00e9;
    L_0x00c4:
        if (r2 > 0) goto L_0x00e8;
    L_0x00c6:
        r2 = r27.Z();
        if (r2 != 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00d8;
    L_0x00cd:
        r2 = r1.e;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x00d8;
    L_0x00d5:
        r2 = 7;
        r12 = 7;
        goto L_0x00e9;
    L_0x00d8:
        r2 = r1.c;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e8;
    L_0x00e1:
        r2 = "Invalid playback type; playback will not start.";
        defpackage.xtl.c(r2);
        r12 = 0;
        goto L_0x00e9;
    L_0x00e8:
        r12 = 1;
    L_0x00e9:
        r0 = r0.c;
        r2 = r0.a;
        r2 = r2 & r9;
        if (r2 == 0) goto L_0x00fd;
    L_0x00f0:
        r0 = r0.d;
        if (r0 != 0) goto L_0x00f6;
    L_0x00f4:
        r0 = defpackage.arhh.bv;
    L_0x00f6:
        r0 = r0.aX;
        if (r0 != 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x00fd;
    L_0x00fb:
        r13 = 1;
        goto L_0x00fe;
    L_0x00fd:
        r13 = 0;
    L_0x00fe:
        r10 = 0;
        r0 = r14;
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r5 = r6;
        r7 = r24;
        r8 = r25;
        r9 = r26;
        r11 = r12;
        r12 = r13;
        r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajs.<init>(aten, java.lang.String, long, long, boolean, boolean, boolean, int, aajo, java.lang.String, aajj):void");
    }

    public final int describeContents() {
        return 0;
    }

    public aajs(aten aten, String str, long j, long j2, int i, aajo aajo, String str2, aaiz aaiz, int i2, boolean z) {
        aahr aahr;
        aten aten2 = aten;
        this.x = null;
        this.b = (aten) amqw.a((Object) aten);
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = i >= 0 ? i : 3;
        this.g = (aajo) amqw.a((Object) aajo);
        this.h = (String) amqw.a((Object) str2);
        this.i = aaiz;
        this.j = i2;
        this.k = z;
        if (aten2.f.isEmpty()) {
            this.q = null;
        } else {
            Uri parse = Uri.parse(aten2.f);
            arlx arlx = (arlx) arlv.E.createBuilder();
            arlx.a(aahv.at);
            arlx.b("application/x-mpegURL");
            arlx.a(parse.toString());
            this.q = new aahr((arlv) ((anxl) arlx.build()), str, j, false);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (arlv arlv : aten2.c) {
            if (!arlv.p) {
                aahr = new aahr(arlv, str, j, z);
                arrayList.add(aahr);
                arrayList2.add(aahr);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = aten2.d.iterator();
        boolean z2 = false;
        int i3 = 3;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            arlv arlv2 = (arlv) it.next();
            Iterator it2 = it;
            if (!arlv2.p) {
                aahr = new aahr(arlv2, str, j, z);
                arrayList.add(aahr);
                arrayList3.add(aahr);
                if (aahr.F()) {
                    arrayList4.add(aahr);
                } else if (aahr.E()) {
                    arrayList5.add(aahr);
                }
                if (!z4 && aahv.e().contains(Integer.valueOf(aahr.b()))) {
                    z4 = true;
                } else if (!z3 && aahv.f().contains(Integer.valueOf(aahr.b()))) {
                    z3 = true;
                } else if (i3 == 3 && aahv.g().contains(Integer.valueOf(aahr.b()))) {
                    arlv arlv3 = aahr.a;
                    if ((arlv3.a & 536870912) != 0) {
                        arlp arlp = arlv3.z;
                        if (arlp == null) {
                            arlp = arlp.d;
                        }
                        int a = arlr.a(arlp.b);
                        i3 = a != 0 ? a : 1;
                    } else {
                        i3 = 3;
                    }
                }
                if (!z2 && aahr.z()) {
                    z2 = true;
                }
            }
            it = it2;
            String str3 = str;
        }
        this.l = Collections.unmodifiableList(arrayList);
        this.m = Collections.unmodifiableList(arrayList2);
        this.n = Collections.unmodifiableList(arrayList3);
        this.o = Collections.unmodifiableList(arrayList4);
        this.p = Collections.unmodifiableList(arrayList5);
        this.t = z2;
        this.u = i3;
        this.r = z3;
        this.s = z4;
    }

    public final boolean a() {
        int i = this.j;
        if (!(i == 2 || i == 4 || i == 5)) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i = this.j;
        return (i == 2 || i == 4 || i == 8) ? false : true;
    }

    public final boolean c() {
        int i = this.j;
        return i == 2 || i == 3;
    }

    public final boolean d() {
        switch (this.j) {
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    public final boolean e() {
        return this.j == 8;
    }

    public final boolean f() {
        int i = this.j;
        return i == 9 || i == 10;
    }

    public final boolean g() {
        int i = this.j;
        return i == 3 || i == 6 || i == 11;
    }

    public final boolean h() {
        int i = this.j;
        return i == 2 || i == 4 || i == 5 || i == 8 || i == 9;
    }

    public final boolean i() {
        return this.j == 1;
    }

    public final Uri j() {
        return !this.b.e.isEmpty() ? Uri.parse(this.b.e) : null;
    }

    public final Uri k() {
        return !this.b.i.isEmpty() ? Uri.parse(this.b.i) : null;
    }

    public final boolean a(int i) {
        return b(i) != null;
    }

    public final boolean l() {
        return this.m.isEmpty() ^ 1;
    }

    public final aahr b(int i) {
        for (aahr aahr : this.l) {
            if (aahr.b() == i) {
                return aahr;
            }
        }
        return null;
    }

    public final boolean m() {
        for (aahr w : this.l) {
            if (!w.w()) {
                return false;
            }
        }
        return true;
    }

    public final boolean n() {
        for (aahr b : this.l) {
            if (!aahv.n().contains(Integer.valueOf(b.b()))) {
                return false;
            }
        }
        return this.l.isEmpty() ^ 1;
    }

    public final boolean o() {
        for (aahr b : this.l) {
            if (b.b() != aaho.RAW.ax) {
                return false;
            }
        }
        return this.l.isEmpty() ^ 1;
    }

    public final boolean p() {
        return u().a();
    }

    public final boolean q() {
        return u() == aaju.RECTANGULAR_3D || u() == aaju.SPHERICAL_3D;
    }

    public final boolean r() {
        for (Integer intValue : aahv.j()) {
            if (a(intValue.intValue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        for (Integer intValue : aahv.k()) {
            if (a(intValue.intValue())) {
                return true;
            }
        }
        return false;
    }

    public final int t() {
        if (!this.n.isEmpty()) {
            aahr aahr = (aahr) this.n.get(0);
            if (aahr != null) {
                return aahr.o();
            }
        }
        return 0;
    }

    public final boolean a(long j) {
        return j >= this.e;
    }

    public final synchronized aaju u() {
        if (this.w == null) {
            if (this.g.a != 1) {
                for (aahr aahr : this.n) {
                    if (aajs.a(aahr) != aaju.RECTANGULAR_2D) {
                        this.w = aajs.a(aahr);
                        break;
                    }
                }
                for (aahr aahr2 : this.m) {
                    if (aajs.a(aahr2) != aaju.RECTANGULAR_2D) {
                        this.w = aajs.a(aahr2);
                        break;
                    }
                }
                this.w = aaju.RECTANGULAR_2D;
            } else {
                this.w = aaju.RECTANGULAR_3D;
            }
        }
        return this.w;
    }

    public final synchronized Map v() {
        if (this.y == null) {
            this.y = new HashMap();
            for (aahr aahr : this.n) {
                this.y.put(aahr.e, aahr);
            }
        }
        return this.y;
    }

    @Deprecated
    public final synchronized oqx a(String str) {
        if (this.v == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (aahr aahr : this.n) {
                if (aahr.F()) {
                    arrayList.add(aahr.d(str));
                } else if (aahr.E()) {
                    arrayList2.add(aahr.d(str));
                }
            }
            ArrayList arrayList3 = new ArrayList(2);
            if (!arrayList.isEmpty()) {
                arrayList3.add(new oqy(1, arrayList));
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.add(new oqy(2, arrayList2));
            }
            this.v = new oqx(this.d, Collections.singletonList(new ora(arrayList3)));
        }
        return this.v;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        for (aahr aahr : this.l) {
            stringBuilder.append(str);
            stringBuilder.append(aahr.b());
            str = ",";
        }
        String stringBuilder2 = stringBuilder.toString();
        long j = this.d;
        long j2 = this.e;
        int i = this.f;
        String valueOf = String.valueOf(this.g);
        String str2 = this.h;
        int i2 = this.j;
        boolean z = this.k;
        int length = String.valueOf(stringBuilder2).length();
        StringBuilder stringBuilder3 = new StringBuilder(((length + 243) + valueOf.length()) + String.valueOf(str2).length());
        stringBuilder3.append("VideoStreamingData(itags=");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" videoDurationMillis=");
        stringBuilder3.append(j);
        stringBuilder3.append(" expirationInElapsedTimeMillis=");
        stringBuilder3.append(j2);
        stringBuilder3.append(" liveChunkReadahead=");
        stringBuilder3.append(i);
        stringBuilder3.append(" playerThreedRenderer=");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(" innertubeDrmSessionId=");
        stringBuilder3.append(str2);
        stringBuilder3.append(" playbackType=");
        stringBuilder3.append(i2);
        stringBuilder3.append(" useAverageBitrate=");
        stringBuilder3.append(z);
        stringBuilder3.append(")");
        return stringBuilder3.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.b, parcel);
        this.g.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.h);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aajs) {
            aajs aajs = (aajs) obj;
            return this.d == aajs.d && this.e == aajs.e && amqq.a(this.c, aajs.c) && amqq.a(this.b, aajs.b) && this.f == aajs.f && amqq.a(this.g, aajs.g) && amqq.a(this.h, aajs.h) && this.j == aajs.j && this.k == aajs.k;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.j), Boolean.valueOf(this.k)});
    }

    public final boolean w() {
        for (aahr A : this.n) {
            if (A.A()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized int c(int i) {
        if (this.x == null) {
            this.x = Integer.valueOf(0);
            for (aahr aahr : this.p) {
                if (aahr.u() <= i) {
                    this.x = Integer.valueOf(Math.max(this.x.intValue(), aahr.u()));
                }
            }
        }
        return this.x.intValue();
    }

    public final boolean x() {
        int i = this.j;
        return i == 4 || i == 5 || i == 6 || i == 7;
    }

    public final Uri y() {
        amqw.b(this.t);
        for (atzg atzg : this.b.h) {
            atzi a = atzi.a(atzg.b);
            if (a == null) {
                a = atzi.UNKNOWN;
            }
            if (a == atzi.WIDEVINE) {
                return Uri.parse(atzg.c);
            }
        }
        return null;
    }

    public final String z() {
        amqw.b(this.t);
        for (atzg atzg : this.b.h) {
            atzi a = atzi.a(atzg.b);
            if (a == null) {
                a = atzi.UNKNOWN;
            }
            if (a == atzi.WIDEVINE) {
                return atzg.d;
            }
        }
        return null;
    }

    public final aajs a(List list, List list2, aaiz aaiz) {
        ateq ateq = (ateq) ((anxo) this.b.toBuilder());
        ateq.b((Iterable) list);
        ateq.copyOnWrite();
        aten aten = (aten) ateq.instance;
        if (!aten.h.a()) {
            aten.h = anxl.mutableCopy(aten.h);
        }
        anvf.addAll(list2, aten.h);
        return new aajs((aten) ((anxl) ateq.build()), this.c, this.d, this.e, this.f, this.g, this.h, aaiz, this.j, this.k);
    }

    private static aaju a(aahr aahr) {
        if (aahr.I() == 3) {
            return aaju.SPHERICAL;
        }
        if (aahr.I() == 4) {
            return aaju.SPHERICAL_3D;
        }
        if (aahr.I() == 5) {
            return aaju.MESH;
        }
        int a = axuc.a(aahr.a.w);
        if (a == 0 || a != 2) {
            return aaju.RECTANGULAR_2D;
        }
        return aaju.RECTANGULAR_3D;
    }

    /* synthetic */ aajs(aten aten, String str, long j, long j2, int i, aajo aajo, String str2, int i2, boolean z) {
        this(aten, str, j, j2, i, aajo, str2, null, i2, z);
    }
}
