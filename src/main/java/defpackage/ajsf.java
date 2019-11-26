package defpackage;

/* renamed from: ajsf */
public final class ajsf extends aoca {
    public static volatile ajsf[] a;
    public ajse b;
    public awyw c;

    public ajsf() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajsf)) {
            return false;
        }
        ajsf ajsf = (ajsf) obj;
        ajse ajse = this.b;
        if (ajse == null) {
            if (ajsf.b != null) {
                return false;
            }
        } else if (!ajse.equals(ajsf.b)) {
            return false;
        }
        awyw awyw = this.c;
        if (awyw == null) {
            if (ajsf.c != null) {
                return false;
            }
        } else if (!awyw.equals(ajsf.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajsf.unknownFieldData);
        }
        aocb aocb2 = ajsf.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajse ajse = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajse != null ? ajse.hashCode() : 0;
        awyw awyw = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (awyw != null ? awyw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(48474525, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(151338912, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(48474525, aocf);
        }
        anze anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(151338912, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 387796202) {
                if (this.b == null) {
                    this.b = new ajse();
                }
                aobv.a(this.b);
            } else if (a == 1210711298) {
                awyw awyw = (awyw) aobv.a(awyw.k.getParserForType());
                awyw awyw2 = this.c;
                if (awyw2 != null) {
                    awyv awyv = (awyv) ((anxo) awyw2.toBuilder());
                    awyv.mergeFrom(awyw);
                    awyw = (awyw) ((anxl) awyv.build());
                }
                this.c = awyw;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
