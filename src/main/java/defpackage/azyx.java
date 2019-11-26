package defpackage;

import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: azyx */
final class azyx implements azyl {
    private final String a;
    private final azyl b;
    private azze c;
    private azze d;
    private azze e;
    private long f = 0;
    private long g = 0;
    private final long h;
    private final MessageDigest i;
    private boolean j;
    private int k = 1;

    public azyx(String str, String str2, azyn azyn, azyl azyl, MessageDigest messageDigest) {
        this.a = str;
        this.b = azyl;
        this.i = messageDigest;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = "--";
        StringBuilder stringBuilder = new StringBuilder(str3);
        stringBuilder.append(this.a);
        stringBuilder.append("\r\nContent-Type: text/plain\r\n\r\n");
        stringBuilder.append(str2);
        str2 = "\r\n";
        stringBuilder.append(str2);
        this.c = new azze(stringBuilder.toString());
        stringBuilder = new StringBuilder(str3);
        stringBuilder.append(this.a);
        stringBuilder.append(str2);
        for (String str4 : azyn.a()) {
            stringBuilder.append(str4);
            stringBuilder.append(": ");
            stringBuilder.append(azyn.b(str4));
            stringBuilder.append(str2);
        }
        if (this.b.a() >= 0 && azyn.a("content-length").isEmpty()) {
            stringBuilder.append("Content-Length: ");
            stringBuilder.append(this.b.a());
            stringBuilder.append(str2);
        }
        stringBuilder.append(str2);
        this.d = new azze(stringBuilder.toString());
        if (azyl.a() != -1 && messageDigest == null) {
            this.e = h();
            this.h = ((this.c.a() + this.d.a()) + azyl.a()) + this.e.a();
            return;
        }
        this.h = -1;
    }

    public final long e() {
        return Long.MAX_VALUE;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (this.j) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        amqw.a(bArr.length - i >= i2, (Object) "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        while (true) {
            long j2 = this.f;
            if (j2 != j) {
                return (int) (j2 - j);
            }
            int i3 = this.k;
            int i4 = i3 - 1;
            azyl azyl = null;
            if (i3 != 0) {
                if (i4 == 0) {
                    azyl = this.c;
                    i3 = 2;
                } else if (i4 == 1) {
                    azyl = this.d;
                    i3 = 3;
                } else if (i4 == 2) {
                    azyl = this.b;
                    i3 = 4;
                } else if (i4 == 3) {
                    if (this.e == null) {
                        this.e = h();
                    }
                    azyl = this.e;
                    i3 = 5;
                } else if (i4 == 4) {
                    return 0;
                }
                this.f += (long) azyl.a(bArr, i, i2);
                if (azyl.e() < Long.MAX_VALUE) {
                    azyl.b();
                }
                if (!azyl.g()) {
                    this.k = i3;
                }
            } else {
                throw null;
            }
        }
    }

    public final void b() {
        this.g = this.f;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.f;
    }

    public final void f() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    public final long a(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    public final long a() {
        return this.h;
    }

    public final boolean g() {
        return this.k != 5;
    }

    public final void close() {
        this.j = true;
        this.b.close();
    }

    private final azze h() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "\r\n--";
        stringBuilder.append(str);
        stringBuilder.append(this.a);
        MessageDigest messageDigest = this.i;
        String str2 = "--";
        if (messageDigest != null) {
            String str3 = "md5";
            if (messageDigest.getAlgorithm().equalsIgnoreCase(str3) || this.i.getAlgorithm().equalsIgnoreCase("sha-1")) {
                stringBuilder.append("\r\n\r\nX-Goog-Hash:");
                if (this.i.getAlgorithm().equalsIgnoreCase(str3)) {
                    stringBuilder.append(" md5=");
                } else {
                    stringBuilder.append(" sha1=");
                }
                stringBuilder.append(anar.a.a(this.i.digest()));
                stringBuilder.append(str);
                stringBuilder.append(this.a);
                stringBuilder.append(str2);
                return new azze(stringBuilder.toString());
            }
        }
        stringBuilder.append(str2);
        return new azze(stringBuilder.toString());
    }
}
