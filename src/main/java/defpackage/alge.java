package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alge */
public final class alge implements allj {
    public final akkq a;
    public final List b = new ArrayList();
    public ayla c;
    private final Context d;
    private final akvp e;
    private final algk f;
    private final algg g;
    private boolean h = false;
    private boolean i = false;

    public alge(Context context, akvp akvp, akkq akkq, View view, View view2) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (akvp) amqw.a((Object) akvp);
        this.a = (akkq) amqw.a((Object) akkq);
        this.f = new algk(view);
        this.g = new algg(this, view2);
    }

    public final void a(allh allh) {
        a(allh.m);
    }

    public final int a() {
        int i = 0;
        int height = this.i ? this.f.a.getHeight() - this.f.d.getHeight() : 0;
        if (this.h) {
            i = this.g.a.getHeight() - this.g.e.getHeight();
        }
        return height + i;
    }

    public final void a(String str) {
        if (!TextUtils.equals(this.g.c.getText(), str)) {
            this.g.c.setText(str);
        }
    }

    public final void b() {
        ayla ayla = this.c;
        if (ayla != null) {
            arml arml;
            aloz aloz = this.g.b;
            aygk aygk = ayla.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aloz.a(aygk);
            EditText editText = this.g.c;
            ayla ayla2 = this.c;
            if ((ayla2.a & 2) != 0) {
                arml = ayla2.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            editText.setHint(ajqy.a(arml));
            this.g.c.setFilters(new InputFilter[]{new LengthFilter((int) Math.min(2147483647L, this.c.d))});
            ayla = this.c;
            if ((ayla.a & 16) != 0) {
                aphj aphj = ayla.e;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 16) != 0) {
                    ImageView imageView = this.g.d;
                    akvp akvp = this.e;
                    aphj aphj2 = this.c.e;
                    if (aphj2 == null) {
                        aphj2 = aphj.d;
                    }
                    aphg aphg2 = aphj2.b;
                    if (aphg2 == null) {
                        aphg2 = aphg.s;
                    }
                    arwf arwf = aphg2.e;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    imageView.setImageResource(akvp.a(a));
                }
            }
            if (this.g.a.getVisibility() != 0) {
                this.h = true;
                b(this.g.a);
            }
        }
    }

    public final void a(alll alll) {
        int i = 0;
        if (alll != null) {
            this.f.b.setText(alll.a);
            arwf arwf = alll.b;
            if (arwf != null) {
                akvp akvp = this.e;
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                i = akvp.a(a);
            }
            if (i != 0) {
                this.f.c.setImageResource(i);
            } else {
                this.f.c.setImageDrawable(null);
            }
            if (this.f.a.getVisibility() != 0) {
                this.i = true;
                b(this.f.a);
            }
        } else if (this.f.a.getVisibility() == 0) {
            this.i = false;
            a(this.f.a);
        }
    }

    public final void c() {
        if (this.g.a.getVisibility() == 0) {
            this.h = false;
            a(this.g.a);
        }
    }

    public final void a(Object obj) {
        if (obj instanceof almv) {
            this.b.add((almv) obj);
        }
    }

    private final void a(View view) {
        d();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.d, R.anim.slide_down);
        loadAnimation.setAnimationListener(new algh(view));
        view.startAnimation(loadAnimation);
    }

    private final void b(View view) {
        d();
        view.setVisibility(0);
        view.startAnimation(AnimationUtils.loadAnimation(this.d, R.anim.slide_up));
    }

    private final void d() {
        if (this.i) {
            this.f.d.setVisibility(0);
            this.g.e.setVisibility(8);
        } else if (this.h) {
            this.f.d.setVisibility(8);
            this.g.e.setVisibility(0);
        } else {
            this.f.d.setVisibility(8);
            this.g.e.setVisibility(8);
        }
    }
}
