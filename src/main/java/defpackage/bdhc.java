package defpackage;

/* renamed from: bdhc */
public final class bdhc extends aoca {
    private static volatile bdhc[] e;
    public bdhw a;
    public bdho b;
    public bdhc[] c;
    public String d;

    public static bdhc[] a() {
        if (e == null) {
            synchronized (aocd.b) {
                if (e == null) {
                    e = new bdhc[0];
                }
            }
        }
        return e;
    }

    public bdhc() {
        this.a = null;
        this.b = null;
        this.c = bdhc.a();
        this.d = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhc) {
            bdhc bdhc = (bdhc) obj;
            bdhw bdhw = this.a;
            if (bdhw == null) {
                if (bdhc.a != null) {
                    return false;
                }
            } else if (!bdhw.equals(bdhc.a)) {
                return false;
            }
            bdho bdho = this.b;
            if (bdho == null) {
                if (bdhc.b != null) {
                    return false;
                }
            } else if (!bdho.equals(bdhc.b)) {
                return false;
            }
            if (aocd.a(this.c, bdhc.c)) {
                String str = this.d;
                if (str == null) {
                    if (bdhc.d != null) {
                        return false;
                    }
                } else if (!str.equals(bdhc.d)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhc.unknownFieldData);
                }
                aocb aocb2 = bdhc.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdhw bdhw = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdhw != null ? bdhw.hashCode() : 0;
        bdho bdho = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + (bdho != null ? bdho.hashCode() : 0)) * 31) + aocd.a(this.c)) * 31;
        String str = this.d;
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
        bdhc[] bdhcArr = this.c;
        if (bdhcArr != null && bdhcArr.length > 0) {
            int i = 0;
            while (true) {
                bdhc[] bdhcArr2 = this.c;
                if (i >= bdhcArr2.length) {
                    break;
                }
                aocf aocf2 = bdhcArr2[i];
                if (aocf2 != null) {
                    aoby.a(3, aocf2);
                }
                i++;
            }
        }
        String str = this.d;
        if (!(str == null || str.equals(""))) {
            aoby.a(4, this.d);
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
        bdhc[] bdhcArr = this.c;
        if (bdhcArr != null && bdhcArr.length > 0) {
            int i = 0;
            while (true) {
                bdhc[] bdhcArr2 = this.c;
                if (i >= bdhcArr2.length) {
                    break;
                }
                aocf aocf2 = bdhcArr2[i];
                if (aocf2 != null) {
                    computeSerializedSize += aoby.b(3, aocf2);
                }
                i++;
            }
        }
        String str = this.d;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(4, this.d);
    }

    public static bdhc a(byte[] bArr) {
        return (bdhc) aocf.mergeFrom(new bdhc(), bArr);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new bdhw();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new bdho();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                aocf bdhc;
                a = aock.a(aobv, 26);
                bdhc[] bdhcArr = this.c;
                int length = bdhcArr != null ? bdhcArr.length : 0;
                bdhc[] bdhcArr2 = new bdhc[(a + length)];
                if (length != 0) {
                    System.arraycopy(bdhcArr, 0, bdhcArr2, 0, length);
                }
                while (length < bdhcArr2.length - 1) {
                    bdhc = new bdhc();
                    bdhcArr2[length] = bdhc;
                    aobv.a(bdhc);
                    aobv.a();
                    length++;
                }
                bdhc = new bdhc();
                bdhcArr2[length] = bdhc;
                aobv.a(bdhc);
                this.c = bdhcArr2;
            } else if (a == 34) {
                this.d = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
