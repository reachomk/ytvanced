package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService;
import java.util.HashMap;
import java.util.Set;

/* renamed from: myv */
public final class myv extends mzt {
    public final HashMap a = new HashMap();
    public IEmbedImageClientService b;
    private final Handler c;

    public myv(Handler handler) {
        this.c = handler;
    }

    public final void a() {
        this.b = null;
        this.c.post(new myu(this));
    }

    public final void a(IEmbedImageClientService iEmbedImageClientService) {
        this.c.post(new myx(this, iEmbedImageClientService));
    }

    public final void a(ngm ngm, Bitmap bitmap) {
        this.c.post(new myw(this, ngm, bitmap));
    }

    public final void b(ngm ngm, Bitmap bitmap) {
        Set<wxg> set = (Set) this.a.get(ngm);
        if (set != null) {
            for (wxg a : set) {
                a.a((Object) ngm, (Object) bitmap);
            }
            set.clear();
            this.a.remove(ngm);
        }
    }
}
