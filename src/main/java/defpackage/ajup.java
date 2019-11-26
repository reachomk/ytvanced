package defpackage;

/* renamed from: ajup */
public final class ajup extends aoca {
    public static volatile ajup[] a;
    public aqgs b;
    public aqfs c;
    public ajsx d;
    public aqfg e;
    public aqqg f;
    private aqgk g;

    public ajup() {
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajup)) {
            return false;
        }
        ajup ajup = (ajup) obj;
        aqgs aqgs = this.b;
        if (aqgs == null) {
            if (ajup.b != null) {
                return false;
            }
        } else if (!aqgs.equals(ajup.b)) {
            return false;
        }
        aqfs aqfs = this.c;
        if (aqfs == null) {
            if (ajup.c != null) {
                return false;
            }
        } else if (!aqfs.equals(ajup.c)) {
            return false;
        }
        ajsx ajsx = this.d;
        if (ajsx == null) {
            if (ajup.d != null) {
                return false;
            }
        } else if (!ajsx.equals(ajup.d)) {
            return false;
        }
        aqfg aqfg = this.e;
        if (aqfg == null) {
            if (ajup.e != null) {
                return false;
            }
        } else if (!aqfg.equals(ajup.e)) {
            return false;
        }
        aqqg aqqg = this.f;
        if (aqqg == null) {
            if (ajup.f != null) {
                return false;
            }
        } else if (!aqqg.equals(ajup.f)) {
            return false;
        }
        aqgk aqgk = this.g;
        if (aqgk == null) {
            if (ajup.g != null) {
                return false;
            }
        } else if (!aqgk.equals(ajup.g)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajup.unknownFieldData);
        }
        aocb aocb2 = ajup.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqgs aqgs = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqgs != null ? aqgs.hashCode() : 0;
        aqfs aqfs = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqfs != null ? aqfs.hashCode() : 0;
        ajsx ajsx = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajsx != null ? ajsx.hashCode() : 0;
        aqfg aqfg = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqfg != null ? aqfg.hashCode() : 0;
        aqqg aqqg = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqqg != null ? aqqg.hashCode() : 0;
        aqgk aqgk = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (aqgk != null ? aqgk.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(50630979, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(50742631, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(50794305, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(58485276, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(98817457, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(106862445, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(50630979, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(50742631, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(50794305, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(58485276, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(98817457, anze);
        }
        anze = this.g;
        return anze != null ? computeSerializedSize + anwm.c(106862445, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 405047834:
                    aqgs aqgs = (aqgs) aobv.a(aqgs.H.getParserForType());
                    aqgs aqgs2 = this.b;
                    if (aqgs2 != null) {
                        aqgv aqgv = (aqgv) ((anxo) aqgs2.toBuilder());
                        aqgv.mergeFrom(aqgs);
                        aqgs = (aqgs) ((anxl) aqgv.build());
                    }
                    this.b = aqgs;
                    continue;
                case 405941050:
                    aqfs aqfs = (aqfs) aobv.a(aqfs.v.getParserForType());
                    aqfs aqfs2 = this.c;
                    if (aqfs2 != null) {
                        aqfr aqfr = (aqfr) ((anxo) aqfs2.toBuilder());
                        aqfr.mergeFrom(aqfs);
                        aqfs = (aqfs) ((anxl) aqfr.build());
                    }
                    this.c = aqfs;
                    continue;
                case 406354442:
                    if (this.d == null) {
                        this.d = new ajsx();
                    }
                    aobv.a(this.d);
                    continue;
                case 467882210:
                    aqfg aqfg = (aqfg) aobv.a(aqfg.z.getParserForType());
                    aqfg aqfg2 = this.e;
                    if (aqfg2 != null) {
                        aqff aqff = (aqff) ((anxo) aqfg2.toBuilder());
                        aqff.mergeFrom(aqfg);
                        aqfg = (aqfg) ((anxl) aqff.build());
                    }
                    this.e = aqfg;
                    continue;
                case 790539658:
                    aqqg aqqg = (aqqg) aobv.a(aqqg.d.getParserForType());
                    aqqg aqqg2 = this.f;
                    if (aqqg2 != null) {
                        aqqi aqqi = (aqqi) ((anxo) aqqg2.toBuilder());
                        aqqi.mergeFrom(aqqg);
                        aqqg = (aqqg) ((anxl) aqqi.build());
                    }
                    this.f = aqqg;
                    continue;
                case 854899562:
                    aqgk aqgk = (aqgk) aobv.a(aqgk.k.getParserForType());
                    aqgk aqgk2 = this.g;
                    if (aqgk2 != null) {
                        aqgj aqgj = (aqgj) ((anxo) aqgk2.toBuilder());
                        aqgj.mergeFrom(aqgk);
                        aqgk = (aqgk) ((anxl) aqgj.build());
                    }
                    this.g = aqgk;
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
