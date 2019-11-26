package defpackage;

/* renamed from: akbq */
public final class akbq extends aoca {
    public static volatile akbq[] a;
    public ayuh b;

    public akbq() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akbq)) {
            return false;
        }
        akbq akbq = (akbq) obj;
        ayuh ayuh = this.b;
        if (ayuh == null) {
            if (akbq.b != null) {
                return false;
            }
        } else if (!ayuh.equals(akbq.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akbq.unknownFieldData);
        }
        aocb aocb2 = akbq.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ayuh ayuh = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ayuh != null ? ayuh.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(64128279, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        return anze != null ? computeSerializedSize + anwm.c(64128279, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 513026234) {
                ayuh ayuh = (ayuh) aobv.a(ayuh.e.getParserForType());
                ayuh ayuh2 = this.b;
                if (ayuh2 != null) {
                    ayuk ayuk = (ayuk) ((anxo) ayuh2.toBuilder());
                    ayuk.mergeFrom(ayuh);
                    ayuh = (ayuh) ((anxl) ayuk.build());
                }
                this.b = ayuh;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
