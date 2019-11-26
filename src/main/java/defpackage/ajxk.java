package defpackage;

/* renamed from: ajxk */
public final class ajxk extends aoca {
    public static volatile ajxk[] a;
    public avdt b;

    public ajxk() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxk)) {
            return false;
        }
        ajxk ajxk = (ajxk) obj;
        avdt avdt = this.b;
        if (avdt == null) {
            if (ajxk.b != null) {
                return false;
            }
        } else if (!avdt.equals(ajxk.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxk.unknownFieldData);
        }
        aocb aocb2 = ajxk.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        avdt avdt = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (avdt != null ? avdt.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(122175950, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        return anze != null ? computeSerializedSize + anwm.c(122175950, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 977407602) {
                avdt avdt = (avdt) aobv.a(avdt.b.getParserForType());
                avdt avdt2 = this.b;
                if (avdt2 != null) {
                    avdw avdw = (avdw) ((anxo) avdt2.toBuilder());
                    avdw.mergeFrom(avdt);
                    avdt = (avdt) ((anxl) avdw.build());
                }
                this.b = avdt;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
