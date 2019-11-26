package defpackage;

/* renamed from: aemi */
final class aemi implements aajh {
    public boolean a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public atbw g;
    public String h;

    aemi() {
    }

    public final synchronized void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = true;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    public final synchronized void a(atbw atbw) {
        this.b = true;
        this.g = atbw;
    }

    public final synchronized void a(String str) {
        this.c = true;
        this.h = str;
    }
}
