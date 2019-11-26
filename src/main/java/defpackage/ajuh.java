package defpackage;

import java.util.Arrays;

/* renamed from: ajuh */
public final class ajuh extends ajwo {
    private boolean A;
    public aygk a;
    public aygk b;
    public arml c;
    public arml d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public apxu o;
    public aule[] p;
    public aule[] q;
    public aule[] r;
    public aret s;
    public byte[] t;
    public int u;
    private aygk v;
    private arml w;
    private String x;
    private boolean y;
    private apxu z;

    public ajuh() {
        super(105860658);
        this.u = 1;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
        this.p = new aule[0];
        this.q = new aule[0];
        this.r = new aule[0];
        this.t = aock.c;
        this.x = "";
        this.y = false;
        this.A = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuh) {
            ajuh ajuh = (ajuh) obj;
            if (this.u == ajuh.u) {
                aygk aygk = this.a;
                if (aygk == null) {
                    if (ajuh.a != null) {
                        return false;
                    }
                } else if (!aygk.equals(ajuh.a)) {
                    return false;
                }
                aygk = this.b;
                if (aygk == null) {
                    if (ajuh.b != null) {
                        return false;
                    }
                } else if (!aygk.equals(ajuh.b)) {
                    return false;
                }
                arml arml = this.c;
                if (arml == null) {
                    if (ajuh.c != null) {
                        return false;
                    }
                } else if (!arml.equals(ajuh.c)) {
                    return false;
                }
                arml = this.d;
                if (arml == null) {
                    if (ajuh.d != null) {
                        return false;
                    }
                } else if (!arml.equals(ajuh.d)) {
                    return false;
                }
                if (Float.floatToIntBits(this.e) == Float.floatToIntBits(ajuh.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(ajuh.f) && Float.floatToIntBits(this.g) == Float.floatToIntBits(ajuh.g) && Float.floatToIntBits(this.h) == Float.floatToIntBits(ajuh.h) && this.i == ajuh.i && this.j == ajuh.j) {
                    arml = this.k;
                    if (arml == null) {
                        if (ajuh.k != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajuh.k)) {
                        return false;
                    }
                    arml = this.l;
                    if (arml == null) {
                        if (ajuh.l != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajuh.l)) {
                        return false;
                    }
                    arml = this.m;
                    if (arml == null) {
                        if (ajuh.m != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajuh.m)) {
                        return false;
                    }
                    arml = this.n;
                    if (arml == null) {
                        if (ajuh.n != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajuh.n)) {
                        return false;
                    }
                    apxu apxu = this.o;
                    if (apxu == null) {
                        if (ajuh.o != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajuh.o)) {
                        return false;
                    }
                    if (aocd.a(this.p, ajuh.p) && aocd.a(this.q, ajuh.q) && aocd.a(this.r, ajuh.r)) {
                        aret aret = this.s;
                        if (aret == null) {
                            if (ajuh.s != null) {
                                return false;
                            }
                        } else if (!aret.equals(ajuh.s)) {
                            return false;
                        }
                        aygk = this.v;
                        if (aygk == null) {
                            if (ajuh.v != null) {
                                return false;
                            }
                        } else if (!aygk.equals(ajuh.v)) {
                            return false;
                        }
                        arml = this.w;
                        if (arml == null) {
                            if (ajuh.w != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajuh.w)) {
                            return false;
                        }
                        if (Arrays.equals(this.t, ajuh.t)) {
                            String str = this.x;
                            if (str == null) {
                                if (ajuh.x != null) {
                                    return false;
                                }
                            } else if (!str.equals(ajuh.x)) {
                                return false;
                            }
                            if (this.y == ajuh.y) {
                                apxu = this.z;
                                if (apxu == null) {
                                    if (ajuh.z != null) {
                                        return false;
                                    }
                                } else if (!apxu.equals(ajuh.z)) {
                                    return false;
                                }
                                if (this.A == ajuh.A) {
                                    aocb aocb = this.unknownFieldData;
                                    if (aocb != null && !aocb.b()) {
                                        return this.unknownFieldData.equals(ajuh.unknownFieldData);
                                    }
                                    aocb aocb2 = ajuh.unknownFieldData;
                                    return aocb2 == null || aocb2.b();
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
        int i = this.u;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        aygk aygk = this.a;
        hashCode = (hashCode + i) * 31;
        i = aygk != null ? aygk.hashCode() : 0;
        aygk = this.b;
        hashCode = (hashCode + i) * 31;
        i = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.c;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        int floatToIntBits = Float.floatToIntBits(this.e);
        int floatToIntBits2 = Float.floatToIntBits(this.f);
        int floatToIntBits3 = Float.floatToIntBits(this.g);
        int floatToIntBits4 = Float.floatToIntBits(this.h);
        long j = this.i;
        long j2 = this.j;
        arml arml2 = this.k;
        hashCode = (((((((((((((hashCode + i) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + floatToIntBits3) * 31) + floatToIntBits4) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        i = arml2 != null ? arml2.hashCode() : 0;
        arml = this.l;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        arml = this.m;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        arml = this.n;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.o;
        hashCode = (hashCode + i) * 31;
        i = apxu != null ? apxu.hashCode() : 0;
        floatToIntBits = aocd.a(this.p);
        floatToIntBits2 = aocd.a(this.q);
        floatToIntBits3 = aocd.a(this.r);
        aret aret = this.s;
        hashCode = (((((((hashCode + i) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + floatToIntBits3) * 31;
        i = aret != null ? aret.hashCode() : 0;
        aygk = this.v;
        hashCode = (hashCode + i) * 31;
        i = aygk != null ? aygk.hashCode() : 0;
        arml = this.w;
        hashCode = (((((hashCode + i) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + Arrays.hashCode(this.t)) * 31;
        String str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        floatToIntBits = 1237;
        i = !this.y ? 1237 : 1231;
        apxu apxu2 = this.z;
        hashCode = (((hashCode + i) * 31) + (apxu2 != null ? apxu2.hashCode() : 0)) * 31;
        if (this.A) {
            floatToIntBits = 1231;
        }
        hashCode = (hashCode + floatToIntBits) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        aule[] auleArr;
        anze anze;
        int i = this.u;
        if (!(i == 1 || i == 0)) {
            aoby.a(1, i - 1);
        }
        anze anze2 = this.a;
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
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            aoby.a(6, this.e);
        }
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(0.0f)) {
            aoby.a(7, this.f);
        }
        if (Float.floatToIntBits(this.g) != Float.floatToIntBits(0.0f)) {
            aoby.a(8, this.g);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            aoby.a(9, this.h);
        }
        long j = this.i;
        if (j != 0) {
            aoby.b(10, j);
        }
        j = this.j;
        if (j != 0) {
            aoby.b(11, j);
        }
        anze2 = this.k;
        if (anze2 != null) {
            aoby.a(12, anze2);
        }
        anze2 = this.l;
        if (anze2 != null) {
            aoby.a(13, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            aoby.a(14, anze2);
        }
        anze2 = this.n;
        if (anze2 != null) {
            aoby.a(15, anze2);
        }
        anze2 = this.o;
        if (anze2 != null) {
            aoby.a(16, anze2);
        }
        aule[] auleArr2 = this.p;
        int i2 = 0;
        if (auleArr2 != null && auleArr2.length > 0) {
            i = 0;
            while (true) {
                auleArr = this.p;
                if (i >= auleArr.length) {
                    break;
                }
                anze = auleArr[i];
                if (anze != null) {
                    aoby.a(17, anze);
                }
                i++;
            }
        }
        auleArr2 = this.q;
        if (auleArr2 != null && auleArr2.length > 0) {
            i = 0;
            while (true) {
                auleArr = this.q;
                if (i >= auleArr.length) {
                    break;
                }
                anze = auleArr[i];
                if (anze != null) {
                    aoby.a(18, anze);
                }
                i++;
            }
        }
        auleArr2 = this.r;
        if (auleArr2 != null && auleArr2.length > 0) {
            while (true) {
                auleArr2 = this.r;
                if (i2 >= auleArr2.length) {
                    break;
                }
                anze2 = auleArr2[i2];
                if (anze2 != null) {
                    aoby.a(19, anze2);
                }
                i2++;
            }
        }
        anze2 = this.s;
        if (anze2 != null) {
            aoby.a(20, anze2);
        }
        anze2 = this.v;
        if (anze2 != null) {
            aoby.a(21, anze2);
        }
        anze2 = this.w;
        if (anze2 != null) {
            aoby.a(22, anze2);
        }
        if (!Arrays.equals(this.t, aock.c)) {
            aoby.a(24, this.t);
        }
        String str = this.x;
        if (!(str == null || str.equals(""))) {
            aoby.a(25, this.x);
        }
        if (this.y) {
            aoby.a(26, true);
        }
        anze2 = this.z;
        if (anze2 != null) {
            aoby.a(27, anze2);
        }
        if (this.A) {
            aoby.a(28, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        aule[] auleArr;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.u;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(1, i - 1);
        }
        anze anze2 = this.a;
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
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(6);
        }
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(7);
        }
        if (Float.floatToIntBits(this.g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(8);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(9);
        }
        long j = this.i;
        if (j != 0) {
            computeSerializedSize += aoby.d(10, j);
        }
        j = this.j;
        if (j != 0) {
            computeSerializedSize += aoby.d(11, j);
        }
        anze2 = this.k;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(12, anze2);
        }
        anze2 = this.l;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(13, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(14, anze2);
        }
        anze2 = this.n;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(15, anze2);
        }
        anze2 = this.o;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(16, anze2);
        }
        aule[] auleArr2 = this.p;
        int i2 = 0;
        if (auleArr2 != null && auleArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                auleArr = this.p;
                if (computeSerializedSize >= auleArr.length) {
                    break;
                }
                anze = auleArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(17, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        auleArr2 = this.q;
        if (auleArr2 != null && auleArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                auleArr = this.q;
                if (computeSerializedSize >= auleArr.length) {
                    break;
                }
                anze = auleArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(18, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        auleArr2 = this.r;
        if (auleArr2 != null && auleArr2.length > 0) {
            while (true) {
                auleArr2 = this.r;
                if (i2 >= auleArr2.length) {
                    break;
                }
                anze2 = auleArr2[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(19, anze2);
                }
                i2++;
            }
        }
        anze2 = this.s;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(20, anze2);
        }
        anze2 = this.v;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(21, anze2);
        }
        anze2 = this.w;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(22, anze2);
        }
        if (!Arrays.equals(this.t, aock.c)) {
            computeSerializedSize += aoby.b(24, this.t);
        }
        String str = this.x;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(25, this.x);
        }
        if (this.y) {
            computeSerializedSize += aoby.d(26);
        }
        anze2 = this.z;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(27, anze2);
        }
        return this.A ? computeSerializedSize + aoby.d(28) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            int f;
            aygk aygk;
            aygk aygk2;
            aygj aygj;
            arml arml;
            arml arml2;
            armk armk;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            aule[] auleArr;
            aule[] auleArr2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    int i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2 || f == 3 || f == 4) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f == 2) {
                            i = 3;
                        } else if (f == 3) {
                            i = 4;
                        } else if (f == 4) {
                            i = 5;
                        }
                        this.u = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
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
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.b;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
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
                case cv.aX /*53*/:
                    this.e = aobv.b();
                    continue;
                case cv.be /*61*/:
                    this.f = aobv.b();
                    continue;
                case 69:
                    this.g = aobv.b();
                    continue;
                case 77:
                    this.h = aobv.b();
                    continue;
                case 80:
                    this.i = aobv.g();
                    continue;
                case 88:
                    this.j = aobv.g();
                    continue;
                case 98:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.k;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.k = arml;
                    continue;
                case 106:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.l;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.l = arml;
                    continue;
                case 114:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.m;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.m = arml;
                    continue;
                case afy.av /*122*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.n;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.n = arml;
                    continue;
                case 130:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.o;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.o = apxu;
                    continue;
                case 138:
                    a = aock.a(aobv, 138);
                    auleArr = this.p;
                    f = auleArr != null ? auleArr.length : 0;
                    auleArr2 = new aule[(a + f)];
                    if (f != 0) {
                        System.arraycopy(auleArr, 0, auleArr2, 0, f);
                    }
                    while (f < auleArr2.length - 1) {
                        auleArr2[f] = (aule) aobv.a(aule.d.getParserForType());
                        aobv.a();
                        f++;
                    }
                    auleArr2[f] = (aule) aobv.a(aule.d.getParserForType());
                    this.p = auleArr2;
                    continue;
                case 146:
                    a = aock.a(aobv, 146);
                    auleArr = this.q;
                    f = auleArr != null ? auleArr.length : 0;
                    auleArr2 = new aule[(a + f)];
                    if (f != 0) {
                        System.arraycopy(auleArr, 0, auleArr2, 0, f);
                    }
                    while (f < auleArr2.length - 1) {
                        auleArr2[f] = (aule) aobv.a(aule.d.getParserForType());
                        aobv.a();
                        f++;
                    }
                    auleArr2[f] = (aule) aobv.a(aule.d.getParserForType());
                    this.q = auleArr2;
                    continue;
                case 154:
                    a = aock.a(aobv, 154);
                    auleArr = this.r;
                    f = auleArr != null ? auleArr.length : 0;
                    auleArr2 = new aule[(a + f)];
                    if (f != 0) {
                        System.arraycopy(auleArr, 0, auleArr2, 0, f);
                    }
                    while (f < auleArr2.length - 1) {
                        auleArr2[f] = (aule) aobv.a(aule.d.getParserForType());
                        aobv.a();
                        f++;
                    }
                    auleArr2[f] = (aule) aobv.a(aule.d.getParserForType());
                    this.r = auleArr2;
                    continue;
                case 162:
                    aret aret = (aret) aobv.a(aret.c.getParserForType());
                    aret aret2 = this.s;
                    if (aret2 != null) {
                        ares ares = (ares) ((anxo) aret2.toBuilder());
                        ares.mergeFrom(aret);
                        aret = (aret) ((anxl) ares.build());
                    }
                    this.s = aret;
                    continue;
                case 170:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.v;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.v = aygk;
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
                case 194:
                    this.t = aobv.e();
                    continue;
                case 202:
                    this.x = aobv.d();
                    continue;
                case 208:
                    this.y = aobv.c();
                    continue;
                case 218:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.z;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.z = apxu;
                    continue;
                case 224:
                    this.A = aobv.c();
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
