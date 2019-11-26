package defpackage;

import java.util.Arrays;

/* renamed from: ajyj */
public final class ajyj extends ajwo {
    public ajym a;
    public awqo[] b;
    public aojc c;
    public byte[] d;
    public String e;

    public ajyj() {
        super(196922251);
        this.a = null;
        this.b = new awqo[0];
        this.d = aock.c;
        this.e = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyj) {
            ajyj ajyj = (ajyj) obj;
            ajym ajym = this.a;
            if (ajym == null) {
                if (ajyj.a != null) {
                    return false;
                }
            } else if (!ajym.equals(ajyj.a)) {
                return false;
            }
            if (aocd.a(this.b, ajyj.b)) {
                aojc aojc = this.c;
                if (aojc == null) {
                    if (ajyj.c != null) {
                        return false;
                    }
                } else if (!aojc.equals(ajyj.c)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajyj.d)) {
                    String str = this.e;
                    if (str == null) {
                        if (ajyj.e != null) {
                            return false;
                        }
                    } else if (!str.equals(ajyj.e)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajyj.unknownFieldData);
                    }
                    aocb aocb2 = ajyj.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajym ajym = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajym != null ? ajym.hashCode() : 0;
        int a = aocd.a(this.b);
        aojc aojc = this.c;
        hashCode = (((((((hashCode + hashCode2) * 31) + a) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31;
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
        anze anze2 = this.c;
        if (anze2 != null) {
            aoby.a(3, anze2);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(5, this.d);
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
        anze anze2 = this.c;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(3, anze2);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(5, this.d);
        }
        String str = this.e;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(6, this.e);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajym();
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
                aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                aojc aojc2 = this.c;
                if (aojc2 != null) {
                    aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                    aojf.mergeFrom(aojc);
                    aojc = (aojc) ((anxl) aojf.build());
                }
                this.c = aojc;
            } else if (a == 42) {
                this.d = aobv.e();
            } else if (a == 50) {
                this.e = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
