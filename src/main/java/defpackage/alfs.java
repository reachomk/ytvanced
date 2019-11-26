package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alfs */
public final class alfs extends akcq {
    public final Context a;
    public final aqhy b;
    public final akkq c;
    public final Object e;
    public final acvx g;
    public final akcp h;

    public static alfs a(Context context, aqhy aqhy, aaas aaas, acvx acvx, akkq akkq, akcp akcp, Object obj) {
        arml arml;
        CharSequence a;
        CharSequence a2;
        alfs alfs = new alfs(context, aqhy, aaas, acvx, akkq, akcp, obj);
        Builder builder = new Builder(context);
        arml arml2 = null;
        View inflate = View.inflate(alfs.a, R.layout.permission_pre_prompt_dialog, null);
        TextView textView = (TextView) inflate.findViewById(R.id.alert_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        aqhy aqhy2 = alfs.b;
        if ((aqhy2.a & 1) != 0) {
            arml = aqhy2.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        xpr.a(textView2, akcs.a(alfs.b, alfs.d));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        TextView textView3 = (TextView) inflate.findViewById(R.id.confirm_button);
        arml arml3;
        if (akcs.b(alfs.b) != null) {
            arml3 = akcs.b(alfs.b).g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            a = ajqy.a(arml3);
        } else {
            aqhy aqhy3 = alfs.b;
            if ((aqhy3.a & 32768) != 0) {
                arml3 = aqhy3.l;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            a = ajqy.a(arml3);
        }
        if (akcs.a(alfs.b) != null) {
            arml2 = akcs.a(alfs.b).g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            a2 = ajqy.a(arml2);
        } else {
            aqhy aqhy4 = alfs.b;
            if ((aqhy4.a & 16384) != 0) {
                arml2 = aqhy4.k;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            a2 = ajqy.a(arml2);
        }
        imageView.setContentDescription(a);
        textView3.setText(a2);
        akle akle = new akle(alfs.c, (ImageView) inflate.findViewById(R.id.illustration));
        aygk aygk = alfs.b.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akle.a(aygk);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        imageView.setOnClickListener(new alfv(alfs));
        textView3.setOnClickListener(new alfu(alfs));
        builder.setView(inflate);
        AlertDialog create = builder.create();
        alfs.a(create);
        alfs.d();
        Window window = create.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(xwe.a(context, R.attr.ytBrandBackgroundSolid, 0)));
        }
        return alfs;
    }

    private alfs(Context context, aqhy aqhy, aaas aaas, acvx acvx, akkq akkq, akcp akcp, Object obj) {
        super(aqhy, aaas, acvx, akcp, obj);
        this.a = (Context) amqw.a((Object) context);
        this.b = (aqhy) amqw.a((Object) aqhy);
        this.c = (akkq) amqw.a((Object) akkq);
        this.g = (acvx) amqw.a((Object) acvx);
        this.h = akcp;
        this.e = obj;
    }
}
