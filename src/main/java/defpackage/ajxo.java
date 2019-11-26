package defpackage;

/* renamed from: ajxo */
public final class ajxo extends aoca {
    public static volatile ajxo[] a;
    public akag b;
    public apvs c;

    public ajxo() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxo)) {
            return false;
        }
        ajxo ajxo = (ajxo) obj;
        akag akag = this.b;
        if (akag == null) {
            if (ajxo.b != null) {
                return false;
            }
        } else if (!akag.equals(ajxo.b)) {
            return false;
        }
        apvs apvs = this.c;
        if (apvs == null) {
            if (ajxo.c != null) {
                return false;
            }
        } else if (!apvs.equals(ajxo.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxo.unknownFieldData);
        }
        aocb aocb2 = ajxo.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akag akag = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akag != null ? akag.hashCode() : 0;
        apvs apvs = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (apvs != null ? apvs.hashCode() : 0)) * 31;
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
        return anze != null ? computeSerializedSize + anwm.c(88478200, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 535442994) {
                if (this.b == null) {
                    this.b = new akag();
                }
                aobv.a(this.b);
            } else if (a == 707825602) {
                apvs apvs = (apvs) aobv.a(apvs.h.getParserForType());
                apvs apvs2 = this.c;
                if (apvs2 != null) {
                    apvr apvr = (apvr) ((anxo) apvs2.toBuilder());
                    apvr.mergeFrom(apvs);
                    apvs = (apvs) ((anxl) apvr.build());
                }
                this.c = apvs;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
