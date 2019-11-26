package defpackage;

/* renamed from: ajxz */
public final class ajxz extends aoca {
    public static volatile ajxz[] a;
    public ajyc b;
    public awjb c;
    public awjh d;

    public ajxz() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxz)) {
            return false;
        }
        ajxz ajxz = (ajxz) obj;
        ajyc ajyc = this.b;
        if (ajyc == null) {
            if (ajxz.b != null) {
                return false;
            }
        } else if (!ajyc.equals(ajxz.b)) {
            return false;
        }
        awjb awjb = this.c;
        if (awjb == null) {
            if (ajxz.c != null) {
                return false;
            }
        } else if (!awjb.equals(ajxz.c)) {
            return false;
        }
        awjh awjh = this.d;
        if (awjh == null) {
            if (ajxz.d != null) {
                return false;
            }
        } else if (!awjh.equals(ajxz.d)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxz.unknownFieldData);
        }
        aocb aocb2 = ajxz.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajyc ajyc = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajyc != null ? ajyc.hashCode() : 0;
        awjb awjb = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awjb != null ? awjb.hashCode() : 0;
        awjh awjh = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (awjh != null ? awjh.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(51779701, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(139406549, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(216407981, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(51779701, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(139406549, anze);
        }
        anze = this.d;
        return anze != null ? computeSerializedSize + anwm.c(216407981, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 414237610) {
                if (this.b == null) {
                    this.b = new ajyc();
                }
                aobv.a(this.b);
            } else if (a == 1115252394) {
                awjb awjb = (awjb) aobv.a(awjb.e.getParserForType());
                awjb awjb2 = this.c;
                if (awjb2 != null) {
                    awja awja = (awja) ((anxo) awjb2.toBuilder());
                    awja.mergeFrom(awjb);
                    awjb = (awjb) ((anxl) awja.build());
                }
                this.c = awjb;
            } else if (a == 1731263850) {
                awjh awjh = (awjh) aobv.a(awjh.f.getParserForType());
                awjh awjh2 = this.d;
                if (awjh2 != null) {
                    awjg awjg = (awjg) ((anxo) awjh2.toBuilder());
                    awjg.mergeFrom(awjh);
                    awjh = (awjh) ((anxl) awjg.build());
                }
                this.d = awjh;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
