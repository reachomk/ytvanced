package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: riu */
public abstract class riu {
    public volatile int W = -1;

    /* Access modifiers changed, original: protected */
    public int a() {
        throw null;
    }

    public abstract riu a(rij rij);

    public void a(rim rim) {
    }

    public final int d() {
        int a = a();
        this.W = a;
        return a;
    }

    public static final byte[] a(riu riu) {
        byte[] bArr = new byte[riu.d()];
        try {
            rim a = rim.a(bArr, bArr.length);
            riu.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.a.remaining())}));
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final riu a(riu riu, byte[] bArr) {
        try {
            rij a = rij.a(bArr, bArr.length);
            riu.a(a);
            a.a(0);
            return riu;
        } catch (rir e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public final String toString() {
        String valueOf;
        String str = "Error printing proto: ";
        StringBuffer stringBuffer = new StringBuffer();
        try {
            rit.a(null, this, new StringBuffer(), stringBuffer);
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

    /* renamed from: c */
    public riu clone() {
        return (riu) super.clone();
    }
}
