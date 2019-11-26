package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hbw */
public final class hbw extends abta {
    private final akle m;

    public hbw(Context context, abru abru, aaas aaas, akkq akkq, akvp akvp, abrf abrf, abrq abrq, abqz abqz, acwa acwa) {
        super(context, abru, aaas, akvp, abrf, abrq, abqz, acwa);
        this.m = new akle(akkq.c(), this.a);
    }

    public final int b() {
        return R.layout.live_chat_light_purchase_flow_item;
    }

    public final void a(aygk aygk) {
        this.m.a(aygk);
    }

    public final void c() {
        if (this.e || this.f) {
            this.d.setEnabled(false);
            this.d.setTextColor(xwe.a(this.c, R.attr.ytTextDisabled, 0));
            return;
        }
        this.d.setEnabled(true);
        this.d.setTextColor(ra.c(this.c, R.color.yt_white1));
    }

    public final void a(akpb akpb) {
        abrf abrf = this.i;
        abrf.c.a((akpb) abrf.a.get());
        abrf.c = null;
        abrf.e = null;
        abrf.d = false;
        this.m.b();
    }
}
