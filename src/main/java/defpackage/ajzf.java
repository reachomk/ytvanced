package defpackage;

import java.util.Arrays;

/* renamed from: ajzf */
public final class ajzf extends ajwo implements ajyn {
    public arml a;
    public arml b;
    public arml c;
    public arwf d;
    public aygk e;
    public apxu f;
    public apxu[] g;
    public auvr h;
    public byte[] i;
    public awso j;
    public long k;
    public long l;
    public aojc m;
    public String n;
    private boolean o;
    private long p;

    public ajzf() {
        super(105649908);
        this.g = new apxu[0];
        this.i = aock.c;
        this.k = 0;
        this.l = 0;
        this.n = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzf) {
            ajzf ajzf = (ajzf) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajzf.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajzf.a)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (ajzf.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajzf.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajzf.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajzf.c)) {
                return false;
            }
            arwf arwf = this.d;
            if (arwf == null) {
                if (ajzf.d != null) {
                    return false;
                }
            } else if (!arwf.equals(ajzf.d)) {
                return false;
            }
            aygk aygk = this.e;
            if (aygk == null) {
                if (ajzf.e != null) {
                    return false;
                }
            } else if (!aygk.equals(ajzf.e)) {
                return false;
            }
            apxu apxu = this.f;
            if (apxu == null) {
                if (ajzf.f != null) {
                    return false;
                }
            } else if (!apxu.equals(ajzf.f)) {
                return false;
            }
            if (aocd.a(this.g, ajzf.g)) {
                auvr auvr = this.h;
                if (auvr == null) {
                    if (ajzf.h != null) {
                        return false;
                    }
                } else if (!auvr.equals(ajzf.h)) {
                    return false;
                }
                if (Arrays.equals(this.i, ajzf.i)) {
                    awso awso = this.j;
                    if (awso == null) {
                        if (ajzf.j != null) {
                            return false;
                        }
                    } else if (!awso.equals(ajzf.j)) {
                        return false;
                    }
                    if (this.k == ajzf.k && this.l == ajzf.l) {
                        aojc aojc = this.m;
                        if (aojc == null) {
                            if (ajzf.m != null) {
                                return false;
                            }
                        } else if (!aojc.equals(ajzf.m)) {
                            return false;
                        }
                        String str = this.n;
                        if (str == null) {
                            if (ajzf.n != null) {
                                return false;
                            }
                        } else if (!str.equals(ajzf.n)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajzf.unknownFieldData);
                        }
                        aocb aocb2 = ajzf.unknownFieldData;
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
        arwf arwf = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf != null ? arwf.hashCode() : 0;
        aygk aygk = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        apxu apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.g);
        auvr auvr = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        a = Arrays.hashCode(this.i);
        awso awso = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = awso != null ? awso.hashCode() : 0;
        long j = this.k;
        long j2 = this.l;
        aojc aojc = this.m;
        hashCode = (((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        String str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
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
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        apxu[] apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.g;
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
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            aoby.a(10, this.i);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(11, anze);
        }
        long j = this.k;
        if (j != 0) {
            aoby.b(12, j);
        }
        j = this.l;
        if (j != 0) {
            aoby.b(13, j);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(14, anze);
        }
        String str = this.n;
        if (!(str == null || str.equals(""))) {
            aoby.a(15, this.n);
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
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        apxu[] apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.g;
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
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            computeSerializedSize += aoby.b(10, this.i);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        long j = this.k;
        if (j != 0) {
            computeSerializedSize += aoby.d(12, j);
        }
        j = this.l;
        if (j != 0) {
            computeSerializedSize += aoby.d(13, j);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        String str = this.n;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(15, this.n);
    }

    public final boolean a() {
        return this.o;
    }

    public final void b() {
        this.o = true;
    }

    public final boolean c() {
        long j = this.p;
        return j > 0 && j + this.k <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.p == 0) {
            this.p = System.currentTimeMillis();
        }
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
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
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.e;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.e = aygk;
                    continue;
                case cv.aU /*50*/:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.f;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.f = apxu;
                    continue;
                case 58:
                    a = aock.a(aobv, 58);
                    apxu[] apxuArr = this.g;
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
                    this.g = apxuArr2;
                    continue;
                case 66:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.h;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.h = auvr;
                    continue;
                case 82:
                    this.i = aobv.e();
                    continue;
                case 90:
                    awso awso = (awso) aobv.a(awso.c.getParserForType());
                    awso awso2 = this.j;
                    if (awso2 != null) {
                        awsr awsr = (awsr) ((anxo) awso2.toBuilder());
                        awsr.mergeFrom(awso);
                        awso = (awso) ((anxl) awsr.build());
                    }
                    this.j = awso;
                    continue;
                case 96:
                    this.k = aobv.g();
                    continue;
                case 104:
                    this.l = aobv.g();
                    continue;
                case 114:
                    aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                    aojc aojc2 = this.m;
                    if (aojc2 != null) {
                        aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                        aojf.mergeFrom(aojc);
                        aojc = (aojc) ((anxl) aojf.build());
                    }
                    this.m = aojc;
                    continue;
                case afy.av /*122*/:
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
