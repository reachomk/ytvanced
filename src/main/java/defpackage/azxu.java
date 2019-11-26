package defpackage;

/* renamed from: azxu */
public final class azxu extends aoca {
    public azxv[] a;

    public azxu() {
        if (azxv.a == null) {
            synchronized (aocd.b) {
                if (azxv.a == null) {
                    azxv.a = new azxv[0];
                }
            }
        }
        this.a = azxv.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final void writeTo(aoby aoby) {
        azxv[] azxvArr = this.a;
        if (azxvArr != null && azxvArr.length > 0) {
            int i = 0;
            while (true) {
                azxv[] azxvArr2 = this.a;
                if (i >= azxvArr2.length) {
                    break;
                }
                aocf aocf = azxvArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        azxv[] azxvArr = this.a;
        if (azxvArr != null && azxvArr.length > 0) {
            int i = 0;
            while (true) {
                azxv[] azxvArr2 = this.a;
                if (i >= azxvArr2.length) {
                    break;
                }
                aocf aocf = azxvArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
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
                aocf azxv;
                a = aock.a(aobv, 10);
                azxv[] azxvArr = this.a;
                int length = azxvArr != null ? azxvArr.length : 0;
                azxv[] azxvArr2 = new azxv[(a + length)];
                if (length != 0) {
                    System.arraycopy(azxvArr, 0, azxvArr2, 0, length);
                }
                while (length < azxvArr2.length - 1) {
                    azxv = new azxv();
                    azxvArr2[length] = azxv;
                    aobv.a(azxv);
                    aobv.a();
                    length++;
                }
                azxv = new azxv();
                azxvArr2[length] = azxv;
                aobv.a(azxv);
                this.a = azxvArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
