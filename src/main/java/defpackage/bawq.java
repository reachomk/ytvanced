package defpackage;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: bawq */
final class bawq extends baxa {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    public final String b;
    public final String c;
    public final bbho d;
    public final Executor e;
    public final baum f;
    public final bawt g;
    public final Runnable h;
    public final boolean i;
    public bciw j;
    public final boolean k;
    public final Object l;
    public final Collection m;
    public final bawu n;
    public bawo o;
    private final bawr q = new bawr(this);

    bawq(String str, String str2, Executor executor, baum baum, bawt bawt, Runnable runnable, Object obj, int i, boolean z, bauw bauw, bbho bbho, barv barv, bbht bbht) {
        barv barv2 = barv;
        super(new bawx(), bbho, bbht, baum, barv, false);
        String str3 = str;
        this.b = (String) amqw.a((Object) str, (Object) "url");
        str3 = str2;
        this.c = (String) amqw.a((Object) str2, (Object) "userAgent");
        this.d = (bbho) amqw.a((Object) bbho, (Object) "statsTraceCtx");
        Executor executor2 = executor;
        this.e = (Executor) amqw.a((Object) executor, (Object) "executor");
        baum baum2 = baum;
        this.f = (baum) amqw.a((Object) baum, (Object) "headers");
        bawt bawt2 = bawt;
        this.g = (bawt) amqw.a((Object) bawt, (Object) "transport");
        Runnable runnable2 = runnable;
        this.h = (Runnable) amqw.a((Object) runnable, (Object) "startCallback");
        this.i = z;
        this.k = bauw.a == baux.UNARY;
        this.l = barv2.a(bawj.a);
        this.m = (Collection) barv2.a(bawj.b);
        this.n = new bawu(this, i, bbho, obj, bbht);
    }

    public final void a(String str) {
        throw new UnsupportedOperationException("Cronet does not support overriding authority");
    }

    public final void a(ByteBuffer byteBuffer, boolean z, boolean z2) {
        bciw bciw = this.j;
        if (bciw != null) {
            bciw.a(byteBuffer, z);
            if (z2) {
                this.j.b();
            }
        }
    }

    public final void a(bavx bavx) {
        this.g.a(this, bavx);
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ bawz a() {
        return this.q;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ baxc b() {
        return this.n;
    }

    public final /* bridge */ /* synthetic */ baxh c() {
        return this.n;
    }
}
