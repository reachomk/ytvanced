package defpackage;

import java.util.Arrays;

/* renamed from: ajtc */
public final class ajtc extends ajwo implements ajyl {
    public aygk a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public apxu g;
    public byte[] h = aock.c;
    public String[] i = aock.b;
    public auvr j;
    public aqge k;
    public aojc l;
    public String m;
    private boolean n;
    private String o;
    private arml p;
    private aygk q;
    private apxu r;
    private String s;
    private String t;
    private aulw u;

    public ajtc() {
        super(73920376);
        String str = "";
        this.o = str;
        this.s = str;
        this.t = str;
        this.m = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtc) {
            ajtc ajtc = (ajtc) obj;
            String str = this.o;
            if (str == null) {
                if (ajtc.o != null) {
                    return false;
                }
            } else if (!str.equals(ajtc.o)) {
                return false;
            }
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajtc.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajtc.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajtc.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajtc.b)) {
                return false;
            }
            arml = this.p;
            if (arml == null) {
                if (ajtc.p != null) {
                    return false;
                }
            } else if (!arml.equals(ajtc.p)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajtc.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajtc.c)) {
                return false;
            }
            aygk = this.q;
            if (aygk == null) {
                if (ajtc.q != null) {
                    return false;
                }
            } else if (!aygk.equals(ajtc.q)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajtc.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajtc.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajtc.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajtc.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajtc.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajtc.f)) {
                return false;
            }
            apxu apxu = this.g;
            if (apxu == null) {
                if (ajtc.g != null) {
                    return false;
                }
            } else if (!apxu.equals(ajtc.g)) {
                return false;
            }
            if (Arrays.equals(this.h, ajtc.h)) {
                apxu = this.r;
                if (apxu == null) {
                    if (ajtc.r != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajtc.r)) {
                    return false;
                }
                if (aocd.a(this.i, ajtc.i)) {
                    auvr auvr = this.j;
                    if (auvr == null) {
                        if (ajtc.j != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajtc.j)) {
                        return false;
                    }
                    str = this.s;
                    if (str == null) {
                        if (ajtc.s != null) {
                            return false;
                        }
                    } else if (!str.equals(ajtc.s)) {
                        return false;
                    }
                    aqge aqge = this.k;
                    if (aqge == null) {
                        if (ajtc.k != null) {
                            return false;
                        }
                    } else if (!aqge.equals(ajtc.k)) {
                        return false;
                    }
                    str = this.t;
                    if (str == null) {
                        if (ajtc.t != null) {
                            return false;
                        }
                    } else if (!str.equals(ajtc.t)) {
                        return false;
                    }
                    aulw aulw = this.u;
                    if (aulw == null) {
                        if (ajtc.u != null) {
                            return false;
                        }
                    } else if (!aulw.equals(ajtc.u)) {
                        return false;
                    }
                    aojc aojc = this.l;
                    if (aojc == null) {
                        if (ajtc.l != null) {
                            return false;
                        }
                    } else if (!aojc.equals(ajtc.l)) {
                        return false;
                    }
                    str = this.m;
                    if (str == null) {
                        if (ajtc.m != null) {
                            return false;
                        }
                    } else if (!str.equals(ajtc.m)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajtc.unknownFieldData);
                    }
                    aocb aocb2 = ajtc.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.o;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        aygk aygk = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aygk = this.q;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.h);
        apxu apxu2 = this.r;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        hashCode3 = aocd.a(this.i);
        auvr auvr = this.j;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (auvr != null ? auvr.hashCode() : 0)) * 31;
        str = this.s;
        hashCode2 = str != null ? str.hashCode() : 0;
        aqge aqge = this.k;
        hashCode = (((hashCode + hashCode2) * 31) + (aqge != null ? aqge.hashCode() : 0)) * 31;
        str = this.t;
        hashCode2 = str != null ? str.hashCode() : 0;
        aulw aulw = this.u;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aulw != null ? aulw.hashCode() : 0;
        aojc aojc = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.o;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.o);
        }
        anze anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(10, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(11, this.h);
        }
        anze = this.r;
        if (anze != null) {
            aoby.a(12, anze);
        }
        String[] strArr = this.i;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    aoby.a(13, str3);
                }
                i++;
            }
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(14, anze);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            aoby.a(16, this.s);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(18, anze);
        }
        str = this.t;
        if (!(str == null || str.equals(str2))) {
            aoby.a(19, this.t);
        }
        anze = this.u;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(21, anze);
        }
        str = this.m;
        if (!(str == null || str.equals(str2))) {
            aoby.a(24, this.m);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.o;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.o);
        }
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(11, this.h);
        }
        anze = this.r;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        String[] strArr = this.i;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    i3++;
                    i2 += aoby.b(str3);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + i3;
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(16, this.s);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        str = this.t;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(19, this.t);
        }
        anze = this.u;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        str = this.m;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(24, this.m);
    }

    public final boolean a() {
        return this.n;
    }

    public final void b() {
        this.n = true;
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
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.o = aobv.d();
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
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.p;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.p = arml;
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
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.q;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.q = aygk;
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 82:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case 90:
                    this.h = aobv.e();
                    continue;
                case 98:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.r;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.r = apxu;
                    continue;
                case 106:
                    a = aock.a(aobv, 106);
                    String[] strArr = this.i;
                    int length = strArr != null ? strArr.length : 0;
                    String[] strArr2 = new String[(a + length)];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = aobv.d();
                        aobv.a();
                        length++;
                    }
                    strArr2[length] = aobv.d();
                    this.i = strArr2;
                    continue;
                case 114:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.j;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.j = auvr;
                    continue;
                case 130:
                    this.s = aobv.d();
                    continue;
                case 146:
                    aqge aqge = (aqge) aobv.a(aqge.c.getParserForType());
                    aqge aqge2 = this.k;
                    if (aqge2 != null) {
                        aqgd aqgd = (aqgd) ((anxo) aqge2.toBuilder());
                        aqgd.mergeFrom(aqge);
                        aqge = (aqge) ((anxl) aqgd.build());
                    }
                    this.k = aqge;
                    continue;
                case 154:
                    this.t = aobv.d();
                    continue;
                case 162:
                    aulw aulw = (aulw) aobv.a(aulw.a.getParserForType());
                    aulw aulw2 = this.u;
                    if (aulw2 != null) {
                        aulv aulv = (aulv) ((anxo) aulw2.toBuilder());
                        aulv.mergeFrom(aulw);
                        aulw = (aulw) ((anxl) aulv.build());
                    }
                    this.u = aulw;
                    continue;
                case 170:
                    aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                    aojc aojc2 = this.l;
                    if (aojc2 != null) {
                        aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                        aojf.mergeFrom(aojc);
                        aojc = (aojc) ((anxl) aojf.build());
                    }
                    this.l = aojc;
                    continue;
                case 194:
                    this.m = aobv.d();
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
