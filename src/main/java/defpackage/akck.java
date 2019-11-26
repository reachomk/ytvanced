package defpackage;

/* renamed from: akck */
public final class akck extends aoca {
    public avoz a;

    public akck() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akck)) {
            return false;
        }
        akck akck = (akck) obj;
        avoz avoz = this.a;
        if (avoz == null) {
            if (akck.a != null) {
                return false;
            }
        } else if (!avoz.equals(akck.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akck.unknownFieldData);
        }
        aocb aocb2 = akck.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        avoz avoz = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (avoz != null ? avoz.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(131899791, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(131899791, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 1055198330) {
                avoz avoz = (avoz) aobv.a(avoz.m.getParserForType());
                avoz avoz2 = this.a;
                if (avoz2 != null) {
                    avoy avoy = (avoy) ((anxo) avoz2.toBuilder());
                    avoy.mergeFrom(avoz);
                    avoz = (avoz) ((anxl) avoy.build());
                }
                this.a = avoz;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
