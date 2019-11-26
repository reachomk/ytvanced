package defpackage;

import java.util.Arrays;

/* renamed from: ajyr */
public final class ajyr extends ajwo {
    public ajyp a;
    public awqo[] b;
    public ajzw c;
    public aojc d;
    public byte[] e;
    public String f;
    private ajzw g;

    public ajyr() {
        super(194442374);
        this.a = null;
        this.b = new awqo[0];
        this.c = null;
        this.e = aock.c;
        this.g = null;
        this.f = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyr) {
            ajyr ajyr = (ajyr) obj;
            ajyp ajyp = this.a;
            if (ajyp == null) {
                if (ajyr.a != null) {
                    return false;
                }
            } else if (!ajyp.equals(ajyr.a)) {
                return false;
            }
            if (aocd.a(this.b, ajyr.b)) {
                ajzw ajzw = this.c;
                if (ajzw == null) {
                    if (ajyr.c != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajyr.c)) {
                    return false;
                }
                aojc aojc = this.d;
                if (aojc == null) {
                    if (ajyr.d != null) {
                        return false;
                    }
                } else if (!aojc.equals(ajyr.d)) {
                    return false;
                }
                if (Arrays.equals(this.e, ajyr.e)) {
                    ajzw = this.g;
                    if (ajzw == null) {
                        if (ajyr.g != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajyr.g)) {
                        return false;
                    }
                    String str = this.f;
                    if (str == null) {
                        if (ajyr.f != null) {
                            return false;
                        }
                    } else if (!str.equals(ajyr.f)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajyr.unknownFieldData);
                    }
                    aocb aocb2 = ajyr.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajyp ajyp = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajyp != null ? ajyp.hashCode() : 0;
        int a = aocd.a(this.b);
        ajzw ajzw = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        aojc aojc = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aojc != null ? aojc.hashCode() : 0;
        a = Arrays.hashCode(this.e);
        ajzw = this.g;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
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
        anze anze2 = this.d;
        if (anze2 != null) {
            aoby.a(4, anze2);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(6, this.e);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        String str = this.f;
        if (!(str == null || str.equals(""))) {
            aoby.a(8, this.f);
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
        anze anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(4, anze2);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(6, this.e);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        String str = this.f;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(8, this.f);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajyp();
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
            } else if (a == 34) {
                aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                aojc aojc2 = this.d;
                if (aojc2 != null) {
                    aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                    aojf.mergeFrom(aojc);
                    aojc = (aojc) ((anxl) aojf.build());
                }
                this.d = aojc;
            } else if (a == 50) {
                this.e = aobv.e();
            } else if (a == 58) {
                if (this.g == null) {
                    this.g = new ajzw();
                }
                aobv.a(this.g);
            } else if (a == 66) {
                this.f = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
