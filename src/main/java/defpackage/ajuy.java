package defpackage;

/* renamed from: ajuy */
public final class ajuy extends aoca {
    public ascu a;

    public ajuy() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajuy)) {
            return false;
        }
        ajuy ajuy = (ajuy) obj;
        ascu ascu = this.a;
        if (ascu == null) {
            if (ajuy.a != null) {
                return false;
            }
        } else if (!ascu.equals(ajuy.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajuy.unknownFieldData);
        }
        aocb aocb2 = ajuy.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ascu ascu = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ascu != null ? ascu.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(4, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(4, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 34) {
                ascu ascu = (ascu) aobv.a(ascu.c.getParserForType());
                ascu ascu2 = this.a;
                if (ascu2 != null) {
                    ascx ascx = (ascx) ((anxo) ascu2.toBuilder());
                    ascx.mergeFrom(ascu);
                    ascu = (ascu) ((anxl) ascx.build());
                }
                this.a = ascu;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
