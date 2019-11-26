package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kco */
final class kco extends epp {
    private final eus d;
    private final eso e;
    private final akoj f;
    private final View g = this.a.findViewById(R.id.channel_subscribe_button_container);
    private boolean h;
    private final /* synthetic */ kcp i;

    kco(kcp kcp) {
        this.i = kcp;
        super(kcp.a, kcp.b, R.layout.grid_channel_item);
        this.f = kcp.e.a(kcp.c);
        TextView textView = (TextView) this.a.findViewById(R.id.subscribe_button);
        this.d = kcp.h.a(this.a.findViewById(R.id.subscription_notification_view));
        this.e = kcp.g.a(textView, this.d);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.f.a();
        this.e.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        View b;
        ajvw ajvw = (ajvw) obj;
        a(ajqy.a(ajvw.e));
        xpr.a(this.c, ajqy.a(ajvw.b));
        b(ajqy.a(ajvw.c));
        a(ajvw.a);
        arrs arrs = ajvw.f;
        axwa axwa = null;
        if (arrs != null && arrs.a == 55419609) {
            axwa = (axwa) arrs.b;
        }
        acvx acvx = akor.a;
        if (axwa != null) {
            axwa = (axwa) ((anxl) evj.a(this.i.a, (axwd) ((anxo) axwa.toBuilder()), this.b.getText()).build());
        }
        this.e.a(axwa, acvx);
        boolean z = true;
        if (!this.h) {
            b = this.d.b();
            if (b != null) {
                int dimensionPixelOffset = this.i.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_vertical_padding);
                int dimensionPixelOffset2 = this.i.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_horizontal_padding);
                b.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
                this.h = true;
            }
        }
        b = this.g;
        if (this.i.d == null) {
            z = false;
        }
        xpr.a(b, z);
        this.f.a(akor.a, ajvw.d, akor.b());
    }
}
