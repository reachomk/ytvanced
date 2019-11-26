package defpackage;

import java.util.Arrays;

/* renamed from: ajyk */
public final class ajyk extends ajwo implements ajyn {
    public aygk a;
    public arml b;
    public float c;
    public arml d;
    public arml e;
    public apxu f;
    public apxu[] g;
    public aphj h;
    public auvr i;
    public awpa j;
    public byte[] k;
    public long l;
    public long m;
    public awpc n;
    public aojc o;
    public String p;
    private boolean q;
    private long r;

    public ajyk() {
        super(99845384);
        this.c = 0.0f;
        this.g = new apxu[0];
        this.k = aock.c;
        this.l = 0;
        this.m = 0;
        this.p = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyk) {
            ajyk ajyk = (ajyk) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajyk.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajyk.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajyk.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajyk.b)) {
                return false;
            }
            if (Float.floatToIntBits(this.c) == Float.floatToIntBits(ajyk.c)) {
                arml = this.d;
                if (arml == null) {
                    if (ajyk.d != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyk.d)) {
                    return false;
                }
                arml = this.e;
                if (arml == null) {
                    if (ajyk.e != null) {
                        return false;
                    }
                } else if (!arml.equals(ajyk.e)) {
                    return false;
                }
                apxu apxu = this.f;
                if (apxu == null) {
                    if (ajyk.f != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajyk.f)) {
                    return false;
                }
                if (aocd.a(this.g, ajyk.g)) {
                    aphj aphj = this.h;
                    if (aphj == null) {
                        if (ajyk.h != null) {
                            return false;
                        }
                    } else if (!aphj.equals(ajyk.h)) {
                        return false;
                    }
                    auvr auvr = this.i;
                    if (auvr == null) {
                        if (ajyk.i != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajyk.i)) {
                        return false;
                    }
                    awpa awpa = this.j;
                    if (awpa == null) {
                        if (ajyk.j != null) {
                            return false;
                        }
                    } else if (!awpa.equals(ajyk.j)) {
                        return false;
                    }
                    if (Arrays.equals(this.k, ajyk.k) && this.l == ajyk.l && this.m == ajyk.m) {
                        awpc awpc = this.n;
                        if (awpc == null) {
                            if (ajyk.n != null) {
                                return false;
                            }
                        } else if (!awpc.equals(ajyk.n)) {
                            return false;
                        }
                        aojc aojc = this.o;
                        if (aojc == null) {
                            if (ajyk.o != null) {
                                return false;
                            }
                        } else if (!aojc.equals(ajyk.o)) {
                            return false;
                        }
                        String str = this.p;
                        if (str == null) {
                            if (ajyk.p != null) {
                                return false;
                            }
                        } else if (!str.equals(ajyk.p)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajyk.unknownFieldData);
                        }
                        aocb aocb2 = ajyk.unknownFieldData;
                        return aocb2 == null || aocb2.b();
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
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        int floatToIntBits = Float.floatToIntBits(this.c);
        arml arml2 = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + floatToIntBits) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        floatToIntBits = aocd.a(this.g);
        aphj aphj = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + floatToIntBits) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        auvr auvr = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        awpa awpa = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awpa != null ? awpa.hashCode() : 0;
        floatToIntBits = Arrays.hashCode(this.k);
        long j = this.l;
        long j2 = this.m;
        awpc awpc = this.n;
        hashCode = (((((((hashCode + hashCode2) * 31) + floatToIntBits) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        hashCode2 = awpc != null ? awpc.hashCode() : 0;
        aojc aojc = this.o;
        hashCode = (((hashCode + hashCode2) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        String str = this.p;
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            aoby.a(3, this.c);
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
        anze = this.i;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(10, anze);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            aoby.a(12, this.k);
        }
        long j = this.l;
        if (j != 0) {
            aoby.b(13, j);
        }
        j = this.m;
        if (j != 0) {
            aoby.b(14, j);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(15, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(16, anze);
        }
        String str = this.p;
        if (!(str == null || str.equals(""))) {
            aoby.a(17, this.p);
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(3);
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
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            computeSerializedSize += aoby.b(12, this.k);
        }
        long j = this.l;
        if (j != 0) {
            computeSerializedSize += aoby.d(13, j);
        }
        j = this.m;
        if (j != 0) {
            computeSerializedSize += aoby.d(14, j);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        String str = this.p;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(17, this.p);
    }

    public final boolean a() {
        return this.q;
    }

    public final void b() {
        this.q = true;
    }

    public final boolean c() {
        long j = this.r;
        return j > 0 && j + this.l <= System.currentTimeMillis();
    }

    public final void d() {
        if (this.r == 0) {
            this.r = System.currentTimeMillis();
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
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 29:
                    this.c = aobv.b();
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
                    aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj aphj2 = this.h;
                    if (aphj2 != null) {
                        aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.h = aphj;
                    continue;
                case 74:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.i;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.i = auvr;
                    continue;
                case 82:
                    awpa awpa = (awpa) aobv.a(awpa.c.getParserForType());
                    awpa awpa2 = this.j;
                    if (awpa2 != null) {
                        awpd awpd = (awpd) ((anxo) awpa2.toBuilder());
                        awpd.mergeFrom(awpa);
                        awpa = (awpa) ((anxl) awpd.build());
                    }
                    this.j = awpa;
                    continue;
                case 98:
                    this.k = aobv.e();
                    continue;
                case 104:
                    this.l = aobv.g();
                    continue;
                case 112:
                    this.m = aobv.g();
                    continue;
                case afy.av /*122*/:
                    awpc awpc = (awpc) aobv.a(awpc.d.getParserForType());
                    awpc awpc2 = this.n;
                    if (awpc2 != null) {
                        awpf awpf = (awpf) ((anxo) awpc2.toBuilder());
                        awpf.mergeFrom(awpc);
                        awpc = (awpc) ((anxl) awpf.build());
                    }
                    this.n = awpc;
                    continue;
                case 130:
                    aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                    aojc aojc2 = this.o;
                    if (aojc2 != null) {
                        aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                        aojf.mergeFrom(aojc);
                        aojc = (aojc) ((anxl) aojf.build());
                    }
                    this.o = aojc;
                    continue;
                case 138:
                    this.p = aobv.d();
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
