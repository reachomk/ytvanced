package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: aklw */
final class aklw implements aklx {
    private final /* synthetic */ aklt a;

    aklw(aklt aklt) {
        this.a = aklt;
    }

    public final brl a(Context context) {
        brl brl = null;
        try {
            brl = bqy.b(context);
            return brl;
        } catch (IllegalArgumentException e) {
            if (!this.a.a.h) {
                return brl;
            }
            StringBuilder stringBuilder = new StringBuilder("Failed to get RequestManager: ");
            if (context instanceof nn) {
                stringBuilder.append("FA");
            } else if (context instanceof Activity) {
                stringBuilder.append("A");
            } else if (context instanceof ContextWrapper) {
                stringBuilder.append("CW");
            }
            stringBuilder.append(" : ");
            stringBuilder.append(context.getClass().getName());
            afpc.a(2, afpf.imagemanager, stringBuilder.toString(), e);
            xtl.a(stringBuilder.toString(), e);
            return brl;
        }
    }
}
