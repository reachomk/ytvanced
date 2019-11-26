package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aley */
public final class aley extends akcq {
    private aley(aqhy aqhy, aaas aaas, acvx acvx, akcp akcp, Object obj) {
        super(aqhy, aaas, acvx, akcp, obj);
    }

    public static void b(Context context, aqhy aqhy, aaas aaas, acvx acvx, akcp akcp, Object obj) {
        arml arml;
        CharSequence a;
        CharSequence a2;
        aley aley = new aley(aqhy, aaas, acvx, akcp, obj);
        Builder builder = new Builder(context);
        arml arml2 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.multi_recipient_share_confirmation, null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.alert_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        if ((aqhy.a & 1) != 0) {
            arml = aqhy.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView2.setText(akcs.a(aqhy, aaas));
        arml arml3;
        if (akcs.b(aqhy) != null) {
            arml3 = akcs.b(aqhy).g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            a = ajqy.a(arml3);
        } else {
            if ((aqhy.a & 32768) != 0) {
                arml3 = aqhy.l;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            a = ajqy.a(arml3);
        }
        if (akcs.a(aqhy) != null) {
            arml arml4 = akcs.a(aqhy).g;
            if (arml4 == null) {
                arml4 = arml.f;
            }
            a2 = ajqy.a(arml4);
        } else {
            if ((aqhy.a & 16384) != 0) {
                arml2 = aqhy.k;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            a2 = ajqy.a(arml2);
        }
        builder.setNegativeButton(a, aley);
        builder.setPositiveButton(a2, aley);
        AlertDialog create = builder.create();
        aley.a(create);
        aley.d();
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        int a3 = xwe.a(context, R.attr.ytStaticBlue, 0);
        create.getButton(-1).setTextColor(a3);
        create.getButton(-2).setTextColor(a3);
    }
}
