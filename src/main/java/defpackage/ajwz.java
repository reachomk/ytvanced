package defpackage;

/* renamed from: ajwz */
public final class ajwz extends aoca {
    public ajxa a;
    private auwl b;

    public ajwz() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajwz)) {
            return false;
        }
        ajwz ajwz = (ajwz) obj;
        auwl auwl = this.b;
        if (auwl == null) {
            if (ajwz.b != null) {
                return false;
            }
        } else if (!auwl.equals(ajwz.b)) {
            return false;
        }
        ajxa ajxa = this.a;
        if (ajxa == null) {
            if (ajwz.a != null) {
                return false;
            }
        } else if (!ajxa.equals(ajwz.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajwz.unknownFieldData);
        }
        aocb aocb2 = ajwz.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        auwl auwl = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = auwl != null ? auwl.hashCode() : 0;
        ajxa ajxa = this.a;
        hashCode = (((hashCode + hashCode2) * 31) + (ajxa != null ? ajxa.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(58508690, anze);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(117294427, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(58508690, anze);
        }
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(117294427, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 468069522) {
                auwl auwl = (auwl) aobv.a(auwl.i.getParserForType());
                auwl auwl2 = this.b;
                if (auwl2 != null) {
                    auwk auwk = (auwk) ((anxo) auwl2.toBuilder());
                    auwk.mergeFrom(auwl);
                    auwl = (auwl) ((anxl) auwk.build());
                }
                this.b = auwl;
            } else if (a == 938355418) {
                if (this.a == null) {
                    this.a = new ajxa();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
