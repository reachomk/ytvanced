package defpackage;

import java.util.Arrays;

/* renamed from: ajvl */
public final class ajvl extends aoca {
    public ajxq a;
    public long b;
    public arml c;
    public arml d;
    public byte[] e;

    public ajvl() {
        this.a = null;
        this.b = 0;
        this.e = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvl) {
            ajvl ajvl = (ajvl) obj;
            ajxq ajxq = this.a;
            if (ajxq == null) {
                if (ajvl.a != null) {
                    return false;
                }
            } else if (!ajxq.equals(ajvl.a)) {
                return false;
            }
            if (this.b == ajvl.b) {
                arml arml = this.c;
                if (arml == null) {
                    if (ajvl.c != null) {
                        return false;
                    }
                } else if (!arml.equals(ajvl.c)) {
                    return false;
                }
                arml = this.d;
                if (arml == null) {
                    if (ajvl.d != null) {
                        return false;
                    }
                } else if (!arml.equals(ajvl.d)) {
                    return false;
                }
                if (Arrays.equals(this.e, ajvl.e)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajvl.unknownFieldData);
                    }
                    aocb aocb2 = ajvl.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajxq ajxq = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajxq != null ? ajxq.hashCode() : 0;
        long j = this.b;
        arml arml = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31) + Arrays.hashCode(this.e)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        long j = this.b;
        if (j != 0) {
            aoby.b(3, j);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(6, anze);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(8, this.e);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        long j = this.b;
        if (j != 0) {
            computeSerializedSize += aoby.d(3, j);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        return !Arrays.equals(this.e, aock.c) ? computeSerializedSize + aoby.b(8, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajxq();
                }
                aobv.a(this.a);
            } else if (a == 24) {
                this.b = aobv.g();
            } else if (a == 42) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.c;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.c = arml;
            } else if (a == 50) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.d;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.d = arml;
            } else if (a == 66) {
                this.e = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
