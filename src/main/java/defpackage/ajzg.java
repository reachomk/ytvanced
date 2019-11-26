package defpackage;

import java.util.Arrays;

/* renamed from: ajzg */
public final class ajzg extends ajwo {
    public ajyq a;
    public awqo[] b;
    public ajzw c;
    public byte[] d;
    public boolean e;
    public aojc f;
    public String g;
    private ajzw h;

    public ajzg() {
        super(157152292);
        this.a = null;
        this.b = new awqo[0];
        this.c = null;
        this.d = aock.c;
        this.e = false;
        this.h = null;
        this.g = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzg) {
            ajzg ajzg = (ajzg) obj;
            ajyq ajyq = this.a;
            if (ajyq == null) {
                if (ajzg.a != null) {
                    return false;
                }
            } else if (!ajyq.equals(ajzg.a)) {
                return false;
            }
            if (aocd.a(this.b, ajzg.b)) {
                ajzw ajzw = this.c;
                if (ajzw == null) {
                    if (ajzg.c != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzg.c)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajzg.d) && this.e == ajzg.e) {
                    aojc aojc = this.f;
                    if (aojc == null) {
                        if (ajzg.f != null) {
                            return false;
                        }
                    } else if (!aojc.equals(ajzg.f)) {
                        return false;
                    }
                    ajzw = this.h;
                    if (ajzw == null) {
                        if (ajzg.h != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajzg.h)) {
                        return false;
                    }
                    String str = this.g;
                    if (str == null) {
                        if (ajzg.g != null) {
                            return false;
                        }
                    } else if (!str.equals(ajzg.g)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajzg.unknownFieldData);
                    }
                    aocb aocb2 = ajzg.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajyq ajyq = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajyq != null ? ajyq.hashCode() : 0;
        int a = aocd.a(this.b);
        ajzw ajzw = this.c;
        hashCode = (((((((hashCode + hashCode2) * 31) + a) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31;
        hashCode2 = !this.e ? 1237 : 1231;
        aojc aojc = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aojc != null ? aojc.hashCode() : 0;
        ajzw ajzw2 = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31;
        String str = this.g;
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
        if (this.e) {
            aoby.a(6, true);
        }
        anze anze2 = this.f;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        aocf = this.h;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        String str = this.g;
        if (!(str == null || str.equals(""))) {
            aoby.a(9, this.g);
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
        if (this.e) {
            computeSerializedSize += aoby.d(6);
        }
        anze anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        String str = this.g;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(9, this.g);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajyq();
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
            } else if (a == 48) {
                this.e = aobv.c();
            } else if (a == 58) {
                aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                aojc aojc2 = this.f;
                if (aojc2 != null) {
                    aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                    aojf.mergeFrom(aojc);
                    aojc = (aojc) ((anxl) aojf.build());
                }
                this.f = aojc;
            } else if (a == 66) {
                if (this.h == null) {
                    this.h = new ajzw();
                }
                aobv.a(this.h);
            } else if (a == 74) {
                this.g = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
