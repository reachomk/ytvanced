package defpackage;

/* renamed from: ajvz */
public final class ajvz extends aoca {
    public static volatile ajvz[] a;
    public avzz b;
    public ajxi c;
    private artc d;
    private arte e;
    private arta f;

    public ajvz() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajvz)) {
            return false;
        }
        ajvz ajvz = (ajvz) obj;
        artc artc = this.d;
        if (artc == null) {
            if (ajvz.d != null) {
                return false;
            }
        } else if (!artc.equals(ajvz.d)) {
            return false;
        }
        arte arte = this.e;
        if (arte == null) {
            if (ajvz.e != null) {
                return false;
            }
        } else if (!arte.equals(ajvz.e)) {
            return false;
        }
        arta arta = this.f;
        if (arta == null) {
            if (ajvz.f != null) {
                return false;
            }
        } else if (!arta.equals(ajvz.f)) {
            return false;
        }
        avzz avzz = this.b;
        if (avzz == null) {
            if (ajvz.b != null) {
                return false;
            }
        } else if (!avzz.equals(ajvz.b)) {
            return false;
        }
        ajxi ajxi = this.c;
        if (ajxi == null) {
            if (ajvz.c != null) {
                return false;
            }
        } else if (!ajxi.equals(ajvz.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajvz.unknownFieldData);
        }
        aocb aocb2 = ajvz.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        artc artc = this.d;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = artc != null ? artc.hashCode() : 0;
        arte arte = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arte != null ? arte.hashCode() : 0;
        arta arta = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arta != null ? arta.hashCode() : 0;
        avzz avzz = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = avzz != null ? avzz.hashCode() : 0;
        ajxi ajxi = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (ajxi != null ? ajxi.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.d;
        if (anze != null) {
            aoby.a(46887524, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(47241482, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(47823041, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(117866661, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(123267149, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(46887524, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(47241482, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(47823041, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(117866661, anze);
        }
        aocf aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(123267149, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 375100194) {
                artc artc = (artc) aobv.a(artc.c.getParserForType());
                artc artc2 = this.d;
                if (artc2 != null) {
                    artf artf = (artf) ((anxo) artc2.toBuilder());
                    artf.mergeFrom(artc);
                    artc = (artc) ((anxl) artf.build());
                }
                this.d = artc;
            } else if (a == 377931858) {
                arte arte = (arte) aobv.a(arte.c.getParserForType());
                arte arte2 = this.e;
                if (arte2 != null) {
                    arth arth = (arth) ((anxo) arte2.toBuilder());
                    arth.mergeFrom(arte);
                    arte = (arte) ((anxl) arth.build());
                }
                this.e = arte;
            } else if (a == 382584330) {
                arta arta = (arta) aobv.a(arta.e.getParserForType());
                arta arta2 = this.f;
                if (arta2 != null) {
                    artd artd = (artd) ((anxo) arta2.toBuilder());
                    artd.mergeFrom(arta);
                    arta = (arta) ((anxl) artd.build());
                }
                this.f = arta;
            } else if (a == 942933290) {
                avzz avzz = (avzz) aobv.a(avzz.b.getParserForType());
                avzz avzz2 = this.b;
                if (avzz2 != null) {
                    avzy avzy = (avzy) ((anxo) avzz2.toBuilder());
                    avzy.mergeFrom(avzz);
                    avzz = (avzz) ((anxl) avzy.build());
                }
                this.b = avzz;
            } else if (a == 986137194) {
                if (this.c == null) {
                    this.c = new ajxi();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
