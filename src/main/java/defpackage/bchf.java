package defpackage;

import java.lang.reflect.Array;

/* renamed from: bchf */
public final class bchf {
    public static boolean a(byte[] bArr) {
        int i = 0;
        if ((bArr != null ? Array.getLength(bArr) : 0) == 0) {
            i = 1;
        }
        return i ^ 1;
    }
}
