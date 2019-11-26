package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abpm */
public final class abpm implements abqn, abxu, afsw {
    public abor a;
    public final Context b;
    private final aaas c;
    private final akso d;
    private final aboq e;
    private final bcaa f;

    public abpm(Context context, aaas aaas, akso akso, aboq aboq, bcaa bcaa) {
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = akso;
        this.e = aboq;
        this.b = context;
        this.f = bcaa;
    }

    public final String a() {
        return null;
    }

    public final String b() {
        return null;
    }

    public final augl c() {
        return null;
    }

    public final afsw e() {
        return null;
    }

    public final void a(auvj auvj) {
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        if (abmk.c(auvj) != null) {
            this.c.a(abmk.c(auvj), hashMap);
        } else if (abmk.d(auvj) != null) {
            this.c.a(abmk.d(auvj), hashMap);
        }
    }

    public final abor d() {
        return this.a;
    }

    public final void a(Object obj) {
        if (obj instanceof ajzx) {
            akaa akaa = ((ajzx) obj).a;
            if (akaa != null) {
                axav axav = akaa.a;
                if (axav != null) {
                    this.d.a(axav, (Object) this);
                }
            }
        } else if (obj instanceof asop) {
            asop asop = (asop) obj;
            if (asop != null) {
                asov asov;
                if (asop.f.size() > 0) {
                    this.e.a(asop.f, this.a);
                }
                if ((asop.a & 8) != 0) {
                    asov = asop.e;
                    if (asov == null) {
                        asov = asov.c;
                    }
                } else {
                    asov = null;
                }
                if (asov != null && asov.a == 171313147) {
                    atze atze;
                    akse akse = (akse) this.f.get();
                    if (asov.a == 171313147) {
                        atze = (atze) asov.b;
                    } else {
                        atze = atze.q;
                    }
                    akse.a(atze, ampo.a, this);
                } else if (asov != null && asov.a == 85374086) {
                    akcr.a(this.b, (aril) asov.b, this.c, this);
                } else if ((asop.a & 2) == 0) {
                    abpm.a(this.b, asop);
                } else {
                    Builder cancelable = new Builder(this.b).setCancelable(true);
                    arml arml = asop.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    View findViewById = cancelable.setMessage(ajqy.a(arml)).setPositiveButton(R.string.ok, new abpp(this, asop)).show().findViewById(16908299);
                    if (findViewById instanceof TextView) {
                        ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
            }
        } else {
            xtl.d("Unhandled ServiceListener response received!");
        }
    }

    public static void a(Context context, asop asop) {
        int i = asop.a;
        if ((i & 4) != 0) {
            asol asol = asop.d;
            if (asol == null) {
                asol = asol.c;
            }
            arml arml = asol.b;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(context, ajqy.a(arml), 1);
            return;
        }
        if ((i & 2) == 0) {
            xpr.a(context, (int) R.string.video_is_flagged, 1);
        }
    }

    public final void a(bqn bqn) {
        xpr.a(this.b, (int) R.string.live_chat_report_form_service_failed, 1);
    }
}
