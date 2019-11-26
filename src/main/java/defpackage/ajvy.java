package defpackage;

import java.util.Arrays;

/* renamed from: ajvy */
public final class ajvy extends ajwo {
    public ajvx[] a;
    public arml b;
    public int c;
    public arsm d;
    public arsi e;
    private boolean f;
    private apxu g;
    private arml h;
    private arml i;
    private byte[] j;
    private int k;

    public ajvy() {
        super(51805506);
        if (ajvx.a == null) {
            synchronized (aocd.b) {
                if (ajvx.a == null) {
                    ajvx.a = new ajvx[0];
                }
            }
        }
        this.a = ajvx.a;
        this.f = false;
        this.c = 0;
        this.j = aock.c;
        this.k = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvy) {
            ajvy ajvy = (ajvy) obj;
            if (aocd.a(this.a, ajvy.a)) {
                arml arml = this.b;
                if (arml == null) {
                    if (ajvy.b != null) {
                        return false;
                    }
                } else if (!arml.equals(ajvy.b)) {
                    return false;
                }
                if (this.f == ajvy.f) {
                    apxu apxu = this.g;
                    if (apxu == null) {
                        if (ajvy.g != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajvy.g)) {
                        return false;
                    }
                    arml = this.h;
                    if (arml == null) {
                        if (ajvy.h != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajvy.h)) {
                        return false;
                    }
                    arml = this.i;
                    if (arml == null) {
                        if (ajvy.i != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajvy.i)) {
                        return false;
                    }
                    if (this.c == ajvy.c) {
                        arsm arsm = this.d;
                        if (arsm == null) {
                            if (ajvy.d != null) {
                                return false;
                            }
                        } else if (!arsm.equals(ajvy.d)) {
                            return false;
                        }
                        if (Arrays.equals(this.j, ajvy.j)) {
                            arsi arsi = this.e;
                            if (arsi == null) {
                                if (ajvy.e != null) {
                                    return false;
                                }
                            } else if (!arsi.equals(ajvy.e)) {
                                return false;
                            }
                            if (this.k == ajvy.k) {
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(ajvy.unknownFieldData);
                                }
                                aocb aocb2 = ajvy.unknownFieldData;
                                return aocb2 == null || aocb2.b();
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        arml arml = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        hashCode = (hashCode + (arml != null ? arml.hashCode() : 0)) * 31;
        int i = !this.f ? 1237 : 1231;
        apxu apxu = this.g;
        hashCode = (hashCode + i) * 31;
        i = apxu != null ? apxu.hashCode() : 0;
        arml arml2 = this.h;
        hashCode = (hashCode + i) * 31;
        i = arml2 != null ? arml2.hashCode() : 0;
        arml2 = this.i;
        hashCode = (hashCode + i) * 31;
        i = arml2 != null ? arml2.hashCode() : 0;
        int i2 = this.c;
        arsm arsm = this.d;
        hashCode = (((hashCode + i) * 31) + i2) * 31;
        i = arsm != null ? arsm.hashCode() : 0;
        i2 = Arrays.hashCode(this.j);
        arsi arsi = this.e;
        hashCode = (((((((hashCode + i) * 31) + i2) * 31) + (arsi != null ? arsi.hashCode() : 0)) * 31) + this.k) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajvx[] ajvxArr = this.a;
        if (ajvxArr != null && ajvxArr.length > 0) {
            i = 0;
            while (true) {
                ajvx[] ajvxArr2 = this.a;
                if (i >= ajvxArr2.length) {
                    break;
                }
                aocf aocf = ajvxArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (this.f) {
            aoby.a(4, true);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(7, anze);
        }
        i = this.c;
        if (i != 0) {
            aoby.a(8, i);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(9, anze);
        }
        if (!Arrays.equals(this.j, aock.c)) {
            aoby.a(10, this.j);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(12, anze);
        }
        i = this.k;
        if (i != 0) {
            aoby.a(14, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajvx[] ajvxArr = this.a;
        if (ajvxArr != null && ajvxArr.length > 0) {
            i = 0;
            while (true) {
                ajvx[] ajvxArr2 = this.a;
                if (i >= ajvxArr2.length) {
                    break;
                }
                aocf aocf = ajvxArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (this.f) {
            computeSerializedSize += aoby.d(4);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.c(8, i);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        if (!Arrays.equals(this.j, aock.c)) {
            computeSerializedSize += aoby.b(10, this.j);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        i = this.k;
        return i != 0 ? computeSerializedSize + aoby.c(14, i) : computeSerializedSize;
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
                    aocf ajvx;
                    a = aock.a(aobv, 10);
                    ajvx[] ajvxArr = this.a;
                    int length = ajvxArr != null ? ajvxArr.length : 0;
                    ajvx[] ajvxArr2 = new ajvx[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajvxArr, 0, ajvxArr2, 0, length);
                    }
                    while (length < ajvxArr2.length - 1) {
                        ajvx = new ajvx();
                        ajvxArr2[length] = ajvx;
                        aobv.a(ajvx);
                        aobv.a();
                        length++;
                    }
                    ajvx = new ajvx();
                    ajvxArr2[length] = ajvx;
                    aobv.a(ajvx);
                    this.a = ajvxArr2;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 32:
                    this.f = aobv.c();
                    continue;
                case 42:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case cv.aU /*50*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.h;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.h = arml;
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 64:
                    this.c = aobv.f();
                    continue;
                case 74:
                    arsm arsm = (arsm) aobv.a(arsm.c.getParserForType());
                    arsm arsm2 = this.d;
                    if (arsm2 != null) {
                        arsp arsp = (arsp) ((anxo) arsm2.toBuilder());
                        arsp.mergeFrom(arsm);
                        arsm = (arsm) ((anxl) arsp.build());
                    }
                    this.d = arsm;
                    continue;
                case 82:
                    this.j = aobv.e();
                    continue;
                case 98:
                    arsi arsi = (arsi) aobv.a(arsi.f.getParserForType());
                    arsi arsi2 = this.e;
                    if (arsi2 != null) {
                        arsl arsl = (arsl) ((anxo) arsi2.toBuilder());
                        arsl.mergeFrom(arsi);
                        arsi = (arsi) ((anxl) arsl.build());
                    }
                    this.e = arsi;
                    continue;
                case 112:
                    this.k = aobv.f();
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

    static {
        aobz.a(ajvy.class, 414444050);
    }
}
