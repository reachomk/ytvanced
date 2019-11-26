package defpackage;

import java.util.Arrays;

/* renamed from: ajwc */
public final class ajwc extends ajwo {
    public ajwe[] a;
    public byte[] b;
    public arux c;
    public aruz d;
    public arvd e;
    public aruv f;
    public ajzw g;
    private String h;
    private int i;
    private ajzw j;
    private ajzw k;

    public ajwc() {
        super(88962895);
        if (ajwe.a == null) {
            synchronized (aocd.b) {
                if (ajwe.a == null) {
                    ajwe.a = new ajwe[0];
                }
            }
        }
        this.a = ajwe.a;
        this.b = aock.c;
        this.h = "";
        this.i = 0;
        this.j = null;
        this.k = null;
        this.g = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwc) {
            ajwc ajwc = (ajwc) obj;
            if (aocd.a(this.a, ajwc.a) && Arrays.equals(this.b, ajwc.b)) {
                arux arux = this.c;
                if (arux == null) {
                    if (ajwc.c != null) {
                        return false;
                    }
                } else if (!arux.equals(ajwc.c)) {
                    return false;
                }
                aruz aruz = this.d;
                if (aruz == null) {
                    if (ajwc.d != null) {
                        return false;
                    }
                } else if (!aruz.equals(ajwc.d)) {
                    return false;
                }
                arvd arvd = this.e;
                if (arvd == null) {
                    if (ajwc.e != null) {
                        return false;
                    }
                } else if (!arvd.equals(ajwc.e)) {
                    return false;
                }
                String str = this.h;
                if (str == null) {
                    if (ajwc.h != null) {
                        return false;
                    }
                } else if (!str.equals(ajwc.h)) {
                    return false;
                }
                if (this.i == ajwc.i) {
                    aruv aruv = this.f;
                    if (aruv == null) {
                        if (ajwc.f != null) {
                            return false;
                        }
                    } else if (!aruv.equals(ajwc.f)) {
                        return false;
                    }
                    ajzw ajzw = this.j;
                    if (ajzw == null) {
                        if (ajwc.j != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajwc.j)) {
                        return false;
                    }
                    ajzw = this.k;
                    if (ajzw == null) {
                        if (ajwc.k != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajwc.k)) {
                        return false;
                    }
                    ajzw = this.g;
                    if (ajzw == null) {
                        if (ajwc.g != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajwc.g)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajwc.unknownFieldData);
                    }
                    aocb aocb2 = ajwc.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        int hashCode2 = Arrays.hashCode(this.b);
        arux arux = this.c;
        hashCode = (((((hashCode + 527) * 31) + a) * 31) + hashCode2) * 31;
        a = 0;
        hashCode2 = arux != null ? arux.hashCode() : 0;
        aruz aruz = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aruz != null ? aruz.hashCode() : 0;
        arvd arvd = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (arvd != null ? arvd.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode2 = str != null ? str.hashCode() : 0;
        int i = this.i;
        aruv aruv = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + i) * 31;
        hashCode2 = aruv != null ? aruv.hashCode() : 0;
        ajzw ajzw = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajwe[] ajweArr = this.a;
        if (ajweArr != null && ajweArr.length > 0) {
            i = 0;
            while (true) {
                ajwe[] ajweArr2 = this.a;
                if (i >= ajweArr2.length) {
                    break;
                }
                aocf aocf = ajweArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(2, this.b);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        String str = this.h;
        if (!(str == null || str.equals(""))) {
            aoby.a(7, this.h);
        }
        i = this.i;
        if (i != 0) {
            aoby.b(8, i);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(9, anze);
        }
        aocf aocf2 = this.j;
        if (aocf2 != null) {
            aoby.a(10, aocf2);
        }
        aocf2 = this.k;
        if (aocf2 != null) {
            aoby.a(11, aocf2);
        }
        aocf2 = this.g;
        if (aocf2 != null) {
            aoby.a(12, aocf2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajwe[] ajweArr = this.a;
        if (ajweArr != null && ajweArr.length > 0) {
            i = 0;
            while (true) {
                ajwe[] ajweArr2 = this.a;
                if (i >= ajweArr2.length) {
                    break;
                }
                aocf aocf = ajweArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(2, this.b);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        String str = this.h;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(7, this.h);
        }
        i = this.i;
        if (i != 0) {
            computeSerializedSize += aoby.d(8, i);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        aocf aocf2 = this.j;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(10, aocf2);
        }
        aocf2 = this.k;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(11, aocf2);
        }
        aocf2 = this.g;
        return aocf2 != null ? computeSerializedSize + aoby.b(12, aocf2) : computeSerializedSize;
    }

    public static ajwc a(byte[] bArr) {
        return (ajwc) aocf.mergeFrom(new ajwc(), bArr);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    aocf ajwe;
                    a = aock.a(aobv, 10);
                    ajwe[] ajweArr = this.a;
                    int length = ajweArr != null ? ajweArr.length : 0;
                    ajwe[] ajweArr2 = new ajwe[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajweArr, 0, ajweArr2, 0, length);
                    }
                    while (length < ajweArr2.length - 1) {
                        ajwe = new ajwe();
                        ajweArr2[length] = ajwe;
                        aobv.a(ajwe);
                        aobv.a();
                        length++;
                    }
                    ajwe = new ajwe();
                    ajweArr2[length] = ajwe;
                    aobv.a(ajwe);
                    this.a = ajweArr2;
                    continue;
                case 18:
                    this.b = aobv.e();
                    continue;
                case 34:
                    arux arux = (arux) aobv.a(arux.d.getParserForType());
                    arux arux2 = this.c;
                    if (arux2 != null) {
                        arva arva = (arva) ((anxo) arux2.toBuilder());
                        arva.mergeFrom(arux);
                        arux = (arux) ((anxl) arva.build());
                    }
                    this.c = arux;
                    continue;
                case 42:
                    aruz aruz = (aruz) aobv.a(aruz.c.getParserForType());
                    aruz aruz2 = this.d;
                    if (aruz2 != null) {
                        arvc arvc = (arvc) ((anxo) aruz2.toBuilder());
                        arvc.mergeFrom(aruz);
                        aruz = (aruz) ((anxl) arvc.build());
                    }
                    this.d = aruz;
                    continue;
                case cv.aU /*50*/:
                    arvd arvd = (arvd) aobv.a(arvd.c.getParserForType());
                    arvd arvd2 = this.e;
                    if (arvd2 != null) {
                        arvg arvg = (arvg) ((anxo) arvd2.toBuilder());
                        arvg.mergeFrom(arvd);
                        arvd = (arvd) ((anxl) arvg.build());
                    }
                    this.e = arvd;
                    continue;
                case 58:
                    this.h = aobv.d();
                    continue;
                case 64:
                    this.i = aobv.f();
                    continue;
                case 74:
                    aruv aruv = (aruv) aobv.a(aruv.c.getParserForType());
                    aruv aruv2 = this.f;
                    if (aruv2 != null) {
                        aruy aruy = (aruy) ((anxo) aruv2.toBuilder());
                        aruy.mergeFrom(aruv);
                        aruv = (aruv) ((anxl) aruy.build());
                    }
                    this.f = aruv;
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new ajzw();
                    }
                    aobv.a(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 98:
                    if (this.g == null) {
                        this.g = new ajzw();
                    }
                    aobv.a(this.g);
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
