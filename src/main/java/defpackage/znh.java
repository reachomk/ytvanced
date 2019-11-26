package defpackage;

import android.view.TextureView;

/* renamed from: znh */
final /* synthetic */ class znh implements zno {
    private final znf a;
    private final String b;
    private final TextureView c;

    znh(znf znf, String str, TextureView textureView) {
        this.a = znf;
        this.b = str;
        this.c = textureView;
    }

    public final void a(Object obj) {
        znf znf = this.a;
        String str = this.b;
        TextureView textureView = this.c;
        synchronized (znf.c) {
            znf.d.put(str, textureView);
            znf.c.remove(str);
        }
    }
}
