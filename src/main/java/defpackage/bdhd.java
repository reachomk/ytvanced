package defpackage;

import java.util.Arrays;

/* renamed from: bdhd */
public final class bdhd extends aoca {
    public static final aobz a = aobz.a(bdhd.class, 1358144434);
    public byte[] b;
    public long c;

    public bdhd() {
        this.b = aock.c;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhd) {
            bdhd bdhd = (bdhd) obj;
            if (Arrays.equals(this.b, bdhd.b) && this.c == bdhd.c) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhd.unknownFieldData);
                }
                aocb aocb2 = bdhd.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = Arrays.hashCode(this.b);
        long j = this.c;
        hashCode = (((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            aoby.a(3, j);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(2, this.b);
        }
        long j = this.c;
        return j != 0 ? computeSerializedSize + aoby.c(3, j) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                this.b = aobv.e();
            } else if (a == 24) {
                this.c = aobv.g();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
