package defpackage;

import java.util.Arrays;

/* renamed from: ajya */
public final class ajya extends ajwo {
    public static final aobz a = aobz.a(ajya.class, 405048002);
    private arml A;
    private int B;
    public String b = "";
    public ajxz[] c;
    public int d;
    public String e;
    public int f;
    public arml g;
    public boolean h;
    public String i;
    public atzt j;
    public awjn[] k;
    public arml l;
    public awjf m;
    public auvr n;
    public axak o;
    public int p;
    private boolean q;
    private auac r;
    private arml s;
    private arml t;
    private byte[] u;
    private apdh[] v;
    private arml w;
    private boolean x;
    private apxu y;
    private int z;

    public ajya() {
        super(50631000);
        if (ajxz.a == null) {
            synchronized (aocd.b) {
                if (ajxz.a == null) {
                    ajxz.a = new ajxz[0];
                }
            }
        }
        this.c = ajxz.a;
        this.d = 0;
        this.e = "";
        this.f = 0;
        this.h = false;
        this.q = false;
        this.r = auac.INDIFFERENT;
        this.i = "";
        this.k = new awjn[0];
        this.p = 1;
        this.u = aock.c;
        this.v = new apdh[0];
        this.x = false;
        this.z = 0;
        this.B = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajya) {
            ajya ajya = (ajya) obj;
            String str = this.b;
            if (str == null) {
                if (ajya.b != null) {
                    return false;
                }
            } else if (!str.equals(ajya.b)) {
                return false;
            }
            if (aocd.a(this.c, ajya.c) && this.d == ajya.d) {
                str = this.e;
                if (str == null) {
                    if (ajya.e != null) {
                        return false;
                    }
                } else if (!str.equals(ajya.e)) {
                    return false;
                }
                if (this.f == ajya.f) {
                    arml arml = this.g;
                    if (arml == null) {
                        if (ajya.g != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajya.g)) {
                        return false;
                    }
                    if (this.h == ajya.h && this.q == ajya.q && this.r == ajya.r) {
                        str = this.i;
                        if (str == null) {
                            if (ajya.i != null) {
                                return false;
                            }
                        } else if (!str.equals(ajya.i)) {
                            return false;
                        }
                        atzt atzt = this.j;
                        if (atzt == null) {
                            if (ajya.j != null) {
                                return false;
                            }
                        } else if (!atzt.equals(ajya.j)) {
                            return false;
                        }
                        if (aocd.a(this.k, ajya.k)) {
                            arml = this.s;
                            if (arml == null) {
                                if (ajya.s != null) {
                                    return false;
                                }
                            } else if (!arml.equals(ajya.s)) {
                                return false;
                            }
                            arml = this.t;
                            if (arml == null) {
                                if (ajya.t != null) {
                                    return false;
                                }
                            } else if (!arml.equals(ajya.t)) {
                                return false;
                            }
                            arml = this.l;
                            if (arml == null) {
                                if (ajya.l != null) {
                                    return false;
                                }
                            } else if (!arml.equals(ajya.l)) {
                                return false;
                            }
                            if (this.p == ajya.p && Arrays.equals(this.u, ajya.u) && aocd.a(this.v, ajya.v)) {
                                arml = this.w;
                                if (arml == null) {
                                    if (ajya.w != null) {
                                        return false;
                                    }
                                } else if (!arml.equals(ajya.w)) {
                                    return false;
                                }
                                if (this.x == ajya.x) {
                                    apxu apxu = this.y;
                                    if (apxu == null) {
                                        if (ajya.y != null) {
                                            return false;
                                        }
                                    } else if (!apxu.equals(ajya.y)) {
                                        return false;
                                    }
                                    awjf awjf = this.m;
                                    if (awjf == null) {
                                        if (ajya.m != null) {
                                            return false;
                                        }
                                    } else if (!awjf.equals(ajya.m)) {
                                        return false;
                                    }
                                    auvr auvr = this.n;
                                    if (auvr == null) {
                                        if (ajya.n != null) {
                                            return false;
                                        }
                                    } else if (!auvr.equals(ajya.n)) {
                                        return false;
                                    }
                                    if (this.z == ajya.z) {
                                        arml = this.A;
                                        if (arml == null) {
                                            if (ajya.A != null) {
                                                return false;
                                            }
                                        } else if (!arml.equals(ajya.A)) {
                                            return false;
                                        }
                                        if (this.B == ajya.B) {
                                            axak axak = this.o;
                                            if (axak == null) {
                                                if (ajya.o != null) {
                                                    return false;
                                                }
                                            } else if (!axak.equals(ajya.o)) {
                                                return false;
                                            }
                                            aocb aocb = this.unknownFieldData;
                                            if (aocb != null && !aocb.b()) {
                                                return this.unknownFieldData.equals(ajya.unknownFieldData);
                                            }
                                            aocb aocb2 = ajya.unknownFieldData;
                                            return aocb2 == null || aocb2.b();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + aocd.a(this.c)) * 31) + this.d) * 31;
        str = this.e;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i2 = this.f;
        arml arml = this.g;
        hashCode = (((((hashCode + hashCode2) * 31) + i2) * 31) + (arml != null ? arml.hashCode() : 0)) * 31;
        i2 = 1237;
        hashCode = (((hashCode + (!this.h ? 1237 : 1231)) * 31) + (!this.q ? 1237 : 1231)) * 31;
        auac auac = this.r;
        hashCode = (hashCode + (auac != null ? auac.hashCode() : 0)) * 31;
        str = this.i;
        hashCode2 = str != null ? str.hashCode() : 0;
        atzt atzt = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atzt != null ? atzt.hashCode() : 0;
        int a = aocd.a(this.k);
        arml arml2 = this.s;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml arml3 = this.t;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        arml3 = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + (arml3 != null ? arml3.hashCode() : 0)) * 31;
        hashCode2 = this.p;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        a = Arrays.hashCode(this.u);
        int a2 = aocd.a(this.v);
        arml arml4 = this.w;
        hashCode = (((((((hashCode + hashCode2) * 31) + a) * 31) + a2) * 31) + (arml4 != null ? arml4.hashCode() : 0)) * 31;
        if (this.x) {
            i2 = 1231;
        }
        apxu apxu = this.y;
        hashCode = (hashCode + i2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        awjf awjf = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awjf != null ? awjf.hashCode() : 0;
        auvr auvr = this.n;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        i2 = this.z;
        arml = this.A;
        hashCode = (((hashCode + hashCode2) * 31) + i2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        i2 = this.B;
        axak axak = this.o;
        hashCode = (((((hashCode + hashCode2) * 31) + i2) * 31) + (axak != null ? axak.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.b);
        }
        ajxz[] ajxzArr = this.c;
        int i2 = 0;
        if (ajxzArr != null && ajxzArr.length > 0) {
            i = 0;
            while (true) {
                ajxz[] ajxzArr2 = this.c;
                if (i >= ajxzArr2.length) {
                    break;
                }
                aocf aocf = ajxzArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        i = this.d;
        if (i != 0) {
            aoby.a(3, i);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.e);
        }
        i = this.f;
        if (i != 0) {
            aoby.a(6, i);
        }
        anze anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        if (this.h) {
            aoby.a(8, true);
        }
        if (this.q) {
            aoby.a(11, true);
        }
        if (this.r != auac.INDIFFERENT) {
            auac auac = this.r;
            if (auac != null) {
                aoby.a(12, auac.e);
            }
        }
        str = this.i;
        if (!(str == null || str.equals(str2))) {
            aoby.a(13, this.i);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(14, anze);
        }
        awjn[] awjnArr = this.k;
        if (awjnArr != null && awjnArr.length > 0) {
            i = 0;
            while (true) {
                awjn[] awjnArr2 = this.k;
                if (i >= awjnArr2.length) {
                    break;
                }
                anze anze2 = awjnArr2[i];
                if (anze2 != null) {
                    aoby.a(15, anze2);
                }
                i++;
            }
        }
        anze = this.s;
        if (anze != null) {
            aoby.a(16, anze);
        }
        anze = this.t;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(18, anze);
        }
        i = this.p;
        if (!(i == 1 || i == 0)) {
            aoby.a(19, i - 1);
        }
        if (!Arrays.equals(this.u, aock.c)) {
            aoby.a(20, this.u);
        }
        apdh[] apdhArr = this.v;
        if (apdhArr != null && apdhArr.length > 0) {
            while (true) {
                apdhArr = this.v;
                if (i2 >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[i2];
                if (anze != null) {
                    aoby.a(21, anze);
                }
                i2++;
            }
        }
        anze = this.w;
        if (anze != null) {
            aoby.a(22, anze);
        }
        if (this.x) {
            aoby.a(23, true);
        }
        anze = this.y;
        if (anze != null) {
            aoby.a(24, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(25, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(26, anze);
        }
        i = this.z;
        if (i != 0) {
            aoby.a(27, i);
        }
        anze = this.A;
        if (anze != null) {
            aoby.a(29, anze);
        }
        i = this.B;
        if (i != 0) {
            aoby.a(33, i);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(34, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        ajxz[] ajxzArr = this.c;
        int i2 = 0;
        if (ajxzArr != null && ajxzArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajxz[] ajxzArr2 = this.c;
                if (computeSerializedSize >= ajxzArr2.length) {
                    break;
                }
                aocf aocf = ajxzArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(2, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.c(3, i);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(5, this.e);
        }
        i = this.f;
        if (i != 0) {
            computeSerializedSize += aoby.c(6, i);
        }
        anze anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(8);
        }
        if (this.q) {
            computeSerializedSize += aoby.d(11);
        }
        if (this.r != auac.INDIFFERENT) {
            auac auac = this.r;
            if (auac != null) {
                computeSerializedSize += aoby.c(12, auac.e);
            }
        }
        str = this.i;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(13, this.i);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        awjn[] awjnArr = this.k;
        if (awjnArr != null && awjnArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                awjn[] awjnArr2 = this.k;
                if (computeSerializedSize >= awjnArr2.length) {
                    break;
                }
                anze anze2 = awjnArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(15, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.s;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        anze = this.t;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        i = this.p;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(19, i - 1);
        }
        if (!Arrays.equals(this.u, aock.c)) {
            computeSerializedSize += aoby.b(20, this.u);
        }
        apdh[] apdhArr = this.v;
        if (apdhArr != null && apdhArr.length > 0) {
            while (true) {
                apdhArr = this.v;
                if (i2 >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(21, anze);
                }
                i2++;
            }
        }
        anze = this.w;
        if (anze != null) {
            computeSerializedSize += anwm.c(22, anze);
        }
        if (this.x) {
            computeSerializedSize += aoby.d(23);
        }
        anze = this.y;
        if (anze != null) {
            computeSerializedSize += anwm.c(24, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(25, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(26, anze);
        }
        i = this.z;
        if (i != 0) {
            computeSerializedSize += aoby.c(27, i);
        }
        anze = this.A;
        if (anze != null) {
            computeSerializedSize += anwm.c(29, anze);
        }
        i = this.B;
        if (i != 0) {
            computeSerializedSize += aoby.c(33, i);
        }
        anze = this.o;
        return anze != null ? computeSerializedSize + anwm.c(34, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 2;
            int length;
            arml arml;
            arml arml2;
            armk armk;
            int f;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = aobv.d();
                    continue;
                case 18:
                    aocf ajxz;
                    a = aock.a(aobv, 18);
                    ajxz[] ajxzArr = this.c;
                    length = ajxzArr != null ? ajxzArr.length : 0;
                    ajxz[] ajxzArr2 = new ajxz[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajxzArr, 0, ajxzArr2, 0, length);
                    }
                    while (length < ajxzArr2.length - 1) {
                        ajxz = new ajxz();
                        ajxzArr2[length] = ajxz;
                        aobv.a(ajxz);
                        aobv.a();
                        length++;
                    }
                    ajxz = new ajxz();
                    ajxzArr2[length] = ajxz;
                    aobv.a(ajxz);
                    this.c = ajxzArr2;
                    continue;
                case 24:
                    this.d = aobv.f();
                    continue;
                case 42:
                    this.e = aobv.d();
                    continue;
                case 48:
                    this.f = aobv.f();
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.g;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.g = arml;
                    continue;
                case 64:
                    this.h = aobv.c();
                    continue;
                case 88:
                    this.q = aobv.c();
                    continue;
                case 96:
                    int i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2) {
                        this.r = auac.a(f);
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 106:
                    this.i = aobv.d();
                    continue;
                case 114:
                    atzt atzt = (atzt) aobv.a(atzt.c.getParserForType());
                    atzt atzt2 = this.j;
                    if (atzt2 != null) {
                        atzs atzs = (atzs) ((anxo) atzt2.toBuilder());
                        atzs.mergeFrom(atzt);
                        atzt = (atzt) ((anxl) atzs.build());
                    }
                    this.j = atzt;
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    awjn[] awjnArr = this.k;
                    length = awjnArr != null ? awjnArr.length : 0;
                    awjn[] awjnArr2 = new awjn[(a + length)];
                    if (length != 0) {
                        System.arraycopy(awjnArr, 0, awjnArr2, 0, length);
                    }
                    while (length < awjnArr2.length - 1) {
                        awjnArr2[length] = (awjn) aobv.a(awjn.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    awjnArr2[length] = (awjn) aobv.a(awjn.f.getParserForType());
                    this.k = awjnArr2;
                    continue;
                case 130:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.s;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.s = arml;
                    continue;
                case 138:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.t;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.t = arml;
                    continue;
                case 146:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.l;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.l = arml;
                    continue;
                case 152:
                    f = aobv.b;
                    int f2 = aobv.f();
                    if (f2 == 0 || f2 == 1 || f2 == 2 || f2 == 3) {
                        if (f2 == 0) {
                            i = 1;
                        } else if (f2 != 1) {
                            i = f2 != 2 ? f2 != 3 ? 0 : 4 : 3;
                        }
                        this.p = i;
                        break;
                    }
                    aobv.e(f);
                    storeUnknownField(aobv, a);
                    continue;
                case 162:
                    this.u = aobv.e();
                    continue;
                case 170:
                    a = aock.a(aobv, 170);
                    apdh[] apdhArr = this.v;
                    length = apdhArr != null ? apdhArr.length : 0;
                    apdh[] apdhArr2 = new apdh[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apdhArr, 0, apdhArr2, 0, length);
                    }
                    while (length < apdhArr2.length - 1) {
                        apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                    this.v = apdhArr2;
                    continue;
                case 178:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.w;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.w = arml;
                    continue;
                case 184:
                    this.x = aobv.c();
                    continue;
                case 194:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.y;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.y = apxu;
                    continue;
                case 202:
                    awjf awjf = (awjf) aobv.a(awjf.c.getParserForType());
                    awjf awjf2 = this.m;
                    if (awjf2 != null) {
                        awje awje = (awje) ((anxo) awjf2.toBuilder());
                        awje.mergeFrom(awjf);
                        awjf = (awjf) ((anxl) awje.build());
                    }
                    this.m = awjf;
                    continue;
                case 210:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.n;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.n = auvr;
                    continue;
                case 216:
                    this.z = aobv.f();
                    continue;
                case 234:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.A;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.A = arml;
                    continue;
                case 264:
                    this.B = aobv.f();
                    continue;
                case 274:
                    axak axak = (axak) aobv.a(axak.a.getParserForType());
                    axak axak2 = this.o;
                    if (axak2 != null) {
                        axaj axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.o = axak;
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
