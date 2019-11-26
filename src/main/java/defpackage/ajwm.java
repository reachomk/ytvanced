package defpackage;

import java.util.Arrays;

/* renamed from: ajwm */
public final class ajwm extends ajwo {
    public arwf a;
    public arwf b;
    public apxu c;
    public arml d;
    public arml e;
    public aryr f;
    public aryv g;
    public byte[] h;
    public int i;
    public int j;

    public ajwm() {
        super(125105119);
        this.h = aock.c;
        this.i = 1;
        this.j = 1;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwm) {
            ajwm ajwm = (ajwm) obj;
            arwf arwf = this.a;
            if (arwf == null) {
                if (ajwm.a != null) {
                    return false;
                }
            } else if (!arwf.equals(ajwm.a)) {
                return false;
            }
            arwf = this.b;
            if (arwf == null) {
                if (ajwm.b != null) {
                    return false;
                }
            } else if (!arwf.equals(ajwm.b)) {
                return false;
            }
            apxu apxu = this.c;
            if (apxu == null) {
                if (ajwm.c != null) {
                    return false;
                }
            } else if (!apxu.equals(ajwm.c)) {
                return false;
            }
            arml arml = this.d;
            if (arml == null) {
                if (ajwm.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajwm.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajwm.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajwm.e)) {
                return false;
            }
            aryr aryr = this.f;
            if (aryr == null) {
                if (ajwm.f != null) {
                    return false;
                }
            } else if (!aryr.equals(ajwm.f)) {
                return false;
            }
            aryv aryv = this.g;
            if (aryv == null) {
                if (ajwm.g != null) {
                    return false;
                }
            } else if (!aryv.equals(ajwm.g)) {
                return false;
            }
            if (Arrays.equals(this.h, ajwm.h) && this.i == ajwm.i && this.j == ajwm.j) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajwm.unknownFieldData);
                }
                aocb aocb2 = ajwm.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arwf arwf = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arwf != null ? arwf.hashCode() : 0;
        arwf arwf2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf2 != null ? arwf2.hashCode() : 0;
        apxu apxu = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arml arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aryr aryr = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aryr != null ? aryr.hashCode() : 0;
        aryv aryv = this.g;
        hashCode = (((((hashCode + hashCode2) * 31) + (aryv != null ? aryv.hashCode() : 0)) * 31) + Arrays.hashCode(this.h)) * 31;
        hashCode2 = this.i;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = this.j;
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
        anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(9, this.h);
        }
        int i = this.i;
        if (!(i == 1 || i == 0)) {
            aoby.a(10, i - 1);
        }
        i = this.j;
        if (!(i == 1 || i == 0)) {
            aoby.a(12, i - 1);
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
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(9, this.h);
        }
        int i = this.i;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(10, i - 1);
        }
        i = this.j;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(12, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 3;
            arwf arwf;
            arwf arwf2;
            arwe arwe;
            arml arml;
            arml arml2;
            armk armk;
            int i2;
            int f;
            switch (a) {
                case 0:
                    break;
                case 10:
                    arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf2 = this.a;
                    if (arwf2 != null) {
                        arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.a = arwf;
                    continue;
                case 18:
                    arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf2 = this.b;
                    if (arwf2 != null) {
                        arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.b = arwf;
                    continue;
                case 26:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.c;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.c = apxu;
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
                    aryr aryr = (aryr) aobv.a(aryr.c.getParserForType());
                    aryr aryr2 = this.f;
                    if (aryr2 != null) {
                        aryu aryu = (aryu) ((anxo) aryr2.toBuilder());
                        aryu.mergeFrom(aryr);
                        aryr = (aryr) ((anxl) aryu.build());
                    }
                    this.f = aryr;
                    continue;
                case 58:
                    aryv aryv = (aryv) aobv.a(aryv.c.getParserForType());
                    aryv aryv2 = this.g;
                    if (aryv2 != null) {
                        aryx aryx = (aryx) ((anxo) aryv2.toBuilder());
                        aryx.mergeFrom(aryv);
                        aryv = (aryv) ((anxl) aryx.build());
                    }
                    this.g = aryv;
                    continue;
                case 74:
                    this.h = aobv.e();
                    continue;
                case 80:
                    i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f != 2) {
                            i = 0;
                        }
                        this.i = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 96:
                    i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f != 2) {
                            i = 0;
                        }
                        this.j = i;
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
