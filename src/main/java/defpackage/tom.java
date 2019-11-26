package defpackage;

import android.support.rastermill.FrameSequence;
import java.io.InputStream;

/* renamed from: tom */
public final class tom implements bsp {
    private final bwd a;

    public tom(bwd bwd) {
        this.a = bwd;
    }

    public final bvw a(InputStream inputStream) {
        return new top(FrameSequence.decodeStream(inputStream), this.a);
    }

    public final /* bridge */ /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        return a((InputStream) obj);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, bsq bsq) {
        return too.a((InputStream) obj);
    }
}
