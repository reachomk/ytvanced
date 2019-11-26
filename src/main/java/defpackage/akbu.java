package defpackage;

import java.util.Arrays;

/* renamed from: akbu */
public final class akbu extends ajwo {
    public aygk a;
    public arml b;
    private axwz c;
    private apxu d;
    private arml e;
    private akbt f;
    private byte[] g;
    private apdh[] h;
    private auuq i;
    private ajzw[] j;
    private ajzw k;

    public akbu() {
        super(51779708);
        this.f = null;
        this.g = aock.c;
        this.h = new apdh[0];
        this.j = ajzw.a();
        this.k = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbu) {
            akbu akbu = (akbu) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (akbu.a != null) {
                    return false;
                }
            } else if (!aygk.equals(akbu.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (akbu.b != null) {
                    return false;
                }
            } else if (!arml.equals(akbu.b)) {
                return false;
            }
            axwz axwz = this.c;
            if (axwz == null) {
                if (akbu.c != null) {
                    return false;
                }
            } else if (!axwz.equals(akbu.c)) {
                return false;
            }
            apxu apxu = this.d;
            if (apxu == null) {
                if (akbu.d != null) {
                    return false;
                }
            } else if (!apxu.equals(akbu.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (akbu.e != null) {
                    return false;
                }
            } else if (!arml.equals(akbu.e)) {
                return false;
            }
            akbt akbt = this.f;
            if (akbt == null) {
                if (akbu.f != null) {
                    return false;
                }
            } else if (!akbt.equals(akbu.f)) {
                return false;
            }
            if (Arrays.equals(this.g, akbu.g) && aocd.a(this.h, akbu.h)) {
                auuq auuq = this.i;
                if (auuq == null) {
                    if (akbu.i != null) {
                        return false;
                    }
                } else if (!auuq.equals(akbu.i)) {
                    return false;
                }
                if (aocd.a(this.j, akbu.j)) {
                    ajzw ajzw = this.k;
                    if (ajzw == null) {
                        if (akbu.k != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(akbu.k)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akbu.unknownFieldData);
                    }
                    aocb aocb2 = akbu.unknownFieldData;
                    return aocb2 == null || aocb2.b();
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
        axwz axwz = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axwz != null ? axwz.hashCode() : 0;
        apxu apxu = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        akbt akbt = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akbt != null ? akbt.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.g);
        int a = aocd.a(this.h);
        auuq auuq = this.i;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a) * 31;
        hashCode2 = auuq != null ? auuq.hashCode() : 0;
        hashCode3 = aocd.a(this.j);
        ajzw ajzw = this.k;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
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
        aocf aocf = this.f;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        if (!Arrays.equals(this.g, aock.c)) {
            aoby.a(8, this.g);
        }
        apdh[] apdhArr = this.h;
        int i = 0;
        if (apdhArr != null && apdhArr.length > 0) {
            int i2 = 0;
            while (true) {
                apdh[] apdhArr2 = this.h;
                if (i2 >= apdhArr2.length) {
                    break;
                }
                anze anze2 = apdhArr2[i2];
                if (anze2 != null) {
                    aoby.a(10, anze2);
                }
                i2++;
            }
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(11, anze);
        }
        ajzw[] ajzwArr = this.j;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.j;
                if (i >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i];
                if (aocf != null) {
                    aoby.a(12, aocf);
                }
                i++;
            }
        }
        aocf = this.k;
        if (aocf != null) {
            aoby.a(14, aocf);
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
        aocf aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        if (!Arrays.equals(this.g, aock.c)) {
            computeSerializedSize += aoby.b(8, this.g);
        }
        apdh[] apdhArr = this.h;
        int i = 0;
        if (apdhArr != null && apdhArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apdh[] apdhArr2 = this.h;
                if (computeSerializedSize >= apdhArr2.length) {
                    break;
                }
                anze anze2 = apdhArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(10, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        ajzw[] ajzwArr = this.j;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.j;
                if (i >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(12, aocf);
                }
                i++;
            }
        }
        aocf = this.k;
        return aocf != null ? computeSerializedSize + aoby.b(14, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            int length;
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
                    axwz axwz = (axwz) aobv.a(axwz.c.getParserForType());
                    axwz axwz2 = this.c;
                    if (axwz2 != null) {
                        axwy axwy = (axwy) ((anxo) axwz2.toBuilder());
                        axwy.mergeFrom(axwz);
                        axwz = (axwz) ((anxl) axwy.build());
                    }
                    this.c = axwz;
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
                    if (this.f == null) {
                        this.f = new akbt();
                    }
                    aobv.a(this.f);
                    continue;
                case 66:
                    this.g = aobv.e();
                    continue;
                case 82:
                    a = aock.a(aobv, 82);
                    apdh[] apdhArr = this.h;
                    length = apdhArr != null ? apdhArr.length : 0;
                    apdh[] apdhArr2 = new apdh[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apdhArr, 0, apdhArr2, 0, length);
                    }
                    while (length < apdhArr2.length - 1) {
                        apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                    this.h = apdhArr2;
                    continue;
                case 90:
                    auuq auuq = (auuq) aobv.a(auuq.c.getParserForType());
                    auuq auuq2 = this.i;
                    if (auuq2 != null) {
                        auup auup = (auup) ((anxo) auuq2.toBuilder());
                        auup.mergeFrom(auuq);
                        auuq = (auuq) ((anxl) auup.build());
                    }
                    this.i = auuq;
                    continue;
                case 98:
                    aocf ajzw;
                    a = aock.a(aobv, 98);
                    ajzw[] ajzwArr = this.j;
                    length = ajzwArr != null ? ajzwArr.length : 0;
                    ajzw[] ajzwArr2 = new ajzw[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajzwArr, 0, ajzwArr2, 0, length);
                    }
                    while (length < ajzwArr2.length - 1) {
                        ajzw = new ajzw();
                        ajzwArr2[length] = ajzw;
                        aobv.a(ajzw);
                        aobv.a();
                        length++;
                    }
                    ajzw = new ajzw();
                    ajzwArr2[length] = ajzw;
                    aobv.a(ajzw);
                    this.j = ajzwArr2;
                    continue;
                case 114:
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
