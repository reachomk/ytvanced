package defpackage;

import android.content.Context;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: ltm */
public final class ltm {
    public xoy a;
    private final Context b;
    private final eki c;
    private final LoadingFrameLayout d;
    private final xhv e;
    private final akzb f;
    private final boolean g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private akyu m;
    private boolean n;

    public ltm(Context context, eki eki, xhv xhv, akzb akzb, LoadingFrameLayout loadingFrameLayout, boolean z) {
        this.b = context;
        this.c = eki;
        this.e = xhv;
        this.f = akzb;
        this.d = loadingFrameLayout;
        this.g = z;
        if (!z) {
            loadingFrameLayout.a((int) R.layout.loading_frame_offline_status_view);
        }
    }

    public final void a(ahjc ahjc) {
        if (this.g) {
            this.d.a(null);
        } else if (this.e.c()) {
            this.d.a(ahjc.c, ahjc.a);
            if (this.h == null) {
                this.h = (TextView) this.d.findViewById(R.id.error_message_text);
            }
            this.h.setTextSize(xss.b(this.b.getResources().getDisplayMetrics(), this.b.getResources().getDimension(R.dimen.medium_font_size)));
            this.h.setTextColor(this.b.getResources().getColor(R.color.grey));
            this.h.setTypeface(ajrc.ROBOTO_LIGHT.a(this.b));
        } else {
            if (this.c.b()) {
                this.d.a(this.b.getString(R.string.offline_no_content_title_offline_eligible_and_has_content), (int) R.drawable.ic_offline_no_content_on_watch);
                a();
                this.i.setText(this.b.getString(R.string.offline_navigate_to_downloads_detail_text));
                akyu akyu = this.m;
                String string = this.b.getString(R.string.offline_navigate_to_downloads_action_text);
                apxu apxu = ekc.a;
                aphf aphf = (aphf) aphg.s.createBuilder();
                aphf.a(3);
                aphf.b(4);
                aphf.a(ajqy.a(string));
                aphf.b(apxu);
                akyu.a((aphg) ((anxl) aphf.build()), null);
                this.i.setVisibility(0);
                this.j.setVisibility(0);
                this.k.setVisibility(8);
            } else {
                this.d.a(this.b.getString(R.string.offline_no_content_title_not_offline_eligible), (int) R.drawable.ic_offline_no_content_upside_down);
                a();
                this.i.setText(this.b.getString(R.string.offline_no_content_body_text_not_offline_eligible));
                this.i.setVisibility(0);
                this.j.setVisibility(8);
                this.k.setVisibility(8);
            }
            TextView textView = this.l;
            if (textView != null) {
                textView.setText(this.b.getString(R.string.offline_retry));
                this.l.setOnClickListener(new ltl(this));
                this.l.setVisibility(0);
            }
        }
    }

    private final void a() {
        if (!this.n) {
            this.n = true;
            this.i = (TextView) this.d.findViewById(R.id.watch_panel_error_offline_message).findViewById(R.id.error_sub_message_text);
            this.j = (TextView) this.d.findViewById(R.id.link_button);
            this.m = this.f.a(this.j);
            this.k = (TextView) this.d.findViewById(R.id.error_retry_button);
            this.l = (TextView) ((ViewStub) this.d.findViewById(R.id.secondary_retry_button_stub)).inflate();
        }
    }
}
