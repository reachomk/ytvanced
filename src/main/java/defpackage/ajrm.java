package defpackage;

import java.util.Arrays;

/* renamed from: ajrm */
public final class ajrm extends ajwo {
    public arml a;
    public azhs b;
    public azik c;
    public akbw[] d;
    public boolean e;
    public arml f;
    public byte[] g;
    private apxu h;
    private arml[] i;
    private apdh[] j;

    public ajrm() {
        super(50171885);
        this.i = new arml[0];
        this.j = new apdh[0];
        this.d = akbw.a();
        this.e = false;
        this.g = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrm) {
            ajrm ajrm = (ajrm) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajrm.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajrm.a)) {
                return false;
            }
            apxu apxu = this.h;
            if (apxu == null) {
                if (ajrm.h != null) {
                    return false;
                }
            } else if (!apxu.equals(ajrm.h)) {
                return false;
            }
            if (aocd.a(this.i, ajrm.i) && aocd.a(this.j, ajrm.j)) {
                azhs azhs = this.b;
                if (azhs == null) {
                    if (ajrm.b != null) {
                        return false;
                    }
                } else if (!azhs.equals(ajrm.b)) {
                    return false;
                }
                azik azik = this.c;
                if (azik == null) {
                    if (ajrm.c != null) {
                        return false;
                    }
                } else if (!azik.equals(ajrm.c)) {
                    return false;
                }
                if (aocd.a(this.d, ajrm.d) && this.e == ajrm.e) {
                    arml = this.f;
                    if (arml == null) {
                        if (ajrm.f != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajrm.f)) {
                        return false;
                    }
                    if (Arrays.equals(this.g, ajrm.g)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajrm.unknownFieldData);
                        }
                        aocb aocb2 = ajrm.unknownFieldData;
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
        apxu apxu = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.i);
        int a2 = aocd.a(this.j);
        azhs azhs = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + a2) * 31;
        hashCode2 = azhs != null ? azhs.hashCode() : 0;
        azik azik = this.c;
        hashCode = (((((hashCode + hashCode2) * 31) + (azik != null ? azik.hashCode() : 0)) * 31) + aocd.a(this.d)) * 31;
        hashCode2 = !this.e ? 1237 : 1231;
        arml arml2 = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31) + Arrays.hashCode(this.g)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        anze anze2 = this.a;
        if (anze2 != null) {
            aoby.a(1, anze2);
        }
        anze2 = this.h;
        if (anze2 != null) {
            aoby.a(2, anze2);
        }
        arml[] armlArr = this.i;
        int i2 = 0;
        if (armlArr != null && armlArr.length > 0) {
            i = 0;
            while (true) {
                arml[] armlArr2 = this.i;
                if (i >= armlArr2.length) {
                    break;
                }
                anze = armlArr2[i];
                if (anze != null) {
                    aoby.a(3, anze);
                }
                i++;
            }
        }
        apdh[] apdhArr = this.j;
        if (apdhArr != null && apdhArr.length > 0) {
            i = 0;
            while (true) {
                apdh[] apdhArr2 = this.j;
                if (i >= apdhArr2.length) {
                    break;
                }
                anze = apdhArr2[i];
                if (anze != null) {
                    aoby.a(4, anze);
                }
                i++;
            }
        }
        anze2 = this.b;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        akbw[] akbwArr = this.d;
        if (akbwArr != null && akbwArr.length > 0) {
            while (true) {
                akbwArr = this.d;
                if (i2 >= akbwArr.length) {
                    break;
                }
                aocf aocf = akbwArr[i2];
                if (aocf != null) {
                    aoby.a(7, aocf);
                }
                i2++;
            }
        }
        if (this.e) {
            aoby.a(8, true);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        if (!Arrays.equals(this.g, aock.c)) {
            aoby.a(11, this.g);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze2 = this.a;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(1, anze2);
        }
        anze2 = this.h;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(2, anze2);
        }
        arml[] armlArr = this.i;
        int i2 = 0;
        if (armlArr != null && armlArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                arml[] armlArr2 = this.i;
                if (computeSerializedSize >= armlArr2.length) {
                    break;
                }
                anze = armlArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(3, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        apdh[] apdhArr = this.j;
        if (apdhArr != null && apdhArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apdh[] apdhArr2 = this.j;
                if (computeSerializedSize >= apdhArr2.length) {
                    break;
                }
                anze = apdhArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(4, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze2 = this.b;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        akbw[] akbwArr = this.d;
        if (akbwArr != null && akbwArr.length > 0) {
            while (true) {
                akbwArr = this.d;
                if (i2 >= akbwArr.length) {
                    break;
                }
                aocf aocf = akbwArr[i2];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(7, aocf);
                }
                i2++;
            }
        }
        if (this.e) {
            computeSerializedSize += aoby.d(8);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        return !Arrays.equals(this.g, aock.c) ? computeSerializedSize + aoby.b(11, this.g) : computeSerializedSize;
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
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.h;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.h = apxu;
                    continue;
                case 26:
                    a = aock.a(aobv, 26);
                    arml[] armlArr = this.i;
                    length = armlArr != null ? armlArr.length : 0;
                    arml[] armlArr2 = new arml[(a + length)];
                    if (length != 0) {
                        System.arraycopy(armlArr, 0, armlArr2, 0, length);
                    }
                    while (length < armlArr2.length - 1) {
                        armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                    this.i = armlArr2;
                    continue;
                case 34:
                    a = aock.a(aobv, 34);
                    apdh[] apdhArr = this.j;
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
                    this.j = apdhArr2;
                    continue;
                case 42:
                    azhs azhs = (azhs) aobv.a(azhs.c.getParserForType());
                    azhs azhs2 = this.b;
                    if (azhs2 != null) {
                        azhv azhv = (azhv) ((anxo) azhs2.toBuilder());
                        azhv.mergeFrom(azhs);
                        azhs = (azhs) ((anxl) azhv.build());
                    }
                    this.b = azhs;
                    continue;
                case cv.aU /*50*/:
                    azik azik = (azik) aobv.a(azik.d.getParserForType());
                    azik azik2 = this.c;
                    if (azik2 != null) {
                        azin azin = (azin) ((anxo) azik2.toBuilder());
                        azin.mergeFrom(azik);
                        azik = (azik) ((anxl) azin.build());
                    }
                    this.c = azik;
                    continue;
                case 58:
                    aocf akbw;
                    a = aock.a(aobv, 58);
                    akbw[] akbwArr = this.d;
                    length = akbwArr != null ? akbwArr.length : 0;
                    akbw[] akbwArr2 = new akbw[(a + length)];
                    if (length != 0) {
                        System.arraycopy(akbwArr, 0, akbwArr2, 0, length);
                    }
                    while (length < akbwArr2.length - 1) {
                        akbw = new akbw();
                        akbwArr2[length] = akbw;
                        aobv.a(akbw);
                        aobv.a();
                        length++;
                    }
                    akbw = new akbw();
                    akbwArr2[length] = akbw;
                    aobv.a(akbw);
                    this.d = akbwArr2;
                    continue;
                case 64:
                    this.e = aobv.c();
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 90:
                    this.g = aobv.e();
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
