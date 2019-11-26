package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService;

/* renamed from: nau */
public final class nau extends mzu {
    public final aicu a;
    public nba b;
    private final Handler c;

    public nau(aicu aicu, Handler handler) {
        this.a = (aicu) amqw.a((Object) aicu, (Object) "target cannot be null");
        this.c = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void d() {
        nba nba = this.b;
        if (nba != null) {
            nba.a = null;
            this.b = null;
        }
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.c.post(new nax(this, charSequence, charSequence2, z, charSequence3, i, charSequence4, i2));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.c.post(new naw(this, charSequence, charSequence2, charSequence3));
    }

    public final int b() {
        return this.a.getWidth();
    }

    public final int c() {
        return this.a.getHeight();
    }

    public final void a(Bitmap bitmap) {
        this.c.post(new nbb(this, bitmap));
    }

    public final void a(ILiveOverlayService iLiveOverlayService) {
        this.c.post(new naz(this, iLiveOverlayService));
    }

    public final void a() {
        this.c.post(new nay(this));
    }
}
