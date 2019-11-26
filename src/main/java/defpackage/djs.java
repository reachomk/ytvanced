package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;

/* renamed from: djs */
final class djs implements wgo {
    private volatile Object a = new baqe();
    private volatile Object b = new baqe();
    private final /* synthetic */ diu c;

    public final void a(wfz wfz) {
        wfz.a = this.c.oA();
        wfz.b = this.c.jY();
        wfz.c = this.c.jX();
        Object obj = this.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    Context ow = this.c.ow();
                    Object obj3 = this.a;
                    if (obj3 instanceof baqe) {
                        Object obj4;
                        synchronized (obj3) {
                            obj4 = this.a;
                            if (obj4 instanceof baqe) {
                                obj4 = new wgi(this.c.ow());
                                this.a = bapx.a(this.a, obj4);
                            }
                        }
                        obj3 = obj4;
                    }
                    wgm wgm = new wgm(ow, (wgi) obj3);
                    this.b = bapx.a(this.b, wgm);
                    obj2 = wgm;
                }
            }
            obj = obj2;
        }
        wfz.Z = (wgm) obj;
    }

    public final void a(alaf alaf) {
        alaf.a = this.c.ox();
    }

    public final void a(ImageGalleryActivity imageGalleryActivity) {
        imageGalleryActivity.g = this.c.jY();
    }

    /* synthetic */ djs(diu diu) {
        this.c = diu;
    }
}
