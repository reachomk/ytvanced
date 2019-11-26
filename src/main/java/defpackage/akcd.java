package defpackage;

/* renamed from: akcd */
public final class akcd extends ajwo {
    public akcg[] a;
    private ajzw b;

    public akcd() {
        super(91700600);
        if (akcg.a == null) {
            synchronized (aocd.b) {
                if (akcg.a == null) {
                    akcg.a = new akcg[0];
                }
            }
        }
        this.a = akcg.a;
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcd) {
            akcd akcd = (akcd) obj;
            if (aocd.a(this.a, akcd.a)) {
                ajzw ajzw = this.b;
                if (ajzw == null) {
                    if (akcd.b != null) {
                        return false;
                    }
                } else if (!ajzw.equals(akcd.b)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akcd.unknownFieldData);
                }
                aocb aocb2 = akcd.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        ajzw ajzw = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        hashCode = (hashCode + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        akcg[] akcgArr = this.a;
        if (akcgArr != null && akcgArr.length > 0) {
            int i = 0;
            while (true) {
                akcg[] akcgArr2 = this.a;
                if (i >= akcgArr2.length) {
                    break;
                }
                aocf aocf = akcgArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        aocf aocf2 = this.b;
        if (aocf2 != null) {
            aoby.a(2, aocf2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        akcg[] akcgArr = this.a;
        if (akcgArr != null && akcgArr.length > 0) {
            int i = 0;
            while (true) {
                akcg[] akcgArr2 = this.a;
                if (i >= akcgArr2.length) {
                    break;
                }
                aocf aocf = akcgArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        aocf aocf2 = this.b;
        return aocf2 != null ? computeSerializedSize + aoby.b(2, aocf2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf akcg;
                a = aock.a(aobv, 10);
                akcg[] akcgArr = this.a;
                int length = akcgArr != null ? akcgArr.length : 0;
                akcg[] akcgArr2 = new akcg[(a + length)];
                if (length != 0) {
                    System.arraycopy(akcgArr, 0, akcgArr2, 0, length);
                }
                while (length < akcgArr2.length - 1) {
                    akcg = new akcg();
                    akcgArr2[length] = akcg;
                    aobv.a(akcg);
                    aobv.a();
                    length++;
                }
                akcg = new akcg();
                akcgArr2[length] = akcg;
                aobv.a(akcg);
                this.a = akcgArr2;
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new ajzw();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
