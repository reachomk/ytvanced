package defpackage;

import java.util.Arrays;

/* renamed from: ajvp */
public final class ajvp extends aoca {
    public ajtk a;
    public ajvs b;
    public apxu c;
    public apxu[] d;
    public byte[] e;
    public asdm f;

    public ajvp() {
        this.a = null;
        this.b = null;
        this.d = new apxu[0];
        this.e = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvp) {
            ajvp ajvp = (ajvp) obj;
            ajtk ajtk = this.a;
            if (ajtk == null) {
                if (ajvp.a != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajvp.a)) {
                return false;
            }
            ajvs ajvs = this.b;
            if (ajvs == null) {
                if (ajvp.b != null) {
                    return false;
                }
            } else if (!ajvs.equals(ajvp.b)) {
                return false;
            }
            apxu apxu = this.c;
            if (apxu == null) {
                if (ajvp.c != null) {
                    return false;
                }
            } else if (!apxu.equals(ajvp.c)) {
                return false;
            }
            if (aocd.a(this.d, ajvp.d) && Arrays.equals(this.e, ajvp.e)) {
                asdm asdm = this.f;
                if (asdm == null) {
                    if (ajvp.f != null) {
                        return false;
                    }
                } else if (!asdm.equals(ajvp.f)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvp.unknownFieldData);
                }
                aocb aocb2 = ajvp.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtk ajtk = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajtk != null ? ajtk.hashCode() : 0;
        ajvs ajvs = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajvs != null ? ajvs.hashCode() : 0;
        apxu apxu = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.d);
        int hashCode3 = Arrays.hashCode(this.e);
        asdm asdm = this.f;
        hashCode = (((((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31) + (asdm != null ? asdm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(7, anze);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(8, anze2);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(9, this.e);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(11, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(8, anze2);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(9, this.e);
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(11, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 34) {
                if (this.a == null) {
                    this.a = new ajtk();
                }
                aobv.a(this.a);
            } else if (a == 50) {
                if (this.b == null) {
                    this.b = new ajvs();
                }
                aobv.a(this.b);
            } else if (a == 58) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.c;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.c = apxu;
            } else if (a == 66) {
                a = aock.a(aobv, 66);
                apxu[] apxuArr = this.d;
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
                this.d = apxuArr2;
            } else if (a == 74) {
                this.e = aobv.e();
            } else if (a == 90) {
                asdm asdm = (asdm) aobv.a(asdm.c.getParserForType());
                asdm asdm2 = this.f;
                if (asdm2 != null) {
                    asdp asdp = (asdp) ((anxo) asdm2.toBuilder());
                    asdp.mergeFrom(asdm);
                    asdm = (asdm) ((anxl) asdp.build());
                }
                this.f = asdm;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
