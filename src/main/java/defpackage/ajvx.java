package defpackage;

/* renamed from: ajvx */
public final class ajvx extends aoca {
    public static volatile ajvx[] a;
    public arsa b;
    public arss c;
    public ajvv d;
    public awvz e;
    public arry f;
    public awmm g;
    public arru h;
    public arrw i;
    public aroa j;

    public ajvx() {
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajvx)) {
            return false;
        }
        ajvx ajvx = (ajvx) obj;
        arsa arsa = this.b;
        if (arsa == null) {
            if (ajvx.b != null) {
                return false;
            }
        } else if (!arsa.equals(ajvx.b)) {
            return false;
        }
        arss arss = this.c;
        if (arss == null) {
            if (ajvx.c != null) {
                return false;
            }
        } else if (!arss.equals(ajvx.c)) {
            return false;
        }
        ajvv ajvv = this.d;
        if (ajvv == null) {
            if (ajvx.d != null) {
                return false;
            }
        } else if (!ajvv.equals(ajvx.d)) {
            return false;
        }
        awvz awvz = this.e;
        if (awvz == null) {
            if (ajvx.e != null) {
                return false;
            }
        } else if (!awvz.equals(ajvx.e)) {
            return false;
        }
        arry arry = this.f;
        if (arry == null) {
            if (ajvx.f != null) {
                return false;
            }
        } else if (!arry.equals(ajvx.f)) {
            return false;
        }
        awmm awmm = this.g;
        if (awmm == null) {
            if (ajvx.g != null) {
                return false;
            }
        } else if (!awmm.equals(ajvx.g)) {
            return false;
        }
        arru arru = this.h;
        if (arru == null) {
            if (ajvx.h != null) {
                return false;
            }
        } else if (!arru.equals(ajvx.h)) {
            return false;
        }
        arrw arrw = this.i;
        if (arrw == null) {
            if (ajvx.i != null) {
                return false;
            }
        } else if (!arrw.equals(ajvx.i)) {
            return false;
        }
        aroa aroa = this.j;
        if (aroa == null) {
            if (ajvx.j != null) {
                return false;
            }
        } else if (!aroa.equals(ajvx.j)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajvx.unknownFieldData);
        }
        aocb aocb2 = ajvx.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arsa arsa = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arsa != null ? arsa.hashCode() : 0;
        arss arss = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arss != null ? arss.hashCode() : 0;
        ajvv ajvv = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajvv != null ? ajvv.hashCode() : 0;
        awvz awvz = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awvz != null ? awvz.hashCode() : 0;
        arry arry = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arry != null ? arry.hashCode() : 0;
        awmm awmm = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awmm != null ? awmm.hashCode() : 0;
        arru arru = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arru != null ? arru.hashCode() : 0;
        arrw arrw = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arrw != null ? arrw.hashCode() : 0;
        aroa aroa = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (aroa != null ? aroa.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(60373571, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(60373625, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(82182324, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(138945852, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(145467693, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(145603515, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(145831208, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(145844540, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(194137132, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(60373571, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(60373625, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(82182324, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(138945852, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(145467693, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(145603515, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(145831208, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(145844540, anze);
        }
        anze = this.j;
        return anze != null ? computeSerializedSize + anwm.c(194137132, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 482988570:
                    arsa arsa = (arsa) aobv.a(arsa.u.getParserForType());
                    arsa arsa2 = this.b;
                    if (arsa2 != null) {
                        arsd arsd = (arsd) ((anxo) arsa2.toBuilder());
                        arsd.mergeFrom(arsa);
                        arsa = (arsa) ((anxl) arsd.build());
                    }
                    this.b = arsa;
                    continue;
                case 482989002:
                    arss arss = (arss) aobv.a(arss.C.getParserForType());
                    arss arss2 = this.c;
                    if (arss2 != null) {
                        arsv arsv = (arsv) ((anxo) arss2.toBuilder());
                        arsv.mergeFrom(arss);
                        arss = (arss) ((anxl) arsv.build());
                    }
                    this.c = arss;
                    continue;
                case 657458594:
                    if (this.d == null) {
                        this.d = new ajvv();
                    }
                    aobv.a(this.d);
                    continue;
                case 1111566818:
                    awvz awvz = (awvz) aobv.a(awvz.j.getParserForType());
                    awvz awvz2 = this.e;
                    if (awvz2 != null) {
                        awvy awvy = (awvy) ((anxo) awvz2.toBuilder());
                        awvy.mergeFrom(awvz);
                        awvz = (awvz) ((anxl) awvy.build());
                    }
                    this.e = awvz;
                    continue;
                case 1163741546:
                    arry arry = (arry) aobv.a(arry.p.getParserForType());
                    arry arry2 = this.f;
                    if (arry2 != null) {
                        arsb arsb = (arsb) ((anxo) arry2.toBuilder());
                        arsb.mergeFrom(arry);
                        arry = (arry) ((anxl) arsb.build());
                    }
                    this.f = arry;
                    continue;
                case 1164828122:
                    awmm awmm = (awmm) aobv.a(awmm.g.getParserForType());
                    awmm awmm2 = this.g;
                    if (awmm2 != null) {
                        awmp awmp = (awmp) ((anxo) awmm2.toBuilder());
                        awmp.mergeFrom(awmm);
                        awmm = (awmm) ((anxl) awmp.build());
                    }
                    this.g = awmm;
                    continue;
                case 1166649666:
                    arru arru = (arru) aobv.a(arru.m.getParserForType());
                    arru arru2 = this.h;
                    if (arru2 != null) {
                        arrx arrx = (arrx) ((anxo) arru2.toBuilder());
                        arrx.mergeFrom(arru);
                        arru = (arru) ((anxl) arrx.build());
                    }
                    this.h = arru;
                    continue;
                case 1166756322:
                    arrw arrw = (arrw) aobv.a(arrw.n.getParserForType());
                    arrw arrw2 = this.i;
                    if (arrw2 != null) {
                        arrz arrz = (arrz) ((anxo) arrw2.toBuilder());
                        arrz.mergeFrom(arrw);
                        arrw = (arrw) ((anxl) arrz.build());
                    }
                    this.i = arrw;
                    continue;
                case 1553097058:
                    aroa aroa = (aroa) aobv.a(aroa.g.getParserForType());
                    aroa aroa2 = this.j;
                    if (aroa2 != null) {
                        arod arod = (arod) ((anxo) aroa2.toBuilder());
                        arod.mergeFrom(aroa);
                        aroa = (aroa) ((anxl) arod.build());
                    }
                    this.j = aroa;
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
