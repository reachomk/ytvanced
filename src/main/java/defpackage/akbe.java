package defpackage;

/* renamed from: akbe */
public final class akbe extends aoca {
    private static volatile akbe[] b;
    public akbg a;

    public static akbe[] a() {
        if (b == null) {
            synchronized (aocd.b) {
                if (b == null) {
                    b = new akbe[0];
                }
            }
        }
        return b;
    }

    public akbe() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akbe)) {
            return false;
        }
        akbe akbe = (akbe) obj;
        akbg akbg = this.a;
        if (akbg == null) {
            if (akbe.a != null) {
                return false;
            }
        } else if (!akbg.equals(akbe.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akbe.unknownFieldData);
        }
        aocb aocb2 = akbe.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akbg akbg = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (akbg != null ? akbg.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(46637760, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(46637760, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 373102082) {
                if (this.a == null) {
                    this.a = new akbg();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
