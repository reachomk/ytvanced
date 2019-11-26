package defpackage;

/* renamed from: akaq */
public final class akaq extends ajwo {
    public ajrt[] a;
    public boolean b;
    public boolean c;
    private boolean d;

    public akaq() {
        super(58173949);
        if (ajrt.a == null) {
            synchronized (aocd.b) {
                if (ajrt.a == null) {
                    ajrt.a = new ajrt[0];
                }
            }
        }
        this.a = ajrt.a;
        this.b = false;
        this.c = false;
        this.d = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akaq) {
            akaq akaq = (akaq) obj;
            if (aocd.a(this.a, akaq.a) && this.b == akaq.b && this.c == akaq.c && this.d == akaq.d) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akaq.unknownFieldData);
                }
                aocb aocb2 = akaq.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.a)) * 31) + (!this.b ? 1237 : 1231)) * 31) + (!this.c ? 1237 : 1231)) * 31;
        if (this.d) {
            i = 1231;
        }
        hashCode = (hashCode + i) * 31;
        aocb aocb = this.unknownFieldData;
        i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        ajrt[] ajrtArr = this.a;
        if (ajrtArr != null && ajrtArr.length > 0) {
            int i = 0;
            while (true) {
                ajrt[] ajrtArr2 = this.a;
                if (i >= ajrtArr2.length) {
                    break;
                }
                aocf aocf = ajrtArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        if (this.b) {
            aoby.a(2, true);
        }
        if (this.c) {
            aoby.a(3, true);
        }
        if (this.d) {
            aoby.a(4, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ajrt[] ajrtArr = this.a;
        if (ajrtArr != null && ajrtArr.length > 0) {
            int i = 0;
            while (true) {
                ajrt[] ajrtArr2 = this.a;
                if (i >= ajrtArr2.length) {
                    break;
                }
                aocf aocf = ajrtArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        if (this.b) {
            computeSerializedSize += aoby.d(2);
        }
        if (this.c) {
            computeSerializedSize += aoby.d(3);
        }
        return this.d ? computeSerializedSize + aoby.d(4) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf ajrt;
                a = aock.a(aobv, 10);
                ajrt[] ajrtArr = this.a;
                int length = ajrtArr != null ? ajrtArr.length : 0;
                ajrt[] ajrtArr2 = new ajrt[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajrtArr, 0, ajrtArr2, 0, length);
                }
                while (length < ajrtArr2.length - 1) {
                    ajrt = new ajrt();
                    ajrtArr2[length] = ajrt;
                    aobv.a(ajrt);
                    aobv.a();
                    length++;
                }
                ajrt = new ajrt();
                ajrtArr2[length] = ajrt;
                aobv.a(ajrt);
                this.a = ajrtArr2;
            } else if (a == 16) {
                this.b = aobv.c();
            } else if (a == 24) {
                this.c = aobv.c();
            } else if (a == 32) {
                this.d = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
