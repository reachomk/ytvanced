package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService;

/* renamed from: mwo */
public final class mwo extends mzb {
    public final mtm a;
    public mxa b;
    private final Handler c;

    public mwo(mtm mtm, Handler handler) {
        this.a = (mtm) amqw.a((Object) mtm, (Object) "target cannot be null");
        this.c = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void a() {
        mxa mxa = this.b;
        if (mxa != null) {
            mxa.a = null;
            this.b = null;
        }
    }

    public final void a(IAdOverlayService iAdOverlayService) {
        this.c.post(new mwr(this, iAdOverlayService));
    }

    public final void a(boolean z) {
        this.c.post(new mwq(this, z));
    }

    public final void b(boolean z) {
        this.c.post(new mws(this, z));
    }

    public final void a(CharSequence charSequence) {
        this.c.post(new mwv(this, charSequence));
    }

    public final void a(int i) {
        this.c.post(new mwu(this, i));
    }

    public final void a(Bitmap bitmap) {
        this.c.post(new mwx(this, bitmap));
    }

    public final void b(int i) {
        this.c.post(new mww(this, i));
    }

    public final void c(boolean z) {
        this.c.post(new mwz(this, z));
    }

    public final void d(boolean z) {
        this.c.post(new mwy(this, z));
    }

    public final void e(boolean z) {
        this.c.post(new mxb(this, z));
    }

    public final void b(CharSequence charSequence) {
        this.c.post(new mwt(this, charSequence));
    }
}
