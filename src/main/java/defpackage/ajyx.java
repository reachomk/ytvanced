package defpackage;

/* renamed from: ajyx */
public final class ajyx extends aoca implements ajzi {
    public aygk a;
    public ajzw b;
    public arwf c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public ajzw h;
    public apxu i;
    public apxu[] j;
    public ajzw k;
    public long l;
    public apfq m;
    public apxu[] n;
    public boolean o;
    public awqa p;
    public awqw q;
    public arml r;
    public boolean s;
    private boolean t;
    private long u;
    private boolean v;
    private boolean w;

    public ajyx() {
        this.b = null;
        this.h = null;
        this.j = new apxu[0];
        this.k = null;
        this.l = 0;
        this.n = new apxu[0];
        this.o = false;
        this.w = false;
        this.s = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyx) {
            ajyx ajyx = (ajyx) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajyx.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajyx.a)) {
                return false;
            }
            ajzw ajzw = this.b;
            if (ajzw == null) {
                if (ajyx.b != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajyx.b)) {
                return false;
            }
            arwf arwf = this.c;
            if (arwf == null) {
                if (ajyx.c != null) {
                    return false;
                }
            } else if (!arwf.equals(ajyx.c)) {
                return false;
            }
            arml arml = this.d;
            if (arml == null) {
                if (ajyx.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajyx.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajyx.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajyx.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajyx.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajyx.f)) {
                return false;
            }
            arml = this.g;
            if (arml == null) {
                if (ajyx.g != null) {
                    return false;
                }
            } else if (!arml.equals(ajyx.g)) {
                return false;
            }
            ajzw = this.h;
            if (ajzw == null) {
                if (ajyx.h != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajyx.h)) {
                return false;
            }
            apxu apxu = this.i;
            if (apxu == null) {
                if (ajyx.i != null) {
                    return false;
                }
            } else if (!apxu.equals(ajyx.i)) {
                return false;
            }
            if (aocd.a(this.j, ajyx.j)) {
                ajzw = this.k;
                if (ajzw == null) {
                    if (ajyx.k != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajyx.k)) {
                    return false;
                }
                if (this.l == ajyx.l) {
                    apfq apfq = this.m;
                    if (apfq == null) {
                        if (ajyx.m != null) {
                            return false;
                        }
                    } else if (!apfq.equals(ajyx.m)) {
                        return false;
                    }
                    if (aocd.a(this.n, ajyx.n) && this.o == ajyx.o) {
                        awqa awqa = this.p;
                        if (awqa == null) {
                            if (ajyx.p != null) {
                                return false;
                            }
                        } else if (!awqa.equals(ajyx.p)) {
                            return false;
                        }
                        awqw awqw = this.q;
                        if (awqw == null) {
                            if (ajyx.q != null) {
                                return false;
                            }
                        } else if (!awqw.equals(ajyx.q)) {
                            return false;
                        }
                        if (this.w == ajyx.w) {
                            arml = this.r;
                            if (arml == null) {
                                if (ajyx.r != null) {
                                    return false;
                                }
                            } else if (!arml.equals(ajyx.r)) {
                                return false;
                            }
                            if (this.s == ajyx.s) {
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(ajyx.unknownFieldData);
                                }
                                aocb aocb2 = ajyx.unknownFieldData;
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
        ajzw ajzw = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        arwf arwf = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf != null ? arwf.hashCode() : 0;
        arml arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        ajzw = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        apxu apxu = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.j);
        ajzw ajzw2 = this.k;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        long j = this.l;
        apfq apfq = this.m;
        hashCode = (((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (apfq != null ? apfq.hashCode() : 0)) * 31) + aocd.a(this.n)) * 31;
        a = 1237;
        hashCode2 = !this.o ? 1237 : 1231;
        awqa awqa = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awqa != null ? awqa.hashCode() : 0;
        awqw awqw = this.q;
        hashCode = (((hashCode + hashCode2) * 31) + (awqw != null ? awqw.hashCode() : 0)) * 31;
        hashCode2 = !this.w ? 1237 : 1231;
        arml arml2 = this.r;
        hashCode = (((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
        if (this.s) {
            a = 1231;
        }
        hashCode = (hashCode + a) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
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
        anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        aocf = this.h;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(9, anze);
        }
        apxu[] apxuArr = this.j;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.j;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i2];
                if (anze2 != null) {
                    aoby.a(10, anze2);
                }
                i2++;
            }
        }
        aocf = this.k;
        if (aocf != null) {
            aoby.a(11, aocf);
        }
        long j = this.l;
        if (j != 0) {
            aoby.b(12, j);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(13, anze);
        }
        apxuArr = this.n;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.n;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(14, anze);
                }
                i++;
            }
        }
        if (this.o) {
            aoby.a(15, true);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(18, anze);
        }
        if (this.w) {
            aoby.a(19, true);
        }
        anze = this.r;
        if (anze != null) {
            aoby.a(20, anze);
        }
        if (this.s) {
            aoby.a(21, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
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
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        apxu[] apxuArr = this.j;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.j;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(10, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(11, aocf);
        }
        long j = this.l;
        if (j != 0) {
            computeSerializedSize += aoby.d(12, j);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        apxuArr = this.n;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.n;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(14, anze);
                }
                i++;
            }
        }
        if (this.o) {
            computeSerializedSize += aoby.d(15);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        if (this.w) {
            computeSerializedSize += aoby.d(19);
        }
        anze = this.r;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        return this.s ? computeSerializedSize + aoby.d(21) : computeSerializedSize;
    }

    public final boolean a() {
        return this.t;
    }

    public final void b() {
        this.t = true;
    }

    public final boolean c() {
        long j = this.u;
        return j > 0 && j + this.l <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.u == 0) {
            this.u = System.currentTimeMillis();
        }
    }

    public final boolean e() {
        return this.v;
    }

    public final void a(boolean z) {
        this.v = z;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
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
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.a;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.a = aygk;
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new ajzw();
                    }
                    aobv.a(this.b);
                    continue;
                case 26:
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.c;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.c = arwf;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
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
                case 66:
                    if (this.h == null) {
                        this.h = new ajzw();
                    }
                    aobv.a(this.h);
                    continue;
                case 74:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.i;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.i = apxu;
                    continue;
                case 82:
                    a = aock.a(aobv, 82);
                    apxuArr = this.j;
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
                    this.j = apxuArr2;
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 96:
                    this.l = aobv.g();
                    continue;
                case 106:
                    apfq apfq = (apfq) aobv.a(apfq.f.getParserForType());
                    apfq apfq2 = this.m;
                    if (apfq2 != null) {
                        apfv apfv = (apfv) ((anxo) apfq2.toBuilder());
                        apfv.mergeFrom(apfq);
                        apfq = (apfq) ((anxl) apfv.build());
                    }
                    this.m = apfq;
                    continue;
                case 114:
                    a = aock.a(aobv, 114);
                    apxuArr = this.n;
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
                    this.n = apxuArr2;
                    continue;
                case 120:
                    this.o = aobv.c();
                    continue;
                case 138:
                    awqa awqa = (awqa) aobv.a(awqa.c.getParserForType());
                    awqa awqa2 = this.p;
                    if (awqa2 != null) {
                        awqd awqd = (awqd) ((anxo) awqa2.toBuilder());
                        awqd.mergeFrom(awqa);
                        awqa = (awqa) ((anxl) awqd.build());
                    }
                    this.p = awqa;
                    continue;
                case 146:
                    awqw awqw = (awqw) aobv.a(awqw.d.getParserForType());
                    awqw awqw2 = this.q;
                    if (awqw2 != null) {
                        awqz awqz = (awqz) ((anxo) awqw2.toBuilder());
                        awqz.mergeFrom(awqw);
                        awqw = (awqw) ((anxl) awqz.build());
                    }
                    this.q = awqw;
                    continue;
                case 152:
                    this.w = aobv.c();
                    continue;
                case 162:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.r;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.r = arml;
                    continue;
                case 168:
                    this.s = aobv.c();
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
