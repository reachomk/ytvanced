package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: iwv */
public final class iwv {
    private static CharSequence a(arml arml, CharSequence charSequence) {
        CharSequence b = ajqy.b(arml);
        return b == null ? charSequence : b;
    }

    private static CharSequence a(CharSequence charSequence, CharSequence charSequence2) {
        return amqh.a(", ").a().a(fpi.a(charSequence), fpi.a(charSequence2), new Object[0]);
    }

    static void a(iwu iwu, axtp axtp) {
        if (axtp != null) {
            arml arml;
            if (axtp.b) {
                iwv.a(iwu.b(), iwu.c(), axtp);
                iwv.b(iwu.d(), iwu.e(), axtp);
            } else {
                iwv.a(iwu.d(), iwu.e(), axtp);
                iwv.b(iwu.b(), iwu.c(), axtp);
            }
            TextView f = iwu.f();
            arml arml2 = null;
            if ((axtp.a & 32) != 0) {
                arml = axtp.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(f, ajqy.a(arml));
            TextView g = iwu.g();
            if ((axtp.a & 64) != 0) {
                arml2 = axtp.h;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            xpr.a(g, ajqy.a(arml2));
        }
    }

    private static void a(TextView textView, TextView textView2, axtp axtp) {
        arml arml;
        arml arml2 = null;
        if ((axtp.a & 2) != 0) {
            arml = axtp.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        if ((axtp.a & 4) != 0) {
            arml2 = axtp.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        CharSequence a2 = ajqy.a(arml2);
        textView.setText(a);
        arml arml3 = axtp.c;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        a = iwv.a(arml3, a);
        arml arml4 = axtp.d;
        if (arml4 == null) {
            arml4 = arml.f;
        }
        textView.setContentDescription(iwv.a(a, iwv.a(arml4, a2)));
        textView2.setText(a2);
    }

    private static void b(TextView textView, TextView textView2, axtp axtp) {
        arml arml;
        arml arml2 = null;
        if ((axtp.a & 8) != 0) {
            arml = axtp.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        if ((axtp.a & 16) != 0) {
            arml2 = axtp.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        CharSequence a2 = ajqy.a(arml2);
        textView.setText(a);
        arml arml3 = axtp.e;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        a = iwv.a(arml3, a);
        arml arml4 = axtp.f;
        if (arml4 == null) {
            arml4 = arml.f;
        }
        textView.setContentDescription(iwv.a(a, iwv.a(arml4, a2)));
        textView2.setText(a2);
    }

    static void a(Context context, ViewGroup viewGroup, akvp akvp, List list, boolean z) {
        viewGroup.removeAllViews();
        if (list != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.watch_card_badge_margin_end);
            for (azhq azhq : list) {
                View view = null;
                if (azhq != null && azhq.a == 91394106) {
                    aped aped;
                    view = View.inflate(context, R.layout.standalone_ypc_badge, null);
                    far far = new far(view, !z ? 1 : 2);
                    if (azhq.a == 91394106) {
                        aped = (aped) azhq.b;
                    } else {
                        aped = aped.g;
                    }
                    far.a(aped);
                } else if (azhq != null && azhq.a == 104364901) {
                    apeb apeb;
                    if (z) {
                        view = View.inflate(context, R.layout.watch_card_standalone_red_badge, null);
                    } else {
                        view = View.inflate(context, R.layout.standalone_red_badge, null);
                    }
                    view.setId(R.id.standalone_red_badge);
                    ipk ipk = new ipk(view);
                    if (azhq.a == 104364901) {
                        apeb = (apeb) azhq.b;
                    } else {
                        apeb = apeb.e;
                    }
                    ipk.a(apeb);
                } else if (azhq != null && azhq.a == 128361622) {
                    auxa auxa;
                    view = View.inflate(context, R.layout.metadata_badge, null);
                    fap fap = new fap(akvp, context, view);
                    if (azhq.a == 128361622) {
                        auxa = (auxa) azhq.b;
                    } else {
                        auxa = auxa.f;
                    }
                    fap.a(auxa);
                }
                if (view != null) {
                    MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMarginEnd(dimensionPixelSize);
                    viewGroup.addView(view, marginLayoutParams);
                }
            }
        }
    }
}
