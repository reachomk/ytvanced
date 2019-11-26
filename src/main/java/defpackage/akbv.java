package defpackage;

import java.util.Arrays;

/* renamed from: akbv */
public final class akbv extends ajwo {
    public arml a;
    public apxu b;
    public arml[] c;
    public azhs d;
    public azik e;
    public akbw f;
    public boolean g;
    public arml h;
    public byte[] i;
    private auvr j;

    public akbv() {
        super(63177942);
        this.c = new arml[0];
        this.f = null;
        this.g = false;
        this.i = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbv) {
            akbv akbv = (akbv) obj;
            arml arml = this.a;
            if (arml == null) {
                if (akbv.a != null) {
                    return false;
                }
            } else if (!arml.equals(akbv.a)) {
                return false;
            }
            apxu apxu = this.b;
            if (apxu == null) {
                if (akbv.b != null) {
                    return false;
                }
            } else if (!apxu.equals(akbv.b)) {
                return false;
            }
            if (aocd.a(this.c, akbv.c)) {
                azhs azhs = this.d;
                if (azhs == null) {
                    if (akbv.d != null) {
                        return false;
                    }
                } else if (!azhs.equals(akbv.d)) {
                    return false;
                }
                azik azik = this.e;
                if (azik == null) {
                    if (akbv.e != null) {
                        return false;
                    }
                } else if (!azik.equals(akbv.e)) {
                    return false;
                }
                akbw akbw = this.f;
                if (akbw == null) {
                    if (akbv.f != null) {
                        return false;
                    }
                } else if (!akbw.equals(akbv.f)) {
                    return false;
                }
                if (this.g == akbv.g) {
                    arml = this.h;
                    if (arml == null) {
                        if (akbv.h != null) {
                            return false;
                        }
                    } else if (!arml.equals(akbv.h)) {
                        return false;
                    }
                    if (Arrays.equals(this.i, akbv.i)) {
                        auvr auvr = this.j;
                        if (auvr == null) {
                            if (akbv.j != null) {
                                return false;
                            }
                        } else if (!auvr.equals(akbv.j)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(akbv.unknownFieldData);
                        }
                        aocb aocb2 = akbv.unknownFieldData;
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
        apxu apxu = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.c);
        azhs azhs = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = azhs != null ? azhs.hashCode() : 0;
        azik azik = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azik != null ? azik.hashCode() : 0;
        akbw akbw = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (akbw != null ? akbw.hashCode() : 0)) * 31;
        hashCode2 = !this.g ? 1237 : 1231;
        arml arml2 = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        a = Arrays.hashCode(this.i);
        auvr auvr = this.j;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (auvr != null ? auvr.hashCode() : 0)) * 31;
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
        arml[] armlArr = this.c;
        if (armlArr != null && armlArr.length > 0) {
            int i = 0;
            while (true) {
                arml[] armlArr2 = this.c;
                if (i >= armlArr2.length) {
                    break;
                }
                anze anze2 = armlArr2[i];
                if (anze2 != null) {
                    aoby.a(3, anze2);
                }
                i++;
            }
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
        if (this.g) {
            aoby.a(7, true);
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
        arml[] armlArr = this.c;
        if (armlArr != null && armlArr.length > 0) {
            int i = 0;
            while (true) {
                arml[] armlArr2 = this.c;
                if (i >= armlArr2.length) {
                    break;
                }
                anze anze2 = armlArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(3, anze2);
                }
                i++;
            }
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
        if (this.g) {
            computeSerializedSize += aoby.d(7);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            computeSerializedSize += aoby.b(10, this.i);
        }
        anze = this.j;
        return anze != null ? computeSerializedSize + anwm.c(11, anze) : computeSerializedSize;
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
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.b;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.b = apxu;
                    continue;
                case 26:
                    a = aock.a(aobv, 26);
                    arml[] armlArr = this.c;
                    int length = armlArr != null ? armlArr.length : 0;
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
                    this.c = armlArr2;
                    continue;
                case 34:
                    azhs azhs = (azhs) aobv.a(azhs.c.getParserForType());
                    azhs azhs2 = this.d;
                    if (azhs2 != null) {
                        azhv azhv = (azhv) ((anxo) azhs2.toBuilder());
                        azhv.mergeFrom(azhs);
                        azhs = (azhs) ((anxl) azhv.build());
                    }
                    this.d = azhs;
                    continue;
                case 42:
                    azik azik = (azik) aobv.a(azik.d.getParserForType());
                    azik azik2 = this.e;
                    if (azik2 != null) {
                        azin azin = (azin) ((anxo) azik2.toBuilder());
                        azin.mergeFrom(azik);
                        azik = (azik) ((anxl) azin.build());
                    }
                    this.e = azik;
                    continue;
                case cv.aU /*50*/:
                    if (this.f == null) {
                        this.f = new akbw();
                    }
                    aobv.a(this.f);
                    continue;
                case cv.ba /*56*/:
                    this.g = aobv.c();
                    continue;
                case 66:
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
                    this.i = aobv.e();
                    continue;
                case 90:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.j;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.j = auvr;
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
