package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.design.snackbar.Snackbar;
import android.text.Html;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.mdx.smartremote.BitmapSoundLevelsView;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: adwl */
public final class adwl implements adqi, adxs {
    public final Context a;
    public final adqf b;
    public adqe c;
    public final adxa d;
    public boolean e;
    public final acvx f;
    public final View g;
    public final ProgressBar h = ((ProgressBar) this.g.findViewById(R.id.loading_spinner));
    public final TextView i = ((TextView) this.g.findViewById(R.id.loading_text));
    public final TextView j = ((TextView) this.g.findViewById(R.id.title));
    public final MediaRouteButton k = ((MediaRouteButton) this.g.findViewById(R.id.cast_icon));
    public final DpadView l;
    public final TextView m;
    public final TextView n;
    public final MicrophoneView o;
    public final View p;
    public final View q;
    public final String[] r;
    public boolean s;
    public boolean t;
    public boolean u;
    private final adwx v;
    private final Handler w;
    private final SharedPreferences x;
    private final adxn y;

    public adwl(adqf adqf, adxa adxa, View view, adwx adwx, Handler handler, bae bae, baz baz, acvx acvx, SharedPreferences sharedPreferences) {
        this.a = view.getContext();
        this.b = adqf;
        this.c = ((adtp) adqf).c;
        this.d = adxa;
        this.v = adwx;
        this.w = handler;
        this.x = sharedPreferences;
        this.y = new adxn(this.a, handler, this);
        this.f = acvx;
        this.g = view;
        this.l = (DpadView) view.findViewById(R.id.dpad);
        this.m = (TextView) view.findViewById(R.id.voice_query);
        this.n = (TextView) view.findViewById(R.id.voice_tips);
        this.o = (MicrophoneView) view.findViewById(R.id.mic);
        this.p = view.findViewById(R.id.back);
        this.q = view.findViewById(R.id.tap_mic);
        this.r = this.a.getResources().getStringArray(R.array.mdx_smart_remote_voice_tips);
        acvx.a(acwl.D, null, null);
        int a = xwe.a(this.a, R.attr.ytStaticBrandRed);
        if (VERSION.SDK_INT < 21) {
            Drawable d = st.d(this.h.getIndeterminateDrawable());
            st.a(d, a);
            this.h.setIndeterminateDrawable(st.e(d));
        } else {
            this.h.getIndeterminateDrawable().setColorFilter(a, Mode.SRC_IN);
        }
        acvx.b(acwc.MDX_SMART_REMOTE_BUTTON_COLLAPSE_ARROW, null);
        view.findViewById(R.id.collapse).setOnClickListener(new adwo(this, acvx, adwx));
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_UP_ARROW, null);
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_DOWN_ARROW, null);
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_LEFT_ARROW, null);
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_RIGHT_ARROW, null);
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_ENTER, null);
        this.l.a = new adwn(this, acvx);
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_BACK, null);
        this.p.setOnClickListener(new adwq(this, acvx));
        acvx.a(acwc.MDX_SMART_REMOTE_BUTTON_MIC, null);
        this.o.setOnClickListener(new adwp(this, acvx));
        acvx.b(acwc.MDX_SMART_REMOTE_BUTTON_CAST_ICON, null);
        this.k.a(this.a.getResources().getDrawable(R.drawable.ic_media_route_transparent_waves_on_red));
        this.k.a(baz);
        this.k.a(bae);
        this.k.setOnClickListener(new adws(acvx));
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(adqe adqe) {
        this.c = adqe;
        a(0, this.c.h().bv_());
    }

    public final void b(adqe adqe) {
        this.c = adqe;
        a(1, this.c.h().bv_());
    }

    public final void c(adqe adqe) {
        this.c = null;
        this.v.a();
    }

    public final void a(int i, String str) {
        if (i == 0) {
            a(1, false, false);
            this.i.setText(this.a.getString(R.string.mdx_connecting_to_screen, new Object[]{str}));
        } else if (i == 1) {
            if (this.s) {
                a(3, false, false);
            } else {
                b();
            }
            this.j.setText(Html.fromHtml(this.a.getString(R.string.mdx_connected_to_screen, new Object[]{str})));
            if (this.s) {
                str = "MDx.SmartRemote.isDisconnectTipAlreadyShown";
                if (!this.x.getBoolean(str, false)) {
                    YouTubeTextView youTubeTextView = new YouTubeTextView(this.a);
                    youTubeTextView.setText(R.string.mdx_smart_remote_cast_icon_tip);
                    youTubeTextView.setTextSize(2, this.a.getResources().getDimension(R.dimen.mdx_smart_remote_tooltip_text_size));
                    youTubeTextView.setWidth(this.a.getResources().getDimensionPixelSize(R.dimen.mdx_smart_remote_tooltip_width));
                    youTubeTextView.setTextColor(this.a.getResources().getColor(R.color.yt_white2));
                    alcg alcg = new alcg(youTubeTextView, this.k, 2, 2);
                    alcg.a(new adwr(alcg));
                    this.k.getViewTreeObserver().addOnGlobalLayoutListener(new adwy(this, alcg));
                    this.x.edit().putBoolean(str, true).apply();
                }
            }
        }
    }

    public final void a(acwc... acwcArr) {
        for (acwc acvs : acwcArr) {
            this.f.a(new acvs(acvs), null);
        }
    }

    public final boolean a() {
        if (VERSION.SDK_INT >= 24) {
            return this.a.getResources().getConfiguration().getLocales().get(0).getLanguage().equals(Locale.ENGLISH.getLanguage());
        }
        return this.a.getResources().getConfiguration().locale.getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    public final void b() {
        adqe adqe;
        if (this.e) {
            this.y.c.cancel();
            a(4, false, false);
            adqe = this.c;
            if (adqe != null) {
                adqe.a(3, null, null);
            }
            this.e = false;
        } else if (ra.a(this.a, "android.permission.RECORD_AUDIO") != 0) {
            this.v.b();
        } else {
            adxn adxn = this.y;
            if (adxn.c == null) {
                adxn.b.e();
            } else {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                adxn.c.startListening(intent);
            }
            a(2, false, false);
            adqe = this.c;
            if (adqe != null) {
                adqe.a(0, null, null);
            }
            this.e = true;
        }
    }

    public final void a(float f) {
        MicrophoneView microphoneView = this.o;
        int min = (int) (((Math.min(Math.max(f, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
        boolean z = false;
        min = min >= 30 ? (min / 10) * 10 : 0;
        amqw.a(min <= 100);
        BitmapSoundLevelsView bitmapSoundLevelsView = microphoneView.a;
        if (min <= 100) {
            z = true;
        }
        amqw.a(z);
        bitmapSoundLevelsView.a = min;
    }

    public final void a(String str, String str2) {
        adqe adqe = this.c;
        if (adqe != null) {
            adqe.a(1, str, str2);
        }
        this.n.setVisibility(8);
        this.m.setVisibility(0);
        this.m.setText(Html.fromHtml(this.a.getString(R.string.mdx_voice_query_html_format, new Object[]{str, str2})));
    }

    public final void a(String str) {
        adqe adqe = this.c;
        if (adqe != null) {
            adqe.a(2, str, null);
        }
        this.t = true;
        this.m.setText(str);
        this.e = false;
        if (str.isEmpty()) {
            g();
            this.w.postDelayed(new adwt(this), 3500);
            this.u = true;
        }
        a(4, true, str.isEmpty());
    }

    public final void e() {
        Toast.makeText(this.a, R.string.mdx_smart_remote_speech_recognition_not_available, 0).show();
    }

    public final void a(int i) {
        if (!this.u) {
            if (i == 6 || i == 7) {
                g();
            } else {
                Snackbar.a(this.g, R.string.mdx_smart_remote_generic_error_message).c();
                this.f.b(acwc.MDX_SMART_REMOTE_VOICE_SEARCH_GENERIC_ERROR_TOAST, null);
            }
            this.w.postDelayed(new adww(this), 3500);
            this.u = true;
            a(4, true, true);
        }
    }

    public final void f() {
        if (this.u) {
            this.q.setVisibility(0);
            this.u = false;
        }
    }

    private final void g() {
        Snackbar.a(this.g, R.string.mdx_smart_remote_voice_input_error_message).c();
        this.f.b(acwc.MDX_SMART_REMOTE_VOICE_SEARCH_UNRECOGNIZED_INPUT_ERROR_TOAST, null);
    }

    private final void a(int i, boolean z, boolean z2) {
        this.w.postDelayed(new adwu(this, i, z2), !z ? 0 : 1000);
    }
}
