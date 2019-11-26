package defpackage;

/* renamed from: ajyd */
public final class ajyd extends aoca {
    public static volatile ajyd[] a;
    public ajyb b;
    public awkb c;

    public ajyd() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajyd)) {
            return false;
        }
        ajyd ajyd = (ajyd) obj;
        ajyb ajyb = this.b;
        if (ajyb == null) {
            if (ajyd.b != null) {
                return false;
            }
        } else if (!ajyb.equals(ajyd.b)) {
            return false;
        }
        awkb awkb = this.c;
        if (awkb == null) {
            if (ajyd.c != null) {
                return false;
            }
        } else if (!awkb.equals(ajyd.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajyd.unknownFieldData);
        }
        aocb aocb2 = ajyd.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajyb ajyb = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajyb != null ? ajyb.hashCode() : 0;
        awkb awkb = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (awkb != null ? awkb.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(91347533, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(91613400, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(91347533, aocf);
        }
        anze anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(91613400, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 730780266) {
                if (this.b == null) {
                    this.b = new ajyb();
                }
                aobv.a(this.b);
            } else if (a == 732907202) {
                awkb awkb = (awkb) aobv.a(awkb.p.getParserForType());
                awkb awkb2 = this.c;
                if (awkb2 != null) {
                    awka awka = (awka) ((anxo) awkb2.toBuilder());
                    awka.mergeFrom(awkb);
                    awkb = (awkb) ((anxl) awka.build());
                }
                this.c = awkb;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
