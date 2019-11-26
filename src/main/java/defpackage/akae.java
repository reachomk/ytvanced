package defpackage;

/* renamed from: akae */
public final class akae extends aoca {
    public ajsg a;
    public appg b;
    public axdw c;
    public axqn d;
    public auah e;
    public axcs f;
    public arbs g;

    public akae() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akae)) {
            return false;
        }
        akae akae = (akae) obj;
        ajsg ajsg = this.a;
        if (ajsg == null) {
            if (akae.a != null) {
                return false;
            }
        } else if (!ajsg.equals(akae.a)) {
            return false;
        }
        appg appg = this.b;
        if (appg == null) {
            if (akae.b != null) {
                return false;
            }
        } else if (!appg.equals(akae.b)) {
            return false;
        }
        axdw axdw = this.c;
        if (axdw == null) {
            if (akae.c != null) {
                return false;
            }
        } else if (!axdw.equals(akae.c)) {
            return false;
        }
        axqn axqn = this.d;
        if (axqn == null) {
            if (akae.d != null) {
                return false;
            }
        } else if (!axqn.equals(akae.d)) {
            return false;
        }
        auah auah = this.e;
        if (auah == null) {
            if (akae.e != null) {
                return false;
            }
        } else if (!auah.equals(akae.e)) {
            return false;
        }
        axcs axcs = this.f;
        if (axcs == null) {
            if (akae.f != null) {
                return false;
            }
        } else if (!axcs.equals(akae.f)) {
            return false;
        }
        arbs arbs = this.g;
        if (arbs == null) {
            if (akae.g != null) {
                return false;
            }
        } else if (!arbs.equals(akae.g)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akae.unknownFieldData);
        }
        aocb aocb2 = akae.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajsg ajsg = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajsg != null ? ajsg.hashCode() : 0;
        appg appg = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = appg != null ? appg.hashCode() : 0;
        axdw axdw = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axdw != null ? axdw.hashCode() : 0;
        axqn axqn = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axqn != null ? axqn.hashCode() : 0;
        auah auah = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auah != null ? auah.hashCode() : 0;
        axcs axcs = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axcs != null ? axcs.hashCode() : 0;
        arbs arbs = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (arbs != null ? arbs.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(48479645, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(53577639, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(69655246, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(76818770, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(85962144, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(132114608, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(153515154, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(48479645, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(53577639, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(69655246, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(76818770, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(85962144, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(132114608, anze);
        }
        anze = this.g;
        return anze != null ? computeSerializedSize + anwm.c(153515154, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 387837162:
                    if (this.a == null) {
                        this.a = new ajsg();
                    }
                    aobv.a(this.a);
                    continue;
                case 428621114:
                    appg appg = (appg) aobv.a(appg.g.getParserForType());
                    appg appg2 = this.b;
                    if (appg2 != null) {
                        appj appj = (appj) ((anxo) appg2.toBuilder());
                        appj.mergeFrom(appg);
                        appg = (appg) ((anxl) appj.build());
                    }
                    this.b = appg;
                    continue;
                case 557241970:
                    axdw axdw = (axdw) aobv.a(axdw.g.getParserForType());
                    axdw axdw2 = this.c;
                    if (axdw2 != null) {
                        axdz axdz = (axdz) ((anxo) axdw2.toBuilder());
                        axdz.mergeFrom(axdw);
                        axdw = (axdw) ((anxl) axdz.build());
                    }
                    this.c = axdw;
                    continue;
                case 614550162:
                    axqn axqn = (axqn) aobv.a(axqn.f.getParserForType());
                    axqn axqn2 = this.d;
                    if (axqn2 != null) {
                        axqm axqm = (axqm) ((anxo) axqn2.toBuilder());
                        axqm.mergeFrom(axqn);
                        axqn = (axqn) ((anxl) axqm.build());
                    }
                    this.d = axqn;
                    continue;
                case 687697154:
                    auah auah = (auah) aobv.a(auah.g.getParserForType());
                    auah auah2 = this.e;
                    if (auah2 != null) {
                        auak auak = (auak) ((anxo) auah2.toBuilder());
                        auak.mergeFrom(auah);
                        auah = (auah) ((anxl) auak.build());
                    }
                    this.e = auah;
                    continue;
                case 1056916866:
                    axcs axcs = (axcs) aobv.a(axcs.h.getParserForType());
                    axcs axcs2 = this.f;
                    if (axcs2 != null) {
                        axcr axcr = (axcr) ((anxo) axcs2.toBuilder());
                        axcr.mergeFrom(axcs);
                        axcs = (axcs) ((anxl) axcr.build());
                    }
                    this.f = axcs;
                    continue;
                case 1228121234:
                    arbs arbs = (arbs) aobv.a(arbs.g.getParserForType());
                    arbs arbs2 = this.g;
                    if (arbs2 != null) {
                        arbr arbr = (arbr) ((anxo) arbs2.toBuilder());
                        arbr.mergeFrom(arbs);
                        arbs = (arbs) ((anxl) arbr.build());
                    }
                    this.g = arbs;
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
