package defpackage;

/* renamed from: ajyp */
public final class ajyp extends aoca implements ajzi {
    public aygk a;
    public aygk b;
    public ajzw c;
    public arwf d;
    public arml e;
    public arml f;
    public float g;
    public arml h;
    public arml i;
    public arml j;
    public apxu k;
    public apxu[] l;
    public ajzw m;
    public long n;
    public apfq o;
    public apxu[] p;
    public boolean q;
    public ajzw r;
    public awqa s;
    public awqw t;
    public boolean u;
    private boolean v;
    private long w;
    private boolean x;
    private boolean y;
    private int z;

    public ajyp() {
        this.c = null;
        this.g = 0.0f;
        this.l = new apxu[0];
        this.m = null;
        this.n = 0;
        this.p = new apxu[0];
        this.q = false;
        this.r = null;
        this.y = false;
        this.z = 0;
        this.u = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyp) {
            ajyp ajyp = (ajyp) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajyp.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajyp.a)) {
                return false;
            }
            aygk = this.b;
            if (aygk == null) {
                if (ajyp.b != null) {
                    return false;
                }
            } else if (!aygk.equals(ajyp.b)) {
                return false;
            }
            ajzw ajzw = this.c;
            if (ajzw == null) {
                if (ajyp.c != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajyp.c)) {
                return false;
            }
            arwf arwf = this.d;
            if (arwf == null) {
                if (ajyp.d != null) {
                    return false;
                }
            } else if (!arwf.equals(ajyp.d)) {
                return false;
            }
            arml arml = this.e;
            if (arml == null) {
                if (ajyp.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajyp.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajyp.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajyp.f)) {
                return false;
            }
            if (Float.floatToIntBits(this.g) == Float.floatToIntBits(ajyp.g)) {
                arml = this.h;
                if (arml == null) {
                    if (ajyp.h != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyp.h)) {
                    return false;
                }
                arml = this.i;
                if (arml == null) {
                    if (ajyp.i != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyp.i)) {
                    return false;
                }
                arml = this.j;
                if (arml == null) {
                    if (ajyp.j != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyp.j)) {
                    return false;
                }
                apxu apxu = this.k;
                if (apxu == null) {
                    if (ajyp.k != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajyp.k)) {
                    return false;
                }
                if (aocd.a(this.l, ajyp.l)) {
                    ajzw = this.m;
                    if (ajzw == null) {
                        if (ajyp.m != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajyp.m)) {
                        return false;
                    }
                    if (this.n == ajyp.n) {
                        apfq apfq = this.o;
                        if (apfq == null) {
                            if (ajyp.o != null) {
                                return false;
                            }
                        } else if (!apfq.equals(ajyp.o)) {
                            return false;
                        }
                        if (aocd.a(this.p, ajyp.p) && this.q == ajyp.q) {
                            ajzw = this.r;
                            if (ajzw == null) {
                                if (ajyp.r != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(ajyp.r)) {
                                return false;
                            }
                            awqa awqa = this.s;
                            if (awqa == null) {
                                if (ajyp.s != null) {
                                    return false;
                                }
                            } else if (!awqa.equals(ajyp.s)) {
                                return false;
                            }
                            awqw awqw = this.t;
                            if (awqw == null) {
                                if (ajyp.t != null) {
                                    return false;
                                }
                            } else if (!awqw.equals(ajyp.t)) {
                                return false;
                            }
                            if (this.y == ajyp.y && this.z == ajyp.z && this.u == ajyp.u) {
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(ajyp.unknownFieldData);
                                }
                                aocb aocb2 = ajyp.unknownFieldData;
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
        ajzw ajzw = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        arwf arwf = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf != null ? arwf.hashCode() : 0;
        arml arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        int floatToIntBits = Float.floatToIntBits(this.g);
        arml arml2 = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + floatToIntBits) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        floatToIntBits = aocd.a(this.l);
        ajzw ajzw2 = this.m;
        hashCode = (((hashCode + hashCode2) * 31) + floatToIntBits) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        long j = this.n;
        apfq apfq = this.o;
        hashCode = (((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (apfq != null ? apfq.hashCode() : 0)) * 31) + aocd.a(this.p)) * 31;
        floatToIntBits = 1237;
        hashCode2 = !this.q ? 1237 : 1231;
        ajzw ajzw3 = this.r;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw3 != null ? ajzw3.hashCode() : 0;
        awqa awqa = this.s;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awqa != null ? awqa.hashCode() : 0;
        awqw awqw = this.t;
        hashCode = (((((((hashCode + hashCode2) * 31) + (awqw != null ? awqw.hashCode() : 0)) * 31) + (!this.y ? 1237 : 1231)) * 31) + this.z) * 31;
        if (this.u) {
            floatToIntBits = 1231;
        }
        hashCode = (hashCode + floatToIntBits) * 31;
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
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        if (Float.floatToIntBits(this.g) != Float.floatToIntBits(0.0f)) {
            aoby.a(7, this.g);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(11, anze);
        }
        apxu[] apxuArr = this.l;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.l;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(12, anze2);
                }
                i++;
            }
        }
        aocf = this.m;
        if (aocf != null) {
            aoby.a(13, aocf);
        }
        long j = this.n;
        if (j != 0) {
            aoby.b(14, j);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(15, anze);
        }
        apxuArr = this.p;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.p;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    aoby.a(16, anze);
                }
                i2++;
            }
        }
        if (this.q) {
            aoby.a(17, true);
        }
        aocf = this.r;
        if (aocf != null) {
            aoby.a(18, aocf);
        }
        anze = this.s;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.t;
        if (anze != null) {
            aoby.a(21, anze);
        }
        if (this.y) {
            aoby.a(22, true);
        }
        i = this.z;
        if (i != 0) {
            aoby.b(23, i);
        }
        if (this.u) {
            aoby.a(24, true);
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
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        if (Float.floatToIntBits(this.g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(7);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        apxu[] apxuArr = this.l;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.l;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(12, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aocf = this.m;
        if (aocf != null) {
            computeSerializedSize += aoby.b(13, aocf);
        }
        long j = this.n;
        if (j != 0) {
            computeSerializedSize += aoby.d(14, j);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        apxuArr = this.p;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.p;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(16, anze);
                }
                i2++;
            }
        }
        if (this.q) {
            computeSerializedSize += aoby.d(17);
        }
        aocf = this.r;
        if (aocf != null) {
            computeSerializedSize += aoby.b(18, aocf);
        }
        anze = this.s;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.t;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        if (this.y) {
            computeSerializedSize += aoby.d(22);
        }
        i = this.z;
        if (i != 0) {
            computeSerializedSize += aoby.d(23, i);
        }
        return this.u ? computeSerializedSize + aoby.d(24) : computeSerializedSize;
    }

    public final boolean a() {
        return this.v;
    }

    public final void b() {
        this.v = true;
    }

    public final boolean c() {
        long j = this.w;
        return j > 0 && j + this.n <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.w == 0) {
            this.w = System.currentTimeMillis();
        }
    }

    public final boolean e() {
        return this.x;
    }

    public final void a(boolean z) {
        this.x = z;
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
            apxu[] apxuArr;
            int length;
            apxu[] apxuArr2;
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
                    if (this.c == null) {
                        this.c = new ajzw();
                    }
                    aobv.a(this.c);
                    continue;
                case 34:
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.d;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.d = arwf;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case cv.aU /*50*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case cv.be /*61*/:
                    this.g = aobv.b();
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.h;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.h = arml;
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 82:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.j;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.j = arml;
                    continue;
                case 90:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.k;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.k = apxu;
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    apxuArr = this.l;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.l = apxuArr2;
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new ajzw();
                    }
                    aobv.a(this.m);
                    continue;
                case 112:
                    this.n = aobv.g();
                    continue;
                case afy.av /*122*/:
                    apfq apfq = (apfq) aobv.a(apfq.f.getParserForType());
                    apfq apfq2 = this.o;
                    if (apfq2 != null) {
                        apfv apfv = (apfv) ((anxo) apfq2.toBuilder());
                        apfv.mergeFrom(apfq);
                        apfq = (apfq) ((anxl) apfv.build());
                    }
                    this.o = apfq;
                    continue;
                case 130:
                    a = aock.a(aobv, 130);
                    apxuArr = this.p;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.p = apxuArr2;
                    continue;
                case 136:
                    this.q = aobv.c();
                    continue;
                case 146:
                    if (this.r == null) {
                        this.r = new ajzw();
                    }
                    aobv.a(this.r);
                    continue;
                case 162:
                    awqa awqa = (awqa) aobv.a(awqa.c.getParserForType());
                    awqa awqa2 = this.s;
                    if (awqa2 != null) {
                        awqd awqd = (awqd) ((anxo) awqa2.toBuilder());
                        awqd.mergeFrom(awqa);
                        awqa = (awqa) ((anxl) awqd.build());
                    }
                    this.s = awqa;
                    continue;
                case 170:
                    awqw awqw = (awqw) aobv.a(awqw.d.getParserForType());
                    awqw awqw2 = this.t;
                    if (awqw2 != null) {
                        awqz awqz = (awqz) ((anxo) awqw2.toBuilder());
                        awqz.mergeFrom(awqw);
                        awqw = (awqw) ((anxl) awqz.build());
                    }
                    this.t = awqw;
                    continue;
                case 176:
                    this.y = aobv.c();
                    continue;
                case 184:
                    this.z = aobv.f();
                    continue;
                case 192:
                    this.u = aobv.c();
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
