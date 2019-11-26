package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: yet */
public final class yet implements akmz, akot, alht {
    public final aaas a;
    public aqmj b;
    public alkz c;
    public int d;
    private final View e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.name));
    private final TextView g = ((TextView) this.e.findViewById(R.id.pending_text));
    private final View h;
    private final TextView i;
    private final aloz j;
    private final akmx k;
    private final Context l;

    public yet(Context context, akkq akkq, aaas aaas, akvp akvp, akmx akmx) {
        amqw.a((Object) context);
        amqw.a((Object) akkq);
        amqw.a((Object) akvp);
        this.a = (aaas) amqw.a((Object) aaas);
        this.k = (akmx) amqw.a((Object) akmx);
        this.l = (Context) amqw.a((Object) context);
        this.e = View.inflate(context, R.layout.conversation_participant, null);
        ImageView imageView = (ImageView) this.e.findViewById(R.id.thumbnail);
        this.h = this.e.findViewById(R.id.invite_button);
        ((ImageButton) this.h).setImageResource(akvp.a(arwh.ADD_FRIEND));
        this.i = (TextView) this.e.findViewById(R.id.invited);
        this.j = new aloz(akkq, imageView);
        this.e.findViewById(R.id.clickable_contact).setOnClickListener(new yew(this));
        this.h.setOnClickListener(new yev(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.e;
    }

    private final void d() {
        alkz alkz = this.c;
        if (alkz != null) {
            this.f.setText(alkz.c());
            this.i.setText(this.c.e());
            if (this.c.d() == null) {
                alkz = this.c;
                if (alkz.f) {
                    a(5);
                } else if (alkz.d == null && TextUtils.isEmpty(alkz.e())) {
                    a(1);
                } else {
                    a(4);
                }
            } else if (this.c.f) {
                a(3);
            } else {
                a(2);
            }
        }
    }

    public final void a(Uri uri, Uri uri2) {
        this.c = (alkz) this.k.a(uri);
        d();
    }

    public final Object a() {
        return this.b;
    }

    public final void c() {
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            Object obj;
            boolean z = false;
            if (i2 == 1) {
                obj = 3;
            } else if (i2 != 3) {
                Toast.makeText(this.l, R.string.common_error_forbidden_action, 0).show();
                return;
            } else {
                obj = 5;
            }
            if (obj == 3) {
                z = true;
            }
            a(z, true);
            return;
        }
        throw null;
    }

    public final void b() {
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            Object obj = 2;
            if (i2 == 2) {
                obj = 4;
            } else if (i2 != 4) {
                return;
            }
            a(obj == 4, false);
            return;
        }
        throw null;
    }

    public final void a(bqn bqn) {
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            Object obj = 2;
            if (i2 != 2) {
                if (i2 == 4) {
                    obj = 4;
                } else {
                    return;
                }
            }
            a(obj == 4, false);
            return;
        }
        throw null;
    }

    private final void a(boolean z, boolean z2) {
        alkz alkz = this.c;
        if (alkz != null && !TextUtils.isEmpty(alkz.b())) {
            Uri a = alle.a(this.c.b());
            alkz alkz2 = (alkz) this.k.a(a);
            akmx akmx = this.k;
            alky a2 = alkz2.a();
            a2.a = z;
            a2.b = z2;
            akmx.b(a, a2.a());
        } else if (z) {
            if (z2) {
                a(3);
            } else {
                a(4);
            }
        } else if (z2) {
            a(5);
        } else {
            a(2);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqmj aqmj = (aqmj) obj;
        this.b = aqmj;
        if (this.c != null) {
            this.k.a((akmz) this);
        }
        TextView textView = this.g;
        aygk aygk = null;
        if ((aqmj.a & 32) != 0) {
            arml = aqmj.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        this.c = new alkz(null, null, null, null, aqmj, false, false);
        alkz alkz = this.c;
        if (!(alkz == null || TextUtils.isEmpty(alkz.b()))) {
            Uri a = alle.a(this.c.b());
            this.c = (alkz) this.k.b(a, this.c);
            this.k.a(a, (akmz) this);
        }
        d();
        aloz aloz = this.j;
        if ((aqmj.a & 2) != 0) {
            aygk = aqmj.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        aloz.a(aygk);
    }

    private final void a(int i) {
        xak.a();
        if (this.d != i) {
            this.d = i;
            i--;
            if (i == 0) {
                this.h.setVisibility(8);
                this.i.setVisibility(8);
            } else if (i == 2 || i == 3) {
                this.h.setVisibility(8);
                this.i.setVisibility(0);
            } else {
                this.h.setVisibility(0);
                this.i.setVisibility(8);
            }
        }
    }
}
