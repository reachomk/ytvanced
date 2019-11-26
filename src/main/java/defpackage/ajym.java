package defpackage;

/* renamed from: ajym */
public final class ajym extends aoca implements ajzi {
    public arml a;
    public aygk b;
    public ajzw c;
    public float d;
    public int e;
    public int f;
    public ajzw g;
    public apxu h;
    public apxu[] i;
    public apxu j;
    public ajzw k;
    public long l;
    public apfq m;
    public arml n;
    private boolean o;
    private long p;
    private boolean q;
    private String r;

    public ajym() {
        this.r = "";
        this.c = null;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.i = new apxu[0];
        this.k = null;
        this.l = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajym) {
            ajym ajym = (ajym) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajym.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajym.a)) {
                return false;
            }
            String str = this.r;
            if (str == null) {
                if (ajym.r != null) {
                    return false;
                }
            } else if (!str.equals(ajym.r)) {
                return false;
            }
            aygk aygk = this.b;
            if (aygk == null) {
                if (ajym.b != null) {
                    return false;
                }
            } else if (!aygk.equals(ajym.b)) {
                return false;
            }
            ajzw ajzw = this.c;
            if (ajzw == null) {
                if (ajym.c != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajym.c)) {
                return false;
            }
            if (Float.floatToIntBits(this.d) == Float.floatToIntBits(ajym.d) && this.e == ajym.e && this.f == ajym.f) {
                ajzw = this.g;
                if (ajzw == null) {
                    if (ajym.g != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajym.g)) {
                    return false;
                }
                apxu apxu = this.h;
                if (apxu == null) {
                    if (ajym.h != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajym.h)) {
                    return false;
                }
                if (aocd.a(this.i, ajym.i)) {
                    apxu = this.j;
                    if (apxu == null) {
                        if (ajym.j != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajym.j)) {
                        return false;
                    }
                    ajzw = this.k;
                    if (ajzw == null) {
                        if (ajym.k != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajym.k)) {
                        return false;
                    }
                    if (this.l == ajym.l) {
                        apfq apfq = this.m;
                        if (apfq == null) {
                            if (ajym.m != null) {
                                return false;
                            }
                        } else if (!apfq.equals(ajym.m)) {
                            return false;
                        }
                        arml = this.n;
                        if (arml == null) {
                            if (ajym.n != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajym.n)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajym.unknownFieldData);
                        }
                        aocb aocb2 = ajym.unknownFieldData;
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
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31;
        String str = this.r;
        int hashCode2 = str != null ? str.hashCode() : 0;
        aygk aygk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        ajzw ajzw = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        int floatToIntBits = Float.floatToIntBits(this.d);
        int i2 = this.e;
        int i3 = this.f;
        ajzw ajzw2 = this.g;
        hashCode = (((((((hashCode + hashCode2) * 31) + floatToIntBits) * 31) + i2) * 31) + i3) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        apxu apxu = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        floatToIntBits = aocd.a(this.i);
        apxu apxu2 = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + floatToIntBits) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        ajzw = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        long j = this.l;
        apfq apfq = this.m;
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        hashCode2 = apfq != null ? apfq.hashCode() : 0;
        arml arml2 = this.n;
        hashCode = (((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
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
        String str = this.r;
        if (!(str == null || str.equals(""))) {
            aoby.a(2, this.r);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            aoby.a(5, this.d);
        }
        int i = this.e;
        if (i != 0) {
            aoby.b(6, i);
        }
        i = this.f;
        if (i != 0) {
            aoby.b(7, i);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(9, anze);
        }
        apxu[] apxuArr = this.i;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.i;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(10, anze2);
                }
                i++;
            }
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(11, anze);
        }
        aocf = this.k;
        if (aocf != null) {
            aoby.a(12, aocf);
        }
        long j = this.l;
        if (j != 0) {
            aoby.b(13, j);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(15, anze);
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
        String str = this.r;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(2, this.r);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(5);
        }
        int i = this.e;
        if (i != 0) {
            computeSerializedSize += aoby.d(6, i);
        }
        i = this.f;
        if (i != 0) {
            computeSerializedSize += aoby.d(7, i);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        apxu[] apxuArr = this.i;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.i;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(10, anze2);
                }
                i++;
            }
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(12, aocf);
        }
        long j = this.l;
        if (j != 0) {
            computeSerializedSize += aoby.d(13, j);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.n;
        return anze != null ? computeSerializedSize + anwm.c(15, anze) : computeSerializedSize;
    }

    public final boolean a() {
        return this.o;
    }

    public final void b() {
        this.o = true;
    }

    public final boolean c() {
        long j = this.p;
        return j > 0 && j + this.l <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.p == 0) {
            this.p = System.currentTimeMillis();
        }
    }

    public final boolean e() {
        return this.q;
    }

    public final void a(boolean z) {
        this.q = z;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
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
                    this.r = aobv.d();
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
                    if (this.c == null) {
                        this.c = new ajzw();
                    }
                    aobv.a(this.c);
                    continue;
                case 45:
                    this.d = aobv.b();
                    continue;
                case 48:
                    this.e = aobv.f();
                    continue;
                case cv.ba /*56*/:
                    this.f = aobv.f();
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new ajzw();
                    }
                    aobv.a(this.g);
                    continue;
                case 74:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.h;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.h = apxu;
                    continue;
                case 82:
                    a = aock.a(aobv, 82);
                    apxu[] apxuArr = this.i;
                    int length = apxuArr != null ? apxuArr.length : 0;
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
                    this.i = apxuArr2;
                    continue;
                case 90:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.j;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.j = apxu;
                    continue;
                case 98:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 104:
                    this.l = aobv.g();
                    continue;
                case 114:
                    apfq apfq = (apfq) aobv.a(apfq.f.getParserForType());
                    apfq apfq2 = this.m;
                    if (apfq2 != null) {
                        apfv apfv = (apfv) ((anxo) apfq2.toBuilder());
                        apfv.mergeFrom(apfq);
                        apfq = (apfq) ((anxl) apfv.build());
                    }
                    this.m = apfq;
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
