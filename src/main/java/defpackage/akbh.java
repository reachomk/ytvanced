package defpackage;

import java.util.Arrays;

/* renamed from: akbh */
public final class akbh extends ajwo {
    public akaj[] a;
    public aylw b;
    public ayku c;
    public apxu[] d;
    public aylc e;
    public ayma f;
    private arml g;
    private apfm h;
    private byte[] i;
    private arml j;
    private int k;
    private ajzw l;

    public akbh() {
        super(87759049);
        if (akaj.a == null) {
            synchronized (aocd.b) {
                if (akaj.a == null) {
                    akaj.a = new akaj[0];
                }
            }
        }
        this.a = akaj.a;
        this.i = aock.c;
        this.d = new apxu[0];
        this.k = 0;
        this.l = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbh) {
            akbh akbh = (akbh) obj;
            arml arml = this.g;
            if (arml == null) {
                if (akbh.g != null) {
                    return false;
                }
            } else if (!arml.equals(akbh.g)) {
                return false;
            }
            if (aocd.a(this.a, akbh.a)) {
                apfm apfm = this.h;
                if (apfm == null) {
                    if (akbh.h != null) {
                        return false;
                    }
                } else if (!apfm.equals(akbh.h)) {
                    return false;
                }
                aylw aylw = this.b;
                if (aylw == null) {
                    if (akbh.b != null) {
                        return false;
                    }
                } else if (!aylw.equals(akbh.b)) {
                    return false;
                }
                if (Arrays.equals(this.i, akbh.i)) {
                    arml = this.j;
                    if (arml == null) {
                        if (akbh.j != null) {
                            return false;
                        }
                    } else if (!arml.equals(akbh.j)) {
                        return false;
                    }
                    ayku ayku = this.c;
                    if (ayku == null) {
                        if (akbh.c != null) {
                            return false;
                        }
                    } else if (!ayku.equals(akbh.c)) {
                        return false;
                    }
                    if (aocd.a(this.d, akbh.d)) {
                        aylc aylc = this.e;
                        if (aylc == null) {
                            if (akbh.e != null) {
                                return false;
                            }
                        } else if (!aylc.equals(akbh.e)) {
                            return false;
                        }
                        ayma ayma = this.f;
                        if (ayma == null) {
                            if (akbh.f != null) {
                                return false;
                            }
                        } else if (!ayma.equals(akbh.f)) {
                            return false;
                        }
                        if (this.k == akbh.k) {
                            ajzw ajzw = this.l;
                            if (ajzw == null) {
                                if (akbh.l != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(akbh.l)) {
                                return false;
                            }
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(akbh.unknownFieldData);
                            }
                            aocb aocb2 = akbh.unknownFieldData;
                            return aocb2 == null || aocb2.b();
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.g;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        int a = aocd.a(this.a);
        apfm apfm = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = apfm != null ? apfm.hashCode() : 0;
        aylw aylw = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aylw != null ? aylw.hashCode() : 0;
        a = Arrays.hashCode(this.i);
        arml arml2 = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        ayku ayku = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ayku != null ? ayku.hashCode() : 0;
        a = aocd.a(this.d);
        aylc aylc = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = aylc != null ? aylc.hashCode() : 0;
        ayma ayma = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ayma != null ? ayma.hashCode() : 0;
        a = this.k;
        ajzw ajzw = this.l;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze = this.g;
        if (anze != null) {
            aoby.a(1, anze);
        }
        akaj[] akajArr = this.a;
        int i2 = 0;
        if (akajArr != null && akajArr.length > 0) {
            i = 0;
            while (true) {
                akaj[] akajArr2 = this.a;
                if (i >= akajArr2.length) {
                    break;
                }
                aocf aocf = akajArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(4, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            aoby.a(6, this.i);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(9, anze);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.d;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    aoby.a(10, anze);
                }
                i2++;
            }
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(11, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(12, anze);
        }
        i = this.k;
        if (i != 0) {
            aoby.a(13, i);
        }
        aocf aocf2 = this.l;
        if (aocf2 != null) {
            aoby.a(14, aocf2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        akaj[] akajArr = this.a;
        int i2 = 0;
        if (akajArr != null && akajArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akaj[] akajArr2 = this.a;
                if (computeSerializedSize >= akajArr2.length) {
                    break;
                }
                aocf aocf = akajArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(2, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            computeSerializedSize += aoby.b(6, this.i);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.d;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(10, anze);
                }
                i2++;
            }
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        i = this.k;
        if (i != 0) {
            computeSerializedSize += aoby.c(13, i);
        }
        aocf aocf2 = this.l;
        return aocf2 != null ? computeSerializedSize + aoby.b(14, aocf2) : computeSerializedSize;
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
                    arml2 = this.g;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.g = arml;
                    continue;
                case 18:
                    aocf akaj;
                    a = aock.a(aobv, 18);
                    akaj[] akajArr = this.a;
                    length = akajArr != null ? akajArr.length : 0;
                    akaj[] akajArr2 = new akaj[(a + length)];
                    if (length != 0) {
                        System.arraycopy(akajArr, 0, akajArr2, 0, length);
                    }
                    while (length < akajArr2.length - 1) {
                        akaj = new akaj();
                        akajArr2[length] = akaj;
                        aobv.a(akaj);
                        aobv.a();
                        length++;
                    }
                    akaj = new akaj();
                    akajArr2[length] = akaj;
                    aobv.a(akaj);
                    this.a = akajArr2;
                    continue;
                case 26:
                    apfm apfm = (apfm) aobv.a(apfm.d.getParserForType());
                    apfm apfm2 = this.h;
                    if (apfm2 != null) {
                        apfp apfp = (apfp) ((anxo) apfm2.toBuilder());
                        apfp.mergeFrom(apfm);
                        apfm = (apfm) ((anxl) apfp.build());
                    }
                    this.h = apfm;
                    continue;
                case 34:
                    aylw aylw = (aylw) aobv.a(aylw.c.getParserForType());
                    aylw aylw2 = this.b;
                    if (aylw2 != null) {
                        aylz aylz = (aylz) ((anxo) aylw2.toBuilder());
                        aylz.mergeFrom(aylw);
                        aylw = (aylw) ((anxl) aylz.build());
                    }
                    this.b = aylw;
                    continue;
                case cv.aU /*50*/:
                    this.i = aobv.e();
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.j;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.j = arml;
                    continue;
                case 74:
                    ayku ayku = (ayku) aobv.a(ayku.c.getParserForType());
                    ayku ayku2 = this.c;
                    if (ayku2 != null) {
                        aykx aykx = (aykx) ((anxo) ayku2.toBuilder());
                        aykx.mergeFrom(ayku);
                        ayku = (ayku) ((anxl) aykx.build());
                    }
                    this.c = ayku;
                    continue;
                case 82:
                    a = aock.a(aobv, 82);
                    apxu[] apxuArr = this.d;
                    length = apxuArr != null ? apxuArr.length : 0;
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
                    this.d = apxuArr2;
                    continue;
                case 90:
                    aylc aylc = (aylc) aobv.a(aylc.c.getParserForType());
                    aylc aylc2 = this.e;
                    if (aylc2 != null) {
                        aylf aylf = (aylf) ((anxo) aylc2.toBuilder());
                        aylf.mergeFrom(aylc);
                        aylc = (aylc) ((anxl) aylf.build());
                    }
                    this.e = aylc;
                    continue;
                case 98:
                    ayma ayma = (ayma) aobv.a(ayma.c.getParserForType());
                    ayma ayma2 = this.f;
                    if (ayma2 != null) {
                        aymd aymd = (aymd) ((anxo) ayma2.toBuilder());
                        aymd.mergeFrom(ayma);
                        ayma = (ayma) ((anxl) aymd.build());
                    }
                    this.f = ayma;
                    continue;
                case 104:
                    this.k = aobv.f();
                    continue;
                case 114:
                    if (this.l == null) {
                        this.l = new ajzw();
                    }
                    aobv.a(this.l);
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
