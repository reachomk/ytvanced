package defpackage;

import java.util.Arrays;

/* renamed from: ajvr */
public final class ajvr extends aoca {
    public asrx a;
    public ajtk b;
    public byte[] c;
    public arnm frameworkUpdates;

    public ajvr() {
        this.b = null;
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvr) {
            ajvr ajvr = (ajvr) obj;
            asrx asrx = this.a;
            if (asrx == null) {
                if (ajvr.a != null) {
                    return false;
                }
            } else if (!asrx.equals(ajvr.a)) {
                return false;
            }
            ajtk ajtk = this.b;
            if (ajtk == null) {
                if (ajvr.b != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajvr.b)) {
                return false;
            }
            if (Arrays.equals(this.c, ajvr.c)) {
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (ajvr.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(ajvr.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvr.unknownFieldData);
                }
                aocb aocb2 = ajvr.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        asrx asrx = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = asrx != null ? asrx.hashCode() : 0;
        ajtk ajtk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtk != null ? ajtk.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.c);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        anze = this.frameworkUpdates;
        if (anze != null) {
            aoby.a(777, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                asrx asrx = (asrx) aobv.a(asrx.c.getParserForType());
                asrx asrx2 = this.a;
                if (asrx2 != null) {
                    assa assa = (assa) ((anxo) asrx2.toBuilder());
                    assa.mergeFrom(asrx);
                    asrx = (asrx) ((anxl) assa.build());
                }
                this.a = asrx;
            } else if (a == 26) {
                if (this.b == null) {
                    this.b = new ajtk();
                }
                aobv.a(this.b);
            } else if (a == 34) {
                this.c = aobv.e();
            } else if (a == 6218) {
                arnm arnm = (arnm) aobv.a(arnm.a.getParserForType());
                arnm arnm2 = this.frameworkUpdates;
                if (arnm2 != null) {
                    arnl arnl = (arnl) ((anxo) arnm2.toBuilder());
                    arnl.mergeFrom(arnm);
                    arnm = (arnm) ((anxl) arnl.build());
                }
                this.frameworkUpdates = arnm;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
