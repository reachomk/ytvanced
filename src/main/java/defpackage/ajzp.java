package defpackage;

import java.util.Arrays;

/* renamed from: ajzp */
public final class ajzp extends ajwo {
    public arml a;
    public awyd b;
    public auvr c;
    public awyh d;
    public atoq e;
    public ajzw f;
    public ajzw g;
    public ajzw h;
    public ajzw i;
    public ajzw j;
    public ajzw k;
    public ajzw l;
    public awga m;
    private atzt n;
    private byte[] o;
    private int p;

    public ajzp() {
        super(139970731);
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.p = 1;
        this.k = null;
        this.l = null;
        this.o = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzp) {
            ajzp ajzp = (ajzp) obj;
            atzt atzt = this.n;
            if (atzt == null) {
                if (ajzp.n != null) {
                    return false;
                }
            } else if (!atzt.equals(ajzp.n)) {
                return false;
            }
            arml arml = this.a;
            if (arml == null) {
                if (ajzp.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajzp.a)) {
                return false;
            }
            awyd awyd = this.b;
            if (awyd == null) {
                if (ajzp.b != null) {
                    return false;
                }
            } else if (!awyd.equals(ajzp.b)) {
                return false;
            }
            auvr auvr = this.c;
            if (auvr == null) {
                if (ajzp.c != null) {
                    return false;
                }
            } else if (!auvr.equals(ajzp.c)) {
                return false;
            }
            awyh awyh = this.d;
            if (awyh == null) {
                if (ajzp.d != null) {
                    return false;
                }
            } else if (!awyh.equals(ajzp.d)) {
                return false;
            }
            atoq atoq = this.e;
            if (atoq == null) {
                if (ajzp.e != null) {
                    return false;
                }
            } else if (!atoq.equals(ajzp.e)) {
                return false;
            }
            ajzw ajzw = this.f;
            if (ajzw == null) {
                if (ajzp.f != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajzp.f)) {
                return false;
            }
            ajzw = this.g;
            if (ajzw == null) {
                if (ajzp.g != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajzp.g)) {
                return false;
            }
            ajzw = this.h;
            if (ajzw == null) {
                if (ajzp.h != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajzp.h)) {
                return false;
            }
            ajzw = this.i;
            if (ajzw == null) {
                if (ajzp.i != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajzp.i)) {
                return false;
            }
            ajzw = this.j;
            if (ajzw == null) {
                if (ajzp.j != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajzp.j)) {
                return false;
            }
            if (this.p == ajzp.p) {
                ajzw = this.k;
                if (ajzw == null) {
                    if (ajzp.k != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzp.k)) {
                    return false;
                }
                ajzw = this.l;
                if (ajzw == null) {
                    if (ajzp.l != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzp.l)) {
                    return false;
                }
                awga awga = this.m;
                if (awga == null) {
                    if (ajzp.m != null) {
                        return false;
                    }
                } else if (!awga.equals(ajzp.m)) {
                    return false;
                }
                if (Arrays.equals(this.o, ajzp.o)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajzp.unknownFieldData);
                    }
                    aocb aocb2 = ajzp.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        atzt atzt = this.n;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = atzt != null ? atzt.hashCode() : 0;
        arml arml = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        awyd awyd = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awyd != null ? awyd.hashCode() : 0;
        auvr auvr = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        awyh awyh = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awyh != null ? awyh.hashCode() : 0;
        atoq atoq = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atoq != null ? atoq.hashCode() : 0;
        ajzw ajzw = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        hashCode2 = this.p;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        ajzw = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        awga awga = this.m;
        hashCode = (((((hashCode + hashCode2) * 31) + (awga != null ? awga.hashCode() : 0)) * 31) + Arrays.hashCode(this.o)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.n;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.c;
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
        aocf aocf = this.f;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            aoby.a(9, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            aoby.a(10, aocf);
        }
        aocf = this.j;
        if (aocf != null) {
            aoby.a(11, aocf);
        }
        int i = this.p;
        if (!(i == 1 || i == 0)) {
            aoby.a(12, i - 1);
        }
        aocf = this.k;
        if (aocf != null) {
            aoby.a(13, aocf);
        }
        aocf = this.l;
        if (aocf != null) {
            aoby.a(14, aocf);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(15, anze);
        }
        if (!Arrays.equals(this.o, aock.c)) {
            aoby.a(16, this.o);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.c;
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
        aocf aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(9, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            computeSerializedSize += aoby.b(10, aocf);
        }
        aocf = this.j;
        if (aocf != null) {
            computeSerializedSize += aoby.b(11, aocf);
        }
        int i = this.p;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(12, i - 1);
        }
        aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(13, aocf);
        }
        aocf = this.l;
        if (aocf != null) {
            computeSerializedSize += aoby.b(14, aocf);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        return !Arrays.equals(this.o, aock.c) ? computeSerializedSize + aoby.b(16, this.o) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    atzt atzt = (atzt) aobv.a(atzt.c.getParserForType());
                    atzt atzt2 = this.n;
                    if (atzt2 != null) {
                        atzs atzs = (atzs) ((anxo) atzt2.toBuilder());
                        atzs.mergeFrom(atzt);
                        atzt = (atzt) ((anxl) atzs.build());
                    }
                    this.n = atzt;
                    continue;
                case 18:
                    arml arml = (arml) aobv.a(arml.f.getParserForType());
                    arml arml2 = this.a;
                    if (arml2 != null) {
                        armk armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 26:
                    awyd awyd = (awyd) aobv.a(awyd.c.getParserForType());
                    awyd awyd2 = this.b;
                    if (awyd2 != null) {
                        awyg awyg = (awyg) ((anxo) awyd2.toBuilder());
                        awyg.mergeFrom(awyd);
                        awyd = (awyd) ((anxl) awyg.build());
                    }
                    this.b = awyd;
                    continue;
                case 34:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.c;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.c = auvr;
                    continue;
                case 42:
                    awyh awyh = (awyh) aobv.a(awyh.c.getParserForType());
                    awyh awyh2 = this.d;
                    if (awyh2 != null) {
                        awyj awyj = (awyj) ((anxo) awyh2.toBuilder());
                        awyj.mergeFrom(awyh);
                        awyh = (awyh) ((anxl) awyj.build());
                    }
                    this.d = awyh;
                    continue;
                case cv.aU /*50*/:
                    atoq atoq = (atoq) aobv.a(atoq.c.getParserForType());
                    atoq atoq2 = this.e;
                    if (atoq2 != null) {
                        atop atop = (atop) ((anxo) atoq2.toBuilder());
                        atop.mergeFrom(atoq);
                        atoq = (atoq) ((anxl) atop.build());
                    }
                    this.e = atoq;
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new ajzw();
                    }
                    aobv.a(this.f);
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new ajzw();
                    }
                    aobv.a(this.g);
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new ajzw();
                    }
                    aobv.a(this.h);
                    continue;
                case 82:
                    if (this.i == null) {
                        this.i = new ajzw();
                    }
                    aobv.a(this.i);
                    continue;
                case 90:
                    if (this.j == null) {
                        this.j = new ajzw();
                    }
                    aobv.a(this.j);
                    continue;
                case 96:
                    int i = aobv.b;
                    int f = aobv.f();
                    int i2 = 3;
                    if (f == 0 || f == 1 || f == 2 || f == 3) {
                        if (f == 0) {
                            i2 = 1;
                        } else if (f == 1) {
                            i2 = 2;
                        } else if (f != 2) {
                            i2 = f != 3 ? 0 : 4;
                        }
                        this.p = i2;
                        break;
                    }
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                    continue;
                case 106:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 114:
                    if (this.l == null) {
                        this.l = new ajzw();
                    }
                    aobv.a(this.l);
                    continue;
                case afy.av /*122*/:
                    awga awga = (awga) aobv.a(awga.b.getParserForType());
                    awga awga2 = this.m;
                    if (awga2 != null) {
                        awfz awfz = (awfz) ((anxo) awga2.toBuilder());
                        awfz.mergeFrom(awga);
                        awga = (awga) ((anxl) awfz.build());
                    }
                    this.m = awga;
                    continue;
                case 130:
                    this.o = aobv.e();
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
