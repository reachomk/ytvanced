package defpackage;

import java.util.Arrays;

/* renamed from: ajyc */
public final class ajyc extends ajwo {
    public arml a;
    public aygk b;
    public arml c;
    public arml d;
    public boolean e = false;
    public apxu f;
    public arml g;
    public String h;
    public arml i;
    public awjl j;
    public byte[] k;
    public auvr l;
    public apdx m;
    public ayym n;
    private arml o;
    private arml p;
    private apdh[] q;
    private apxu[] r;
    private arml s;
    private apdx t;
    private String u;
    private ayfu[] v;
    private String w;
    private aulw x;
    private ajzw y;

    public ajyc() {
        super(51779701);
        String str = "";
        this.h = str;
        this.q = new apdh[0];
        this.k = aock.c;
        this.r = new apxu[0];
        this.u = str;
        this.v = new ayfu[0];
        this.w = str;
        this.y = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyc) {
            ajyc ajyc = (ajyc) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajyc.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajyc.a)) {
                return false;
            }
            arml = this.o;
            if (arml == null) {
                if (ajyc.o != null) {
                    return false;
                }
            } else if (!arml.equals(ajyc.o)) {
                return false;
            }
            aygk aygk = this.b;
            if (aygk == null) {
                if (ajyc.b != null) {
                    return false;
                }
            } else if (!aygk.equals(ajyc.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajyc.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajyc.c)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajyc.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajyc.d)) {
                return false;
            }
            if (this.e == ajyc.e) {
                apxu apxu = this.f;
                if (apxu == null) {
                    if (ajyc.f != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajyc.f)) {
                    return false;
                }
                arml = this.p;
                if (arml == null) {
                    if (ajyc.p != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyc.p)) {
                    return false;
                }
                arml = this.g;
                if (arml == null) {
                    if (ajyc.g != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyc.g)) {
                    return false;
                }
                String str = this.h;
                if (str == null) {
                    if (ajyc.h != null) {
                        return false;
                    }
                } else if (!str.equals(ajyc.h)) {
                    return false;
                }
                arml = this.i;
                if (arml == null) {
                    if (ajyc.i != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyc.i)) {
                    return false;
                }
                if (aocd.a(this.q, ajyc.q)) {
                    awjl awjl = this.j;
                    if (awjl == null) {
                        if (ajyc.j != null) {
                            return false;
                        }
                    } else if (!awjl.equals(ajyc.j)) {
                        return false;
                    }
                    if (Arrays.equals(this.k, ajyc.k) && aocd.a(this.r, ajyc.r)) {
                        arml = this.s;
                        if (arml == null) {
                            if (ajyc.s != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajyc.s)) {
                            return false;
                        }
                        auvr auvr = this.l;
                        if (auvr == null) {
                            if (ajyc.l != null) {
                                return false;
                            }
                        } else if (!auvr.equals(ajyc.l)) {
                            return false;
                        }
                        apdx apdx = this.m;
                        if (apdx == null) {
                            if (ajyc.m != null) {
                                return false;
                            }
                        } else if (!apdx.equals(ajyc.m)) {
                            return false;
                        }
                        apdx = this.t;
                        if (apdx == null) {
                            if (ajyc.t != null) {
                                return false;
                            }
                        } else if (!apdx.equals(ajyc.t)) {
                            return false;
                        }
                        str = this.u;
                        if (str == null) {
                            if (ajyc.u != null) {
                                return false;
                            }
                        } else if (!str.equals(ajyc.u)) {
                            return false;
                        }
                        if (aocd.a(this.v, ajyc.v)) {
                            str = this.w;
                            if (str == null) {
                                if (ajyc.w != null) {
                                    return false;
                                }
                            } else if (!str.equals(ajyc.w)) {
                                return false;
                            }
                            aulw aulw = this.x;
                            if (aulw == null) {
                                if (ajyc.x != null) {
                                    return false;
                                }
                            } else if (!aulw.equals(ajyc.x)) {
                                return false;
                            }
                            ayym ayym = this.n;
                            if (ayym == null) {
                                if (ajyc.n != null) {
                                    return false;
                                }
                            } else if (!ayym.equals(ajyc.n)) {
                                return false;
                            }
                            ajzw ajzw = this.y;
                            if (ajzw == null) {
                                if (ajyc.y != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(ajyc.y)) {
                                return false;
                            }
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajyc.unknownFieldData);
                            }
                            aocb aocb2 = ajyc.unknownFieldData;
                            return aocb2 == null || aocb2.b();
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.o;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        aygk aygk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml2 = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
        hashCode2 = !this.e ? 1237 : 1231;
        apxu apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arml2 = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml2 = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode2 = str != null ? str.hashCode() : 0;
        arml2 = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        int a = aocd.a(this.q);
        awjl awjl = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = awjl != null ? awjl.hashCode() : 0;
        a = Arrays.hashCode(this.k);
        int a2 = aocd.a(this.r);
        arml arml3 = this.s;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + a2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        auvr auvr = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        apdx apdx = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apdx != null ? apdx.hashCode() : 0;
        apdx = this.t;
        hashCode = (((hashCode + hashCode2) * 31) + (apdx != null ? apdx.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + aocd.a(this.v)) * 31;
        str = this.w;
        hashCode2 = str != null ? str.hashCode() : 0;
        aulw aulw = this.x;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aulw != null ? aulw.hashCode() : 0;
        ayym ayym = this.n;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ayym != null ? ayym.hashCode() : 0;
        ajzw ajzw = this.y;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        anze anze2 = this.a;
        if (anze2 != null) {
            aoby.a(1, anze2);
        }
        anze2 = this.o;
        if (anze2 != null) {
            aoby.a(2, anze2);
        }
        anze2 = this.b;
        if (anze2 != null) {
            aoby.a(3, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            aoby.a(4, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        if (this.e) {
            aoby.a(6, true);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        anze2 = this.p;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        String str = this.h;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(10, this.h);
        }
        anze2 = this.i;
        if (anze2 != null) {
            aoby.a(12, anze2);
        }
        apdh[] apdhArr = this.q;
        int i2 = 0;
        if (apdhArr != null && apdhArr.length > 0) {
            i = 0;
            while (true) {
                apdh[] apdhArr2 = this.q;
                if (i >= apdhArr2.length) {
                    break;
                }
                anze = apdhArr2[i];
                if (anze != null) {
                    aoby.a(13, anze);
                }
                i++;
            }
        }
        anze2 = this.j;
        if (anze2 != null) {
            aoby.a(14, anze2);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            aoby.a(15, this.k);
        }
        apxu[] apxuArr = this.r;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.r;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(17, anze);
                }
                i++;
            }
        }
        anze2 = this.s;
        if (anze2 != null) {
            aoby.a(18, anze2);
        }
        anze2 = this.l;
        if (anze2 != null) {
            aoby.a(19, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            aoby.a(20, anze2);
        }
        anze2 = this.t;
        if (anze2 != null) {
            aoby.a(21, anze2);
        }
        str = this.u;
        if (!(str == null || str.equals(str2))) {
            aoby.a(23, this.u);
        }
        ayfu[] ayfuArr = this.v;
        if (ayfuArr != null && ayfuArr.length > 0) {
            while (true) {
                ayfuArr = this.v;
                if (i2 >= ayfuArr.length) {
                    break;
                }
                anze2 = ayfuArr[i2];
                if (anze2 != null) {
                    aoby.a(24, anze2);
                }
                i2++;
            }
        }
        str = this.w;
        if (!(str == null || str.equals(str2))) {
            aoby.a(26, this.w);
        }
        anze2 = this.x;
        if (anze2 != null) {
            aoby.a(27, anze2);
        }
        anze2 = this.n;
        if (anze2 != null) {
            aoby.a(28, anze2);
        }
        aocf aocf = this.y;
        if (aocf != null) {
            aoby.a(30, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze2 = this.a;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(1, anze2);
        }
        anze2 = this.o;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(2, anze2);
        }
        anze2 = this.b;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(3, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(4, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        if (this.e) {
            computeSerializedSize += aoby.d(6);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        anze2 = this.p;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        String str = this.h;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(10, this.h);
        }
        anze2 = this.i;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(12, anze2);
        }
        apdh[] apdhArr = this.q;
        int i2 = 0;
        if (apdhArr != null && apdhArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apdh[] apdhArr2 = this.q;
                if (computeSerializedSize >= apdhArr2.length) {
                    break;
                }
                anze = apdhArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(13, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze2 = this.j;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(14, anze2);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            computeSerializedSize += aoby.b(15, this.k);
        }
        apxu[] apxuArr = this.r;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.r;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze = apxuArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(17, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze2 = this.s;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(18, anze2);
        }
        anze2 = this.l;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(19, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(20, anze2);
        }
        anze2 = this.t;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(21, anze2);
        }
        str = this.u;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(23, this.u);
        }
        ayfu[] ayfuArr = this.v;
        if (ayfuArr != null && ayfuArr.length > 0) {
            while (true) {
                ayfuArr = this.v;
                if (i2 >= ayfuArr.length) {
                    break;
                }
                anze2 = ayfuArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(24, anze2);
                }
                i2++;
            }
        }
        str = this.w;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(26, this.w);
        }
        anze2 = this.x;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(27, anze2);
        }
        anze2 = this.n;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(28, anze2);
        }
        aocf aocf = this.y;
        return aocf != null ? computeSerializedSize + aoby.b(30, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            int length;
            apdx apdx;
            apdx apdx2;
            apdw apdw;
            switch (a) {
                case 0:
                    break;
                case 10:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.a;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 18:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.o;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.o = arml;
                    continue;
                case 26:
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.b;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.b = aygk;
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
                case 48:
                    this.e = aobv.c();
                    continue;
                case 58:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.f;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.f = apxu;
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.p;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.p = arml;
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.g;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.g = arml;
                    continue;
                case 82:
                    this.h = aobv.d();
                    continue;
                case 98:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 106:
                    a = aock.a(aobv, 106);
                    apdh[] apdhArr = this.q;
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
                    this.q = apdhArr2;
                    continue;
                case 114:
                    awjl awjl = (awjl) aobv.a(awjl.c.getParserForType());
                    awjl awjl2 = this.j;
                    if (awjl2 != null) {
                        awjk awjk = (awjk) ((anxo) awjl2.toBuilder());
                        awjk.mergeFrom(awjl);
                        awjl = (awjl) ((anxl) awjk.build());
                    }
                    this.j = awjl;
                    continue;
                case afy.av /*122*/:
                    this.k = aobv.e();
                    continue;
                case 138:
                    a = aock.a(aobv, 138);
                    apxu[] apxuArr = this.r;
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
                    this.r = apxuArr2;
                    continue;
                case 146:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.s;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.s = arml;
                    continue;
                case 154:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.l;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.l = auvr;
                    continue;
                case 162:
                    apdx = (apdx) aobv.a(apdx.g.getParserForType());
                    apdx2 = this.m;
                    if (apdx2 != null) {
                        apdw = (apdw) ((anxo) apdx2.toBuilder());
                        apdw.mergeFrom(apdx);
                        apdx = (apdx) ((anxl) apdw.build());
                    }
                    this.m = apdx;
                    continue;
                case 170:
                    apdx = (apdx) aobv.a(apdx.g.getParserForType());
                    apdx2 = this.t;
                    if (apdx2 != null) {
                        apdw = (apdw) ((anxo) apdx2.toBuilder());
                        apdw.mergeFrom(apdx);
                        apdx = (apdx) ((anxl) apdw.build());
                    }
                    this.t = apdx;
                    continue;
                case 186:
                    this.u = aobv.d();
                    continue;
                case 194:
                    a = aock.a(aobv, 194);
                    ayfu[] ayfuArr = this.v;
                    length = ayfuArr != null ? ayfuArr.length : 0;
                    ayfu[] ayfuArr2 = new ayfu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ayfuArr, 0, ayfuArr2, 0, length);
                    }
                    while (length < ayfuArr2.length - 1) {
                        ayfuArr2[length] = (ayfu) aobv.a(ayfu.q.getParserForType());
                        aobv.a();
                        length++;
                    }
                    ayfuArr2[length] = (ayfu) aobv.a(ayfu.q.getParserForType());
                    this.v = ayfuArr2;
                    continue;
                case 210:
                    this.w = aobv.d();
                    continue;
                case 218:
                    aulw aulw = (aulw) aobv.a(aulw.a.getParserForType());
                    aulw aulw2 = this.x;
                    if (aulw2 != null) {
                        aulv aulv = (aulv) ((anxo) aulw2.toBuilder());
                        aulv.mergeFrom(aulw);
                        aulw = (aulw) ((anxl) aulv.build());
                    }
                    this.x = aulw;
                    continue;
                case 226:
                    ayym ayym = (ayym) aobv.a(ayym.c.getParserForType());
                    ayym ayym2 = this.n;
                    if (ayym2 != null) {
                        ayyl ayyl = (ayyl) ((anxo) ayym2.toBuilder());
                        ayyl.mergeFrom(ayym);
                        ayym = (ayym) ((anxl) ayyl.build());
                    }
                    this.n = ayym;
                    continue;
                case 242:
                    if (this.y == null) {
                        this.y = new ajzw();
                    }
                    aobv.a(this.y);
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
