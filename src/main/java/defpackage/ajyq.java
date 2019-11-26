package defpackage;

/* renamed from: ajyq */
public final class ajyq extends aoca implements ajzi {
    public aygk a;
    public ajzw b;
    public arwf c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public apxu[] i;
    public ajzw j;
    public long k;
    public apfq l;
    public apxu[] m;
    public boolean n;
    public ajzw o;
    public awqa p;
    public awqw q;
    public boolean r;
    private boolean s;
    private long t;
    private boolean u;
    private boolean v;

    public ajyq() {
        this.b = null;
        this.i = new apxu[0];
        this.j = null;
        this.k = 0;
        this.m = new apxu[0];
        this.n = false;
        this.o = null;
        this.v = false;
        this.r = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyq) {
            ajyq ajyq = (ajyq) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajyq.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajyq.a)) {
                return false;
            }
            ajzw ajzw = this.b;
            if (ajzw == null) {
                if (ajyq.b != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajyq.b)) {
                return false;
            }
            arwf arwf = this.c;
            if (arwf == null) {
                if (ajyq.c != null) {
                    return false;
                }
            } else if (!arwf.equals(ajyq.c)) {
                return false;
            }
            arml arml = this.d;
            if (arml == null) {
                if (ajyq.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajyq.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajyq.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajyq.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajyq.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajyq.f)) {
                return false;
            }
            arml = this.g;
            if (arml == null) {
                if (ajyq.g != null) {
                    return false;
                }
            } else if (!arml.equals(ajyq.g)) {
                return false;
            }
            apxu apxu = this.h;
            if (apxu == null) {
                if (ajyq.h != null) {
                    return false;
                }
            } else if (!apxu.equals(ajyq.h)) {
                return false;
            }
            if (aocd.a(this.i, ajyq.i)) {
                ajzw = this.j;
                if (ajzw == null) {
                    if (ajyq.j != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajyq.j)) {
                    return false;
                }
                if (this.k == ajyq.k) {
                    apfq apfq = this.l;
                    if (apfq == null) {
                        if (ajyq.l != null) {
                            return false;
                        }
                    } else if (!apfq.equals(ajyq.l)) {
                        return false;
                    }
                    if (aocd.a(this.m, ajyq.m) && this.n == ajyq.n) {
                        ajzw = this.o;
                        if (ajzw == null) {
                            if (ajyq.o != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajyq.o)) {
                            return false;
                        }
                        awqa awqa = this.p;
                        if (awqa == null) {
                            if (ajyq.p != null) {
                                return false;
                            }
                        } else if (!awqa.equals(ajyq.p)) {
                            return false;
                        }
                        awqw awqw = this.q;
                        if (awqw == null) {
                            if (ajyq.q != null) {
                                return false;
                            }
                        } else if (!awqw.equals(ajyq.q)) {
                            return false;
                        }
                        if (this.v == ajyq.v && this.r == ajyq.r) {
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajyq.unknownFieldData);
                            }
                            aocb aocb2 = ajyq.unknownFieldData;
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
        apxu apxu = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.i);
        ajzw ajzw2 = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        long j = this.k;
        apfq apfq = this.l;
        hashCode = (((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (apfq != null ? apfq.hashCode() : 0)) * 31) + aocd.a(this.m)) * 31;
        a = 1237;
        hashCode2 = !this.n ? 1237 : 1231;
        ajzw ajzw3 = this.o;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw3 != null ? ajzw3.hashCode() : 0;
        awqa awqa = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awqa != null ? awqa.hashCode() : 0;
        awqw awqw = this.q;
        hashCode = (((((hashCode + hashCode2) * 31) + (awqw != null ? awqw.hashCode() : 0)) * 31) + (!this.v ? 1237 : 1231)) * 31;
        if (this.r) {
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
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
        }
        apxu[] apxuArr = this.i;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.i;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i2];
                if (anze2 != null) {
                    aoby.a(9, anze2);
                }
                i2++;
            }
        }
        aocf = this.j;
        if (aocf != null) {
            aoby.a(10, aocf);
        }
        long j = this.k;
        if (j != 0) {
            aoby.b(11, j);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(12, anze);
        }
        apxuArr = this.m;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.m;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(13, anze);
                }
                i++;
            }
        }
        if (this.n) {
            aoby.a(14, true);
        }
        aocf = this.o;
        if (aocf != null) {
            aoby.a(15, aocf);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(18, anze);
        }
        if (this.v) {
            aoby.a(19, true);
        }
        if (this.r) {
            aoby.a(20, true);
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
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        apxu[] apxuArr = this.i;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.i;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(9, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        aocf = this.j;
        if (aocf != null) {
            computeSerializedSize += aoby.b(10, aocf);
        }
        long j = this.k;
        if (j != 0) {
            computeSerializedSize += aoby.d(11, j);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        apxuArr = this.m;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.m;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(13, anze);
                }
                i++;
            }
        }
        if (this.n) {
            computeSerializedSize += aoby.d(14);
        }
        aocf = this.o;
        if (aocf != null) {
            computeSerializedSize += aoby.b(15, aocf);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        if (this.v) {
            computeSerializedSize += aoby.d(19);
        }
        return this.r ? computeSerializedSize + aoby.d(20) : computeSerializedSize;
    }

    public final boolean a() {
        return this.s;
    }

    public final void b() {
        this.s = true;
    }

    public final boolean c() {
        long j = this.t;
        return j > 0 && j + this.k <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.t == 0) {
            this.t = System.currentTimeMillis();
        }
    }

    public final boolean e() {
        return this.u;
    }

    public final void a(boolean z) {
        this.u = z;
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
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.h;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.h = apxu;
                    continue;
                case 74:
                    a = aock.a(aobv, 74);
                    apxuArr = this.i;
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
                    this.i = apxuArr2;
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new ajzw();
                    }
                    aobv.a(this.j);
                    continue;
                case 88:
                    this.k = aobv.g();
                    continue;
                case 98:
                    apfq apfq = (apfq) aobv.a(apfq.f.getParserForType());
                    apfq apfq2 = this.l;
                    if (apfq2 != null) {
                        apfv apfv = (apfv) ((anxo) apfq2.toBuilder());
                        apfv.mergeFrom(apfq);
                        apfq = (apfq) ((anxl) apfv.build());
                    }
                    this.l = apfq;
                    continue;
                case 106:
                    a = aock.a(aobv, 106);
                    apxuArr = this.m;
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
                    this.m = apxuArr2;
                    continue;
                case 112:
                    this.n = aobv.c();
                    continue;
                case afy.av /*122*/:
                    if (this.o == null) {
                        this.o = new ajzw();
                    }
                    aobv.a(this.o);
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
                    this.v = aobv.c();
                    continue;
                case 160:
                    this.r = aobv.c();
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
