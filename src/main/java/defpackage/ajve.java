package defpackage;

import java.util.Arrays;

/* renamed from: ajve */
public final class ajve extends aoca {
    public ajtr a;
    public azbh b;
    public ajtk c;
    public byte[] d;
    private apxu[] e;

    public ajve() {
        this.a = null;
        this.c = null;
        this.d = aock.c;
        this.e = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajve) {
            ajve ajve = (ajve) obj;
            ajtr ajtr = this.a;
            if (ajtr == null) {
                if (ajve.a != null) {
                    return false;
                }
            } else if (!ajtr.equals(ajve.a)) {
                return false;
            }
            azbh azbh = this.b;
            if (azbh == null) {
                if (ajve.b != null) {
                    return false;
                }
            } else if (!azbh.equals(ajve.b)) {
                return false;
            }
            ajtk ajtk = this.c;
            if (ajtk == null) {
                if (ajve.c != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajve.c)) {
                return false;
            }
            if (Arrays.equals(this.d, ajve.d) && aocd.a(this.e, ajve.e)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajve.unknownFieldData);
                }
                aocb aocb2 = ajve.unknownFieldData;
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
        ajtk ajtk = this.c;
        hashCode = (((((((hashCode + hashCode2) * 31) + (ajtk != null ? ajtk.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + aocd.a(this.e)) * 31;
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
        anze anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(6, this.d);
        }
        apxu[] apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(7, anze2);
                }
                i++;
            }
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
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(6, this.d);
        }
        apxu[] apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(7, anze2);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajtr();
                }
                aobv.a(this.a);
            } else if (a == 26) {
                azbh azbh = (azbh) aobv.a(azbh.c.getParserForType());
                azbh azbh2 = this.b;
                if (azbh2 != null) {
                    azbg azbg = (azbg) ((anxo) azbh2.toBuilder());
                    azbg.mergeFrom(azbh);
                    azbh = (azbh) ((anxl) azbg.build());
                }
                this.b = azbh;
            } else if (a == 34) {
                if (this.c == null) {
                    this.c = new ajtk();
                }
                aobv.a(this.c);
            } else if (a == 50) {
                this.d = aobv.e();
            } else if (a == 58) {
                a = aock.a(aobv, 58);
                apxu[] apxuArr = this.e;
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
                this.e = apxuArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
