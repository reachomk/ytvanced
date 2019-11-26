package defpackage;

import java.util.Arrays;

/* renamed from: ajsw */
public final class ajsw extends ajwo {
    public ajsm a;
    public aqbq b;
    public byte[] c;
    public arml d;
    public arml e;
    public boolean f;
    public apxu[] g;
    public boolean h;
    public arml i;
    private arml j;
    private boolean k;
    private axak l;
    private axak m;
    private axak n;
    private axak o;
    private axak p;
    private boolean q;

    public ajsw() {
        super(105977417);
        this.a = null;
        this.k = false;
        this.c = aock.c;
        this.f = false;
        this.g = new apxu[0];
        this.h = false;
        this.q = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsw) {
            ajsw ajsw = (ajsw) obj;
            arml arml = this.j;
            if (arml == null) {
                if (ajsw.j != null) {
                    return false;
                }
            } else if (!arml.equals(ajsw.j)) {
                return false;
            }
            ajsm ajsm = this.a;
            if (ajsm == null) {
                if (ajsw.a != null) {
                    return false;
                }
            } else if (!ajsm.equals(ajsw.a)) {
                return false;
            }
            aqbq aqbq = this.b;
            if (aqbq == null) {
                if (ajsw.b != null) {
                    return false;
                }
            } else if (!aqbq.equals(ajsw.b)) {
                return false;
            }
            if (this.k == ajsw.k && Arrays.equals(this.c, ajsw.c)) {
                arml = this.d;
                if (arml == null) {
                    if (ajsw.d != null) {
                        return false;
                    }
                } else if (!arml.equals(ajsw.d)) {
                    return false;
                }
                arml = this.e;
                if (arml == null) {
                    if (ajsw.e != null) {
                        return false;
                    }
                } else if (!arml.equals(ajsw.e)) {
                    return false;
                }
                if (this.f == ajsw.f && aocd.a(this.g, ajsw.g)) {
                    axak axak = this.l;
                    if (axak == null) {
                        if (ajsw.l != null) {
                            return false;
                        }
                    } else if (!axak.equals(ajsw.l)) {
                        return false;
                    }
                    axak = this.m;
                    if (axak == null) {
                        if (ajsw.m != null) {
                            return false;
                        }
                    } else if (!axak.equals(ajsw.m)) {
                        return false;
                    }
                    axak = this.n;
                    if (axak == null) {
                        if (ajsw.n != null) {
                            return false;
                        }
                    } else if (!axak.equals(ajsw.n)) {
                        return false;
                    }
                    if (this.h == ajsw.h) {
                        axak = this.o;
                        if (axak == null) {
                            if (ajsw.o != null) {
                                return false;
                            }
                        } else if (!axak.equals(ajsw.o)) {
                            return false;
                        }
                        arml = this.i;
                        if (arml == null) {
                            if (ajsw.i != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajsw.i)) {
                            return false;
                        }
                        axak = this.p;
                        if (axak == null) {
                            if (ajsw.p != null) {
                                return false;
                            }
                        } else if (!axak.equals(ajsw.p)) {
                            return false;
                        }
                        if (this.q == ajsw.q) {
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajsw.unknownFieldData);
                            }
                            aocb aocb2 = ajsw.unknownFieldData;
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
        arml arml = this.j;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        ajsm ajsm = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajsm != null ? ajsm.hashCode() : 0;
        aqbq aqbq = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (aqbq != null ? aqbq.hashCode() : 0)) * 31;
        int i2 = 1237;
        hashCode2 = !this.k ? 1237 : 1231;
        int hashCode3 = Arrays.hashCode(this.c);
        arml arml2 = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml arml3 = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (arml3 != null ? arml3.hashCode() : 0)) * 31;
        hashCode2 = !this.f ? 1237 : 1231;
        hashCode3 = aocd.a(this.g);
        axak axak = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = axak != null ? axak.hashCode() : 0;
        axak axak2 = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axak2 != null ? axak2.hashCode() : 0;
        axak2 = this.n;
        hashCode = (((hashCode + hashCode2) * 31) + (axak2 != null ? axak2.hashCode() : 0)) * 31;
        hashCode2 = !this.h ? 1237 : 1231;
        axak2 = this.o;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axak2 != null ? axak2.hashCode() : 0;
        arml3 = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        axak2 = this.p;
        hashCode = (((hashCode + hashCode2) * 31) + (axak2 != null ? axak2.hashCode() : 0)) * 31;
        if (this.q) {
            i2 = 1231;
        }
        hashCode = (hashCode + i2) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.j;
        if (anze != null) {
            aoby.a(1, anze);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (this.k) {
            aoby.a(6, true);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(7, this.c);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(11, anze);
        }
        if (this.f) {
            aoby.a(14, true);
        }
        apxu[] apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.g;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(15, anze2);
                }
                i++;
            }
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(16, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(18, anze);
        }
        if (this.h) {
            aoby.a(19, true);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(23, anze);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(24, anze);
        }
        if (this.q) {
            aoby.a(25, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (this.k) {
            computeSerializedSize += aoby.d(6);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(7, this.c);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        if (this.f) {
            computeSerializedSize += aoby.d(14);
        }
        apxu[] apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.g;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(15, anze2);
                }
                i++;
            }
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(19);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(23, anze);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(24, anze);
        }
        return this.q ? computeSerializedSize + aoby.d(25) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            axak axak;
            axak axak2;
            axaj axaj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.j;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.j = arml;
                    continue;
                case 18:
                    if (this.a == null) {
                        this.a = new ajsm();
                    }
                    aobv.a(this.a);
                    continue;
                case 26:
                    aqbq aqbq = (aqbq) aobv.a(aqbq.c.getParserForType());
                    aqbq aqbq2 = this.b;
                    if (aqbq2 != null) {
                        aqbp aqbp = (aqbp) ((anxo) aqbq2.toBuilder());
                        aqbp.mergeFrom(aqbq);
                        aqbq = (aqbq) ((anxl) aqbp.build());
                    }
                    this.b = aqbq;
                    continue;
                case 48:
                    this.k = aobv.c();
                    continue;
                case 58:
                    this.c = aobv.e();
                    continue;
                case 82:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case 90:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case 112:
                    this.f = aobv.c();
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    apxu[] apxuArr = this.g;
                    int length = apxuArr != null ? apxuArr.length : 0;
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
                    this.g = apxuArr2;
                    continue;
                case 130:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.l;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.l = axak;
                    continue;
                case 138:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.m;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.m = axak;
                    continue;
                case 146:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.n;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.n = axak;
                    continue;
                case 152:
                    this.h = aobv.c();
                    continue;
                case 162:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.o;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.o = axak;
                    continue;
                case 186:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 194:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.p;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.p = axak;
                    continue;
                case 200:
                    this.q = aobv.c();
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
