package defpackage;

/* renamed from: akaw */
public final class akaw extends aoca {
    public axwa a;

    public akaw() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akaw)) {
            return false;
        }
        akaw akaw = (akaw) obj;
        axwa axwa = this.a;
        if (axwa == null) {
            if (akaw.a != null) {
                return false;
            }
        } else if (!axwa.equals(akaw.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akaw.unknownFieldData);
        }
        aocb aocb2 = akaw.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        axwa axwa = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (axwa != null ? axwa.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(55419609, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(55419609, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 443356874) {
                axwa axwa = (axwa) aobv.a(axwa.M.getParserForType());
                axwa axwa2 = this.a;
                if (axwa2 != null) {
                    axwd axwd = (axwd) ((anxo) axwa2.toBuilder());
                    axwd.mergeFrom(axwa);
                    axwa = (axwa) ((anxl) axwd.build());
                }
                this.a = axwa;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
