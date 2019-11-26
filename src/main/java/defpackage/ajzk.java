package defpackage;

import java.util.Arrays;

/* renamed from: ajzk */
public final class ajzk extends ajwo implements ajyl {
    public ajzw a;
    public apxu[] b;
    public byte[] c;
    public aojc d;
    public String e;
    private boolean f;

    public ajzk() {
        super(166487981);
        this.a = null;
        this.b = new apxu[0];
        this.c = aock.c;
        this.e = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzk) {
            ajzk ajzk = (ajzk) obj;
            ajzw ajzw = this.a;
            if (ajzw == null) {
                if (ajzk.a != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajzk.a)) {
                return false;
            }
            if (aocd.a(this.b, ajzk.b) && Arrays.equals(this.c, ajzk.c)) {
                aojc aojc = this.d;
                if (aojc == null) {
                    if (ajzk.d != null) {
                        return false;
                    }
                } else if (!aojc.equals(ajzk.d)) {
                    return false;
                }
                String str = this.e;
                if (str == null) {
                    if (ajzk.e != null) {
                        return false;
                    }
                } else if (!str.equals(ajzk.e)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajzk.unknownFieldData);
                }
                aocb aocb2 = ajzk.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzw ajzw = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        int a = aocd.a(this.b);
        int hashCode3 = Arrays.hashCode(this.c);
        aojc aojc = this.d;
        hashCode = (((((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
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
        apxu[] apxuArr = this.b;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        anze anze2 = this.d;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        String str = this.e;
        if (!(str == null || str.equals(""))) {
            aoby.a(6, this.e);
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
        apxu[] apxuArr = this.b;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(2, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        anze anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        String str = this.e;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(6, this.e);
    }

    public final boolean a() {
        return this.f;
    }

    public final void b() {
        this.f = true;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajzw();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                a = aock.a(aobv, 18);
                apxu[] apxuArr = this.b;
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
                this.b = apxuArr2;
            } else if (a == 34) {
                this.c = aobv.e();
            } else if (a == 42) {
                aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                aojc aojc2 = this.d;
                if (aojc2 != null) {
                    aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                    aojf.mergeFrom(aojc);
                    aojc = (aojc) ((anxl) aojf.build());
                }
                this.d = aojc;
            } else if (a == 50) {
                this.e = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
