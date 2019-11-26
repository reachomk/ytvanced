package defpackage;

import java.util.Arrays;

/* renamed from: ajrk */
public final class ajrk extends aoca {
    public ajxg[] a;
    public boolean b;
    public byte[] c;
    private String d;
    private String e;

    public ajrk() {
        if (ajxg.a == null) {
            synchronized (aocd.b) {
                if (ajxg.a == null) {
                    ajxg.a = new ajxg[0];
                }
            }
        }
        this.a = ajxg.a;
        this.d = "";
        this.b = false;
        this.e = "";
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrk) {
            ajrk ajrk = (ajrk) obj;
            if (aocd.a(this.a, ajrk.a)) {
                String str = this.d;
                if (str == null) {
                    if (ajrk.d != null) {
                        return false;
                    }
                } else if (!str.equals(ajrk.d)) {
                    return false;
                }
                if (this.b == ajrk.b) {
                    str = this.e;
                    if (str == null) {
                        if (ajrk.e != null) {
                            return false;
                        }
                    } else if (!str.equals(ajrk.e)) {
                        return false;
                    }
                    if (Arrays.equals(this.c, ajrk.c)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajrk.unknownFieldData);
                        }
                        aocb aocb2 = ajrk.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.a)) * 31;
        String str = this.d;
        int i = 0;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.b ? 1237 : 1231)) * 31;
        str = this.e;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.c)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        ajxg[] ajxgArr = this.a;
        if (ajxgArr != null && ajxgArr.length > 0) {
            int i = 0;
            while (true) {
                ajxg[] ajxgArr2 = this.a;
                if (i >= ajxgArr2.length) {
                    break;
                }
                aocf aocf = ajxgArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        String str = this.d;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(3, this.d);
        }
        if (this.b) {
            aoby.a(5, true);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            aoby.a(6, this.e);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(8, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ajxg[] ajxgArr = this.a;
        if (ajxgArr != null && ajxgArr.length > 0) {
            int i = 0;
            while (true) {
                ajxg[] ajxgArr2 = this.a;
                if (i >= ajxgArr2.length) {
                    break;
                }
                aocf aocf = ajxgArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(2, aocf);
                }
                i++;
            }
        }
        String str = this.d;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(3, this.d);
        }
        if (this.b) {
            computeSerializedSize += aoby.d(5);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(6, this.e);
        }
        return !Arrays.equals(this.c, aock.c) ? computeSerializedSize + aoby.b(8, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                aocf ajxg;
                a = aock.a(aobv, 18);
                ajxg[] ajxgArr = this.a;
                int length = ajxgArr != null ? ajxgArr.length : 0;
                ajxg[] ajxgArr2 = new ajxg[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajxgArr, 0, ajxgArr2, 0, length);
                }
                while (length < ajxgArr2.length - 1) {
                    ajxg = new ajxg();
                    ajxgArr2[length] = ajxg;
                    aobv.a(ajxg);
                    aobv.a();
                    length++;
                }
                ajxg = new ajxg();
                ajxgArr2[length] = ajxg;
                aobv.a(ajxg);
                this.a = ajxgArr2;
            } else if (a == 26) {
                this.d = aobv.d();
            } else if (a == 40) {
                this.b = aobv.c();
            } else if (a == 50) {
                this.e = aobv.d();
            } else if (a == 66) {
                this.c = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
