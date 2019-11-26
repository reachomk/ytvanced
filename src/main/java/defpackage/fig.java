package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: fig */
public final class fig implements akot, xcp {
    public akwl a;
    private final Context b;
    private final akou c;
    private final xci d;
    private final FrameLayout e;
    private final YouTubeTextView f;
    private final OnClickListener g;
    private View h;
    private View i;
    private View j;
    private int k = -1;

    public fig(Context context, akpn akpn, xci xci) {
        this.b = context;
        this.c = akpn;
        this.d = xci;
        this.e = new FrameLayout(context);
        this.f = (YouTubeTextView) LayoutInflater.from(context).inflate(R.layout.text_link_item_common, null);
        this.e.addView(this.f);
        akpn.a(this.e);
        this.g = new fif(this);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    private final void a(akuq akuq) {
        if (akuq.a) {
            b();
            return;
        }
        d();
        e();
        xpr.a(this.f, true);
    }

    private final void b() {
        if (this.h == null) {
            this.h = LayoutInflater.from(this.b).inflate(R.layout.loading_frame_status_progress_view, this.e, false);
            this.e.addView(this.h);
        }
        c();
        e();
        xpr.a(this.h, true);
    }

    private final void a(akuv akuv) {
        c();
        d();
        e();
        if (akuv.a() != 1) {
            LayoutParams layoutParams = this.e.getLayoutParams();
            if (this.k >= 2 || !ajti.RELOAD.a(akuv.c)) {
                if (this.i == null) {
                    this.i = LayoutInflater.from(this.b).inflate(R.layout.loading_status_error_compact_view, this.e, false);
                    this.e.addView(this.i);
                }
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                a(this.i, akuv, this.g);
            } else {
                if (this.j == null) {
                    this.j = LayoutInflater.from(this.b).inflate(R.layout.loading_status_error_full_view_common, this.e, false);
                    this.e.addView(this.j);
                }
                if (layoutParams != null) {
                    layoutParams.height = -1;
                }
                a(this.j, akuv, this.g);
            }
        }
    }

    private final void a(View view, akuv akuv, OnClickListener onClickListener) {
        ((TextView) view.findViewById(R.id.error_message_text)).setText(akuv.a.a);
        View findViewById = view.findViewById(R.id.error_retry_button);
        xpr.a(findViewById, akuv.b);
        if (!akuv.b) {
            onClickListener = null;
        }
        findViewById.setOnClickListener(onClickListener);
        ImageView imageView = (ImageView) view.findViewById(R.id.error_icon);
        if (imageView != null) {
            imageView.setImageDrawable(ra.a(this.b, akuv.a() == 1 ? R.drawable.quantum_ic_cloud_off_grey600_48 : R.drawable.quantum_ic_error_outline_grey600_48));
        }
        xpr.a(view, true);
    }

    private final void c() {
        xpr.a(this.f, false);
    }

    private final void d() {
        View view = this.h;
        if (view != null) {
            xpr.a(view, false);
        }
    }

    private final void e() {
        View view = this.i;
        if (view != null) {
            xpr.a(view, false);
        }
        view = this.j;
        if (view != null) {
            xpr.a(view, false);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akwl akwl = (akwl) obj;
        Object obj2 = akwl.b;
        if (obj2 != null) {
            akwl akwl2 = this.a;
            if (akwl2 == null || akwl2.b != obj2) {
                this.d.b(this);
                this.d.a((Object) this, obj2);
            }
        }
        this.a = akwl;
        this.c.a(akwl.d);
        CharSequence charSequence = akwl.c;
        if (charSequence != null) {
            this.f.setText(charSequence);
        } else {
            this.f.setText(R.string.load_more_label);
        }
        LayoutParams layoutParams = this.e.getLayoutParams();
        if (!(layoutParams == null || layoutParams.height == -2)) {
            layoutParams.height = -2;
            this.e.setLayoutParams(layoutParams);
        }
        this.k = akor.a("position", -1);
        akux akux = akwl.a;
        if (akux instanceof akuq) {
            a((akuq) akux);
        } else if (akux instanceof akuu) {
            b();
        } else if (akux instanceof akuv) {
            a((akuv) akux);
        }
        this.c.a(akor);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{akuq.class, akuv.class, akuu.class};
        } else if (i == 0) {
            a((akuq) obj);
            return null;
        } else if (i == 1) {
            a((akuv) obj);
            return null;
        } else if (i == 2) {
            b();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
