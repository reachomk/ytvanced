package defpackage;

/* renamed from: ajub */
public final class ajub extends aoca {
    public aqra a;

    public ajub() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajub)) {
            return false;
        }
        ajub ajub = (ajub) obj;
        aqra aqra = this.a;
        if (aqra == null) {
            if (ajub.a != null) {
                return false;
            }
        } else if (!aqra.equals(ajub.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajub.unknownFieldData);
        }
        aocb aocb2 = ajub.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqra aqra = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (aqra != null ? aqra.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(84960675, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(84960675, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 679685402) {
                aqra aqra = (aqra) aobv.a(aqra.d.getParserForType());
                aqra aqra2 = this.a;
                if (aqra2 != null) {
                    aqrd aqrd = (aqrd) ((anxo) aqra2.toBuilder());
                    aqrd.mergeFrom(aqra);
                    aqra = (aqra) ((anxl) aqrd.build());
                }
                this.a = aqra;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
