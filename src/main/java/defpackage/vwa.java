package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: vwa */
public final class vwa extends aiua implements OnClickListener, OnTouchListener, vws {
    public vwv a;
    private ViewGroup b;
    private ViewGroup c;
    private TextView[] d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private Drawable i;
    private Drawable j;
    private vyy k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;

    public vwa(Context context) {
        super(context);
        if (this.b == null) {
            this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.survey_overlay, this);
            TextView textView = (TextView) this.b.findViewById(R.id.minimize_survey);
            this.c = (ViewGroup) this.b.findViewById(R.id.normal_survey);
            this.g = (TextView) this.c.findViewById(R.id.survey_question);
            this.i = ra.a(context, (int) R.drawable.survey_checked);
            this.j = ra.a(context, (int) R.drawable.survey_unchecked);
            this.h = (TextView) this.c.findViewById(R.id.survey_attribution);
            this.k = new vyy(this.h);
            ViewGroup[] viewGroupArr = new ViewGroup[]{(ViewGroup) this.c.findViewById(R.id.survey_answers_row_1), (ViewGroup) this.c.findViewById(R.id.survey_answers_row_2), (ViewGroup) this.c.findViewById(R.id.survey_answers_row_3)};
            this.d = new TextView[]{(TextView) this.c.findViewById(R.id.survey_answer_1), (TextView) this.c.findViewById(R.id.survey_answer_2), (TextView) this.c.findViewById(R.id.survey_answer_3), (TextView) this.c.findViewById(R.id.survey_answer_4), (TextView) this.c.findViewById(R.id.survey_answer_5)};
            this.e = this.c.findViewById(R.id.skip_button);
            this.e.setOnClickListener(this);
            this.e.setOnTouchListener(this);
            this.f = this.c.findViewById(R.id.submit_button);
            this.f.setOnClickListener(this);
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.d;
                if (i >= textViewArr.length) {
                    break;
                }
                textViewArr[i].setOnClickListener(this);
                i++;
            }
            textView.setVisibility(8);
            this.c.setVisibility(0);
            this.h.setOnClickListener(new vwd(this));
        }
        f();
    }

    public final vwq g() {
        return null;
    }

    public final void a(String str, List list, boolean z) {
        f();
        this.l = z;
        this.m = list.size();
        this.g.setText(str);
        int size = list.size();
        for (int i = 0; i < this.d.length; i++) {
            if (i < list.size()) {
                this.d[i].setText((CharSequence) list.get(i));
                this.d[i].setVisibility(0);
            } else if (i == size && z) {
                this.d[i].setText(R.string.survey_none_of_the_above);
                this.d[i].setVisibility(0);
            } else {
                this.d[i].setVisibility(4);
            }
            a(i, false);
        }
        this.b.setVisibility(0);
    }

    public final void d() {
        this.k.a(true, false);
    }

    public final void a(int i) {
        if (this.b != null) {
            String b = xvd.b((long) ((int) Math.ceil((double) (((float) i) / 1000.0f))));
            this.h.setText(this.b.getResources().getString(R.string.survey_attribution, new Object[]{b}));
        }
    }

    public final void e() {
        this.o = true;
        c();
    }

    public final void a(vwv vwv) {
        this.a = vwv;
    }

    public final void f() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.k.a();
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
        this.n = false;
        this.o = false;
        this.p = 0;
        this.q = 0;
        setVisibility(8);
    }

    public final void a(boolean z) {
        setVisibility(!z ? 8 : 0);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    private final void c() {
        int i;
        boolean z;
        this.n = false;
        int i2 = 0;
        while (true) {
            i = this.m;
            z = true;
            if (i2 >= i) {
                break;
            }
            if (!(this.n || b(i2))) {
                z = false;
            }
            this.n = z;
            i2++;
        }
        if (!(this.n || (this.l && b(i)))) {
            z = false;
        }
        this.n = z;
        if (this.b != null) {
            View view = this.f;
            i = 8;
            int i3 = (z && this.l) ? 0 : 8;
            view.setVisibility(i3);
            view = this.e;
            if (this.o && !this.n) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    private final void h() {
        if (this.a != null) {
            int[] iArr = new int[this.m];
            int i = 0;
            for (int i2 = 0; i2 < this.m; i2++) {
                if (b(i2)) {
                    int i3 = i + 1;
                    iArr[i] = i2;
                    i = i3;
                }
            }
            this.a.a(Arrays.copyOf(iArr, i));
        }
    }

    private final void a(int i, boolean z) {
        if (this.b != null) {
            TextView[] textViewArr = this.d;
            if (i < textViewArr.length) {
                textViewArr[i].setSelected(z);
                if (this.l) {
                    Drawable drawable;
                    TextView textView = this.d[i];
                    if (z) {
                        drawable = this.i;
                    } else {
                        drawable = this.j;
                    }
                    adl.a(textView, null, null, drawable);
                    return;
                }
                this.d[i].setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            }
        }
    }

    private final boolean b(int i) {
        if (this.b != null) {
            TextView[] textViewArr = this.d;
            if (i < textViewArr.length && textViewArr[i].isSelected()) {
                return true;
            }
        }
        return false;
    }

    public final void onClick(View view) {
        if (view == this.e) {
            vwv vwv = this.a;
            if (vwv != null) {
                vwv.a(this.p, this.q);
            }
        } else if (view != this.f) {
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.d;
                if (i >= textViewArr.length) {
                    break;
                }
                if (view == textViewArr[i]) {
                    int isSelected = view.isSelected() ^ 1;
                    a(i, isSelected);
                    if (this.l) {
                        if (isSelected != 0) {
                            isSelected = this.m;
                            if (i < isSelected) {
                                a(isSelected, false);
                            } else {
                                for (isSelected = 0; isSelected < this.m; isSelected++) {
                                    a(isSelected, false);
                                }
                            }
                        }
                        c();
                    } else {
                        h();
                    }
                }
                i++;
            }
        } else {
            h();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.p = (int) motionEvent.getRawX();
            this.q = (int) motionEvent.getRawY();
        }
        return false;
    }
}
