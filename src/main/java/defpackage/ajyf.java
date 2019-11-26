package defpackage;

import java.util.Arrays;

/* renamed from: ajyf */
public final class ajyf extends ajwo {
    public static final aobz a = aobz.a(ajyf.class, 437448482);
    public ajyi[] b;
    public String c;
    public awlg[] d;
    public boolean e;
    private boolean f;
    private byte[] g;

    public ajyf() {
        super(54681060);
        if (ajyi.a == null) {
            synchronized (aocd.b) {
                if (ajyi.a == null) {
                    ajyi.a = new ajyi[0];
                }
            }
        }
        this.b = ajyi.a;
        this.c = "";
        this.f = false;
        this.d = new awlg[0];
        this.e = false;
        this.g = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyf) {
            ajyf ajyf = (ajyf) obj;
            if (aocd.a(this.b, ajyf.b)) {
                String str = this.c;
                if (str == null) {
                    if (ajyf.c != null) {
                        return false;
                    }
                } else if (!str.equals(ajyf.c)) {
                    return false;
                }
                if (this.f == ajyf.f && aocd.a(this.d, ajyf.d) && this.e == ajyf.e && Arrays.equals(this.g, ajyf.g)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajyf.unknownFieldData);
                    }
                    aocb aocb2 = ajyf.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.b)) * 31;
        String str = this.c;
        int i = 0;
        int i2 = 1237;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.f ? 1237 : 1231)) * 31) + aocd.a(this.d)) * 31;
        if (this.e) {
            i2 = 1231;
        }
        hashCode = (((hashCode + i2) * 31) + Arrays.hashCode(this.g)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        ajyi[] ajyiArr = this.b;
        int i = 0;
        if (ajyiArr != null && ajyiArr.length > 0) {
            int i2 = 0;
            while (true) {
                ajyi[] ajyiArr2 = this.b;
                if (i2 >= ajyiArr2.length) {
                    break;
                }
                aocf aocf = ajyiArr2[i2];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i2++;
            }
        }
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            aoby.a(2, this.c);
        }
        if (this.f) {
            aoby.a(3, true);
        }
        awlg[] awlgArr = this.d;
        if (awlgArr != null && awlgArr.length > 0) {
            while (true) {
                awlgArr = this.d;
                if (i >= awlgArr.length) {
                    break;
                }
                anze anze = awlgArr[i];
                if (anze != null) {
                    aoby.a(4, anze);
                }
                i++;
            }
        }
        if (this.e) {
            aoby.a(5, true);
        }
        if (!Arrays.equals(this.g, aock.c)) {
            aoby.a(9, this.g);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ajyi[] ajyiArr = this.b;
        int i = 0;
        if (ajyiArr != null && ajyiArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajyi[] ajyiArr2 = this.b;
                if (computeSerializedSize >= ajyiArr2.length) {
                    break;
                }
                aocf aocf = ajyiArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(2, this.c);
        }
        if (this.f) {
            computeSerializedSize += aoby.d(3);
        }
        awlg[] awlgArr = this.d;
        if (awlgArr != null && awlgArr.length > 0) {
            while (true) {
                awlgArr = this.d;
                if (i >= awlgArr.length) {
                    break;
                }
                anze anze = awlgArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(4, anze);
                }
                i++;
            }
        }
        if (this.e) {
            computeSerializedSize += aoby.d(5);
        }
        return !Arrays.equals(this.g, aock.c) ? computeSerializedSize + aoby.b(9, this.g) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf ajyi;
                a = aock.a(aobv, 10);
                ajyi[] ajyiArr = this.b;
                length = ajyiArr != null ? ajyiArr.length : 0;
                ajyi[] ajyiArr2 = new ajyi[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajyiArr, 0, ajyiArr2, 0, length);
                }
                while (length < ajyiArr2.length - 1) {
                    ajyi = new ajyi();
                    ajyiArr2[length] = ajyi;
                    aobv.a(ajyi);
                    aobv.a();
                    length++;
                }
                ajyi = new ajyi();
                ajyiArr2[length] = ajyi;
                aobv.a(ajyi);
                this.b = ajyiArr2;
            } else if (a == 18) {
                this.c = aobv.d();
            } else if (a == 24) {
                this.f = aobv.c();
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                awlg[] awlgArr = this.d;
                length = awlgArr != null ? awlgArr.length : 0;
                awlg[] awlgArr2 = new awlg[(a + length)];
                if (length != 0) {
                    System.arraycopy(awlgArr, 0, awlgArr2, 0, length);
                }
                while (length < awlgArr2.length - 1) {
                    awlgArr2[length] = (awlg) aobv.a(awlg.d.getParserForType());
                    aobv.a();
                    length++;
                }
                awlgArr2[length] = (awlg) aobv.a(awlg.d.getParserForType());
                this.d = awlgArr2;
            } else if (a == 40) {
                this.e = aobv.c();
            } else if (a == 74) {
                this.g = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
