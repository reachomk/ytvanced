package defpackage;

/* renamed from: ajto */
public final class ajto extends aoca {
    public aqpp a;

    public ajto() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajto)) {
            return false;
        }
        ajto ajto = (ajto) obj;
        aqpp aqpp = this.a;
        if (aqpp == null) {
            if (ajto.a != null) {
                return false;
            }
        } else if (!aqpp.equals(ajto.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajto.unknownFieldData);
        }
        aocb aocb2 = ajto.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqpp aqpp = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (aqpp != null ? aqpp.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(96334041, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(96334041, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 770672330) {
                aqpp aqpp = (aqpp) aobv.a(aqpp.d.getParserForType());
                aqpp aqpp2 = this.a;
                if (aqpp2 != null) {
                    aqpo aqpo = (aqpo) ((anxo) aqpp2.toBuilder());
                    aqpo.mergeFrom(aqpp);
                    aqpp = (aqpp) ((anxl) aqpo.build());
                }
                this.a = aqpp;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
