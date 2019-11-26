package defpackage;

/* renamed from: akau */
public final class akau extends aoca {
    public ajud a;

    public akau() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akau)) {
            return false;
        }
        akau akau = (akau) obj;
        ajud ajud = this.a;
        if (ajud == null) {
            if (akau.a != null) {
                return false;
            }
        } else if (!ajud.equals(akau.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akau.unknownFieldData);
        }
        aocb aocb2 = akau.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajud ajud = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajud != null ? ajud.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(80162164, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(80162164, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 641297314) {
                if (this.a == null) {
                    this.a = new ajud();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
