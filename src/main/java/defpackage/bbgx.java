package defpackage;

/* renamed from: bbgx */
final class bbgx extends bbgv {
    private bbgx() {
    }

    public final boolean a(bbgw bbgw) {
        synchronized (bbgw) {
            if (bbgw.a == 0) {
                bbgw.a = -1;
                return true;
            }
            return false;
        }
    }

    public final void b(bbgw bbgw) {
        synchronized (bbgw) {
            bbgw.a = 0;
        }
    }

    /* synthetic */ bbgx(byte b) {
    }
}
