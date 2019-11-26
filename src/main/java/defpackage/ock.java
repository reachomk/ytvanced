package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ock */
public abstract class ock implements obq {
    private ByteBuffer b = a;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public ByteBuffer f = a;
    private boolean g;

    public boolean a() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void j() {
    }

    /* Access modifiers changed, original: protected */
    public void k() {
    }

    /* Access modifiers changed, original: protected */
    public void l() {
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public final int d() {
        return this.c;
    }

    public final void e() {
        this.g = true;
        k();
    }

    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f;
        this.f = a;
        return byteBuffer;
    }

    public boolean g() {
        return this.g && this.f == a;
    }

    public final void h() {
        this.f = a;
        this.g = false;
        l();
    }

    public final void i() {
        h();
        this.b = a;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        j();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(int i, int i2, int i3) {
        if (i == this.c && i2 == this.d && i3 == this.e) {
            return false;
        }
        this.c = i;
        this.d = i2;
        this.e = i3;
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final ByteBuffer a(int i) {
        if (this.b.capacity() < i) {
            this.b = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.b.clear();
        }
        ByteBuffer byteBuffer = this.b;
        this.f = byteBuffer;
        return byteBuffer;
    }
}
