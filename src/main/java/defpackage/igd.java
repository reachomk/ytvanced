package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: igd */
public final class igd extends aiua implements enc, vws {
    public final akkq a;
    public final boolean b;
    public ViewGroup c;
    public vwv d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    private final Context i;
    private TextView j;
    private ViewGroup k;
    private TextView[] l;
    private View m;
    private View n;
    private TextView o;
    private TextView p;
    private Drawable q;
    private Drawable r;
    private vyy s;
    private final igj t;
    private boolean u;
    private boolean v;

    public igd(Context context, akkq akkq, zyw zyw) {
        super(context);
        this.i = context;
        this.a = akkq;
        this.b = foh.e(zyw);
        this.t = new igj(this, context);
        f();
    }

    public final void c() {
        if (this.c == null) {
            this.c = (ViewGroup) LayoutInflater.from(this.i).inflate(R.layout.survey_overlay, this);
            this.j = (TextView) this.c.findViewById(R.id.minimize_survey);
            this.k = (ViewGroup) this.c.findViewById(R.id.normal_survey);
            this.o = (TextView) this.k.findViewById(R.id.survey_question);
            this.q = ra.a(this.i, (int) R.drawable.survey_checked);
            this.r = ra.a(this.i, (int) R.drawable.survey_unchecked);
            this.p = (TextView) this.k.findViewById(R.id.survey_attribution);
            this.s = new vyy(this.p);
            r0 = new TextView[5];
            int i = 0;
            r0[0] = (TextView) this.k.findViewById(R.id.survey_answer_1);
            r0[1] = (TextView) this.k.findViewById(R.id.survey_answer_2);
            r0[2] = (TextView) this.k.findViewById(R.id.survey_answer_3);
            r0[3] = (TextView) this.k.findViewById(R.id.survey_answer_4);
            r0[4] = (TextView) this.k.findViewById(R.id.survey_answer_5);
            this.l = r0;
            this.m = this.k.findViewById(R.id.skip_button);
            this.m.setOnClickListener(new igf(this));
            this.m.setOnTouchListener(new igi(this));
            this.n = this.k.findViewById(R.id.submit_button);
            this.n.setOnClickListener(new igh(this));
            while (true) {
                r0 = this.l;
                if (i < r0.length) {
                    r0[i].setOnClickListener(new igk(this, i));
                    i++;
                } else {
                    this.p.setOnClickListener(new igg(this));
                    return;
                }
            }
        }
    }

    public final void a(String str, List list, boolean z) {
        c();
        f();
        this.e = z;
        this.f = list.size();
        this.j.setText(str);
        this.o.setText(str);
        int size = list.size();
        for (int i = 0; i < this.l.length; i++) {
            if (i < list.size()) {
                this.l[i].setText((CharSequence) list.get(i));
                this.l[i].setVisibility(0);
            } else if (i == size && z) {
                this.l[i].setText(R.string.survey_none_of_the_above);
                this.l[i].setVisibility(0);
            } else {
                this.l[i].setVisibility(4);
            }
            a(i, false);
        }
        this.c.setVisibility(0);
    }

    public final void d() {
        this.s.a(true, false);
    }

    public final void a(int i) {
        if (this.c != null) {
            String b = xvd.b((long) ((int) Math.ceil((double) (((float) i) / 1000.0f))));
            this.p.setText(this.c.getResources().getString(R.string.survey_attribution, new Object[]{b}));
        }
    }

    public final void e() {
        this.v = true;
        h();
    }

    public final void a(vwv vwv) {
        this.d = vwv;
    }

    public final void f() {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.s.a();
            this.m.setVisibility(8);
            this.n.setVisibility(8);
        }
        this.u = false;
        this.v = false;
        this.g = 0;
        this.h = 0;
        setVisibility(8);
    }

    public final void a(boolean z) {
        setVisibility(!z ? 8 : 0);
    }

    public final vwq g() {
        return this.t;
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final boolean a(ejd ejd) {
        return emq.a(ejd);
    }

    public final void b(ejd ejd) {
        if (!ejd.f()) {
            if (this.c != null) {
                this.j.setVisibility(8);
                this.k.setVisibility(0);
            }
            igj igj = this.t;
            if (igj != null) {
                boolean a = ejd.a();
                if (igj.a != null) {
                    float dimension;
                    float dimension2;
                    if (a) {
                        dimension = igj.f.i.getResources().getDimension(R.dimen.large_font_size);
                    } else if (xss.b(igj.f.i)) {
                        dimension = igj.f.i.getResources().getDimension(R.dimen.medium_font_size);
                    } else {
                        dimension = igj.f.i.getResources().getDimension(R.dimen.small_font_size);
                    }
                    if (a) {
                        dimension2 = igj.f.i.getResources().getDimension(R.dimen.large_font_size);
                    } else {
                        dimension2 = igj.f.i.getResources().getDimension(R.dimen.medium_font_size);
                    }
                    igj.b.setTextSize(0, dimension);
                    igj.c.setTextSize(0, dimension2);
                }
            }
        } else if (this.c != null) {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
        }
    }

    public final void h() {
        int i;
        boolean z;
        this.u = false;
        int i2 = 0;
        while (true) {
            i = this.f;
            z = true;
            if (i2 >= i) {
                break;
            }
            if (!(this.u || b(i2))) {
                z = false;
            }
            this.u = z;
            i2++;
        }
        if (!(this.u || (this.e && b(i)))) {
            z = false;
        }
        this.u = z;
        if (this.c != null) {
            View view = this.n;
            i = 8;
            int i3 = (z && this.e) ? 0 : 8;
            view.setVisibility(i3);
            view = this.m;
            if (this.v && !this.u) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final void i() {
        if (this.d != null) {
            int[] iArr = new int[this.f];
            int i = 0;
            for (int i2 = 0; i2 < this.f; i2++) {
                if (b(i2)) {
                    int i3 = i + 1;
                    iArr[i] = i2;
                    i = i3;
                }
            }
            this.d.a(Arrays.copyOf(iArr, i));
        }
    }

    public final void a(int i, boolean z) {
        if (this.c != null) {
            TextView[] textViewArr = this.l;
            if (i < textViewArr.length) {
                textViewArr[i].setSelected(z);
                if (this.e) {
                    Drawable drawable;
                    TextView textView = this.l[i];
                    if (z) {
                        drawable = this.q;
                    } else {
                        drawable = this.r;
                    }
                    adl.a(textView, null, null, drawable);
                    return;
                }
                this.l[i].setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            }
        }
    }

    private final boolean b(int i) {
        if (this.c != null) {
            TextView[] textViewArr = this.l;
            if (i < textViewArr.length && textViewArr[i].isSelected()) {
                return true;
            }
        }
        return false;
    }
}
