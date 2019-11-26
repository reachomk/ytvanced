package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: klh */
public final class klh {
    public final View a;
    public final View b;
    public final ImageView c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final eso i;
    public final View j;
    public final TextView k;
    public apxu l;
    private final Handler m;
    private final akkq n;
    private final jnx o;

    public klh(Handler handler, akkq akkq, aaas aaas, eur eur, est est, jnz jnz, View view) {
        this.m = handler;
        this.n = akkq;
        this.a = view;
        this.b = view.findViewById(R.id.channel_navigation_container);
        this.c = (ImageView) view.findViewById(R.id.channel_owner_avatar);
        this.d = view.findViewById(R.id.channel_title_container);
        this.e = (TextView) view.findViewById(R.id.channel_title);
        this.f = (TextView) view.findViewById(R.id.channel_subscribers);
        this.g = (TextView) view.findViewById(R.id.channel_subscribers_long);
        this.h = (TextView) view.findViewById(R.id.subscribe_button);
        this.k = (TextView) view.findViewById(R.id.sponsor_button);
        this.j = view.findViewById(R.id.subscription_notification_view);
        this.i = est.a(this.h, eur.a(this.j));
        TextView textView = this.k;
        if (textView != null) {
            this.o = jnz.a(textView);
        } else {
            this.o = null;
        }
        View view2 = this.b;
        if (view2 == null) {
            view2 = view;
        }
        view2.setOnClickListener(new klg(this, aaas));
    }

    public final void a() {
        this.a.setVisibility(0);
    }

    public final void b() {
        this.a.setVisibility(8);
    }

    public final void a(akat akat, boolean z, acvx acvx, akxv akxv) {
        aphg aphg = null;
        this.l = null;
        b();
        if (akat != null) {
            this.l = akat.c;
            a();
            this.e.setText(ajqy.a(akat.b));
            View view = this.b;
            if (view != null) {
                view.setContentDescription(ajqy.a(akat.b));
            }
            aygk aygk = akat.a;
            if (aygk != null && aygk.b.size() > 0) {
                this.n.a(this.c, akat.a);
            } else {
                this.n.a(this.c);
                this.c.setImageResource(R.drawable.missing_avatar);
            }
            this.c.setEnabled(akat.c != null);
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            akaw akaw = akat.d;
            if (akaw != null) {
                axwa axwa = akaw.a;
                if (axwa != null) {
                    arml arml;
                    TextView textView;
                    arml arml2;
                    arml arml3;
                    if (z) {
                        arml = axwa.j;
                        if (arml == null) {
                            arml = arml.f;
                        }
                        if (!TextUtils.isEmpty(ajqy.a(arml))) {
                            textView = this.f;
                            if ((axwa.a & 64) != 0) {
                                arml2 = axwa.k;
                                if (arml2 == null) {
                                    arml2 = arml.f;
                                }
                            } else {
                                arml2 = null;
                            }
                            textView.setText(ajqy.a(arml2));
                            textView = this.g;
                            arml3 = axwa.j;
                            if (arml3 == null) {
                                arml3 = arml.f;
                            }
                            textView.setText(ajqy.a(arml3));
                            this.g.setVisibility(0);
                        }
                    } else {
                        arml = axwa.k;
                        if (arml == null) {
                            arml = arml.f;
                        }
                        if (!TextUtils.isEmpty(ajqy.a(arml))) {
                            textView = this.f;
                            arml2 = axwa.k;
                            if (arml2 == null) {
                                arml2 = arml.f;
                            }
                            textView.setText(ajqy.a(arml2));
                            textView = this.g;
                            if ((axwa.a & 32) != 0) {
                                arml3 = axwa.j;
                                if (arml3 == null) {
                                    arml3 = arml.f;
                                }
                            } else {
                                arml3 = null;
                            }
                            textView.setText(ajqy.a(arml3));
                            this.f.setVisibility(0);
                        }
                    }
                }
            }
            this.m.post(new klj(this, akat, acvx, akxv));
            jnx jnx = this.o;
            if (jnx != null) {
                auuq auuq = akat.e;
                if (auuq != null && auuq.a == 65153809) {
                    aphg = (aphg) auuq.b;
                }
                jnx.a(aphg, acvx);
            }
        }
    }

    public final void c() {
        this.i.a();
    }
}
