package defpackage;

import java.util.Arrays;

/* renamed from: ajzb */
public final class ajzb extends ajwo {
    public ajzc a;
    public awqo[] b;
    public ajzw c;
    public byte[] d;
    public aojc e;
    public String f;

    public ajzb() {
        super(175608736);
        this.a = null;
        this.b = new awqo[0];
        this.c = null;
        this.d = aock.c;
        this.f = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzb) {
            ajzb ajzb = (ajzb) obj;
            ajzc ajzc = this.a;
            if (ajzc == null) {
                if (ajzb.a != null) {
                    return false;
                }
            } else if (!ajzc.equals(ajzb.a)) {
                return false;
            }
            if (aocd.a(this.b, ajzb.b)) {
                ajzw ajzw = this.c;
                if (ajzw == null) {
                    if (ajzb.c != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzb.c)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajzb.d)) {
                    aojc aojc = this.e;
                    if (aojc == null) {
                        if (ajzb.e != null) {
                            return false;
                        }
                    } else if (!aojc.equals(ajzb.e)) {
                        return false;
                    }
                    String str = this.f;
                    if (str == null) {
                        if (ajzb.f != null) {
                            return false;
                        }
                    } else if (!str.equals(ajzb.f)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajzb.unknownFieldData);
                    }
                    aocb aocb2 = ajzb.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzc ajzc = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajzc != null ? ajzc.hashCode() : 0;
        int a = aocd.a(this.b);
        ajzw ajzw = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        a = Arrays.hashCode(this.d);
        aojc aojc = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        String str = this.f;
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
        awqo[] awqoArr = this.b;
        if (awqoArr != null && awqoArr.length > 0) {
            int i = 0;
            while (true) {
                awqo[] awqoArr2 = this.b;
                if (i >= awqoArr2.length) {
                    break;
                }
                anze anze = awqoArr2[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(5, this.d);
        }
        anze anze2 = this.e;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        String str = this.f;
        if (!(str == null || str.equals(""))) {
            aoby.a(7, this.f);
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
        awqo[] awqoArr = this.b;
        if (awqoArr != null && awqoArr.length > 0) {
            int i = 0;
            while (true) {
                awqo[] awqoArr2 = this.b;
                if (i >= awqoArr2.length) {
                    break;
                }
                anze anze = awqoArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(2, anze);
                }
                i++;
            }
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(5, this.d);
        }
        anze anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        String str = this.f;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(7, this.f);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajzc();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                a = aock.a(aobv, 18);
                awqo[] awqoArr = this.b;
                int length = awqoArr != null ? awqoArr.length : 0;
                awqo[] awqoArr2 = new awqo[(a + length)];
                if (length != 0) {
                    System.arraycopy(awqoArr, 0, awqoArr2, 0, length);
                }
                while (length < awqoArr2.length - 1) {
                    awqoArr2[length] = (awqo) aobv.a(awqo.e.getParserForType());
                    aobv.a();
                    length++;
                }
                awqoArr2[length] = (awqo) aobv.a(awqo.e.getParserForType());
                this.b = awqoArr2;
            } else if (a == 26) {
                if (this.c == null) {
                    this.c = new ajzw();
                }
                aobv.a(this.c);
            } else if (a == 42) {
                this.d = aobv.e();
            } else if (a == 50) {
                aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                aojc aojc2 = this.e;
                if (aojc2 != null) {
                    aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                    aojf.mergeFrom(aojc);
                    aojc = (aojc) ((anxl) aojf.build());
                }
                this.e = aojc;
            } else if (a == 58) {
                this.f = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
