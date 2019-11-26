package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;

/* renamed from: bcpd */
final class bcpd extends bckz {
    private final /* synthetic */ bcpe a;

    public bcpd(bcpe bcpe) {
        this.a = bcpe;
    }

    public final void a(bckx bckx, bclb bclb) {
        bcpe bcpe = this.a;
        bcpe.e = bclb;
        bcpe.j = true;
        this.a.a.b();
    }

    public final void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        bcpe bcpe = this.a;
        bcpe.e = bclb;
        bcpe.a.b();
    }

    public final void a(bckx bckx, bclb bclb, String str) {
        this.a.g = true;
        try {
            URL url = new URL(str);
            boolean equals = url.getProtocol().equals(this.a.url.getProtocol());
            if (this.a.instanceFollowRedirects) {
                this.a.url = url;
            }
            if (this.a.instanceFollowRedirects) {
                if (equals) {
                    this.a.b.b();
                    return;
                }
            }
        } catch (MalformedURLException unused) {
        }
        bcpe bcpe = this.a;
        bcpe.e = bclb;
        bcpe.b.c();
        a(null);
    }

    public final void b(bckx bckx, bclb bclb) {
        this.a.e = bclb;
        a(null);
    }

    public final void a(bckx bckx, bclb bclb, bcjd bcjd) {
        if (bcjd != null) {
            this.a.e = bclb;
            a(bcjd);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    public final void c(bckx bckx, bclb bclb) {
        this.a.e = bclb;
        a(new IOException("disconnect() called"));
    }

    private final void a(IOException iOException) {
        bcpe bcpe = this.a;
        bcpe.f = iOException;
        bcpf bcpf = bcpe.c;
        if (bcpf != null) {
            bcpf.c = iOException;
            bcpf.a = true;
            bcpf.b = null;
        }
        bcpi bcpi = bcpe.d;
        if (bcpi != null) {
            bcpi.d = iOException;
            bcpi.e = true;
        }
        bcpe.j = true;
        this.a.a.b();
    }
}
