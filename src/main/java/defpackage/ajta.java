package defpackage;

import java.util.Arrays;

/* renamed from: ajta */
public final class ajta extends ajwo {
    public aygk a;
    public arml b;
    public arml c;
    public apxu d;
    public apxu e;
    public aphj f;
    public apxu g;
    public byte[] h;
    public aphj i;
    public arwf j;

    public ajta() {
        super(92511086);
        this.h = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajta) {
            ajta ajta = (ajta) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajta.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajta.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajta.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajta.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajta.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajta.c)) {
                return false;
            }
            apxu apxu = this.d;
            if (apxu == null) {
                if (ajta.d != null) {
                    return false;
                }
            } else if (!apxu.equals(ajta.d)) {
                return false;
            }
            apxu = this.e;
            if (apxu == null) {
                if (ajta.e != null) {
                    return false;
                }
            } else if (!apxu.equals(ajta.e)) {
                return false;
            }
            aphj aphj = this.f;
            if (aphj == null) {
                if (ajta.f != null) {
                    return false;
                }
            } else if (!aphj.equals(ajta.f)) {
                return false;
            }
            apxu = this.g;
            if (apxu == null) {
                if (ajta.g != null) {
                    return false;
                }
            } else if (!apxu.equals(ajta.g)) {
                return false;
            }
            if (Arrays.equals(this.h, ajta.h)) {
                aphj = this.i;
                if (aphj == null) {
                    if (ajta.i != null) {
                        return false;
                    }
                } else if (!aphj.equals(ajta.i)) {
                    return false;
                }
                arwf arwf = this.j;
                if (arwf == null) {
                    if (ajta.j != null) {
                        return false;
                    }
                } else if (!arwf.equals(ajta.j)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajta.unknownFieldData);
                }
                aocb aocb2 = ajta.unknownFieldData;
                return aocb2 == null || aocb2.b();
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
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        apxu = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        aphj aphj = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        apxu = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.h);
        aphj aphj2 = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        arwf arwf = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (arwf != null ? arwf.hashCode() : 0)) * 31;
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
        anze = this.i;
        if (anze != null) {
            aoby.a(12, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(13, anze);
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
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        anze = this.j;
        return anze != null ? computeSerializedSize + anwm.c(13, anze) : computeSerializedSize;
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
            aphj aphj;
            aphj aphj2;
            aphm aphm;
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
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.d;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.d = apxu;
                    continue;
                case 42:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.e;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.e = apxu;
                    continue;
                case cv.aU /*50*/:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.f;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.f = aphj;
                    continue;
                case 58:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case 74:
                    this.h = aobv.e();
                    continue;
                case 98:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.i;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.i = aphj;
                    continue;
                case 106:
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.j;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.j = arwf;
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
