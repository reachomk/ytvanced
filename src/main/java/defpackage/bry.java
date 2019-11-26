package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: bry */
final class bry implements Closeable {
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public bry(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(bsa.a)) {
            this.c = inputStream;
            this.a = charset;
            this.d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }

    public final String a() {
        synchronized (this.c) {
            if (this.d != null) {
                if (this.e >= this.b) {
                    b();
                }
                int i = this.e;
                while (true) {
                    int i2 = this.b;
                    byte[] bArr;
                    int i3;
                    int i4;
                    if (i != i2) {
                        bArr = this.d;
                        if (bArr[i] != (byte) 10) {
                            i++;
                        } else {
                            String str;
                            i3 = this.e;
                            if (i != i3) {
                                i4 = i - 1;
                                if (bArr[i4] == (byte) 13) {
                                    str = new String(bArr, i3, i4 - i3, this.a.name());
                                    this.e = i + 1;
                                    return str;
                                }
                            }
                            i4 = i;
                            str = new String(bArr, i3, i4 - i3, this.a.name());
                            this.e = i + 1;
                            return str;
                        }
                    }
                    byte[] bArr2;
                    brx brx = new brx(this, (i2 - this.e) + 80);
                    loop1:
                    while (true) {
                        bArr = this.d;
                        i4 = this.e;
                        brx.write(bArr, i4, this.b - i4);
                        this.b = -1;
                        b();
                        i2 = this.e;
                        while (i2 != this.b) {
                            bArr2 = this.d;
                            if (bArr2[i2] == (byte) 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                    i3 = this.e;
                    if (i2 != i3) {
                        brx.write(bArr2, i3, i2 - i3);
                    }
                    this.e = i2 + 1;
                    String byteArrayOutputStream = brx.toString();
                    return byteArrayOutputStream;
                }
            }
            throw new IOException("LineReader is closed");
        }
    }

    private final void b() {
        InputStream inputStream = this.c;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.e = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }
}
