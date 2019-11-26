package defpackage;

import java.util.Arrays;

/* renamed from: ajsy */
public final class ajsy extends ajwo {
    public arml a;
    public arml b;
    public aqdw c;
    public aygk d;
    public aygk e;
    public apxu f;
    public aqds g;
    public atzm h;
    public byte[] i;
    public ajzw j;
    private arml k;
    private arml l;

    public ajsy() {
        super(137097475);
        this.i = aock.c;
        this.j = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsy) {
            ajsy ajsy = (ajsy) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajsy.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajsy.a)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (ajsy.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajsy.b)) {
                return false;
            }
            aqdw aqdw = this.c;
            if (aqdw == null) {
                if (ajsy.c != null) {
                    return false;
                }
            } else if (!aqdw.equals(ajsy.c)) {
                return false;
            }
            aygk aygk = this.d;
            if (aygk == null) {
                if (ajsy.d != null) {
                    return false;
                }
            } else if (!aygk.equals(ajsy.d)) {
                return false;
            }
            aygk = this.e;
            if (aygk == null) {
                if (ajsy.e != null) {
                    return false;
                }
            } else if (!aygk.equals(ajsy.e)) {
                return false;
            }
            apxu apxu = this.f;
            if (apxu == null) {
                if (ajsy.f != null) {
                    return false;
                }
            } else if (!apxu.equals(ajsy.f)) {
                return false;
            }
            arml = this.k;
            if (arml == null) {
                if (ajsy.k != null) {
                    return false;
                }
            } else if (!arml.equals(ajsy.k)) {
                return false;
            }
            aqds aqds = this.g;
            if (aqds == null) {
                if (ajsy.g != null) {
                    return false;
                }
            } else if (!aqds.equals(ajsy.g)) {
                return false;
            }
            atzm atzm = this.h;
            if (atzm == null) {
                if (ajsy.h != null) {
                    return false;
                }
            } else if (!atzm.equals(ajsy.h)) {
                return false;
            }
            if (Arrays.equals(this.i, ajsy.i)) {
                ajzw ajzw = this.j;
                if (ajzw == null) {
                    if (ajsy.j != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajsy.j)) {
                    return false;
                }
                arml = this.l;
                if (arml == null) {
                    if (ajsy.l != null) {
                        return false;
                    }
                } else if (!arml.equals(ajsy.l)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajsy.unknownFieldData);
                }
                aocb aocb2 = ajsy.unknownFieldData;
                return aocb2 == null || aocb2.b();
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
        arml arml2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        aqdw aqdw = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqdw != null ? aqdw.hashCode() : 0;
        aygk aygk = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        aygk = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        apxu apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arml2 = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        aqds aqds = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqds != null ? aqds.hashCode() : 0;
        atzm atzm = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atzm != null ? atzm.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.i);
        ajzw ajzw = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        arml2 = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
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
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(10, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            aoby.a(12, this.i);
        }
        aocf aocf = this.j;
        if (aocf != null) {
            aoby.a(13, aocf);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(14, anze);
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
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            computeSerializedSize += aoby.b(12, this.i);
        }
        aocf aocf = this.j;
        if (aocf != null) {
            computeSerializedSize += aoby.b(13, aocf);
        }
        anze = this.l;
        return anze != null ? computeSerializedSize + anwm.c(14, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            aygk aygk;
            aygk aygk2;
            aygj aygj;
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
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 26:
                    aqdw aqdw = (aqdw) aobv.a(aqdw.c.getParserForType());
                    aqdw aqdw2 = this.c;
                    if (aqdw2 != null) {
                        aqdv aqdv = (aqdv) ((anxo) aqdw2.toBuilder());
                        aqdv.mergeFrom(aqdw);
                        aqdw = (aqdw) ((anxl) aqdv.build());
                    }
                    this.c = aqdw;
                    continue;
                case 34:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.d;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.d = aygk;
                    continue;
                case 42:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.e;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.e = aygk;
                    continue;
                case 58:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.f;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.f = apxu;
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.k;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.k = arml;
                    continue;
                case 74:
                    aqds aqds = (aqds) aobv.a(aqds.c.getParserForType());
                    aqds aqds2 = this.g;
                    if (aqds2 != null) {
                        aqdr aqdr = (aqdr) ((anxo) aqds2.toBuilder());
                        aqdr.mergeFrom(aqds);
                        aqds = (aqds) ((anxl) aqdr.build());
                    }
                    this.g = aqds;
                    continue;
                case 82:
                    atzm atzm = (atzm) aobv.a(atzm.f.getParserForType());
                    atzm atzm2 = this.h;
                    if (atzm2 != null) {
                        atzl atzl = (atzl) ((anxo) atzm2.toBuilder());
                        atzl.mergeFrom(atzm);
                        atzm = (atzm) ((anxl) atzl.build());
                    }
                    this.h = atzm;
                    continue;
                case 98:
                    this.i = aobv.e();
                    continue;
                case 106:
                    if (this.j == null) {
                        this.j = new ajzw();
                    }
                    aobv.a(this.j);
                    continue;
                case 114:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.l;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.l = arml;
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
