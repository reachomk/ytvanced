package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
import java.util.Map;

/* renamed from: gbh */
public final class gbh implements aaap {
    private final gdu a;

    public gbh(gdu gdu) {
        this.a = gdu;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        zin zin = (zin) xsb.a(map, (Object) "recording_info", zin.class);
        apxu apxu2 = (apxu) xsb.a(map, (Object) "destination_endpoint", apxu.class);
        String str = (String) xsb.a(map, (Object) "fragment_tag", String.class);
        znv znv = (znv) xsb.a(map, (Object) "video_effects_loader", znv.class);
        bacz bacz = (bacz) xsb.a(map, (Object) "comment_sticker", bacz.class);
        gdu gdu = this.a;
        anxr access$000 = anxl.checkIsLite(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        anxp anxp = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) obj).b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(ReelEditVideoRendererOuterClass.reelEditVideoRenderer);
        anxp.a(access$0002);
        obj = anxp.h.b(access$0002.d);
        if (obj == null) {
            obj = access$0002.b;
        } else {
            obj = access$0002.a(obj);
        }
        awxb awxb = (awxb) obj;
        if (gdu.a == null) {
            xtl.c("fragmentManager is null");
            return;
        }
        gdn a = gdn.a(zin, apxu2, znv, apxu, awxb, bacz);
        or a2 = gdu.a.a();
        a2.b(R.id.reel_container, a, str);
        a2.a();
    }
}
