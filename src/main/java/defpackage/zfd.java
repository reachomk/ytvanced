package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zfd */
public final class zfd extends oo {
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();

    public zfd(nt ntVar, zep zep, zen zen, zer zer) {
        zfv zfv;
        super(ntVar);
        if (zep != null) {
            zfv = new zfv();
            zfv.b = zep;
            this.b.add(zfv);
            this.c.add(zep.a);
            this.d.add(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_LIBRARY_SUGGESTED_TAB);
        }
        if (zen != null) {
            zfp zfp = new zfp();
            zfp.b = zen;
            this.b.add(zfp);
            this.c.add(zen.a);
            this.d.add(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_LIBRARY_CATEGORY_TAB);
        }
        if (zer != null) {
            zfv = new zfv();
            zfv.b = zer;
            this.b.add(zfv);
            this.c.add(zer.a);
            this.d.add(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_LIBRARY_ON_DEVICE_TAB);
        }
    }

    public final acwc c(int i) {
        List list = this.d;
        return (acwc) list.get(xru.a(i, list.size()));
    }

    public final int c() {
        return this.b.size();
    }

    public final nf a(int i) {
        List list = this.b;
        return (nf) list.get(xru.a(i, list.size()));
    }

    public final CharSequence b(int i) {
        List list = this.c;
        return (CharSequence) list.get(xru.a(i, list.size()));
    }
}
