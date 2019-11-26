package defpackage;

/* renamed from: ajrp */
public final class ajrp extends aoca {
    public ajrw a;
    public arjg b;
    public ajxx c;
    public axom d;
    public aqiy e;
    public axvu f;
    public arvx g;
    public ayix h;
    public azcw i;
    public aqvl j;
    public attr k;
    public aqdm l;

    public ajrp() {
        this.a = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrp)) {
            return false;
        }
        ajrp ajrp = (ajrp) obj;
        ajrw ajrw = this.a;
        if (ajrw == null) {
            if (ajrp.a != null) {
                return false;
            }
        } else if (!ajrw.equals(ajrp.a)) {
            return false;
        }
        arjg arjg = this.b;
        if (arjg == null) {
            if (ajrp.b != null) {
                return false;
            }
        } else if (!arjg.equals(ajrp.b)) {
            return false;
        }
        ajxx ajxx = this.c;
        if (ajxx == null) {
            if (ajrp.c != null) {
                return false;
            }
        } else if (!ajxx.equals(ajrp.c)) {
            return false;
        }
        axom axom = this.d;
        if (axom == null) {
            if (ajrp.d != null) {
                return false;
            }
        } else if (!axom.equals(ajrp.d)) {
            return false;
        }
        aqiy aqiy = this.e;
        if (aqiy == null) {
            if (ajrp.e != null) {
                return false;
            }
        } else if (!aqiy.equals(ajrp.e)) {
            return false;
        }
        axvu axvu = this.f;
        if (axvu == null) {
            if (ajrp.f != null) {
                return false;
            }
        } else if (!axvu.equals(ajrp.f)) {
            return false;
        }
        arvx arvx = this.g;
        if (arvx == null) {
            if (ajrp.g != null) {
                return false;
            }
        } else if (!arvx.equals(ajrp.g)) {
            return false;
        }
        ayix ayix = this.h;
        if (ayix == null) {
            if (ajrp.h != null) {
                return false;
            }
        } else if (!ayix.equals(ajrp.h)) {
            return false;
        }
        azcw azcw = this.i;
        if (azcw == null) {
            if (ajrp.i != null) {
                return false;
            }
        } else if (!azcw.equals(ajrp.i)) {
            return false;
        }
        aqvl aqvl = this.j;
        if (aqvl == null) {
            if (ajrp.j != null) {
                return false;
            }
        } else if (!aqvl.equals(ajrp.j)) {
            return false;
        }
        attr attr = this.k;
        if (attr == null) {
            if (ajrp.k != null) {
                return false;
            }
        } else if (!attr.equals(ajrp.k)) {
            return false;
        }
        aqdm aqdm = this.l;
        if (aqdm == null) {
            if (ajrp.l != null) {
                return false;
            }
        } else if (!aqdm.equals(ajrp.l)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrp.unknownFieldData);
        }
        aocb aocb2 = ajrp.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajrw ajrw = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajrw != null ? ajrw.hashCode() : 0;
        arjg arjg = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arjg != null ? arjg.hashCode() : 0;
        ajxx ajxx = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajxx != null ? ajxx.hashCode() : 0;
        axom axom = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axom != null ? axom.hashCode() : 0;
        aqiy aqiy = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqiy != null ? aqiy.hashCode() : 0;
        axvu axvu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axvu != null ? axvu.hashCode() : 0;
        arvx arvx = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arvx != null ? arvx.hashCode() : 0;
        ayix ayix = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ayix != null ? ayix.hashCode() : 0;
        azcw azcw = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azcw != null ? azcw.hashCode() : 0;
        aqvl aqvl = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqvl != null ? aqvl.hashCode() : 0;
        attr attr = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = attr != null ? attr.hashCode() : 0;
        aqdm aqdm = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + (aqdm != null ? aqdm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(46407682, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(50236216, anze);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(53272665, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(101397128, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(102883021, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(126869174, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(155144651, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(155554693, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(156098381, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(159058187, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(188799247, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(217771576, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(46407682, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(50236216, anze);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(53272665, aocf);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(101397128, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(102883021, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(126869174, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(155144651, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(155554693, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(156098381, anze);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(159058187, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(188799247, anze);
        }
        anze = this.l;
        return anze != null ? computeSerializedSize + anwm.c(217771576, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 371261458:
                    if (this.a == null) {
                        this.a = new ajrw();
                    }
                    aobv.a(this.a);
                    continue;
                case 401889730:
                    arjg arjg = (arjg) aobv.a(arjg.c.getParserForType());
                    arjg arjg2 = this.b;
                    if (arjg2 != null) {
                        arjj arjj = (arjj) ((anxo) arjg2.toBuilder());
                        arjj.mergeFrom(arjg);
                        arjg = (arjg) ((anxl) arjj.build());
                    }
                    this.b = arjg;
                    continue;
                case 426181322:
                    if (this.c == null) {
                        this.c = new ajxx();
                    }
                    aobv.a(this.c);
                    continue;
                case 811177026:
                    axom axom = (axom) aobv.a(axom.d.getParserForType());
                    axom axom2 = this.d;
                    if (axom2 != null) {
                        axol axol = (axol) ((anxo) axom2.toBuilder());
                        axol.mergeFrom(axom);
                        axom = (axom) ((anxl) axol.build());
                    }
                    this.d = axom;
                    continue;
                case 823064170:
                    aqiy aqiy = (aqiy) aobv.a(aqiy.d.getParserForType());
                    aqiy aqiy2 = this.e;
                    if (aqiy2 != null) {
                        aqix aqix = (aqix) ((anxo) aqiy2.toBuilder());
                        aqix.mergeFrom(aqiy);
                        aqiy = (aqiy) ((anxl) aqix.build());
                    }
                    this.e = aqiy;
                    continue;
                case 1014953394:
                    axvu axvu = (axvu) aobv.a(axvu.c.getParserForType());
                    axvu axvu2 = this.f;
                    if (axvu2 != null) {
                        axvt axvt = (axvt) ((anxo) axvu2.toBuilder());
                        axvt.mergeFrom(axvu);
                        axvu = (axvu) ((anxl) axvt.build());
                    }
                    this.f = axvu;
                    continue;
                case 1241157210:
                    arvx arvx = (arvx) aobv.a(arvx.a.getParserForType());
                    arvx arvx2 = this.g;
                    if (arvx2 != null) {
                        arwa arwa = (arwa) ((anxo) arvx2.toBuilder());
                        arwa.mergeFrom(arvx);
                        arvx = (arvx) ((anxl) arwa.build());
                    }
                    this.g = arvx;
                    continue;
                case 1244437546:
                    ayix ayix = (ayix) aobv.a(ayix.i.getParserForType());
                    ayix ayix2 = this.h;
                    if (ayix2 != null) {
                        ayiw ayiw = (ayiw) ((anxo) ayix2.toBuilder());
                        ayiw.mergeFrom(ayix);
                        ayix = (ayix) ((anxl) ayiw.build());
                    }
                    this.h = ayix;
                    continue;
                case 1248787050:
                    azcw azcw = (azcw) aobv.a(azcw.c.getParserForType());
                    azcw azcw2 = this.i;
                    if (azcw2 != null) {
                        azcv azcv = (azcv) ((anxo) azcw2.toBuilder());
                        azcv.mergeFrom(azcw);
                        azcw = (azcw) ((anxl) azcv.build());
                    }
                    this.i = azcw;
                    continue;
                case 1272465498:
                    aqvl aqvl = (aqvl) aobv.a(aqvl.s.getParserForType());
                    aqvl aqvl2 = this.j;
                    if (aqvl2 != null) {
                        aqvk aqvk = (aqvk) ((anxo) aqvl2.toBuilder());
                        aqvk.mergeFrom(aqvl);
                        aqvl = (aqvl) ((anxl) aqvk.build());
                    }
                    this.j = aqvl;
                    continue;
                case 1510393978:
                    attr attr = (attr) aobv.a(attr.l.getParserForType());
                    attr attr2 = this.k;
                    if (attr2 != null) {
                        attq attq = (attq) ((anxo) attr2.toBuilder());
                        attq.mergeFrom(attr);
                        attr = (attr) ((anxl) attq.build());
                    }
                    this.k = attr;
                    continue;
                case 1742172610:
                    aqdm aqdm = (aqdm) aobv.a(aqdm.e.getParserForType());
                    aqdm aqdm2 = this.l;
                    if (aqdm2 != null) {
                        aqdl aqdl = (aqdl) ((anxo) aqdm2.toBuilder());
                        aqdl.mergeFrom(aqdm);
                        aqdm = (aqdm) ((anxl) aqdl.build());
                    }
                    this.l = aqdm;
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
