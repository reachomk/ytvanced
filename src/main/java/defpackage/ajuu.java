package defpackage;

/* renamed from: ajuu */
public final class ajuu extends aoca {
    public static volatile ajuu[] a;
    public azdt b;
    public awjp c;
    public aryi d;
    public axmk e;
    private arbs f;

    public ajuu() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajuu)) {
            return false;
        }
        ajuu ajuu = (ajuu) obj;
        azdt azdt = this.b;
        if (azdt == null) {
            if (ajuu.b != null) {
                return false;
            }
        } else if (!azdt.equals(ajuu.b)) {
            return false;
        }
        awjp awjp = this.c;
        if (awjp == null) {
            if (ajuu.c != null) {
                return false;
            }
        } else if (!awjp.equals(ajuu.c)) {
            return false;
        }
        aryi aryi = this.d;
        if (aryi == null) {
            if (ajuu.d != null) {
                return false;
            }
        } else if (!aryi.equals(ajuu.d)) {
            return false;
        }
        axmk axmk = this.e;
        if (axmk == null) {
            if (ajuu.e != null) {
                return false;
            }
        } else if (!axmk.equals(ajuu.e)) {
            return false;
        }
        arbs arbs = this.f;
        if (arbs == null) {
            if (ajuu.f != null) {
                return false;
            }
        } else if (!arbs.equals(ajuu.f)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajuu.unknownFieldData);
        }
        aocb aocb2 = ajuu.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        azdt azdt = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = azdt != null ? azdt.hashCode() : 0;
        awjp awjp = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awjp != null ? awjp.hashCode() : 0;
        aryi aryi = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aryi != null ? aryi.hashCode() : 0;
        axmk axmk = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axmk != null ? axmk.hashCode() : 0;
        arbs arbs = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (arbs != null ? arbs.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(50577878, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(50732276, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(83537025, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(107011484, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(153515154, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(50577878, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(50732276, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(83537025, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(107011484, anze);
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(153515154, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 404623026) {
                azdt azdt = (azdt) aobv.a(azdt.K.getParserForType());
                azdt azdt2 = this.b;
                if (azdt2 != null) {
                    azdw azdw = (azdw) ((anxo) azdt2.toBuilder());
                    azdw.mergeFrom(azdt);
                    azdt = (azdt) ((anxl) azdw.build());
                }
                this.b = azdt;
            } else if (a == 405858210) {
                awjp awjp = (awjp) aobv.a(awjp.u.getParserForType());
                awjp awjp2 = this.c;
                if (awjp2 != null) {
                    awjo awjo = (awjo) ((anxo) awjp2.toBuilder());
                    awjo.mergeFrom(awjp);
                    awjp = (awjp) ((anxl) awjo.build());
                }
                this.c = awjp;
            } else if (a == 668296202) {
                aryi aryi = (aryi) aobv.a(aryi.o.getParserForType());
                aryi aryi2 = this.d;
                if (aryi2 != null) {
                    aryh aryh = (aryh) ((anxo) aryi2.toBuilder());
                    aryh.mergeFrom(aryi);
                    aryi = (aryi) ((anxl) aryh.build());
                }
                this.d = aryi;
            } else if (a == 856091874) {
                axmk axmk = (axmk) aobv.a(axmk.l.getParserForType());
                axmk axmk2 = this.e;
                if (axmk2 != null) {
                    axmm axmm = (axmm) ((anxo) axmk2.toBuilder());
                    axmm.mergeFrom(axmk);
                    axmk = (axmk) ((anxl) axmm.build());
                }
                this.e = axmk;
            } else if (a == 1228121234) {
                arbs arbs = (arbs) aobv.a(arbs.g.getParserForType());
                arbs arbs2 = this.f;
                if (arbs2 != null) {
                    arbr arbr = (arbr) ((anxo) arbs2.toBuilder());
                    arbr.mergeFrom(arbs);
                    arbs = (arbs) ((anxl) arbr.build());
                }
                this.f = arbs;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
