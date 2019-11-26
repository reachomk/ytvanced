package defpackage;

import java.util.Arrays;

/* renamed from: ajxm */
public final class ajxm extends ajwo {
    public aygk a;
    public aygk b;
    public arml c;
    public arml d;
    public apxu e;
    public apxu f;
    public auvr g;
    public byte[] h;
    public arml i;
    public String j;
    public ajzw k;
    public int l;
    private arml m;
    private apxu[] n;
    private boolean o;
    private boolean p;
    private apxu q;
    private arml r;
    private int s;
    private avlo t;
    private boolean u;
    private boolean v;
    private boolean w;

    public ajxm() {
        super(65099882);
        this.n = new apxu[0];
        this.o = false;
        this.p = false;
        this.h = aock.c;
        this.s = 0;
        this.j = "";
        this.u = false;
        this.v = false;
        this.w = false;
        this.k = null;
        this.l = 1;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxm) {
            ajxm ajxm = (ajxm) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajxm.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajxm.a)) {
                return false;
            }
            aygk = this.b;
            if (aygk == null) {
                if (ajxm.b != null) {
                    return false;
                }
            } else if (!aygk.equals(ajxm.b)) {
                return false;
            }
            arml arml = this.m;
            if (arml == null) {
                if (ajxm.m != null) {
                    return false;
                }
            } else if (!arml.equals(ajxm.m)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajxm.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajxm.c)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajxm.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajxm.d)) {
                return false;
            }
            apxu apxu = this.e;
            if (apxu == null) {
                if (ajxm.e != null) {
                    return false;
                }
            } else if (!apxu.equals(ajxm.e)) {
                return false;
            }
            if (aocd.a(this.n, ajxm.n) && this.o == ajxm.o && this.p == ajxm.p) {
                apxu = this.f;
                if (apxu == null) {
                    if (ajxm.f != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajxm.f)) {
                    return false;
                }
                auvr auvr = this.g;
                if (auvr == null) {
                    if (ajxm.g != null) {
                        return false;
                    }
                } else if (!auvr.equals(ajxm.g)) {
                    return false;
                }
                if (Arrays.equals(this.h, ajxm.h)) {
                    apxu = this.q;
                    if (apxu == null) {
                        if (ajxm.q != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxm.q)) {
                        return false;
                    }
                    arml = this.r;
                    if (arml == null) {
                        if (ajxm.r != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajxm.r)) {
                        return false;
                    }
                    if (this.s == ajxm.s) {
                        arml = this.i;
                        if (arml == null) {
                            if (ajxm.i != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajxm.i)) {
                            return false;
                        }
                        avlo avlo = this.t;
                        if (avlo == null) {
                            if (ajxm.t != null) {
                                return false;
                            }
                        } else if (!avlo.equals(ajxm.t)) {
                            return false;
                        }
                        String str = this.j;
                        if (str == null) {
                            if (ajxm.j != null) {
                                return false;
                            }
                        } else if (!str.equals(ajxm.j)) {
                            return false;
                        }
                        if (this.u == ajxm.u && this.v == ajxm.v && this.w == ajxm.w) {
                            ajzw ajzw = this.k;
                            if (ajzw == null) {
                                if (ajxm.k != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(ajxm.k)) {
                                return false;
                            }
                            if (this.l == ajxm.l) {
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(ajxm.unknownFieldData);
                                }
                                aocb aocb2 = ajxm.unknownFieldData;
                                return aocb2 == null || aocb2.b();
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aygk aygk = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aygk != null ? aygk.hashCode() : 0;
        aygk aygk2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk2 != null ? aygk2.hashCode() : 0;
        arml arml = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31) + aocd.a(this.n)) * 31;
        int i2 = 1237;
        hashCode = (hashCode + (!this.o ? 1237 : 1231)) * 31;
        hashCode2 = !this.p ? 1237 : 1231;
        apxu apxu2 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        auvr auvr = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.h);
        apxu apxu3 = this.q;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apxu3 != null ? apxu3.hashCode() : 0;
        arml arml2 = this.r;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        hashCode3 = this.s;
        arml arml3 = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        avlo avlo = this.t;
        hashCode = (((hashCode + hashCode2) * 31) + (avlo != null ? avlo.hashCode() : 0)) * 31;
        String str = this.j;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.u ? 1237 : 1231)) * 31) + (!this.v ? 1237 : 1231)) * 31;
        if (this.w) {
            i2 = 1231;
        }
        ajzw ajzw = this.k;
        hashCode = (((hashCode + i2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        hashCode2 = this.l;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        apxu[] apxuArr = this.n;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.n;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(7, anze2);
                }
                i++;
            }
        }
        if (this.o) {
            aoby.a(8, true);
        }
        if (this.p) {
            aoby.a(9, true);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(11, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(13, this.h);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.r;
        if (anze != null) {
            aoby.a(15, anze);
        }
        i = this.s;
        if (i != 0) {
            aoby.a(16, i);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.t;
        if (anze != null) {
            aoby.a(18, anze);
        }
        String str = this.j;
        if (!(str == null || str.equals(""))) {
            aoby.a(19, this.j);
        }
        if (this.u) {
            aoby.a(22, true);
        }
        if (this.v) {
            aoby.a(23, true);
        }
        if (this.w) {
            aoby.a(25, true);
        }
        aocf aocf = this.k;
        if (aocf != null) {
            aoby.a(27, aocf);
        }
        i = this.l;
        if (!(i == 1 || i == 0)) {
            aoby.a(28, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        apxu[] apxuArr = this.n;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.n;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(7, anze2);
                }
                i++;
            }
        }
        if (this.o) {
            computeSerializedSize += aoby.d(8);
        }
        if (this.p) {
            computeSerializedSize += aoby.d(9);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(13, this.h);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.r;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        i = this.s;
        if (i != 0) {
            computeSerializedSize += aoby.c(16, i);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.t;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        String str = this.j;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(19, this.j);
        }
        if (this.u) {
            computeSerializedSize += aoby.d(22);
        }
        if (this.v) {
            computeSerializedSize += aoby.d(23);
        }
        if (this.w) {
            computeSerializedSize += aoby.d(25);
        }
        aocf aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(27, aocf);
        }
        i = this.l;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(28, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            aygk aygk;
            aygk aygk2;
            aygj aygj;
            arml arml;
            arml arml2;
            armk armk;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            int length;
            switch (a) {
                case 0:
                    break;
                case 10:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.a;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.a = aygk;
                    continue;
                case 18:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.b;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.b = aygk;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.m;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.m = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.c;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case cv.aU /*50*/:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.e;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.e = apxu;
                    continue;
                case 58:
                    a = aock.a(aobv, 58);
                    apxu[] apxuArr = this.n;
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
                    this.n = apxuArr2;
                    continue;
                case 64:
                    this.o = aobv.c();
                    continue;
                case 72:
                    this.p = aobv.c();
                    continue;
                case 82:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.f;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.f = apxu;
                    continue;
                case 90:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.g;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.g = auvr;
                    continue;
                case 106:
                    this.h = aobv.e();
                    continue;
                case 114:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.q;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.q = apxu;
                    continue;
                case afy.av /*122*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.r;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.r = arml;
                    continue;
                case 128:
                    this.s = aobv.f();
                    continue;
                case 138:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 146:
                    avlo avlo = (avlo) aobv.a(avlo.a.getParserForType());
                    avlo avlo2 = this.t;
                    if (avlo2 != null) {
                        avlr avlr = (avlr) ((anxo) avlo2.toBuilder());
                        avlr.mergeFrom(avlo);
                        avlo = (avlo) ((anxl) avlr.build());
                    }
                    this.t = avlo;
                    continue;
                case 154:
                    this.j = aobv.d();
                    continue;
                case 176:
                    this.u = aobv.c();
                    continue;
                case 184:
                    this.v = aobv.c();
                    continue;
                case 200:
                    this.w = aobv.c();
                    continue;
                case 218:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 224:
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length == 0 || length == 1) {
                        if (length == 0) {
                            i = 1;
                        } else if (length == 1) {
                            i = 2;
                        }
                        this.l = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
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
