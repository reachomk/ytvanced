package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aakj */
public final class aakj implements Parcelable {
    public static final Creator CREATOR = new aaki();
    public final ajxu a;
    public final long b;
    public final aajs c;
    public xto d;
    public final aakl e;
    private atdv f;
    private aakh g;
    private aajj h;
    private awcq i;
    private aakj j;
    private List k;
    private aakr l;
    private aoio m;
    private aolc n;

    private aakj(ajxu ajxu) {
        this(ajxu, 0, aajx.a);
    }

    public final int describeContents() {
        return 0;
    }

    public aakj(ajxu ajxu, long j, aajx aajx) {
        this(ajxu, j, aakj.a(aajx, ajxu, j));
    }

    public aakj(ajxu ajxu, long j, aajs aajs) {
        this(ajxu, j, aajs, new aakl());
    }

    public aakj(ajxu ajxu, long j, aajs aajs, aakl aakl) {
        this.a = (ajxu) amqw.a((Object) ajxu);
        this.b = j;
        this.c = aajs;
        this.e = aakl;
    }

    public aakj(aajs aajs, aakh aakh, aajj aajj) {
        this.a = new ajxu();
        ajxu ajxu = this.a;
        ates ates = (ates) atep.l.createBuilder();
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(aajs.d);
        ates.copyOnWrite();
        atep atep = (atep) ates.instance;
        atep.a |= 4;
        atep.d = toSeconds;
        ajxu.g = (atep) ((anxl) ates.build());
        this.c = (aajs) amqw.a((Object) aajs);
        this.b = aajs.e;
        this.g = (aakh) amqw.a((Object) aakh);
        this.h = (aajj) amqw.a((Object) aajj);
        this.e = new aakl();
    }

    public static aakj a() {
        return new aakj(new ajxu());
    }

    public final String b() {
        atep atep = this.a.g;
        if (atep == null) {
            return "";
        }
        return atep.b;
    }

    public final String c() {
        atep atep = this.a.g;
        if (atep == null) {
            return "";
        }
        return atep.c;
    }

    public final boolean d() {
        atep atep = this.a.g;
        return atep != null && atep.g;
    }

    public final aoio e() {
        if (this.m == null) {
            for (atdz atdz : this.a.d) {
                if (atdz.a == 97725940) {
                    this.m = (aoio) atdz.b;
                    break;
                }
            }
        }
        return this.m;
    }

    public final String f() {
        atep atep = this.a.g;
        if (atep == null) {
            return "";
        }
        return atep.k;
    }

