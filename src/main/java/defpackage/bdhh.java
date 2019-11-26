package defpackage;

/* renamed from: bdhh */
public final class bdhh extends aoca {
    public static final aobz a = aobz.a(bdhh.class, 1466516290);
    public String b;
    private String c = "";
    private String d = "";
    private bdhg[] e;
    private String f;

    public bdhh() {
        if (bdhg.a == null) {
            synchronized (aocd.b) {
                if (bdhg.a == null) {
                    bdhg.a = new bdhg[0];
                }
            }
        }
        this.e = bdhg.a;
        this.f = "";
        this.b = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhh) {
            bdhh bdhh = (bdhh) obj;
            String str = this.c;
            if (str == null) {
                if (bdhh.c != null) {
                    return false;
                }
            } else if (!str.equals(bdhh.c)) {
                return false;
            }
            str = this.d;
            if (str == null) {
                if (bdhh.d != null) {
                    return false;
                }
            } else if (!str.equals(bdhh.d)) {
                return false;
            }
            if (aocd.a(this.e, bdhh.e)) {
                str = this.f;
                if (str == null) {
                    if (bdhh.f != null) {
                        return false;
                    }
                } else if (!str.equals(bdhh.f)) {
                    return false;
                }
                str = this.b;
                if (str == null) {
                    if (bdhh.b != null) {
                        return false;
                    }
                } else if (!str.equals(bdhh.b)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhh.unknownFieldData);
                }
                aocb aocb2 = bdhh.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.c;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + aocd.a(this.e)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.c;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.c);
        }
        str = this.d;
        if (!(str == null || str.equals(str2))) {
            aoby.a(2, this.d);
        }
        bdhg[] bdhgArr = this.e;
        if (bdhgArr != null && bdhgArr.length > 0) {
            int i = 0;
            while (true) {
                bdhg[] bdhgArr2 = this.e;
                if (i >= bdhgArr2.length) {
                    break;
                }
                aocf aocf = bdhgArr2[i];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i++;
            }
        }
        str = this.f;
        if (!(str == null || str.equals(str2))) {
            aoby.a(4, this.f);
        }
        str = this.b;
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.b);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.c;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.c);
        }
        str = this.d;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(2, this.d);
        }
        bdhg[] bdhgArr = this.e;
        if (bdhgArr != null && bdhgArr.length > 0) {
            int i = 0;
            while (true) {
                bdhg[] bdhgArr2 = this.e;
                if (i >= bdhgArr2.length) {
                    break;
                }
                aocf aocf = bdhgArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(3, aocf);
                }
                i++;
            }
        }
        str = this.f;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(4, this.f);
        }
        str = this.b;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(5, this.b);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.c = aobv.d();
            } else if (a == 18) {
                this.d = aobv.d();
            } else if (a == 26) {
                aocf bdhg;
                a = aock.a(aobv, 26);
                bdhg[] bdhgArr = this.e;
                int length = bdhgArr != null ? bdhgArr.length : 0;
                bdhg[] bdhgArr2 = new bdhg[(a + length)];
                if (length != 0) {
                    System.arraycopy(bdhgArr, 0, bdhgArr2, 0, length);
                }
                while (length < bdhgArr2.length - 1) {
                    bdhg = new bdhg();
                    bdhgArr2[length] = bdhg;
                    aobv.a(bdhg);
                    aobv.a();
                    length++;
                }
                bdhg = new bdhg();
                bdhgArr2[length] = bdhg;
                aobv.a(bdhg);
                this.e = bdhgArr2;
            } else if (a == 34) {
                this.f = aobv.d();
            } else if (a == 42) {
                this.b = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
