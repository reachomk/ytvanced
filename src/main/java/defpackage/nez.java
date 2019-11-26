package defpackage;

import android.view.TextureView;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService;

/* renamed from: nez */
final class nez implements Runnable {
    private final /* synthetic */ ISurfaceTextureService a;
    private final /* synthetic */ nfa b;

    nez(nfa nfa, ISurfaceTextureService iSurfaceTextureService) {
        this.b = nfa;
        this.a = iSurfaceTextureService;
    }

    public final void run() {
        nfa nfa = this.b;
        nfa.c = new nfc(this.a, nfa.a);
        TextureView textureView = new TextureView(this.b.b);
        textureView.setSurfaceTextureListener(this.b.c);
        this.b.a.a(textureView);
    }
}
