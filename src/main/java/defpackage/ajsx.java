package defpackage;

import java.util.Arrays;

/* renamed from: ajsx */
public final class ajsx extends ajwo {
    public aygk a;
    public arml b;
    public arml c;
    public apxu d;
    public arml e;
    public aqea f;
    public apdh[] g;
    public byte[] h;
    public auvr i;
    private String j;
    private arml k;
    private String l;
    private axwz m;
    private apdh[] n;
    private apxu[] o;
    private aygk p;
    private int q;
    private aulw r;

    public ajsx() {
        super(50794305);
        String str = "";
        this.j = str;
        this.l = str;
        this.g = new apdh[0];
        this.n = new apdh[0];
        this.h = aock.c;
        this.o = new apxu[0];
        this.q = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsx) {
            ajsx ajsx = (ajsx) obj;
            String str = this.j;
            if (str == null) {
                if (ajsx.j != null) {
                    return false;
                }
            } else if (!str.equals(ajsx.j)) {
                return false;
            }
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajsx.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajsx.a)) {
                return false;
            }
            arml arml = this.k;
            if (arml == null) {
                if (ajsx.k != null) {
                    return false;
                }
            } else if (!arml.equals(ajsx.k)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (ajsx.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajsx.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajsx.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajsx.c)) {
                return false;
            }
            apxu apxu = this.d;
            if (apxu == null) {
                if (ajsx.d != null) {
                    return false;
                }
            } else if (!apxu.equals(ajsx.d)) {
                return false;
            }
            str = this.l;
            if (str == null) {
                if (ajsx.l != null) {
                    return false;
                }
            } else if (!str.equals(ajsx.l)) {
                return false;
            }
            axwz axwz = this.m;
            if (axwz == null) {
                if (ajsx.m != null) {
                    return false;
                }
            } else if (!axwz.equals(ajsx.m)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajsx.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajsx.e)) {
                return false;
            }
            aqea aqea = this.f;
            if (aqea == null) {
                if (ajsx.f != null) {
                    return false;
                }
            } else if (!aqea.equals(ajsx.f)) {
                return false;
            }
            if (aocd.a(this.g, ajsx.g) && aocd.a(this.n, ajsx.n) && Arrays.equals(this.h, ajsx.h) && aocd.a(this.o, ajsx.o)) {
                aygk = this.p;
                if (aygk == null) {
                    if (ajsx.p != null) {
                        return false;
                    }
                } else if (!aygk.equals(ajsx.p)) {
                    return false;
                }
                if (this.q == ajsx.q) {
                    auvr auvr = this.i;
                    if (auvr == null) {
                        if (ajsx.i != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajsx.i)) {
                        return false;
                    }
                    aulw aulw = this.r;
                    if (aulw == null) {
                        if (ajsx.r != null) {
                            return false;
                        }
                    } else if (!aulw.equals(ajsx.r)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajsx.unknownFieldData);
                    }
                    aocb aocb2 = ajsx.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.j;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        aygk aygk = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        str = this.l;
        hashCode2 = str != null ? str.hashCode() : 0;
        axwz axwz = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axwz != null ? axwz.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aqea aqea = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqea != null ? aqea.hashCode() : 0;
        int a = aocd.a(this.g);
        int a2 = aocd.a(this.n);
        int hashCode3 = Arrays.hashCode(this.h);
        int a3 = aocd.a(this.o);
        aygk aygk2 = this.p;
        hashCode = (((((((((hashCode + hashCode2) * 31) + a) * 31) + a2) * 31) + hashCode3) * 31) + a3) * 31;
        hashCode2 = aygk2 != null ? aygk2.hashCode() : 0;
        a = this.q;
        auvr auvr = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        aulw aulw = this.r;
        hashCode = (((hashCode + hashCode2) * 31) + (aulw != null ? aulw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        apdh[] apdhArr;
        anze anze;
        String str = this.j;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.j);
        }
        anze anze2 = this.a;
        if (anze2 != null) {
            aoby.a(2, anze2);
        }
        anze2 = this.k;
        if (anze2 != null) {
            aoby.a(3, anze2);
        }
        anze2 = this.b;
        if (anze2 != null) {
            aoby.a(4, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        str = this.l;
        if (!(str == null || str.equals(str2))) {
            aoby.a(7, this.l);
        }
        anze2 = this.m;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(11, anze2);
        }
        apdh[] apdhArr2 = this.g;
        int i2 = 0;
        if (apdhArr2 != null && apdhArr2.length > 0) {
            i = 0;
            while (true) {
                apdhArr = this.g;
                if (i >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[i];
                if (anze != null) {
                    aoby.a(12, anze);
                }
                i++;
            }
        }
        apdhArr2 = this.n;
        if (apdhArr2 != null && apdhArr2.length > 0) {
            i = 0;
            while (true) {
                apdhArr = this.n;
                if (i >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[i];
                if (anze != null) {
                    aoby.a(13, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(14, this.h);
        }
        apxu[] apxuArr = this.o;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.o;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze2 = apxuArr[i2];
                if (anze2 != null) {
                    aoby.a(15, anze2);
                }
                i2++;
            }
        }
        anze2 = this.p;
        if (anze2 != null) {
            aoby.a(16, anze2);
        }
        i = this.q;
        if (i != 0) {
            aoby.b(18, i);
        }
        anze2 = this.i;
        if (anze2 != null) {
            aoby.a(19, anze2);
        }
        anze2 = this.r;
        if (anze2 != null) {
            aoby.a(20, anze2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        apdh[] apdhArr;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.j;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.j);
        }
        anze anze2 = this.a;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(2, anze2);
        }
        anze2 = this.k;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(3, anze2);
        }
        anze2 = this.b;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(4, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        str = this.l;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(7, this.l);
        }
        anze2 = this.m;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(11, anze2);
        }
        apdh[] apdhArr2 = this.g;
        int i2 = 0;
        if (apdhArr2 != null && apdhArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apdhArr = this.g;
                if (computeSerializedSize >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(12, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        apdhArr2 = this.n;
        if (apdhArr2 != null && apdhArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apdhArr = this.n;
                if (computeSerializedSize >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(13, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(14, this.h);
        }
        apxu[] apxuArr = this.o;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.o;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze2 = apxuArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(15, anze2);
                }
                i2++;
            }
        }
        anze2 = this.p;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(16, anze2);
        }
        i = this.q;
        if (i != 0) {
            computeSerializedSize += aoby.d(18, i);
        }
        anze2 = this.i;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(19, anze2);
        }
        anze2 = this.r;
        return anze2 != null ? computeSerializedSize + anwm.c(20, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            aygk aygk;
            aygk aygk2;
            aygj aygj;
            arml arml;
            arml arml2;
            armk armk;
            apdh[] apdhArr;
            int length;
            apdh[] apdhArr2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.j = aobv.d();
                    continue;
                case 18:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.a;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.a = aygk;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.k;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.k = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.c;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case cv.aU /*50*/:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.d;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.d = apxu;
                    continue;
                case 58:
                    this.l = aobv.d();
                    continue;
                case 66:
                    axwz axwz = (axwz) aobv.a(axwz.c.getParserForType());
                    axwz axwz2 = this.m;
                    if (axwz2 != null) {
                        axwy axwy = (axwy) ((anxo) axwz2.toBuilder());
                        axwy.mergeFrom(axwz);
                        axwz = (axwz) ((anxl) axwy.build());
                    }
                    this.m = axwz;
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case 90:
                    aqea aqea = (aqea) aobv.a(aqea.c.getParserForType());
                    aqea aqea2 = this.f;
                    if (aqea2 != null) {
                        aqdz aqdz = (aqdz) ((anxo) aqea2.toBuilder());
                        aqdz.mergeFrom(aqea);
                        aqea = (aqea) ((anxl) aqdz.build());
                    }
                    this.f = aqea;
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    apdhArr = this.g;
                    length = apdhArr != null ? apdhArr.length : 0;
                    apdhArr2 = new apdh[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apdhArr, 0, apdhArr2, 0, length);
                    }
                    while (length < apdhArr2.length - 1) {
                        apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                    this.g = apdhArr2;
                    continue;
                case 106:
                    a = aock.a(aobv, 106);
                    apdhArr = this.n;
                    length = apdhArr != null ? apdhArr.length : 0;
                    apdhArr2 = new apdh[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apdhArr, 0, apdhArr2, 0, length);
                    }
                    while (length < apdhArr2.length - 1) {
                        apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                    this.n = apdhArr2;
                    continue;
                case 114:
                    this.h = aobv.e();
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    apxu[] apxuArr = this.o;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxu[] apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.o = apxuArr2;
                    continue;
                case 130:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.p;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.p = aygk;
                    continue;
                case 144:
                    this.q = aobv.f();
                    continue;
                case 154:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.i;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.i = auvr;
                    continue;
                case 162:
                    aulw aulw = (aulw) aobv.a(aulw.a.getParserForType());
                    aulw aulw2 = this.r;
                    if (aulw2 != null) {
                        aulv aulv = (aulv) ((anxo) aulw2.toBuilder());
                        aulv.mergeFrom(aulw);
                        aulw = (aulw) ((anxl) aulv.build());
                    }
                    this.r = aulw;
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
