package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.google.protos.youtube.api.innertube.ReelVodLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;

/* renamed from: gef */
public final class gef implements OnClickListener, gfz {
    public final akkq a;
    public View b;
    public View c;
    public ImageButton d;
    public gpp e;
    public geh f;
    public awyt g;
    public boolean h;
    public acvx i;

    public gef(akkq akkq) {
        this.a = akkq;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction) {
        if (videoSelectedActionOuterClass$VideoSelectedAction != null && (videoSelectedActionOuterClass$VideoSelectedAction.a & 1) != 0) {
            anxp anxp = videoSelectedActionOuterClass$VideoSelectedAction.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = videoSelectedActionOuterClass$VideoSelectedAction.c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                this.g = (awyt) b;
                this.e.a(this.g);
                this.b.setVisibility(0);
                this.i.b(acwc.REELS_REMOVE_VIDEO_LINK_BUTTON, null);
                this.h = true;
            }
        }
    }

    public final void onClick(View view) {
        if (view == this.d) {
            this.i.a(3, new acvs(acwc.REELS_REMOVE_VIDEO_LINK_BUTTON), null);
            this.b.setVisibility(8);
            this.f.at();
            this.g = null;
            this.h = false;
        }
    }

    public final View a() {
        return this.b;
    }
}
