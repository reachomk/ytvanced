package defpackage;

import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* renamed from: oet */
final class oet extends bckz {
    private final /* synthetic */ oep a;

    public final synchronized void a(bckx bckx, bclb bclb, String str) {
        oep oep = this.a;
        if (bckx == oep.d) {
            if (oep.e.b == 2) {
                int b = bclb.b();
                if (b != 307) {
                    if (b != 308) {
                    }
                }
                oep oep2 = this.a;
                bclb.c();
                bclb.e();
                oep2.g = new owd(b, this.a.e);
                this.a.c.a();
                return;
            }
            oep = this.a;
            if (oep.a) {
                oep.e();
            }
            bclb.e();
            boolean z = this.a.b;
            bckx.b();
        }
    }

    public final synchronized void a(bckx bckx, bclb bclb) {
        oep oep = this.a;
        if (bckx == oep.d) {
            oep.f = bclb;
            oep.c.a();
        }
    }

    public final synchronized void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        oep oep = this.a;
        if (bckx == oep.d) {
            oep.c.a();
        }
    }

    public final synchronized void b(bckx bckx, bclb bclb) {
        oep oep = this.a;
        if (bckx == oep.d) {
            oep.h = true;
            oep.c.a();
        }
    }

    public final synchronized void a(bckx bckx, bclb bclb, bcjd bcjd) {
        if (bckx == this.a.d) {
            if ((bcjd instanceof bckg) && ((bckg) bcjd).a() == 1) {
                this.a.g = new UnknownHostException();
            } else {
                this.a.g = bcjd;
            }
            this.a.c.a();
        }
    }

    /* synthetic */ oet(oep oep) {
        this.a = oep;
    }
}
