package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: aieg */
public final class aieg extends aiud implements aido, OnClickListener {
    private static final float[] b = new float[]{0.0f, 18750.0f, 37500.0f, 81250.0f, 128000.0f, 256000.0f, 512000.0f, 2048000.0f, 8192000.0f, 3.2768E7f, 1.31072E8f};
    private static final int[] c = new int[]{-16777216, -2802097, -758461, -151967, -73589, -1641064, -5513820, -10042715, -13465411, -15579768, -1};
    private static final float[] d = new float[]{0.0f, 15.0f, 30.0f, 60.0f, 90.0f, 120.0f};
    private static final int[] e = new int[]{-16777216, -151967, -1641064, -10042715, -13465411, -1};
    private TextView A;
    private TextView B;
    private View C;
    private TextView D;
    private View E;
    private TextView F;
    public aidn a;
    private View f;
    private View g;
    private View h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private View o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private xoo t;
    private ImageView u;
    private TextView v;
    private xoo w;
    private ImageView x;
    private TextView y;
    private TextView z;

    public aieg(Context context) {
        super(context);
    }

    public final void a(aidn aidn) {
        this.a = aidn;
    }

    public final void a(String str) {
        this.i.setText(str);
    }

    public final void d(String str) {
        this.j.setText(str);
    }

    public final void e(String str) {
        this.k.setText(str);
    }

    public final void a(int i, float f, float f2) {
        if (this.r != null) {
            int round = Math.round(f * ((float) i));
            double d = (double) f2;
            Double.isNaN(d);
            long round2 = Math.round(d * 10.0d);
            StringBuilder stringBuilder = new StringBuilder(71);
            stringBuilder.append(i);
            stringBuilder.append("%/");
            stringBuilder.append(round);
            stringBuilder.append("%(content loudness ");
            double d2 = (double) round2;
            Double.isNaN(d2);
            stringBuilder.append(d2 / 10.0d);
            stringBuilder.append(" dB)");
            this.r.setText(stringBuilder.toString());
        }
    }

    public final void b(String str) {
        this.l.setText(aieg.g(str));
    }

    public final void c(String str) {
        this.m.setText(aieg.g(str));
    }

    public final void a(aahr aahr) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(aied.a(aahr));
        }
    }

    public final void a(aaju aaju) {
        if (this.p != null) {
            if (aaju == null || aaju == aaju.NOOP || aaju == aaju.RECTANGULAR_2D) {
                this.o.setVisibility(8);
                this.p.setVisibility(8);
            } else {
                this.o.setVisibility(0);
                this.p.setVisibility(0);
                this.p.setText(aaju.toString().toLowerCase(Locale.US));
            }
        }
    }

    public final void b(aahr aahr) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setText(aied.a(aahr));
        }
    }

    public final void a(float f) {
        CharSequence format;
        this.u.setImageBitmap(this.t.a(f));
        TextView textView = this.s;
        double d = (double) f;
        Locale locale;
        Object[] objArr;
        if (d < 1000000.0d) {
            locale = Locale.US;
            objArr = new Object[1];
            Double.isNaN(d);
            objArr[0] = Double.valueOf(d / 1000.0d);
            format = String.format(locale, " %.3g kbps", objArr);
        } else if (d < 1.0E9d) {
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[1];
            Double.isNaN(d);
            objArr2[0] = Double.valueOf(d / 1000000.0d);
            format = String.format(locale2, " %.3g mbps", objArr2);
        } else {
            locale = Locale.US;
            objArr = new Object[1];
            Double.isNaN(d);
            objArr[0] = Double.valueOf(d / 1.0E9d);
            format = String.format(locale, " %.3g gbps", objArr);
        }
        textView.setText(format);
    }

    public final void a(long j) {
        this.x.setImageBitmap(this.w.a(((float) j) / 1000.0f));
        this.v.setText(String.format(Locale.US, " %.3g s", new Object[]{Float.valueOf(r4)}));
    }

    public final void a(afjs afjs) {
        this.y.setText(afjs.toString());
    }

    public final void a(int i, int i2) {
        TextView textView = this.z;
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append(i);
        stringBuilder.append(" / ");
        stringBuilder.append(i + i2);
        textView.setText(stringBuilder.toString());
    }

    public final void b(long j) {
        if (j != -1) {
            this.C.setVisibility(0);
            this.D.setVisibility(0);
            this.D.setText(String.format(Locale.US, "%.2fs", new Object[]{Float.valueOf(((float) j) / 1000.0f)}));
            return;
        }
        this.C.setVisibility(8);
        this.D.setVisibility(8);
    }

    public final void f(String str) {
        if (!(this.F == null || this.E == null)) {
            if (str == null || str.isEmpty()) {
                this.F.setVisibility(8);
                this.E.setVisibility(8);
            } else {
                this.F.setVisibility(0);
                this.E.setVisibility(0);
                this.F.setText(str);
            }
        }
    }

    private static String g(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() + 3);
        stringBuilder.append(" [");
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void onClick(View view) {
        if (view == this.g) {
            this.a.d();
        } else if (view == this.h) {
            this.a.e();
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void bB_() {
        if (this.f == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.default_nerd_stats_overlay, this);
            this.f = findViewById(R.id.nerd_stats_layout);
            this.g = findViewById(R.id.dismiss_button);
            this.g.setOnClickListener(this);
            this.g.setVisibility(0);
            this.h = findViewById(R.id.copy_debug_info_button);
            this.h.setOnClickListener(this);
            this.h.setVisibility(0);
            this.i = (TextView) findViewById(R.id.device_info);
            this.j = (TextView) findViewById(R.id.video_id);
            this.k = (TextView) findViewById(R.id.cpn);
            this.l = (TextView) findViewById(R.id.player_type);
            this.m = (TextView) findViewById(R.id.playback_type);
            this.n = (TextView) findViewById(R.id.video_format);
            this.q = (TextView) findViewById(R.id.audio_format);
            this.r = (TextView) findViewById(R.id.volume);
            this.s = (TextView) findViewById(R.id.bandwidth_estimate);
            this.u = (ImageView) findViewById(R.id.bandwidth_sparkline);
            this.v = (TextView) findViewById(R.id.readahead);
            this.x = (ImageView) findViewById(R.id.readahead_sparkline);
            this.y = (TextView) findViewById(R.id.viewport);
            this.z = (TextView) findViewById(R.id.dropped_frames);
            this.A = (TextView) findViewById(R.id.battery_current_title);
            this.B = (TextView) findViewById(R.id.battery_current);
            this.C = findViewById(R.id.latency_title);
            this.D = (TextView) findViewById(R.id.latency);
            this.o = findViewById(R.id.video_gl_rendering_mode_title);
            this.p = (TextView) findViewById(R.id.video_gl_rendering_mode);
            this.F = (TextView) findViewById(R.id.content_protection);
            this.E = findViewById(R.id.content_protection_title);
            this.C.measure(0, 0);
            int a = xss.a(getResources().getDisplayMetrics(), 100);
            int measuredHeight = this.C.getMeasuredHeight() - 1;
            this.t = new xoo(a, measuredHeight, b, c);
            this.w = new xoo(a, measuredHeight, d, e);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
        }
        this.f.setVisibility(0);
    }

    public final void c() {
        this.f.setVisibility(8);
    }
}
