package defpackage;

import java.util.Arrays;

/* renamed from: akal */
public final class akal extends ajwo {
    public ajtr a;
    public azbh b;
    public apxu c;
    private byte[] d;

    public akal() {
        super(101423018);
        this.a = null;
        this.d = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akal) {
            akal akal = (akal) obj;
            ajtr ajtr = this.a;
            if (ajtr == null) {
                if (akal.a != null) {
                    return false;
                }
            } else if (!ajtr.equals(akal.a)) {
                return false;
            }
            azbh azbh = this.b;
            if (azbh == null) {
                if (akal.b != null) {
                    return false;
                }
            } else if (!azbh.equals(akal.b)) {
                return false;
            }
            if (Arrays.equals(this.d, akal.d)) {
                apxu apxu = this.c;
                if (apxu == null) {
                    if (akal.c != null) {
                        return false;
                    }
                } else if (!apxu.equals(akal.c)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akal.unknownFieldData);
                }
                aocb aocb2 = akal.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtr ajtr = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajtr != null ? ajtr.hashCode() : 0;
        azbh azbh = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azbh != null ? azbh.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.d);
        apxu apxu = this.c;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(4, this.d);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(4, this.d);
        }
        anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(5, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajtr();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                azbh azbh = (azbh) aobv.a(azbh.c.getParserForType());
                azbh azbh2 = this.b;
                if (azbh2 != null) {
                    azbg azbg = (azbg) ((anxo) azbh2.toBuilder());
                    azbg.mergeFrom(azbh);
                    azbh = (azbh) ((anxl) azbg.build());
                }
                this.b = azbh;
            } else if (a == 34) {
                this.d = aobv.e();
            } else if (a == 42) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.c;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.c = apxu;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
