package defpackage;

/* renamed from: ajyi */
public final class ajyi extends aoca {
    public static volatile ajyi[] a;
    public awlq b;
    public aqqg c;
    public ajzl d;

    public ajyi() {
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajyi)) {
            return false;
        }
        ajyi ajyi = (ajyi) obj;
        awlq awlq = this.b;
        if (awlq == null) {
            if (ajyi.b != null) {
                return false;
            }
        } else if (!awlq.equals(ajyi.b)) {
            return false;
        }
        aqqg aqqg = this.c;
        if (aqqg == null) {
            if (ajyi.c != null) {
                return false;
            }
        } else if (!aqqg.equals(ajyi.c)) {
            return false;
        }
        ajzl ajzl = this.d;
        if (ajzl == null) {
            if (ajyi.d != null) {
                return false;
            }
        } else if (!ajzl.equals(ajyi.d)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajyi.unknownFieldData);
        }
        aocb aocb2 = ajyi.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        awlq awlq = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = awlq != null ? awlq.hashCode() : 0;
        aqqg aqqg = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqqg != null ? aqqg.hashCode() : 0;
        ajzl ajzl = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzl != null ? ajzl.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(53330184, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(98817457, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(154471660, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(53330184, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(98817457, anze);
        }
        aocf aocf = this.d;
        return aocf != null ? computeSerializedSize + aoby.b(154471660, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 426641474) {
                awlq awlq = (awlq) aobv.a(awlq.C.getParserForType());
                awlq awlq2 = this.b;
                if (awlq2 != null) {
                    awlt awlt = (awlt) ((anxo) awlq2.toBuilder());
                    awlt.mergeFrom(awlq);
                    awlq = (awlq) ((anxl) awlt.build());
                }
                this.b = awlq;
            } else if (a == 790539658) {
                aqqg aqqg = (aqqg) aobv.a(aqqg.d.getParserForType());
                aqqg aqqg2 = this.c;
                if (aqqg2 != null) {
                    aqqi aqqi = (aqqi) ((anxo) aqqg2.toBuilder());
                    aqqi.mergeFrom(aqqg);
                    aqqg = (aqqg) ((anxl) aqqi.build());
                }
                this.c = aqqg;
            } else if (a == 1235773282) {
                if (this.d == null) {
                    this.d = new ajzl();
                }
                aobv.a(this.d);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
