package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aoca */
public abstract class aoca extends aocf {
    public aocb unknownFieldData;

    public int computeSerializedSize() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.unknownFieldData.a(); i2++) {
            i += this.unknownFieldData.b(i2).a();
        }
        return i;
    }

    public void writeTo(aoby aoby) {
        if (this.unknownFieldData != null) {
            for (int i = 0; i < this.unknownFieldData.a(); i++) {
                this.unknownFieldData.b(i).a(aoby);
            }
        }
    }

    public final boolean hasExtension(aobz aobz) {
        aocb aocb = this.unknownFieldData;
        if (aocb == null || aocb.a(aock.b(aobz.c)) == null) {
            return false;
        }
        return true;
    }

    public final Object getExtension(aobz aobz) {
        aocb aocb = this.unknownFieldData;
        if (aocb != null) {
            aoce a = aocb.a(aock.b(aobz.c));
            if (a != null) {
                if (a.b == null) {
                    a.a = aobz;
                    a.b = aobz.a(a.c);
                    a.c = null;
                } else if (!a.a.equals(aobz)) {
                    throw new IllegalStateException("Tried to getExtension with a different Extension.");
                }
                return a.b;
            }
        }
        return null;
    }

    public final aoca setExtension(aobz aobz, Object obj) {
        int b = aock.b(aobz.c);
        aoce aoce = null;
        if (obj == null) {
            aocb aocb = this.unknownFieldData;
            if (aocb != null) {
                int c = aocb.c(b);
                if (c >= 0 && aocb.c[c] != aocb.a) {
                    aocb.c[c] = aocb.a;
                    aocb.b = true;
                }
                if (this.unknownFieldData.b()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            aocb aocb2 = this.unknownFieldData;
            if (aocb2 == null) {
                this.unknownFieldData = new aocb();
            } else {
                aoce = aocb2.a(b);
            }
            if (aoce == null) {
                this.unknownFieldData.a(b, new aoce(aobz, obj));
            } else {
                aoce.a(aobz, obj);
            }
        }
        return this;
    }

    public final boolean storeUnknownField(aobv aobv, int i) {
        int i2 = aobv.b;
        if (!aobv.b(i)) {
            return false;
        }
        byte[] bArr;
        int b = aock.b(i);
        int i3 = aobv.b - i2;
        if (i3 == 0) {
            bArr = aock.c;
        } else {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(aobv.a, i2, bArr2, 0, i3);
            bArr = bArr2;
        }
        storeUnknownFieldData(b, new aoch(i, bArr));
        return true;
    }

    private void storeUnknownFieldData(int i, aoch aoch) {
        aoce aoce;
        aocb aocb = this.unknownFieldData;
        if (aocb == null) {
            this.unknownFieldData = new aocb();
            aoce = null;
        } else {
            aoce = aocb.a(i);
        }
        if (aoce == null) {
            aoce = new aoce();
            this.unknownFieldData.a(i, aoce);
        }
        List list = aoce.c;
        if (list != null) {
            list.add(aoch);
            return;
        }
        Object obj = aoce.b;
        int f;
        if (obj instanceof aocf) {
            byte[] bArr = aoch.b;
            int length = bArr.length;
            aobv a = aobv.a(bArr, length);
            f = a.f();
            if (f == length - aoby.e(f)) {
                obj = ((aocf) aoce.b).mergeFrom(a);
            } else {
                throw aocg.a();
            }
        }
        Object obj2;
        int length2;
        if (obj instanceof aocf[]) {
            aocf[] aocfArr = (aocf[]) aoce.a.a(Collections.singletonList(aoch));
            aocf[] aocfArr2 = (aocf[]) aoce.b;
            f = aocfArr2.length;
            length2 = aocfArr.length;
            obj2 = (aocf[]) Arrays.copyOf(aocfArr2, f + length2);
            System.arraycopy(aocfArr, 0, obj2, f, length2);
        } else if (obj instanceof anze) {
            obj = ((anze) aoce.b).toBuilder().mergeFrom((anze) aoce.a.a(Collections.singletonList(aoch))).build();
        } else if (obj instanceof anze[]) {
            anze[] anzeArr = (anze[]) aoce.a.a(Collections.singletonList(aoch));
            anze[] anzeArr2 = (anze[]) aoce.b;
            f = anzeArr2.length;
            length2 = anzeArr.length;
            anzeArr2 = (anze[]) Arrays.copyOf(anzeArr2, f + length2);
            System.arraycopy(anzeArr, 0, anzeArr2, f, length2);
        } else {
            obj = aoce.a.a(Collections.singletonList(aoch));
        }
        obj = obj2;
        aoce.a(aoce.a, obj);
    }

    public aoca clone() {
        aoca aoca = (aoca) super.clone();
        aocd.a(this, aoca);
        return aoca;
    }
}
