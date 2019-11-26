package defpackage;

import com.google.mediapipe.framework.GlSyncToken;

/* renamed from: zkn */
final class zkn extends anur {
    public final ayx a;
    public final zkd b;
    private final /* synthetic */ zkk f;

    public zkn(zkk zkk, int i, int i2) {
        ayx a = ayx.a();
        this.f = zkk;
        super(a.a, i, i2);
        this.a = (ayx) amqw.a((Object) a);
        a.a(i, i2);
        this.b = zkd.a(a);
    }

    public final void release() {
        super.release();
        if (this.f.k) {
            zkk zkk = this.f;
            zkk.k = false;
            zkk.b();
        }
    }

    public final void a() {
        try {
            synchronized (this) {
                while (this.c && this.e == null) {
                    wait();
                }
                GlSyncToken glSyncToken = this.e;
                if (glSyncToken != null) {
                    glSyncToken.waitOnCpu();
                    this.e.release();
                    this.c = false;
                    this.e = null;
                }
            }
            zkk.a(this.a);
            zkk.a(this.b);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(e.getMessage());
            String str = "Thread was unexpectedly interrupted: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.c(valueOf);
            throw new RuntimeException(e);
        }
    }
}