    public final aaft g() {
        aygk aygk;
        atep atep = this.a.g;
        if (atep == null) {
            aygk = null;
        } else {
            aygk = atep.j;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        return new aaft(aygk);
    }

    public final void a(aaft aaft) {
        ajxu ajxu = this.a;
        if (ajxu.g == null) {
            ajxu.g = atep.l;
        }
        ajxu = this.a;
        ates ates = (ates) ((anxo) ajxu.g.toBuilder());
        aygk d = aaft.d();
        ates.copyOnWrite();
        atep atep = (atep) ates.instance;
        if (d != null) {
            atep.j = d;
            atep.a |= 262144;
            ajxu.g = (atep) ((anxl) ates.build());
            return;
        }
        throw new NullPointerException();
    }

    public final int h() {
        atep atep = this.a.g;
        return atep != null ? (int) atep.d : 0;
    }

    public final boolean i() {
        aajs aajs = this.c;
        boolean z = true;
        if (aajs != null) {
            return aajs.a() && this.c.b();
        } else {
            atep atep = this.a.g;
            if (atep == null) {
                z = false;
            } else if (atep.h) {
                return z;
            } else {
                return false;
            }
            return z;
        }
    }

    public final boolean j() {
        aajs aajs = this.c;
        if (aajs != null) {
            return aajs.a();
        }
        atep atep = this.a.g;
        if (atep != null && atep.e) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return u() != null;
    }

    public final atdv l() {
        if (this.f == null) {
            atdv atdv = this.a.a;
            if (atdv != null) {
                this.f = atdv;
            }
        }
        return this.f;
    }

    public final aakh m() {
        if (this.g == null) {
            this.g = new aakh(this.a.e);
        }
        return this.g;
    }

    public final aajj n() {
        if (this.h == null) {
            aajj aajj;
            awdg awdg = this.a.j;
            if (awdg != null) {
                aajj = new aajj(awdg);
            } else {
                aajj = aajj.b;
            }
            this.h = aajj;
        }
        return this.h;
    }

    public static aajs a(aajx aajx, ajxu ajxu, long j) {
        return aakj.a(aajx, ajxu, j, null);
    }

    public static aajs a(aajx aajx, ajxu ajxu, long j, String str) {
        ajxu ajxu2 = ajxu;
        amqw.a((Object) aajx);
        atdh atdh = ajxu2.c;
        String str2 = "";
        String str3 = atdh == null ? str2 : atdh.e;
        if (ajxu2.b == null) {
            return null;
        }
        long j2;
        aajo aajo;
        aajj aajj;
        atep atep = ajxu2.g;
        Object obj = atep == null ? null : 1;
        if (atep != null) {
            str2 = atep.b;
        }
        if (obj == null) {
            j2 = 0;
        } else {
            j2 = TimeUnit.SECONDS.toMillis(atep.d);
        }
        long j3 = j2;
        boolean z = obj != null && atep.e;
        boolean z2 = obj != null && atep.h;
        boolean z3 = obj != null && atep.f;
        int i = obj != null ? atep.i : 0;
        if (ajzv.b(ajxu2.l, awgr.class)) {
            aajo = new aajo((awgr) ajzv.a(ajxu2.l, awgr.class));
        } else {
            aajo = new aajo();
        }
        aajo aajo2 = aajo;
        awdg awdg = ajxu2.j;
        if (awdg == null) {
            aajj = aajj.b;
        } else {
            aajj = new aajj(awdg);
        }
        return aajx.a(ajxu2.b, str2, str, j3, j, z, z2, z3, i, aajo2, str3, aajj);
    }

    public final aolc o() {
        if (this.n == null) {
            for (atdz atdz : this.a.d) {
                if (atdz != null && atdz.a == 89145698) {
                    this.n = (aolc) atdz.b;
                    break;
                }
            }
        }
        return this.n;
    }

    public final azdi p() {
        ater ater = this.a.r;
        return (ater == null || ater.a != 74049584) ? null : (azdi) ater.b;
    }

    public final List q() {
        if (this.k == null) {
            this.k = new ArrayList();
            for (atdz atdz : this.a.d) {
                if (atdz.a == 84813246) {
                    this.k.add((aogi) atdz.b);
                }
            }
        }
        return this.k;
    }

    public final aogi r() {
        for (atdz atdz : this.a.d) {
            aogi aogi;
            if (atdz.a == 84813246) {
                aogi = (aogi) atdz.b;
            } else {
                aogi = aogi.h;
            }
            int a = aogh.a(aogi.d);
            if (a != 0 && a == 2) {
                return aogi;
            }
        }
        return null;
    }

    public final aakj s() {
        if (this.j == null) {
            aoia aoia;
            for (atdz atdz : this.a.d) {
                if (atdz != null && atdz.a == 88254013) {
                    aoia = (aoia) atdz.b;
                    break;
                }
            }
            aoia = null;
            if (aoia != null) {
                anvu anvu;
                if (aoia.b == 1) {
                    anvu = (anvu) aoia.c;
                } else {
                    anvu = anvu.a;
                }
                this.j = aakj.a(anvu.d(), this.b);
            }
        }
        return this.j;
    }

    public final awcq t() {
        if (this.i == null) {
            atcz atcz = this.a.o;
            if (atcz != null && atcz.a == 59961494) {
                this.i = (awcq) atcz.b;
            }
        }
        return this.i;
    }

    public final aakr a(aajx aajx) {
        if (this.l == null) {
            azpk azpk;
            ajxu ajxu;
            atdv l = l();
            if (l != null) {
                int a = awah.a(l.b);
                if (a != 0 && a == 3) {
                    atdt atdt = l.f;
                    if (atdt == null) {
                        atdt = atdt.c;
                    }
                    if (atdt.a == 86164011) {
                        atdt atdt2 = l.f;
                        if (atdt2 == null) {
                            atdt2 = atdt.c;
                        }
                        if (atdt2.a == 86164011) {
                            azpk = (azpk) atdt2.b;
                        } else {
                            azpk = azpk.d;
                        }
                        if (azpk != null && azpk.b.b() > 0) {
                            ajxu = new ajxu();
                            aocf.mergeFrom(ajxu, azpk.b.d());
                            this.l = new aakr(azpk, new aakj(ajxu, this.b, aajx));
                        }
                    }
                }
            }
            azpk = null;
            ajxu = new ajxu();
            try {
                aocf.mergeFrom(ajxu, azpk.b.d());
                this.l = new aakr(azpk, new aakj(ajxu, this.b, aajx));
            } catch (aocg unused) {
                return null;
            }
        }
        return this.l;
    }

    public final avqc u() {
        return this.a.i;
    }

    public final atef[] v() {
        return this.a.s;
    }

    public final int hashCode() {
        return ((b().hashCode() + 19) * 19) + (l() != null ? Arrays.hashCode(l().toByteArray()) : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aakj) {
            aakj aakj = (aakj) obj;
            return amqq.a(b(), aakj.b()) && amqq.a(l(), aakj.l());
        }
    }

    public final aakj a(aajx aajx, aahr aahr, aahr aahr2) {
        aten aten = this.a.b;
        return a(aajx, aahr, aahr2, this.b, aten != null ? aten.b : 0);
    }

    public final aakj a(aajx aajx, aahr aahr, aahr aahr2, long j, long j2) {
        ajxu ajxu = new ajxu();
        aocf.mergeFrom(ajxu, aocf.toByteArray(this.a));
        aten aten = ajxu.b;
        ateq ateq = aten != null ? (ateq) ((anxo) aten.toBuilder()) : null;
        if (ateq != null) {
            ateq.a(Math.max(0, j2));
            SparseArray a = aakj.a(Collections.unmodifiableList(((aten) ateq.instance).d));
            if (aahr != null) {
                if (aahr.D()) {
                    a.put(aahr.b(), aahr.a);
                } else {
                    SparseArray a2 = aakj.a(ateq.a());
                    a2.put(aahr.b(), aahr.a);
                    ateq.c();
                    ateq.a(aakj.a(a2));
                }
            }
            if (aahr2 != null) {
                a.put(aahr2.b(), aahr2.a);
            }
            ateq.e();
            ateq.b(aakj.a(a));
            ajxu.b = (aten) ((anxl) ateq.build());
        }
        return new aakj(ajxu, j, aakj.a(aajx, ajxu, j));
    }

    public final aakj a(aajx aajx, aahr aahr, aahr aahr2, long j, long j2, boolean z) {
        ajxu ajxu = new ajxu();
        aocf.mergeFrom(ajxu, aocf.toByteArray(this.a));
        aten aten = ajxu.b;
        ateq ateq = aten != null ? (ateq) ((anxo) aten.toBuilder()) : null;
        if (ateq != null) {
            int d;
            ateq.a(Math.max(0, j2));
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            if (aahr != null) {
                if (aahr.D()) {
                    sparseArray.put(aahr.b(), aahr.a);
                } else {
                    sparseArray2.put(aahr.b(), aahr.a);
                }
            } else if (z) {
                int i;
                arlv a;
                d = ateq.d();
                for (i = 0; i < d; i++) {
                    a = ateq.a(i);
                    if (aaja.a(a.e)) {
                        sparseArray.put(a.c, a);
                    }
                }
                d = ateq.b();
                for (i = 0; i < d; i++) {
                    a = (arlv) ((aten) ateq.instance).c.get(i);
                    sparseArray2.put(a.c, a);
                }
            }
            if (aahr2 != null) {
                sparseArray.put(aahr2.b(), aahr2.a);
            } else if (z) {
                d = ateq.d();
                for (int i2 = 0; i2 < d; i2++) {
                    arlv a2 = ateq.a(i2);
                    if (aaja.b(a2.e)) {
                        sparseArray.put(a2.c, a2);
                    }
                }
            }
            ateq.e();
            ateq.b(aakj.a(sparseArray));
            ateq.c();
            ateq.a(aakj.a(sparseArray2));
            ajxu.b = (aten) ((anxl) ateq.build());
        }
        return new aakj(ajxu, j, aakj.a(aajx, ajxu, j));
    }

    private static SparseArray a(List list) {
        SparseArray sparseArray = new SparseArray();
        for (arlv arlv : amvj.a(list)) {
            sparseArray.put(arlv.c, arlv);
        }
        return sparseArray;
    }

    private static List a(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((arlv) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public final aakj b(aajx aajx) {
        ajxu ajxu = new ajxu();
        aocf.mergeFrom(ajxu, aocf.toByteArray(this.a));
        aten aten = ajxu.b;
        if (aten != null) {
            ateq ateq = (ateq) ((anxo) aten.toBuilder());
            ateq.e();
            ateq.c();
            aten = (aten) ((anxl) ateq.build());
        } else {
            aten = null;
        }
        ajxu.b = aten;
        ajxu.d = new atdz[0];
        return new aakj(ajxu, this.b, aajx);
    }

    public final byte[] w() {
        return aocf.toByteArray(this.a);
    }

    public static aakj a(byte[] bArr, long j) {
        if (bArr != null) {
            try {
                ajxu ajxu = new ajxu();
                aocf.mergeFrom(ajxu, bArr);
                return new aakj(ajxu, j, aajx.b);
            } catch (aocg unused) {
            }
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(parcel, this.a);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public final byte[] x() {
        return this.a.n;
    }

    public final String y() {
        return this.a.p;
    }

    public final String z() {
        return this.a.q;
    }
}
