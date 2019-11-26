package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: xip */
abstract class xip extends bckz {
    public final xjf a;
    public boolean b;
    public Object c;
    public boolean d;
    public boolean e;
    private final boolean f;
    private final xiw g;
    private final xji h;
    private xjl i;
    private IOException j;

    protected xip(xjf xjf, boolean z, xiw xiw, xji xji) {
        this.a = xjf;
        this.f = z;
        this.g = xiw;
        this.h = xji;
    }

    public abstract Object a(bclb bclb, InputStream inputStream);

    public final void a(bckx bckx, bclb bclb, String str) {
        try {
            if (this.f) {
                if (this.g.a != null) {
                    xlg.a(str);
                }
                bckx.b();
                return;
            }
            this.a.a();
            this.c = a(bclb, null);
            this.b = true;
            this.e = true;
            bckx.c();
        } catch (IOException e) {
            a(e);
        }
    }

    public final void a(bckx bckx, bclb bclb) {
        this.a.a();
        this.h.a(bclb);
        this.i = new xjl(bckx, this);
        this.c = a(bclb, this.i);
        this.b = true;
    }

    public final void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        this.a.a();
        if (this.i == null) {
            a(new IOException());
        }
    }

    public final void b(bckx bckx, bclb bclb) {
        this.a.a();
        a(null);
    }

    public final void a(bckx bckx, bclb bclb, bcjd bcjd) {
        IOException bcjd2;
        this.a.a();
        Throwable cause = bcjd2.getCause();
        if (cause instanceof IOException) {
            bcjd2 = (IOException) cause;
        }
        a(bcjd2);
    }

    public final void c(bckx bckx, bclb bclb) {
        this.a.a();
        a(!this.e ? xjm.a : null);
    }

    private final void a(IOException iOException) {
        this.a.a();
        this.d = true;
        this.j = iOException;
        xjl xjl = this.i;
        if (xjl != null) {
            xjl.a = null;
        }
    }

    public final void a() {
        IOException iOException = this.j;
        if (iOException != null) {
            throw iOException;
        }
    }
}
