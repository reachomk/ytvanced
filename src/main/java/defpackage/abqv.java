package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.LiveChatAction.ShowLiveChatDialogAction;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import java.util.Map;

/* renamed from: abqv */
public final class abqv implements aaap {
    private final Context a;
    private final akkl b;
    private final aaas c;
    private final acvx d;

    public abqv(Context context, akkl akkl, aaas aaas, acvx acvx) {
        this.a = context;
        this.b = akkl;
        this.c = aaas;
        this.d = acvx;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(ShowLiveChatDialogAction.showLiveChatDialogAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ShowLiveChatDialogAction showLiveChatDialogAction = (ShowLiveChatDialogAction) obj;
        anxr access$0002 = anxl.checkIsLite(ShowLiveChatDialogAction.showLiveChatDialogAction);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d) && (showLiveChatDialogAction.a & 1) != 0) {
            anxp anxp = showLiveChatDialogAction.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(UpsellDialogRendererOuterClass.upsellDialogRenderer);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d)) {
                anxp = showLiveChatDialogAction.b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(UpsellDialogRendererOuterClass.upsellDialogRenderer);
                anxp.a(access$000);
                Object b2 = anxp.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                new abvk((ayvi) b2, this.a, this.b, this.c, this.d).b();
                return;
            }
        }
        throw new aabf();
    }
}
