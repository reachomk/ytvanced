package defpackage;

import java.util.Arrays;

/* renamed from: ajvv */
public final class ajvv extends ajwo implements ajyl {
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
    public arse k;
    public auma l;
    public aojc m;
    public String n;
    private boolean o;
    private String p;
    private arml q;
    private aygk r;
    private apxu s;
    private String t;
    private String u;

    public ajvv() {
        super(82182324);
        String str = "";
        this.p = str;
        this.t = str;
        this.u = str;
        this.n = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvv) {
            ajvv ajvv = (ajvv) obj;
            String str = this.p;
            if (str == null) {
                if (ajvv.p != null) {
                    return false;
                }
            } else if (!str.equals(ajvv.p)) {
                return false;
            }
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajvv.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajvv.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajvv.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajvv.b)) {
                return false;
            }
            arml = this.q;
            if (arml == null) {
                if (ajvv.q != null) {
                    return false;
                }
            } else if (!arml.equals(ajvv.q)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajvv.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajvv.c)) {
                return false;
            }
            aygk = this.r;
            if (aygk == null) {
                if (ajvv.r != null) {
                    return false;
                }
            } else if (!aygk.equals(ajvv.r)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajvv.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajvv.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajvv.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajvv.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajvv.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajvv.f)) {
                return false;
            }
            apxu apxu = this.g;
            if (apxu == null) {
                if (ajvv.g != null) {
                    return false;
                }
            } else if (!apxu.equals(ajvv.g)) {
                return false;
            }
            if (Arrays.equals(this.h, ajvv.h)) {
                apxu = this.s;
                if (apxu == null) {
                    if (ajvv.s != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajvv.s)) {
                    return false;
                }
                if (aocd.a(this.i, ajvv.i)) {
                    auvr auvr = this.j;
                    if (auvr == null) {
                        if (ajvv.j != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajvv.j)) {
                        return false;
                    }
                    str = this.t;
                    if (str == null) {
                        if (ajvv.t != null) {
                            return false;
                        }
                    } else if (!str.equals(ajvv.t)) {
                        return false;
                    }
                    arse arse = this.k;
                    if (arse == null) {
                        if (ajvv.k != null) {
                            return false;
                        }
                    } else if (!arse.equals(ajvv.k)) {
                        return false;
                    }
                    str = this.u;
                    if (str == null) {
                        if (ajvv.u != null) {
                            return false;
                        }
                    } else if (!str.equals(ajvv.u)) {
                        return false;
                    }
                    auma auma = this.l;
                    if (auma == null) {
                        if (ajvv.l != null) {
                            return false;
                        }
                    } else if (!auma.equals(ajvv.l)) {
                        return false;
                    }
                    aojc aojc = this.m;
                    if (aojc == null) {
                        if (ajvv.m != null) {
                            return false;
                        }
                    } else if (!aojc.equals(ajvv.m)) {
                        return false;
                    }
                    str = this.n;
                    if (str == null) {
                        if (ajvv.n != null) {
                            return false;
                        }
                    } else if (!str.equals(ajvv.n)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajvv.unknownFieldData);
                    }
                    aocb aocb2 = ajvv.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.p;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        aygk aygk = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.q;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aygk = this.r;
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
        apxu apxu2 = this.s;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        hashCode3 = aocd.a(this.i);
        auvr auvr = this.j;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (auvr != null ? auvr.hashCode() : 0)) * 31;
        str = this.t;
        hashCode2 = str != null ? str.hashCode() : 0;
        arse arse = this.k;
        hashCode = (((hashCode + hashCode2) * 31) + (arse != null ? arse.hashCode() : 0)) * 31;
        str = this.u;
        hashCode2 = str != null ? str.hashCode() : 0;
        auma auma = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auma != null ? auma.hashCode() : 0;
        aojc aojc = this.m;
        hashCode = (((hashCode + hashCode2) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.p;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.p);
        }
        anze anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.r;
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
        anze = this.s;
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
        str = this.t;
        if (!(str == null || str.equals(str2))) {
            aoby.a(16, this.t);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(18, anze);
        }
        str = this.u;
        if (!(str == null || str.equals(str2))) {
            aoby.a(19, this.u);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(21, anze);
        }
        str = this.n;
        if (!(str == null || str.equals(str2))) {
            aoby.a(22, this.n);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.p;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.p);
        }
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.r;
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
        anze = this.s;
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
        str = this.t;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(16, this.t);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        str = this.u;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(19, this.u);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        str = this.n;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(22, this.n);
    }

    public final boolean a() {
        return this.o;
    }

    public final void b() {
        this.o = true;
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
                    this.p = aobv.d();
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
                    arml2 = this.q;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.q = arml;
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
                    aygk2 = this.r;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.r = aygk;
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
                    apxu2 = this.s;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.s = apxu;
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
                    this.t = aobv.d();
                    continue;
                case 146:
                    arse arse = (arse) aobv.a(arse.c.getParserForType());
                    arse arse2 = this.k;
                    if (arse2 != null) {
                        arsh arsh = (arsh) ((anxo) arse2.toBuilder());
                        arsh.mergeFrom(arse);
                        arse = (arse) ((anxl) arsh.build());
                    }
                    this.k = arse;
                    continue;
                case 154:
                    this.u = aobv.d();
                    continue;
                case 162:
                    auma auma = (auma) aobv.a(auma.c.getParserForType());
                    auma auma2 = this.l;
                    if (auma2 != null) {
                        aulz aulz = (aulz) ((anxo) auma2.toBuilder());
                        aulz.mergeFrom(auma);
                        auma = (auma) ((anxl) aulz.build());
                    }
                    this.l = auma;
                    continue;
                case 170:
                    aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                    aojc aojc2 = this.m;
                    if (aojc2 != null) {
                        aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                        aojf.mergeFrom(aojc);
                        aojc = (aojc) ((anxl) aojf.build());
                    }
                    this.m = aojc;
                    continue;
                case 178:
                    this.n = aobv.d();
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
