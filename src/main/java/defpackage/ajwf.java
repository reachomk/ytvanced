package defpackage;

import java.util.Arrays;

/* renamed from: ajwf */
public final class ajwf extends ajwo {
    public ajwk[] a;
    public aule[] b;
    public aule[] c;
    public arml d;
    public arwr e;
    public arwr f;
    public arwt g;
    public long h;
    private byte[] i;
    private boolean j;
    private boolean k;

    public ajwf() {
        super(61737181);
        if (ajwk.a == null) {
            synchronized (aocd.b) {
                if (ajwk.a == null) {
                    ajwk.a = new ajwk[0];
                }
            }
        }
        this.a = ajwk.a;
        this.b = new aule[0];
        this.c = new aule[0];
        this.i = aock.c;
        this.j = false;
        this.h = 0;
        this.k = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwf) {
            ajwf ajwf = (ajwf) obj;
            if (aocd.a(this.a, ajwf.a) && aocd.a(this.b, ajwf.b) && aocd.a(this.c, ajwf.c)) {
                arml arml = this.d;
                if (arml == null) {
                    if (ajwf.d != null) {
                        return false;
                    }
                } else if (!arml.equals(ajwf.d)) {
                    return false;
                }
                arwr arwr = this.e;
                if (arwr == null) {
                    if (ajwf.e != null) {
                        return false;
                    }
                } else if (!arwr.equals(ajwf.e)) {
                    return false;
                }
                arwr = this.f;
                if (arwr == null) {
                    if (ajwf.f != null) {
                        return false;
                    }
                } else if (!arwr.equals(ajwf.f)) {
                    return false;
                }
                if (Arrays.equals(this.i, ajwf.i) && this.j == ajwf.j) {
                    arwt arwt = this.g;
                    if (arwt == null) {
                        if (ajwf.g != null) {
                            return false;
                        }
                    } else if (!arwt.equals(ajwf.g)) {
                        return false;
                    }
                    if (this.h == ajwf.h && this.k == ajwf.k) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajwf.unknownFieldData);
                        }
                        aocb aocb2 = ajwf.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        int a2 = aocd.a(this.b);
        int a3 = aocd.a(this.c);
        arml arml = this.d;
        hashCode = (((((((hashCode + 527) * 31) + a) * 31) + a2) * 31) + a3) * 31;
        a = 0;
        a2 = arml != null ? arml.hashCode() : 0;
        arwr arwr = this.e;
        hashCode = (hashCode + a2) * 31;
        a2 = arwr != null ? arwr.hashCode() : 0;
        arwr = this.f;
        hashCode = (((((hashCode + a2) * 31) + (arwr != null ? arwr.hashCode() : 0)) * 31) + Arrays.hashCode(this.i)) * 31;
        a3 = 1237;
        a2 = !this.j ? 1237 : 1231;
        arwt arwt = this.g;
        hashCode = (hashCode + a2) * 31;
        a2 = arwt != null ? arwt.hashCode() : 0;
        long j = this.h;
        hashCode = (((hashCode + a2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.k) {
            a3 = 1231;
        }
        hashCode = (hashCode + a3) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        ajwk[] ajwkArr = this.a;
        int i2 = 0;
        if (ajwkArr != null && ajwkArr.length > 0) {
            i = 0;
            while (true) {
                ajwk[] ajwkArr2 = this.a;
                if (i >= ajwkArr2.length) {
                    break;
                }
                aocf aocf = ajwkArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        aule[] auleArr = this.b;
        if (auleArr != null && auleArr.length > 0) {
            i = 0;
            while (true) {
                aule[] auleArr2 = this.b;
                if (i >= auleArr2.length) {
                    break;
                }
                anze anze2 = auleArr2[i];
                if (anze2 != null) {
                    aoby.a(9, anze2);
                }
                i++;
            }
        }
        auleArr = this.c;
        if (auleArr != null && auleArr.length > 0) {
            while (true) {
                auleArr = this.c;
                if (i2 >= auleArr.length) {
                    break;
                }
                anze = auleArr[i2];
                if (anze != null) {
                    aoby.a(11, anze);
                }
                i2++;
            }
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(13, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(15, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            aoby.a(16, this.i);
        }
        if (this.j) {
            aoby.a(17, true);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(18, anze);
        }
        long j = this.h;
        if (j != 0) {
            aoby.b(19, j);
        }
        if (this.k) {
            aoby.a(20, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        ajwk[] ajwkArr = this.a;
        int i2 = 0;
        if (ajwkArr != null && ajwkArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajwk[] ajwkArr2 = this.a;
                if (computeSerializedSize >= ajwkArr2.length) {
                    break;
                }
                aocf aocf = ajwkArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aule[] auleArr = this.b;
        if (auleArr != null && auleArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aule[] auleArr2 = this.b;
                if (computeSerializedSize >= auleArr2.length) {
                    break;
                }
                anze anze2 = auleArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(9, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        auleArr = this.c;
        if (auleArr != null && auleArr.length > 0) {
            while (true) {
                auleArr = this.c;
                if (i2 >= auleArr.length) {
                    break;
                }
                anze = auleArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(11, anze);
                }
                i2++;
            }
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            computeSerializedSize += aoby.b(16, this.i);
        }
        if (this.j) {
            computeSerializedSize += aoby.d(17);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        long j = this.h;
        if (j != 0) {
            computeSerializedSize += aoby.d(19, j);
        }
        return this.k ? computeSerializedSize + aoby.d(20) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            aule[] auleArr;
            aule[] auleArr2;
            arwr arwr;
            arwr arwr2;
            arwu arwu;
            switch (a) {
                case 0:
                    break;
                case 10:
                    aocf ajwk;
                    a = aock.a(aobv, 10);
                    ajwk[] ajwkArr = this.a;
                    length = ajwkArr != null ? ajwkArr.length : 0;
                    ajwk[] ajwkArr2 = new ajwk[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajwkArr, 0, ajwkArr2, 0, length);
                    }
                    while (length < ajwkArr2.length - 1) {
                        ajwk = new ajwk();
                        ajwkArr2[length] = ajwk;
                        aobv.a(ajwk);
                        aobv.a();
                        length++;
                    }
                    ajwk = new ajwk();
                    ajwkArr2[length] = ajwk;
                    aobv.a(ajwk);
                    this.a = ajwkArr2;
                    continue;
                case 74:
                    a = aock.a(aobv, 74);
                    auleArr = this.b;
                    length = auleArr != null ? auleArr.length : 0;
                    auleArr2 = new aule[(a + length)];
                    if (length != 0) {
                        System.arraycopy(auleArr, 0, auleArr2, 0, length);
                    }
                    while (length < auleArr2.length - 1) {
                        auleArr2[length] = (aule) aobv.a(aule.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    auleArr2[length] = (aule) aobv.a(aule.d.getParserForType());
                    this.b = auleArr2;
                    continue;
                case 90:
                    a = aock.a(aobv, 90);
                    auleArr = this.c;
                    length = auleArr != null ? auleArr.length : 0;
                    auleArr2 = new aule[(a + length)];
                    if (length != 0) {
                        System.arraycopy(auleArr, 0, auleArr2, 0, length);
                    }
                    while (length < auleArr2.length - 1) {
                        auleArr2[length] = (aule) aobv.a(aule.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    auleArr2[length] = (aule) aobv.a(aule.d.getParserForType());
                    this.c = auleArr2;
                    continue;
                case 106:
                    arml arml = (arml) aobv.a(arml.f.getParserForType());
                    arml arml2 = this.d;
                    if (arml2 != null) {
                        armk armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case 114:
                    arwr = (arwr) aobv.a(arwr.d.getParserForType());
                    arwr2 = this.e;
                    if (arwr2 != null) {
                        arwu = (arwu) ((anxo) arwr2.toBuilder());
                        arwu.mergeFrom(arwr);
                        arwr = (arwr) ((anxl) arwu.build());
                    }
                    this.e = arwr;
                    continue;
                case afy.av /*122*/:
                    arwr = (arwr) aobv.a(arwr.d.getParserForType());
                    arwr2 = this.f;
                    if (arwr2 != null) {
                        arwu = (arwu) ((anxo) arwr2.toBuilder());
                        arwu.mergeFrom(arwr);
                        arwr = (arwr) ((anxl) arwu.build());
                    }
                    this.f = arwr;
                    continue;
                case 130:
                    this.i = aobv.e();
                    continue;
                case 136:
                    this.j = aobv.c();
                    continue;
                case 146:
                    arwt arwt = (arwt) aobv.a(arwt.c.getParserForType());
                    arwt arwt2 = this.g;
                    if (arwt2 != null) {
                        arww arww = (arww) ((anxo) arwt2.toBuilder());
                        arww.mergeFrom(arwt);
                        arwt = (arwt) ((anxl) arww.build());
                    }
                    this.g = arwt;
                    continue;
                case 152:
                    this.h = aobv.g();
                    continue;
                case 160:
                    this.k = aobv.c();
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
