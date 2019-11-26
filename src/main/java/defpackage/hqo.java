package defpackage;

import android.content.Context;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hqo */
public final class hqo implements eij {
    public eir a;
    private final Context b;
    private final eki c;
    private final akzb d;
    private final FrameLayout e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private ProgressBar k;
    private akyy l;
    private Button m;
    private boolean n;

    public hqo(Context context, eki eki, akzb akzb, FrameLayout frameLayout) {
        this.b = context;
        this.c = eki;
        this.d = akzb;
        this.e = frameLayout;
    }

    public final void a() {
        c();
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(this.b.getString(R.string.offline_retry));
            this.j.setOnClickListener(new hqn(this));
            this.j.setVisibility(0);
        }
        ProgressBar progressBar = this.k;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void b() {
        c();
        ProgressBar progressBar = this.k;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a(eir eir) {
        this.a = eir;
    }

    private final void c() {
        if (this.c.a()) {
            d();
            this.f.setImageResource(R.drawable.ic_offline_no_content_on_watch);
            if (this.c.b()) {
                this.g.setText(this.b.getString(R.string.offline_no_content_title_offline_eligible_and_has_content));
                if (this.c.g()) {
                    this.g.setText(R.string.offline_no_content_title_has_download_recommendations);
                    this.h.setText(R.string.offline_no_content_body_text_has_download_recommendations);
                    this.l.a(hqo.a(this.b.getString(R.string.offline_no_content_button_text_has_download_recommendations), ekc.a), null);
                } else if (this.c.f()) {
                    this.h.setText(R.string.offline_no_content_body_text_has_both_downloads_and_recommendations);
                    this.l.a(hqo.a(this.b.getString(R.string.offline_no_content_button_text_has_download_recommendations), ekc.a), null);
                } else {
                    this.h.setText(this.b.getString(R.string.offline_navigate_to_downloads_detail_text));
                    this.l.a(hqo.a(this.b.getString(R.string.offline_navigate_to_downloads_action_text), ekc.a), null);
                }
                this.i.setVisibility(0);
            } else {
                this.g.setText(this.b.getString(R.string.offline_no_content_title_offline_eligible_and_no_content));
                this.h.setText(this.b.getString(R.string.offline_no_content_body_text_offline_eligible_and_no_content));
                this.i.setVisibility(8);
            }
            this.h.setVisibility(0);
            this.m.setVisibility(8);
            return;
        }
        d();
        this.g.setText(this.b.getString(R.string.offline_no_content_title_not_offline_eligible));
        this.f.setImageResource(R.drawable.ic_offline_no_content_upside_down);
        this.h.setText(this.b.getString(R.string.offline_no_content_body_text_not_offline_eligible));
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.m.setVisibility(8);
    }

    private final void d() {
        if (!this.n) {
            this.n = true;
            this.g = (TextView) this.e.findViewById(R.id.error_message_text);
            this.f = (ImageView) this.e.findViewById(R.id.error_icon);
            this.h = (TextView) this.e.findViewById(R.id.error_sub_message_text);
            this.i = (TextView) this.e.findViewById(R.id.link_button);
            this.l = this.d.a(this.i);
            this.m = (Button) this.e.findViewById(R.id.error_retry_button);
            this.j = (TextView) ((ViewStub) this.e.findViewById(R.id.secondary_retry_button_stub)).inflate();
            this.k = (ProgressBar) ((ViewStub) this.e.findViewById(R.id.load_spinner_stub)).inflate();
        }
    }

    private static aphg a(String str, apxu apxu) {
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(3);
        aphf.b(4);
        aphf.a(ajqy.a(str));
        aphf.b(apxu);
        return (aphg) ((anxl) aphf.build());
    }
}
