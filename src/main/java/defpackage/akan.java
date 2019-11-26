package defpackage;

/* renamed from: akan */
public final class akan extends aoca {
    public ajwd a;
    public ajvy b;
    public akbp c;

    public akan() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akan)) {
            return false;
        }
        akan akan = (akan) obj;
        ajwd ajwd = this.a;
        if (ajwd == null) {
            if (akan.a != null) {
                return false;
            }
        } else if (!ajwd.equals(akan.a)) {
            return false;
        }
        ajvy ajvy = this.b;
        if (ajvy == null) {
            if (akan.b != null) {
                return false;
            }
        } else if (!ajvy.equals(akan.b)) {
            return false;
        }
        akbp akbp = this.c;
        if (akbp == null) {
            if (akan.c != null) {
                return false;
            }
        } else if (!akbp.equals(akan.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akan.unknownFieldData);
        }
        aocb aocb2 = akan.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwd ajwd = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajwd != null ? ajwd.hashCode() : 0;
        ajvy ajvy = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajvy != null ? ajvy.hashCode() : 0;
        akbp akbp = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (akbp != null ? akbp.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(51431404, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(51805506, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(57988071, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(51431404, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(51805506, aocf);
        }
        aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(57988071, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 411451234) {
                if (this.a == null) {
                    this.a = new ajwd();
                }
                aobv.a(this.a);
            } else if (a == 414444050) {
                if (this.b == null) {
                    this.b = new ajvy();
                }
                aobv.a(this.b);
            } else if (a == 463904570) {
                if (this.c == null) {
                    this.c = new akbp();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
