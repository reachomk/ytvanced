package defpackage;

/* renamed from: ajrn */
public final class ajrn extends aoca {
    public azdt a;
    public aqgs b;
    public awjp c;
    public awly d;
    public apbf e;

    public ajrn() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrn)) {
            return false;
        }
        ajrn ajrn = (ajrn) obj;
        azdt azdt = this.a;
        if (azdt == null) {
            if (ajrn.a != null) {
                return false;
            }
        } else if (!azdt.equals(ajrn.a)) {
            return false;
        }
        aqgs aqgs = this.b;
        if (aqgs == null) {
            if (ajrn.b != null) {
                return false;
            }
        } else if (!aqgs.equals(ajrn.b)) {
            return false;
        }
        awjp awjp = this.c;
        if (awjp == null) {
            if (ajrn.c != null) {
                return false;
            }
        } else if (!awjp.equals(ajrn.c)) {
            return false;
        }
        awly awly = this.d;
        if (awly == null) {
            if (ajrn.d != null) {
                return false;
            }
        } else if (!awly.equals(ajrn.d)) {
            return false;
        }
        apbf apbf = this.e;
        if (apbf == null) {
            if (ajrn.e != null) {
                return false;
            }
        } else if (!apbf.equals(ajrn.e)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrn.unknownFieldData);
        }
        aocb aocb2 = ajrn.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        azdt azdt = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = azdt != null ? azdt.hashCode() : 0;
        aqgs aqgs = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqgs != null ? aqgs.hashCode() : 0;
        awjp awjp = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awjp != null ? awjp.hashCode() : 0;
        awly awly = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awly != null ? awly.hashCode() : 0;
        apbf apbf = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (apbf != null ? apbf.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(50577878, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(50630979, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(50732276, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(99391126, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(120744665, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(50577878, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(50630979, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(50732276, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(99391126, anze);
        }
        anze = this.e;
        return anze != null ? computeSerializedSize + anwm.c(120744665, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 404623026) {
                azdt azdt = (azdt) aobv.a(azdt.K.getParserForType());
                azdt azdt2 = this.a;
                if (azdt2 != null) {
                    azdw azdw = (azdw) ((anxo) azdt2.toBuilder());
                    azdw.mergeFrom(azdt);
                    azdt = (azdt) ((anxl) azdw.build());
                }
                this.a = azdt;
            } else if (a == 405047834) {
                aqgs aqgs = (aqgs) aobv.a(aqgs.H.getParserForType());
                aqgs aqgs2 = this.b;
                if (aqgs2 != null) {
                    aqgv aqgv = (aqgv) ((anxo) aqgs2.toBuilder());
                    aqgv.mergeFrom(aqgs);
                    aqgs = (aqgs) ((anxl) aqgv.build());
                }
                this.b = aqgs;
            } else if (a == 405858210) {
                awjp awjp = (awjp) aobv.a(awjp.u.getParserForType());
                awjp awjp2 = this.c;
                if (awjp2 != null) {
                    awjo awjo = (awjo) ((anxo) awjp2.toBuilder());
                    awjo.mergeFrom(awjp);
                    awjp = (awjp) ((anxl) awjo.build());
                }
                this.c = awjp;
            } else if (a == 795129010) {
                awly awly = (awly) aobv.a(awly.j.getParserForType());
                awly awly2 = this.d;
                if (awly2 != null) {
                    awmb awmb = (awmb) ((anxo) awly2.toBuilder());
                    awmb.mergeFrom(awly);
                    awly = (awly) ((anxl) awmb.build());
                }
                this.d = awly;
            } else if (a == 965957322) {
                apbf apbf = (apbf) aobv.a(apbf.e.getParserForType());
                apbf apbf2 = this.e;
                if (apbf2 != null) {
                    apbe apbe = (apbe) ((anxo) apbf2.toBuilder());
                    apbe.mergeFrom(apbf);
                    apbf = (apbf) ((anxl) apbe.build());
                }
                this.e = apbf;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
