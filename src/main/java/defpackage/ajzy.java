package defpackage;

/* renamed from: ajzy */
public final class ajzy extends aoca {
    public apmi a;
    public auvl b;
    public auvp c;
    public avls d;
    public avkv e;
    public ajwm f;

    public ajzy() {
        this.f = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajzy)) {
            return false;
        }
        ajzy ajzy = (ajzy) obj;
        apmi apmi = this.a;
        if (apmi == null) {
            if (ajzy.a != null) {
                return false;
            }
        } else if (!apmi.equals(ajzy.a)) {
            return false;
        }
        auvl auvl = this.b;
        if (auvl == null) {
            if (ajzy.b != null) {
                return false;
            }
        } else if (!auvl.equals(ajzy.b)) {
            return false;
        }
        auvp auvp = this.c;
        if (auvp == null) {
            if (ajzy.c != null) {
                return false;
            }
        } else if (!auvp.equals(ajzy.c)) {
            return false;
        }
        avls avls = this.d;
        if (avls == null) {
            if (ajzy.d != null) {
                return false;
            }
        } else if (!avls.equals(ajzy.d)) {
            return false;
        }
        avkv avkv = this.e;
        if (avkv == null) {
            if (ajzy.e != null) {
                return false;
            }
        } else if (!avkv.equals(ajzy.e)) {
            return false;
        }
        ajwm ajwm = this.f;
        if (ajwm == null) {
            if (ajzy.f != null) {
                return false;
            }
        } else if (!ajwm.equals(ajzy.f)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajzy.unknownFieldData);
        }
        aocb aocb2 = ajzy.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        apmi apmi = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = apmi != null ? apmi.hashCode() : 0;
        auvl auvl = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvl != null ? auvl.hashCode() : 0;
        auvp auvp = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvp != null ? auvp.hashCode() : 0;
        avls avls = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = avls != null ? avls.hashCode() : 0;
        avkv avkv = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = avkv != null ? avkv.hashCode() : 0;
        ajwm ajwm = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (ajwm != null ? ajwm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(48694381, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(66441108, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(66441155, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(73850394, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(122645542, anze);
        }
        aocf aocf = this.f;
        if (aocf != null) {
            aoby.a(125105119, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(48694381, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(66441108, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(66441155, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(73850394, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(122645542, anze);
        }
        aocf aocf = this.f;
        return aocf != null ? computeSerializedSize + aoby.b(125105119, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 389555050:
                    apmi apmi = (apmi) aobv.a(apmi.n.getParserForType());
                    apmi apmi2 = this.a;
                    if (apmi2 != null) {
                        apml apml = (apml) ((anxo) apmi2.toBuilder());
                        apml.mergeFrom(apmi);
                        apmi = (apmi) ((anxl) apml.build());
                    }
                    this.a = apmi;
                    continue;
                case 531528866:
                    auvl auvl = (auvl) aobv.a(auvl.f.getParserForType());
                    auvl auvl2 = this.b;
                    if (auvl2 != null) {
                        auvo auvo = (auvo) ((anxo) auvl2.toBuilder());
                        auvo.mergeFrom(auvl);
                        auvl = (auvl) ((anxl) auvo.build());
                    }
                    this.b = auvl;
                    continue;
                case 531529242:
                    auvp auvp = (auvp) aobv.a(auvp.h.getParserForType());
                    auvp auvp2 = this.c;
                    if (auvp2 != null) {
                        auvs auvs = (auvs) ((anxo) auvp2.toBuilder());
                        auvs.mergeFrom(auvp);
                        auvp = (auvp) ((anxl) auvs.build());
                    }
                    this.c = auvp;
                    continue;
                case 590803154:
                    avls avls = (avls) aobv.a(avls.g.getParserForType());
                    avls avls2 = this.d;
                    if (avls2 != null) {
                        avlv avlv = (avlv) ((anxo) avls2.toBuilder());
                        avlv.mergeFrom(avls);
                        avls = (avls) ((anxl) avlv.build());
                    }
                    this.d = avls;
                    continue;
                case 981164338:
                    avkv avkv = (avkv) aobv.a(avkv.g.getParserForType());
                    avkv avkv2 = this.e;
                    if (avkv2 != null) {
                        avku avku = (avku) ((anxo) avkv2.toBuilder());
                        avku.mergeFrom(avkv);
                        avkv = (avkv) ((anxl) avku.build());
                    }
                    this.e = avkv;
                    continue;
                case 1000840954:
                    if (this.f == null) {
                        this.f = new ajwm();
                    }
                    aobv.a(this.f);
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
