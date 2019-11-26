package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Space;

/* renamed from: epr */
public final class epr implements akot {
    private final Context a;
    private final Space b;

    public epr(Context context) {
        this.a = (Context) amqw.a((Object) context);
        this.b = new Space(context);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        epq epq = (epq) obj;
        int i = 0;
        if (!(akor.a("vertical_padding_should_display_top") == Boolean.FALSE && akor.a("position") == Integer.valueOf(0))) {
            Resources resources = this.a.getResources();
            if (epq.b != 1) {
                i = epq.a;
            } else {
                i = xss.a(resources.getDisplayMetrics(), epq.a);
            }
        }
        this.b.setMinimumHeight(i);
    }
}
