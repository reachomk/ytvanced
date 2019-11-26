package defpackage;

/* renamed from: akbd */
public final class akbd extends aoca {
    public static volatile akbd[] a;
    public String b;
    public boolean c;
    public akbe[] d;

    public akbd() {
        this.b = "";
        this.c = false;
        this.d = akbe.a();
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbd) {
            akbd akbd = (akbd) obj;
            String str = this.b;
            if (str == null) {
                if (akbd.b != null) {
                    return false;
                }
            } else if (!str.equals(akbd.b)) {
                return false;
            }
            if (this.c == akbd.c && aocd.a(this.d, akbd.d)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akbd.unknownFieldData);
                }
                aocb aocb2 = akbd.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.c ? 1237 : 1231)) * 31) + aocd.a(this.d)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.b;
        if (!(str == null || str.equals(""))) {
            aoby.a(1, this.b);
        }
        if (this.c) {
            aoby.a(2, true);
        }
        akbe[] akbeArr = this.d;
        if (akbeArr != null && akbeArr.length > 0) {
            int i = 0;
            while (true) {
                akbe[] akbeArr2 = this.d;
                if (i >= akbeArr2.length) {
                    break;
                }
                aocf aocf = akbeArr2[i];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        if (this.c) {
            computeSerializedSize += aoby.d(2);
        }
        akbe[] akbeArr = this.d;
        if (akbeArr != null && akbeArr.length > 0) {
            int i = 0;
            while (true) {
                akbe[] akbeArr2 = this.d;
                if (i >= akbeArr2.length) {
                    break;
                }
                aocf aocf = akbeArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(3, aocf);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (a == 16) {
                this.c = aobv.c();
            } else if (a == 26) {
                aocf akbe;
                a = aock.a(aobv, 26);
                akbe[] akbeArr = this.d;
                int length = akbeArr != null ? akbeArr.length : 0;
                akbe[] akbeArr2 = new akbe[(a + length)];
                if (length != 0) {
                    System.arraycopy(akbeArr, 0, akbeArr2, 0, length);
                }
                while (length < akbeArr2.length - 1) {
                    akbe = new akbe();
                    akbeArr2[length] = akbe;
                    aobv.a(akbe);
                    aobv.a();
                    length++;
                }
                akbe = new akbe();
                akbeArr2[length] = akbe;
                aobv.a(akbe);
                this.d = akbeArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
