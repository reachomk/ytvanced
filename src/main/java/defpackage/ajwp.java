package defpackage;

import java.util.Arrays;

/* renamed from: ajwp */
public final class ajwp extends ajwo {
    public arml a;
    public aqme[] b;
    public aphj c;
    public byte[] d;
    public int e;
    public arml f;
    public arml g;
    public arml h;
    public ajzw[] i;
    public apxu j;
    public ajzw k;

    public ajwp() {
        super(97628151);
        this.b = new aqme[0];
        this.d = aock.c;
        this.e = 0;
        this.i = ajzw.a();
        this.k = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwp) {
            ajwp ajwp = (ajwp) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajwp.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajwp.a)) {
                return false;
            }
            if (aocd.a(this.b, ajwp.b)) {
                aphj aphj = this.c;
                if (aphj == null) {
                    if (ajwp.c != null) {
                        return false;
                    }
                } else if (!aphj.equals(ajwp.c)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajwp.d) && this.e == ajwp.e) {
                    arml = this.f;
                    if (arml == null) {
                        if (ajwp.f != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajwp.f)) {
                        return false;
                    }
                    arml = this.g;
                    if (arml == null) {
                        if (ajwp.g != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajwp.g)) {
                        return false;
                    }
                    arml = this.h;
                    if (arml == null) {
                        if (ajwp.h != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajwp.h)) {
                        return false;
                    }
                    if (aocd.a(this.i, ajwp.i)) {
                        apxu apxu = this.j;
                        if (apxu == null) {
                            if (ajwp.j != null) {
                                return false;
                            }
                        } else if (!apxu.equals(ajwp.j)) {
                            return false;
                        }
                        ajzw ajzw = this.k;
                        if (ajzw == null) {
                            if (ajwp.k != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajwp.k)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajwp.unknownFieldData);
                        }
                        aocb aocb2 = ajwp.unknownFieldData;
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
        int a = aocd.a(this.b);
        aphj aphj = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        a = Arrays.hashCode(this.d);
        int i2 = this.e;
        arml arml2 = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + i2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml arml3 = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        arml3 = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        a = aocd.a(this.i);
        apxu apxu = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        ajzw ajzw = this.k;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        aocf aocf;
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        aqme[] aqmeArr = this.b;
        int i2 = 0;
        if (aqmeArr != null && aqmeArr.length > 0) {
            i = 0;
            while (true) {
                aqme[] aqmeArr2 = this.b;
                if (i >= aqmeArr2.length) {
                    break;
                }
                anze anze2 = aqmeArr2[i];
                if (anze2 != null) {
                    aoby.a(2, anze2);
                }
                i++;
            }
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(5, this.d);
        }
        i = this.e;
        if (i != 0) {
            aoby.a(6, i);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(9, anze);
        }
        ajzw[] ajzwArr = this.i;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.i;
                if (i2 >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i2];
                if (aocf != null) {
                    aoby.a(10, aocf);
                }
                i2++;
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
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        aocf aocf;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        aqme[] aqmeArr = this.b;
        int i2 = 0;
        if (aqmeArr != null && aqmeArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aqme[] aqmeArr2 = this.b;
                if (computeSerializedSize >= aqmeArr2.length) {
                    break;
                }
                anze anze2 = aqmeArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(2, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(5, this.d);
        }
        i = this.e;
        if (i != 0) {
            computeSerializedSize += aoby.c(6, i);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        ajzw[] ajzwArr = this.i;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.i;
                if (i2 >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i2];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(10, aocf);
                }
                i2++;
            }
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        aocf = this.k;
        return aocf != null ? computeSerializedSize + aoby.b(12, aocf) : computeSerializedSize;
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
                    a = aock.a(aobv, 18);
                    aqme[] aqmeArr = this.b;
                    length = aqmeArr != null ? aqmeArr.length : 0;
                    aqme[] aqmeArr2 = new aqme[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aqmeArr, 0, aqmeArr2, 0, length);
                    }
                    while (length < aqmeArr2.length - 1) {
                        aqmeArr2[length] = (aqme) aobv.a(aqme.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aqmeArr2[length] = (aqme) aobv.a(aqme.c.getParserForType());
                    this.b = aqmeArr2;
                    continue;
                case 26:
                    aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj aphj2 = this.c;
                    if (aphj2 != null) {
                        aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.c = aphj;
                    continue;
                case 42:
                    this.d = aobv.e();
                    continue;
                case 48:
                    this.e = aobv.f();
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.g;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.g = arml;
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.h;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.h = arml;
                    continue;
                case 82:
                    aocf ajzw;
                    a = aock.a(aobv, 82);
                    ajzw[] ajzwArr = this.i;
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
                    this.i = ajzwArr2;
                    continue;
                case 90:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.j;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
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
