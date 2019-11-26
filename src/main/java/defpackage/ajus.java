package defpackage;

import java.util.Arrays;

/* renamed from: ajus */
public final class ajus extends ajwo {
    public aygk a;
    public apxu b;
    public arml c;
    public arml d;
    public ajuu e;
    public arwf f;
    public apxu[] g;
    private arml h;
    private String i = "";
    private ajuu[] j;
    private apxu[] k;
    private byte[] l;
    private auvr m;

    public ajus() {
        super(50779196);
        if (ajuu.a == null) {
            synchronized (aocd.b) {
                if (ajuu.a == null) {
                    ajuu.a = new ajuu[0];
                }
            }
        }
        this.j = ajuu.a;
        this.e = null;
        this.k = new apxu[0];
        this.l = aock.c;
        this.g = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajus) {
            ajus ajus = (ajus) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajus.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajus.a)) {
                return false;
            }
            apxu apxu = this.b;
            if (apxu == null) {
                if (ajus.b != null) {
                    return false;
                }
            } else if (!apxu.equals(ajus.b)) {
                return false;
            }
            arml arml = this.c;
            if (arml == null) {
                if (ajus.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajus.c)) {
                return false;
            }
            arml = this.h;
            if (arml == null) {
                if (ajus.h != null) {
                    return false;
                }
            } else if (!arml.equals(ajus.h)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajus.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajus.d)) {
                return false;
            }
            String str = this.i;
            if (str == null) {
                if (ajus.i != null) {
                    return false;
                }
            } else if (!str.equals(ajus.i)) {
                return false;
            }
            if (aocd.a(this.j, ajus.j)) {
                ajuu ajuu = this.e;
                if (ajuu == null) {
                    if (ajus.e != null) {
                        return false;
                    }
                } else if (!ajuu.equals(ajus.e)) {
                    return false;
                }
                if (aocd.a(this.k, ajus.k) && Arrays.equals(this.l, ajus.l)) {
                    auvr auvr = this.m;
                    if (auvr == null) {
                        if (ajus.m != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajus.m)) {
                        return false;
                    }
                    arwf arwf = this.f;
                    if (arwf == null) {
                        if (ajus.f != null) {
                            return false;
                        }
                    } else if (!arwf.equals(ajus.f)) {
                        return false;
                    }
                    if (aocd.a(this.g, ajus.g)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajus.unknownFieldData);
                        }
                        aocb aocb2 = ajus.unknownFieldData;
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
        apxu apxu = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arml arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (arml != null ? arml.hashCode() : 0)) * 31;
        String str = this.i;
        hashCode2 = str != null ? str.hashCode() : 0;
        int a = aocd.a(this.j);
        ajuu ajuu = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajuu != null ? ajuu.hashCode() : 0;
        a = aocd.a(this.k);
        int hashCode3 = Arrays.hashCode(this.l);
        auvr auvr = this.m;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        arwf arwf = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + (arwf != null ? arwf.hashCode() : 0)) * 31) + aocd.a(this.g)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
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
        anze = this.h;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        String str = this.i;
        if (!(str == null || str.equals(""))) {
            aoby.a(6, this.i);
        }
        ajuu[] ajuuArr = this.j;
        int i2 = 0;
        if (ajuuArr != null && ajuuArr.length > 0) {
            i = 0;
            while (true) {
                ajuu[] ajuuArr2 = this.j;
                if (i >= ajuuArr2.length) {
                    break;
                }
                aocf aocf = ajuuArr2[i];
                if (aocf != null) {
                    aoby.a(7, aocf);
                }
                i++;
            }
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            aoby.a(10, aocf2);
        }
        apxu[] apxuArr = this.k;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.k;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(11, anze2);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.l, aock.c)) {
            aoby.a(12, this.l);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(13, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(14, anze);
        }
        apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.g;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    aoby.a(15, anze);
                }
                i2++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
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
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        String str = this.i;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(6, this.i);
        }
        ajuu[] ajuuArr = this.j;
        int i2 = 0;
        if (ajuuArr != null && ajuuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajuu[] ajuuArr2 = this.j;
                if (computeSerializedSize >= ajuuArr2.length) {
                    break;
                }
                aocf aocf = ajuuArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(7, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(10, aocf2);
        }
        apxu[] apxuArr = this.k;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.k;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(11, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (!Arrays.equals(this.l, aock.c)) {
            computeSerializedSize += aoby.b(12, this.l);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.g;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(15, anze);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            int length;
            apxu[] apxuArr;
            apxu[] apxuArr2;
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
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.h;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.h = arml;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case cv.aU /*50*/:
                    this.i = aobv.d();
                    continue;
                case 58:
                    aocf ajuu;
                    a = aock.a(aobv, 58);
                    ajuu[] ajuuArr = this.j;
                    length = ajuuArr != null ? ajuuArr.length : 0;
                    ajuu[] ajuuArr2 = new ajuu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajuuArr, 0, ajuuArr2, 0, length);
                    }
                    while (length < ajuuArr2.length - 1) {
                        ajuu = new ajuu();
                        ajuuArr2[length] = ajuu;
                        aobv.a(ajuu);
                        aobv.a();
                        length++;
                    }
                    ajuu = new ajuu();
                    ajuuArr2[length] = ajuu;
                    aobv.a(ajuu);
                    this.j = ajuuArr2;
                    continue;
                case 82:
                    if (this.e == null) {
                        this.e = new ajuu();
                    }
                    aobv.a(this.e);
                    continue;
                case 90:
                    a = aock.a(aobv, 90);
                    apxuArr = this.k;
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
                    this.k = apxuArr2;
                    continue;
                case 98:
                    this.l = aobv.e();
                    continue;
                case 106:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.m;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.m = auvr;
                    continue;
                case 114:
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.f;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.f = arwf;
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    apxuArr = this.g;
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
                    this.g = apxuArr2;
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
