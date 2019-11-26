package defpackage;

import java.util.Arrays;

/* renamed from: akcf */
public final class akcf extends aoca {
    public ajyh a;
    public atqm b;
    public byte[] c;
    public apxu[] d;
    private ajua e;
    private String[] f;

    public akcf() {
        this.a = null;
        this.e = null;
        this.c = aock.c;
        this.d = new apxu[0];
        this.f = aock.b;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcf) {
            akcf akcf = (akcf) obj;
            ajyh ajyh = this.a;
            if (ajyh == null) {
                if (akcf.a != null) {
                    return false;
                }
            } else if (!ajyh.equals(akcf.a)) {
                return false;
            }
            ajua ajua = this.e;
            if (ajua == null) {
                if (akcf.e != null) {
                    return false;
                }
            } else if (!ajua.equals(akcf.e)) {
                return false;
            }
            atqm atqm = this.b;
            if (atqm == null) {
                if (akcf.b != null) {
                    return false;
                }
            } else if (!atqm.equals(akcf.b)) {
                return false;
            }
            if (Arrays.equals(this.c, akcf.c) && aocd.a(this.d, akcf.d) && aocd.a(this.f, akcf.f)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akcf.unknownFieldData);
                }
                aocb aocb2 = akcf.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajyh ajyh = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajyh != null ? ajyh.hashCode() : 0;
        ajua ajua = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajua != null ? ajua.hashCode() : 0;
        atqm atqm = this.b;
        hashCode = (((((((((hashCode + hashCode2) * 31) + (atqm != null ? atqm.hashCode() : 0)) * 31) + Arrays.hashCode(this.c)) * 31) + aocd.a(this.d)) * 31) + aocd.a(this.f)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(5, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(6, this.c);
        }
        apxu[] apxuArr = this.d;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i2];
                if (anze2 != null) {
                    aoby.a(7, anze2);
                }
                i2++;
            }
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.f;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                if (str != null) {
                    aoby.a(9, str);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(6, this.c);
        }
        apxu[] apxuArr = this.d;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(7, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String[] strArr = this.f;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        i = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f;
            if (i2 >= strArr2.length) {
                return (computeSerializedSize + i) + i3;
            }
            String str = strArr2[i2];
            if (str != null) {
                i3++;
                i += aoby.b(str);
            }
            i2++;
        }
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new ajyh();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                if (this.e == null) {
                    this.e = new ajua();
                }
                aobv.a(this.e);
            } else if (a == 42) {
                atqm atqm = (atqm) aobv.a(atqm.c.getParserForType());
                atqm atqm2 = this.b;
                if (atqm2 != null) {
                    atql atql = (atql) ((anxo) atqm2.toBuilder());
                    atql.mergeFrom(atqm);
                    atqm = (atqm) ((anxl) atql.build());
                }
                this.b = atqm;
            } else if (a == 50) {
                this.c = aobv.e();
            } else if (a == 58) {
                a = aock.a(aobv, 58);
                apxu[] apxuArr = this.d;
                length = apxuArr != null ? apxuArr.length : 0;
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
                a = aock.a(aobv, 74);
                String[] strArr = this.f;
                length = strArr != null ? strArr.length : 0;
                String[] strArr2 = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = aobv.d();
                    aobv.a();
                    length++;
                }
                strArr2[length] = aobv.d();
                this.f = strArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
