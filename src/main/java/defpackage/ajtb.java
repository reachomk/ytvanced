package defpackage;

/* renamed from: ajtb */
public final class ajtb extends aoca {
    public aqha a;
    public aowr b;
    public axkp c;
    public aqeb d;
    public arbs e;
    public avdj f;
    public aveo g;
    public axyk h;

    public ajtb() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtb)) {
            return false;
        }
        ajtb ajtb = (ajtb) obj;
        aqha aqha = this.a;
        if (aqha == null) {
            if (ajtb.a != null) {
                return false;
            }
        } else if (!aqha.equals(ajtb.a)) {
            return false;
        }
        aowr aowr = this.b;
        if (aowr == null) {
            if (ajtb.b != null) {
                return false;
            }
        } else if (!aowr.equals(ajtb.b)) {
            return false;
        }
        axkp axkp = this.c;
        if (axkp == null) {
            if (ajtb.c != null) {
                return false;
            }
        } else if (!axkp.equals(ajtb.c)) {
            return false;
        }
        aqeb aqeb = this.d;
        if (aqeb == null) {
            if (ajtb.d != null) {
                return false;
            }
        } else if (!aqeb.equals(ajtb.d)) {
            return false;
        }
        arbs arbs = this.e;
        if (arbs == null) {
            if (ajtb.e != null) {
                return false;
            }
        } else if (!arbs.equals(ajtb.e)) {
            return false;
        }
        avdj avdj = this.f;
        if (avdj == null) {
            if (ajtb.f != null) {
                return false;
            }
        } else if (!avdj.equals(ajtb.f)) {
            return false;
        }
        aveo aveo = this.g;
        if (aveo == null) {
            if (ajtb.g != null) {
                return false;
            }
        } else if (!aveo.equals(ajtb.g)) {
            return false;
        }
        axyk axyk = this.h;
        if (axyk == null) {
            if (ajtb.h != null) {
                return false;
            }
        } else if (!axyk.equals(ajtb.h)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtb.unknownFieldData);
        }
        aocb aocb2 = ajtb.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqha aqha = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqha != null ? aqha.hashCode() : 0;
        aowr aowr = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aowr != null ? aowr.hashCode() : 0;
        axkp axkp = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axkp != null ? axkp.hashCode() : 0;
        aqeb aqeb = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqeb != null ? aqeb.hashCode() : 0;
        arbs arbs = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arbs != null ? arbs.hashCode() : 0;
        avdj avdj = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = avdj != null ? avdj.hashCode() : 0;
        aveo aveo = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aveo != null ? aveo.hashCode() : 0;
        axyk axyk = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (axyk != null ? axyk.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(55514441, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(65002523, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(114449537, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(153405107, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(153515154, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(156112846, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(166394028, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(177484939, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(55514441, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(65002523, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(114449537, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(153405107, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(153515154, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(156112846, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(166394028, anze);
        }
        anze = this.h;
        return anze != null ? computeSerializedSize + anwm.c(177484939, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 444115530:
                    aqha aqha = (aqha) aobv.a(aqha.s.getParserForType());
                    aqha aqha2 = this.a;
                    if (aqha2 != null) {
                        aqgz aqgz = (aqgz) ((anxo) aqha2.toBuilder());
                        aqgz.mergeFrom(aqha);
                        aqha = (aqha) ((anxl) aqgz.build());
                    }
                    this.a = aqha;
                    continue;
                case 520020186:
                    aowr aowr = (aowr) aobv.a(aowr.w.getParserForType());
                    aowr aowr2 = this.b;
                    if (aowr2 != null) {
                        aowt aowt = (aowt) ((anxo) aowr2.toBuilder());
                        aowt.mergeFrom(aowr);
                        aowr = (aowr) ((anxl) aowt.build());
                    }
                    this.b = aowr;
                    continue;
                case 915596298:
                    axkp axkp = (axkp) aobv.a(axkp.p.getParserForType());
                    axkp axkp2 = this.c;
                    if (axkp2 != null) {
                        axks axks = (axks) ((anxo) axkp2.toBuilder());
                        axks.mergeFrom(axkp);
                        axkp = (axkp) ((anxl) axks.build());
                    }
                    this.c = axkp;
                    continue;
                case 1227240858:
                    aqeb aqeb = (aqeb) aobv.a(aqeb.p.getParserForType());
                    aqeb aqeb2 = this.d;
                    if (aqeb2 != null) {
                        aqed aqed = (aqed) ((anxo) aqeb2.toBuilder());
                        aqed.mergeFrom(aqeb);
                        aqeb = (aqeb) ((anxl) aqed.build());
                    }
                    this.d = aqeb;
                    continue;
                case 1228121234:
                    arbs arbs = (arbs) aobv.a(arbs.g.getParserForType());
                    arbs arbs2 = this.e;
                    if (arbs2 != null) {
                        arbr arbr = (arbr) ((anxo) arbs2.toBuilder());
                        arbr.mergeFrom(arbs);
                        arbs = (arbs) ((anxl) arbr.build());
                    }
                    this.e = arbs;
                    continue;
                case 1248902770:
                    avdj avdj = (avdj) aobv.a(avdj.r.getParserForType());
                    avdj avdj2 = this.f;
                    if (avdj2 != null) {
                        avdi avdi = (avdi) ((anxo) avdj2.toBuilder());
                        avdi.mergeFrom(avdj);
                        avdj = (avdj) ((anxl) avdi.build());
                    }
                    this.f = avdj;
                    continue;
                case 1331152226:
                    aveo aveo = (aveo) aobv.a(aveo.b.getParserForType());
                    aveo aveo2 = this.g;
                    if (aveo2 != null) {
                        aven aven = (aven) ((anxo) aveo2.toBuilder());
                        aven.mergeFrom(aveo);
                        aveo = (aveo) ((anxl) aven.build());
                    }
                    this.g = aveo;
                    continue;
                case 1419879514:
                    axyk axyk = (axyk) aobv.a(axyk.f.getParserForType());
                    axyk axyk2 = this.h;
                    if (axyk2 != null) {
                        axym axym = (axym) ((anxo) axyk2.toBuilder());
                        axym.mergeFrom(axyk);
                        axyk = (axyk) ((anxl) axym.build());
                    }
                    this.h = axyk;
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
