package defpackage;

/* renamed from: akah */
public final class akah extends aoca {
    public static volatile akah[] a;
    public akag b;
    public apvs c;
    public ajxl d;
    public apvw e;
    public apvy f;
    public apvu g;

    public akah() {
        this.b = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akah)) {
            return false;
        }
        akah akah = (akah) obj;
        akag akag = this.b;
        if (akag == null) {
            if (akah.b != null) {
                return false;
            }
        } else if (!akag.equals(akah.b)) {
            return false;
        }
        apvs apvs = this.c;
        if (apvs == null) {
            if (akah.c != null) {
                return false;
            }
        } else if (!apvs.equals(akah.c)) {
            return false;
        }
        ajxl ajxl = this.d;
        if (ajxl == null) {
            if (akah.d != null) {
                return false;
            }
        } else if (!ajxl.equals(akah.d)) {
            return false;
        }
        apvw apvw = this.e;
        if (apvw == null) {
            if (akah.e != null) {
                return false;
            }
        } else if (!apvw.equals(akah.e)) {
            return false;
        }
        apvy apvy = this.f;
        if (apvy == null) {
            if (akah.f != null) {
                return false;
            }
        } else if (!apvy.equals(akah.f)) {
            return false;
        }
        apvu apvu = this.g;
        if (apvu == null) {
            if (akah.g != null) {
                return false;
            }
        } else if (!apvu.equals(akah.g)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akah.unknownFieldData);
        }
        aocb aocb2 = akah.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akag akag = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akag != null ? akag.hashCode() : 0;
        apvs apvs = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apvs != null ? apvs.hashCode() : 0;
        ajxl ajxl = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajxl != null ? ajxl.hashCode() : 0;
        apvw apvw = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apvw != null ? apvw.hashCode() : 0;
        apvy apvy = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apvy != null ? apvy.hashCode() : 0;
        apvu apvu = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (apvu != null ? apvu.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(66930374, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(88478200, anze);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(93763033, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(94214034, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(144484052, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(173548507, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(66930374, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(88478200, anze);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(93763033, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(94214034, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(144484052, anze);
        }
        anze = this.g;
        return anze != null ? computeSerializedSize + anwm.c(173548507, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 535442994:
                    if (this.b == null) {
                        this.b = new akag();
                    }
                    aobv.a(this.b);
                    continue;
                case 707825602:
                    apvs apvs = (apvs) aobv.a(apvs.h.getParserForType());
                    apvs apvs2 = this.c;
                    if (apvs2 != null) {
                        apvr apvr = (apvr) ((anxo) apvs2.toBuilder());
                        apvr.mergeFrom(apvs);
                        apvs = (apvs) ((anxl) apvr.build());
                    }
                    this.c = apvs;
                    continue;
                case 750104266:
                    if (this.d == null) {
                        this.d = new ajxl();
                    }
                    aobv.a(this.d);
                    continue;
                case 753712274:
                    apvw apvw = (apvw) aobv.a(apvw.f.getParserForType());
                    apvw apvw2 = this.e;
                    if (apvw2 != null) {
                        apvv apvv = (apvv) ((anxo) apvw2.toBuilder());
                        apvv.mergeFrom(apvw);
                        apvw = (apvw) ((anxl) apvv.build());
                    }
                    this.e = apvw;
                    continue;
                case 1155872418:
                    apvy apvy = (apvy) aobv.a(apvy.e.getParserForType());
                    apvy apvy2 = this.f;
                    if (apvy2 != null) {
                        apvx apvx = (apvx) ((anxo) apvy2.toBuilder());
                        apvx.mergeFrom(apvy);
                        apvy = (apvy) ((anxl) apvx.build());
                    }
                    this.f = apvy;
                    continue;
                case 1388388058:
                    apvu apvu = (apvu) aobv.a(apvu.f.getParserForType());
                    apvu apvu2 = this.g;
                    if (apvu2 != null) {
                        apvt apvt = (apvt) ((anxo) apvu2.toBuilder());
                        apvt.mergeFrom(apvu);
                        apvu = (apvu) ((anxl) apvt.build());
                    }
                    this.g = apvu;
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
