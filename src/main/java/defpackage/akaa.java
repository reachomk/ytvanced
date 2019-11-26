package defpackage;

/* renamed from: akaa */
public final class akaa extends aoca {
    public axav a;

    public akaa() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akaa)) {
            return false;
        }
        akaa akaa = (akaa) obj;
        axav axav = this.a;
        if (axav == null) {
            if (akaa.a != null) {
                return false;
            }
        } else if (!axav.equals(akaa.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akaa.unknownFieldData);
        }
        aocb aocb2 = akaa.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        axav axav = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (axav != null ? axav.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(113762946, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(113762946, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 910103570) {
                axav axav = (axav) aobv.a(axav.l.getParserForType());
                axav axav2 = this.a;
                if (axav2 != null) {
                    axau axau = (axau) ((anxo) axav2.toBuilder());
                    axau.mergeFrom(axav);
                    axav = (axav) ((anxl) axau.build());
                }
                this.a = axav;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
