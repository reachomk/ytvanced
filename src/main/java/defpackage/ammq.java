package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.ZipException;

/* renamed from: ammq */
public final class ammq implements Cloneable {
    public String a;
    public long b = -1;
    public long c = -1;
    public int d = -1;
    public byte[] e;
    public long f = -1;

    public final String toString() {
        return this.a;
    }

    public final Object clone() {
        try {
            ammq ammq = (ammq) super.clone();
            byte[] bArr = this.e;
            ammq.e = bArr != null ? (byte[]) bArr.clone() : null;
            return ammq;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    ammq(byte[] bArr, InputStream inputStream, Charset charset, boolean z) {
        amqw.a((Object) inputStream);
        amqw.a((Object) bArr);
        inputStream.read(bArr, 0, 46);
        ammo ammo = new ammo(bArr);
        int a = ammo.a();
        if (((long) a) != 33639248) {
            ammp.a("Central Directory Entry", a);
        }
        ammo.a = 8;
        char b = (char) ammo.b();
        if ((b & 1) == 0) {
            String valueOf;
            if ((b & 2048) != 0) {
                charset = StandardCharsets.UTF_8;
            }
            this.d = (char) ammo.b();
            ammo.b();
            ammo.b();
            ammo.a();
            this.b = ((long) ammo.a()) & 4294967295L;
            this.c = ((long) ammo.a()) & 4294967295L;
            short b2 = ammo.b();
            char b3 = (char) ammo.b();
            char b4 = (char) ammo.b();
            ammo.a = 42;
            this.f = 4294967295L & ((long) ammo.a());
            Object obj = new byte[((char) b2)];
            amqw.a(obj);
            inputStream.read(obj, 0, r4);
            for (byte b5 : obj) {
                if (b5 == (byte) 0) {
                    valueOf = String.valueOf(Arrays.toString(obj));
                    String str = "Filename contains NUL byte: ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    throw new ZipException(valueOf);
                }
            }
            this.a = new String(obj, 0, obj.length, charset);
            if (b3 > 0) {
                this.e = new byte[b3];
                amqw.a(this.e);
                inputStream.read(this.e, 0, b3);
            }
            if (b4 > 0) {
                Object obj2 = new byte[b4];
                amqw.a(obj2);
                inputStream.read(obj2, 0, b4);
                valueOf = new String(obj2, 0, obj2.length, charset);
            }
            if (z) {
                ammn.a(this);
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Invalid General Purpose Bit Flag: ");
        stringBuilder.append(b);
        throw new ZipException(stringBuilder.toString());
    }
}
