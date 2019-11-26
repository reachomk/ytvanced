package defpackage;

import java.util.Arrays;

/* renamed from: ajyu */
public final class ajyu extends ajwo {
    public ajyp a;
    public ajyo b;
    public awqm[] c;
    public ajzw d;
    public byte[] e;
    public aojc f;
    public String g;
    private ajzw h;

    public ajyu() {
        super(157152263);
        this.a = null;
        this.b = null;
        this.c = new awqm[0];
        this.d = null;
        this.e = aock.c;
        this.h = null;
        this.g = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyu) {
            ajyu ajyu = (ajyu) obj;
            ajyp ajyp = this.a;
            if (ajyp == null) {
                if (ajyu.a != null) {
                    return false;
                }
            } else if (!ajyp.equals(ajyu.a)) {
                return false;
            }
            ajyo ajyo = this.b;
            if (ajyo == null) {
                if (ajyu.b != null) {
                    return false;
                }
            } else if (!ajyo.equals(ajyu.b)) {
                return false;
            }
            if (aocd.a(this.c, ajyu.c)) {
                ajzw ajzw = this.d;
                if (ajzw == null) {
                    if (ajyu.d != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajyu.d)) {
                    return false;
                }
                if (Arrays.equals(this.e, ajyu.e)) {
                    aojc aojc = this.f;
                    if (aojc == null) {
                        if (ajyu.f != null) {
                            return false;
                        }
                    } else if (!aojc.equals(ajyu.f)) {
                        return false;
                    }
                    ajzw = this.h;
                    if (ajzw == null) {
                        if (ajyu.h != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajyu.h)) {
                        return false;
                    }
                    String str = this.g;
                    if (str == null) {
                        if (ajyu.g != null) {
                            return false;
                        }
                    } else if (!str.equals(ajyu.g)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajyu.unknownFieldData);
                    }
                    aocb aocb2 = ajyu.unknownFieldData;
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
        ajyo ajyo = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajyo != null ? ajyo.hashCode() : 0;
        int a = aocd.a(this.c);
        ajzw ajzw = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        a = Arrays.hashCode(this.e);
        aojc aojc = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
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
        aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        awqm[] awqmArr = this.c;
        if (awqmArr != null && awqmArr.length > 0) {
            int i = 0;
            while (true) {
                awqm[] awqmArr2 = this.c;
                if (i >= awqmArr2.length) {
                    break;
                }
                anze anze = awqmArr2[i];
                if (anze != null) {
                    aoby.a(3, anze);
                }
                i++;
            }
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(6, this.e);
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
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        awqm[] awqmArr = this.c;
        if (awqmArr != null && awqmArr.length > 0) {
            int i = 0;
            while (true) {
                awqm[] awqmArr2 = this.c;
                if (i >= awqmArr2.length) {
                    break;
                }
                anze anze = awqmArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(3, anze);
                }
                i++;
            }
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(6, this.e);
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
                    this.a = new ajyp();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new ajyo();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                awqm[] awqmArr = this.c;
                int length = awqmArr != null ? awqmArr.length : 0;
                awqm[] awqmArr2 = new awqm[(a + length)];
                if (length != 0) {
                    System.arraycopy(awqmArr, 0, awqmArr2, 0, length);
                }
                while (length < awqmArr2.length - 1) {
                    awqmArr2[length] = (awqm) aobv.a(awqm.f.getParserForType());
                    aobv.a();
                    length++;
                }
                awqmArr2[length] = (awqm) aobv.a(awqm.f.getParserForType());
                this.c = awqmArr2;
            } else if (a == 34) {
                if (this.d == null) {
                    this.d = new ajzw();
                }
                aobv.a(this.d);
            } else if (a == 50) {
                this.e = aobv.e();
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
