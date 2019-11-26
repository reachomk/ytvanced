package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: aocf */
public abstract class aocf {
    public static final int UNSET_ENUM_VALUE = Integer.MIN_VALUE;
    public volatile int cachedSize = -1;

    public int computeSerializedSize() {
        throw null;
    }

    public abstract aocf mergeFrom(aobv aobv);

    public void writeTo(aoby aoby) {
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public static final byte[] toByteArray(aocf aocf) {
        byte[] bArr = new byte[aocf.getSerializedSize()];
        aocf.toByteArray(aocf, bArr, 0, bArr.length);
        return bArr;
    }

    public static final void toByteArray(aocf aocf, byte[] bArr, int i, int i2) {
        try {
            aoby a = aoby.a(bArr, i2);
            aocf.writeTo(a);
            if (a.b() != 0) {
                throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.b())}));
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final aocf mergeFrom(aocf aocf, byte[] bArr) {
        return aocf.mergeFrom(aocf, bArr, 0, bArr.length);
    }

    public static final aocf mergeFrom(aocf aocf, byte[] bArr, int i, int i2) {
        try {
            aobv a = aobv.a(bArr, i2);
            aocf.mergeFrom(a);
            a.a(0);
            return aocf;
        } catch (aocg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final aocf cloneUsingSerialization(aocf aocf) {
        try {
            return aocf.mergeFrom((aocf) aocf.getClass().getConstructor(new Class[0]).newInstance(new Object[0]), aocf.toByteArray(aocf));
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException(e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(e4);
        } catch (aocg e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static final boolean messageNanoEquals(aocf aocf, aocf aocf2) {
        if (aocf == aocf2) {
            return true;
        }
        if (!(aocf == null || aocf2 == null || aocf.getClass() != aocf2.getClass())) {
            int serializedSize = aocf.getSerializedSize();
            if (aocf2.getSerializedSize() == serializedSize) {
                byte[] bArr = new byte[serializedSize];
                byte[] bArr2 = new byte[serializedSize];
                aocf.toByteArray(aocf, bArr, 0, serializedSize);
                aocf.toByteArray(aocf2, bArr2, 0, serializedSize);
                return Arrays.equals(bArr, bArr2);
            }
        }
        return false;
    }

    public String toString() {
        String valueOf;
        String str = "Error printing proto: ";
        StringBuffer stringBuffer = new StringBuffer();
        try {
            aoci.a(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                return str.concat(valueOf);
            }
            valueOf = new String(str);
            return valueOf;
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                return str.concat(valueOf);
            }
            valueOf = new String(str);
            return valueOf;
        }
    }

    public aocf clone() {
        return (aocf) super.clone();
    }
}
