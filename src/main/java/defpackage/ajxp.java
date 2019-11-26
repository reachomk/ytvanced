package defpackage;

/* renamed from: ajxp */
public final class ajxp extends aoca {
    public aqha a;
    public aowr b;
    public axkp c;
    public arbs d;
    public avdj e;

    public ajxp() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxp)) {
            return false;
        }
        ajxp ajxp = (ajxp) obj;
        aqha aqha = this.a;
        if (aqha == null) {
            if (ajxp.a != null) {
                return false;
            }
        } else if (!aqha.equals(ajxp.a)) {
            return false;
        }
        aowr aowr = this.b;
        if (aowr == null) {
            if (ajxp.b != null) {
                return false;
            }
        } else if (!aowr.equals(ajxp.b)) {
            return false;
        }
        axkp axkp = this.c;
        if (axkp == null) {
            if (ajxp.c != null) {
                return false;
            }
        } else if (!axkp.equals(ajxp.c)) {
            return false;
        }
        arbs arbs = this.d;
        if (arbs == null) {
            if (ajxp.d != null) {
                return false;
            }
        } else if (!arbs.equals(ajxp.d)) {
            return false;
        }
        avdj avdj = this.e;
        if (avdj == null) {
            if (ajxp.e != null) {
                return false;
            }
        } else if (!avdj.equals(ajxp.e)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxp.unknownFieldData);
        }
        aocb aocb2 = ajxp.unknownFieldData;
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
        arbs arbs = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arbs != null ? arbs.hashCode() : 0;
        avdj avdj = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (avdj != null ? avdj.hashCode() : 0)) * 31;
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
            aoby.a(153515154, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(156112846, anze);
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
            computeSerializedSize += anwm.c(153515154, anze);
        }
        anze = this.e;
        return anze != null ? computeSerializedSize + anwm.c(156112846, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 444115530) {
                aqha aqha = (aqha) aobv.a(aqha.s.getParserForType());
                aqha aqha2 = this.a;
                if (aqha2 != null) {
                    aqgz aqgz = (aqgz) ((anxo) aqha2.toBuilder());
                    aqgz.mergeFrom(aqha);
                    aqha = (aqha) ((anxl) aqgz.build());
                }
                this.a = aqha;
            } else if (a == 520020186) {
                aowr aowr = (aowr) aobv.a(aowr.w.getParserForType());
                aowr aowr2 = this.b;
                if (aowr2 != null) {
                    aowt aowt = (aowt) ((anxo) aowr2.toBuilder());
                    aowt.mergeFrom(aowr);
                    aowr = (aowr) ((anxl) aowt.build());
                }
                this.b = aowr;
            } else if (a == 915596298) {
                axkp axkp = (axkp) aobv.a(axkp.p.getParserForType());
                axkp axkp2 = this.c;
                if (axkp2 != null) {
                    axks axks = (axks) ((anxo) axkp2.toBuilder());
                    axks.mergeFrom(axkp);
                    axkp = (axkp) ((anxl) axks.build());
                }
                this.c = axkp;
            } else if (a == 1228121234) {
                arbs arbs = (arbs) aobv.a(arbs.g.getParserForType());
                arbs arbs2 = this.d;
                if (arbs2 != null) {
                    arbr arbr = (arbr) ((anxo) arbs2.toBuilder());
                    arbr.mergeFrom(arbs);
                    arbs = (arbs) ((anxl) arbr.build());
                }
                this.d = arbs;
            } else if (a == 1248902770) {
                avdj avdj = (avdj) aobv.a(avdj.r.getParserForType());
                avdj avdj2 = this.e;
                if (avdj2 != null) {
                    avdi avdi = (avdi) ((anxo) avdj2.toBuilder());
                    avdi.mergeFrom(avdj);
                    avdj = (avdj) ((anxl) avdi.build());
                }
                this.e = avdj;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
