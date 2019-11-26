package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: abpg */
final class abpg implements Runnable {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ abpe b;

    abpg(abpe abpe, apxu apxu) {
        this.b = abpe;
        this.a = apxu;
    }

    public final void run() {
        apxu apxu = this.a;
        anxr access$000 = anxl.checkIsLite(MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Map map = this.b.c;
            apxu apxu2 = this.a;
            anxr access$0002 = anxl.checkIsLite(MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
            apxu2.a(access$0002);
            Object b = apxu2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            abpj abpj = (abpj) map.get(((MarkChatItemAsDeletedAction) b).d);
            if (abpj != null) {
                b = abpj.a;
                if ((b instanceof auhb) || (b instanceof augv)) {
                    this.b.a.removeCallbacks(abpj);
                    abpj.run();
                } else {
                    abpj.d = this.a;
                    this.b.b.a(b, b);
                    return;
                }
            }
        }
        apxu = this.a;
        access$000 = anxl.checkIsLite(MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            abpj abpj2;
            apxu = this.a;
            access$000 = anxl.checkIsLite(MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
            apxu.a(access$000);
            Object b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                b2 = access$000.b;
            } else {
                b2 = access$000.a(b2);
            }
            String str = ((MarkChatItemsByAuthorAsDeletedAction) b2).d;
            ArrayList arrayList = new ArrayList();
            for (abpj abpj22 : this.b.c.values()) {
                if (TextUtils.equals(str, abov.b(abpj22.a))) {
                    Object obj = abpj22.a;
                    if ((obj instanceof auhb) || (obj instanceof augv)) {
                        arrayList.add(abpj22);
                    } else {
                        abpj22.d = this.a;
                        this.b.b.a(obj, obj);
                    }
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                abpj22 = (abpj) arrayList.get(i);
                this.b.a.removeCallbacks(abpj22);
                abpj22.run();
            }
        }
    }
}
