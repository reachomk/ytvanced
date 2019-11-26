package defpackage;

/* renamed from: ajzc */
public final class ajzc extends aoca implements ajzi {
    public arml a;
    public arml b;
    public arml c;
    public apxu d;
    public apxu[] e;
    public ajzw f;
    public long g;
    public apfq h;
    public apxu[] i;
    public awqa j;
    public ajzw k;
    private boolean l;
    private long m;
    private boolean n;

    public ajzc() {
        this.e = new apxu[0];
        this.f = null;
        this.g = 0;
        this.i = new apxu[0];
        this.k = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzc) {
            ajzc ajzc = (ajzc) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajzc.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajzc.a)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (ajzc.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajzc.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajzc.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajzc.c)) {
                return false;
            }
            apxu apxu = this.d;
            if (apxu == null) {
                if (ajzc.d != null) {
                    return false;
                }
            } else if (!apxu.equals(ajzc.d)) {
                return false;
            }
            if (aocd.a(this.e, ajzc.e)) {
                ajzw ajzw = this.f;
                if (ajzw == null) {
                    if (ajzc.f != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzc.f)) {
                    return false;
                }
                if (this.g == ajzc.g) {
                    apfq apfq = this.h;
                    if (apfq == null) {
                        if (ajzc.h != null) {
                            return false;
                        }
                    } else if (!apfq.equals(ajzc.h)) {
                        return false;
                    }
                    if (aocd.a(this.i, ajzc.i)) {
                        awqa awqa = this.j;
                        if (awqa == null) {
                            if (ajzc.j != null) {
                                return false;
                            }
                        } else if (!awqa.equals(ajzc.j)) {
                            return false;
                        }
                        ajzw = this.k;
                        if (ajzw == null) {
                            if (ajzc.k != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajzc.k)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajzc.unknownFieldData);
                        }
                        aocb aocb2 = ajzc.unknownFieldData;
                        return aocb2 == null || aocb2.b();
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
        arml arml2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        apxu apxu = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.e);
        ajzw ajzw = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        long j = this.g;
        apfq apfq = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        hashCode2 = apfq != null ? apfq.hashCode() : 0;
        a = aocd.a(this.i);
        awqa awqa = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = awqa != null ? awqa.hashCode() : 0;
        ajzw ajzw2 = this.k;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31;
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
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        apxu[] apxuArr = this.e;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i2];
                if (anze2 != null) {
                    aoby.a(5, anze2);
                }
                i2++;
            }
        }
        aocf aocf = this.f;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        long j = this.g;
        if (j != 0) {
            aoby.b(7, j);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
        }
        apxuArr = this.i;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.i;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(9, anze);
                }
                i++;
            }
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(10, anze);
        }
        aocf = this.k;
        if (aocf != null) {
            aoby.a(11, aocf);
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
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        apxu[] apxuArr = this.e;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(5, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        aocf aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        long j = this.g;
        if (j != 0) {
            computeSerializedSize += aoby.d(7, j);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        apxuArr = this.i;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.i;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(9, anze);
                }
                i++;
            }
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        aocf = this.k;
        return aocf != null ? computeSerializedSize + aoby.b(11, aocf) : computeSerializedSize;
    }

    public final boolean a() {
        return this.l;
    }

    public final void b() {
        this.l = true;
    }

    public final boolean c() {
        long j = this.m;
        return j > 0 && j + this.g <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.m == 0) {
            this.m = System.currentTimeMillis();
        }
    }

    public final boolean e() {
        return this.n;
    }

    public final void a(boolean z) {
        this.n = z;
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
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.c;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case 34:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.d;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.d = apxu;
                    continue;
                case 42:
                    a = aock.a(aobv, 42);
                    apxuArr = this.e;
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
                    this.e = apxuArr2;
                    continue;
                case cv.aU /*50*/:
                    if (this.f == null) {
                        this.f = new ajzw();
                    }
                    aobv.a(this.f);
                    continue;
                case cv.ba /*56*/:
                    this.g = aobv.g();
                    continue;
                case 66:
                    apfq apfq = (apfq) aobv.a(apfq.f.getParserForType());
                    apfq apfq2 = this.h;
                    if (apfq2 != null) {
                        apfv apfv = (apfv) ((anxo) apfq2.toBuilder());
                        apfv.mergeFrom(apfq);
                        apfq = (apfq) ((anxl) apfv.build());
                    }
                    this.h = apfq;
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
                    awqa awqa = (awqa) aobv.a(awqa.c.getParserForType());
                    awqa awqa2 = this.j;
                    if (awqa2 != null) {
                        awqd awqd = (awqd) ((anxo) awqa2.toBuilder());
                        awqd.mergeFrom(awqa);
                        awqa = (awqa) ((anxl) awqd.build());
                    }
                    this.j = awqa;
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
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
