package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gjh */
public final class gjh {
    public static Uri a(axak axak) {
        amqw.a((Object) axak);
        anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
        axak.a(access$000);
        if (axak.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            axuj axuj = (axuj) b;
            if ((axuj.a & 1) != 0) {
                aygk aygk = axuj.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                return aklb.e(aygk);
            } else if (axuj.c.size() != 0) {
                return aklb.e((aygk) axuj.c.get(0));
            }
        }
        return null;
    }

    public static List b(axak axak) {
        amqw.a((Object) axak);
        anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
        axak.a(access$000);
        amqw.b(axak.h.a(access$000.d));
        access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
        axak.a(access$000);
        Object b = axak.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axuj axuj = (axuj) b;
        ArrayList arrayList = new ArrayList();
        for (aygk e : axuj.c) {
            Uri e2 = aklb.e(e);
            if (e2 != null) {
                arrayList.add(e2.toString());
            }
        }
        return arrayList;
    }
}
