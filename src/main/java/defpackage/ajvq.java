package defpackage;

import java.util.Arrays;

/* renamed from: ajvq */
public final class ajvq extends aoca {
    public akam a;
    public byte[] b;
    private apxu[] c;
    public arnm frameworkUpdates;

    public ajvq() {
        this.a = null;
        this.b = aock.c;
        this.c = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvq) {
            ajvq ajvq = (ajvq) obj;
            akam akam = this.a;
            if (akam == null) {
                if (ajvq.a != null) {
                    return false;
                }
            } else if (!akam.equals(ajvq.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajvq.b) && aocd.a(this.c, ajvq.c)) {
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (ajvq.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(ajvq.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvq.unknownFieldData);
                }
                aocb aocb2 = ajvq.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akam akam = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akam != null ? akam.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.b);
        int a = aocd.a(this.c);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
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
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(4, this.b);
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(6, anze);
                }
                i++;
            }
        }
        anze anze2 = this.frameworkUpdates;
        if (anze2 != null) {
            aoby.a(777, anze2);
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
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(4, this.b);
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(6, anze);
                }
                i++;
            }
        }
        anze anze2 = this.frameworkUpdates;
        return anze2 != null ? computeSerializedSize + anwm.c(777, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new akam();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                this.b = aobv.e();
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                apxu[] apxuArr = this.c;
                int length = apxuArr != null ? apxuArr.length : 0;
                apxu[] apxuArr2 = new apxu[(a + length)];
                if (length != 0) {
                    System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                }
                while (length < apxuArr2.length - 1) {
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    aobv.a();
                    length++;
                }
                apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                this.c = apxuArr2;
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
